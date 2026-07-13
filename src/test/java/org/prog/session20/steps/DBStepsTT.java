package org.prog.session20.steps;

import io.cucumber.java.en.Given;
import org.prog.session9.PersonDto;
import org.prog.session9.ResultsDto;
import org.testng.Assert;

import java.sql.*;
import java.util.List;

import static org.prog.session11.steps.DBSteps.connection;

public class DBStepsTT {

    public static Connection connection;
    public static String RandomPersonName;

    @Given("I store those people in database")
    public void storePersontoDB() throws SQLException {
        List<PersonDto> personDtos = RestStepsTT.response.getResults();
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat) VALUES (?,?,?,?,?)"
        );

        personDtos.forEach(dto -> executeStatement(dto, preparedStatement));
    }

    @Given("I pick a single random person from DB")
    public void pickRandomPersonfromDB() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Persons ORDER BY RAND() LIMIT 1");
        if (resultSet.next()) {
            RandomPersonName = resultSet.getString("FirstName") + " " + resultSet.getString("LastName");
        } else {
            Assert.fail("No records found");
        }
    }

    private void executeStatement(PersonDto dto, PreparedStatement preparedStatement) {
        try {
            preparedStatement.setString(1, dto.getName().getFirst());
            preparedStatement.setString(2, dto.getName().getLast());
            preparedStatement.setString(3, dto.getGender());
            preparedStatement.setString(4, dto.getName().getTitle());
            preparedStatement.setString(5, dto.getNat());
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error inserting person: " + dto);
        }
    }
}

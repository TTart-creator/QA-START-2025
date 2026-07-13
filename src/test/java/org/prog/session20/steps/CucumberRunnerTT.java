package org.prog.session20.steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.DriverManager;
import java.sql.SQLException;

import static org.prog.session20.steps.DBStepsTT.connection;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.prog.session20.steps"
)

public class CucumberRunnerTT extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void beforeSuite() throws ClassNotFoundException, SQLException {
        WebStepsTT.driver = new ChromeDriver();
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db", "root", "password");
    }

    @AfterSuite
    public void tearDown() throws SQLException {
        if (WebStepsTT.driver != null) {
            WebStepsTT.driver.quit();
        }
        if (connection != null) {
            connection.close();
        }

    }
}

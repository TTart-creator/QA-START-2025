package SessionTT;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_TT {

    @Test(dataProvider = "providerName")
    public void test1(String value) {
        System.out.println("Hello" + value);
      /*  System.out.println(secondValue);*/
    }

    @DataProvider
    public Object[][] providerName() {
        return new Object[][]{
                {"World1"},
                {"World2"},
                {"World3"},
                {"World4"},
                {"World5"},


        };
    }
}

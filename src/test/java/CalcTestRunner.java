import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestRunner extends setup {
    CalcScreen screen;

    @Test(priority = 1, description = "Calculate Series")
    public void doSeries() {
        screen = new CalcScreen(driver);
        String value = screen.calculateSeries("50+10-20*2+10/2");
        System.out.println(value);
        Assert.assertEquals(value, "25");
        Allure.description("Calculate the Series");
    }
}

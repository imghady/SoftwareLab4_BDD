package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Objects;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private String opt;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("Two input values, {int} and {int}, One operation +")
    public void twoInputValuesFirstAndSecondOneOperationAdd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
        opt = "+";
    }

    @Given("Two input values, {int} and {int}, One operation *")
    public void twoInputValuesFirstAndSecondOneOperationMultiply(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
        opt = "*";
    }

    @Given("Two input values, {int} and {int}, One operation \\/")
    public void twoInputValuesFirstAndSecondOneOperationDivide(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
        opt = "/";
    }

    @Given("Two input values, {int} and {int}, One operation ^")
    public void twoInputValuesFirstAndSecondOneOperationPower(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
        opt = "^";
    }

    @When("I do the operation for the two values")
    public void iOperateTheTwoValues() {
        if (Objects.equals(opt, "*")) {
            result = calculator.multiply(value1, value2);
        } else if (Objects.equals(opt, "/")) {
            result = calculator.divide(value1, value2);
        } else if (Objects.equals(opt, "^")) {
            result = calculator.power(value1, value2);
        } else if (Objects.equals(opt, "+")) {
            result = calculator.add(value1, value2);
        }
        System.out.println(value1 + " " + opt + " " + value2 + " = " + result);
    }

    @Then("I expect the result {int}")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}

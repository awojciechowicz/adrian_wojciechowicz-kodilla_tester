package divisiblenumber;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsNumberDivisibleStep implements En {
    private int number;
    private String answer;

    public IsNumberDivisibleStep() {
        Given("The number is 15", () -> this.number = 15);

        Given("The number is 30", () -> this.number = 30);

        Given("The number is 45", () -> this.number = 45);

        Given("The number is 3", () -> this.number = 3);

        Given("The number is 6", () -> this.number = 6);

        Given("The number is 9", () -> this.number = 9);

        Given("The number is 5", () -> this.number = 5);

        Given("The number is 10", () -> this.number = 10);

        Given("The number is 20", () -> this.number = 20);

        Given("The number is 2", () -> this.number = 2);

        Given("The number is 7", () -> this.number = 7);

        Given("The number is 131", () -> this.number = 131);

        When("I ask whether is the number divisible by 3 or 5 or both", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.isTheNumberDivisible(this.number);
        });

        Then("The answer is {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}

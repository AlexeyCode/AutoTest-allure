import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestClass2 {
    @Test
    @Description(value="Проверка сложения заданных чисел")
    public void simpleTest(){
        numbersSum(2,2,4);
        numbersSum(3,3,6);
        numbersSum(3,3,6);
        numbersSum(3,3,6);
    }

    @Step
    public void numbersSum(int a, int b, int expectedResult){
        Assertions.assertTrue(a + b == expectedResult, "Результат вычитания не соответствует ожидаемому значению");
        Assertions.assertTrue(a + b == expectedResult, "Результат вычитания не соответствует ожидаемому значению");
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewSimpleTest {
    @Test
    void FirstTest(){
        System.out.println("###      firstTest()");
        Assertions.assertTrue(3>2);
    }

    @Test
    void SecondTest(){
        System.out.println("###      secondTest()");
        Assertions.assertTrue(4>2);
    }

    @Test
    void ThirdTest(){
        System.out.println("###      thirdTest()");
        Assertions.assertTrue(5>2);
    }


}

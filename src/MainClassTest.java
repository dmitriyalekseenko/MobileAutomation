import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    MainClass testGetLocalNumber = new MainClass();

    @Test
    public void myHomeTest1() {
        int a = testGetLocalNumber.getLocalNumber();
        if (a != 14) {
            Assert.fail("GetLocalNumber !=14");
        }
    }


    MainClass testGetClassNumber = new MainClass();

    @Test
    public void testGetClassNumber() {
        int b = testGetClassNumber.getClassNumber();
        if (b <= 45) {
            Assert.fail("Initial value is not more than 45 ");
        }
    }

}

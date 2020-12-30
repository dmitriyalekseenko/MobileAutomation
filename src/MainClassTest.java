import org.junit.Assert;
import org.junit.Test;

import static java.lang.System.in;

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

    MainClass testGetClassString = new MainClass();

    @Test
    public void testGetClassString()
    {
        String c = testGetClassString.getClassString();
        String substring = "Hello";
        if (c.toLowerCase().contains(substring.toLowerCase()))
        {

        } else {
            Assert.fail("The original phrase does not contain 'Hello' or 'hello'");
        }

    }

}

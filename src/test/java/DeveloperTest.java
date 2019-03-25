
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before

    public void before(){
        developer = new Developer("Cheche", "AL00000", 20000);
    }

    @Test
    public void hasName(){
        assertEquals("Cheche", developer.getName());
    }

    @Test
    public void hasNINo(){

        assertEquals("AL00000",developer.getNINo());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, developer.getSalary());
    }


    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(20.5);
        assertEquals(20040.0, developer.raiseSalary(20.5), 0.01);
    }

    @Test
    public void hasBonus(){
        assertEquals(200, developer.payBonus(), 0.01);
    }

    @Test
    public void cannotChangeNameIfNull(){
        developer.setName(null);
        assertEquals("Cheche", developer.getName());
    }

}


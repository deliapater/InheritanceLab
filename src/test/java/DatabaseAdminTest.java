
import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {


    DatabaseAdmin databaseAdmin;

    @Before

    public void before(){
        databaseAdmin = new DatabaseAdmin("Duncan", "AL00000", 20000);
    }

    @Test
    public void hasName(){
        assertEquals("Duncan", databaseAdmin.getName());
    }

    @Test
    public void hasNINo(){

        assertEquals("AL00000",databaseAdmin.getNINo());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, databaseAdmin.getSalary());
    }


    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(20.5);
        assertEquals(20040.0, databaseAdmin.raiseSalary(20.5), 0.01);
    }

    @Test
    public void hasBonus(){
        assertEquals(200, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void cannotChangeNameIfNull(){
        databaseAdmin.setName(null);
        assertEquals("Duncan", databaseAdmin.getName());
    }

    @Test
    public void cannotAddNegativeSalary(){
        databaseAdmin.raiseSalary(-20);
        assertEquals(20000, databaseAdmin.raiseSalary(-20), 0.01);
    }

}


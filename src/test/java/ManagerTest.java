import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before

    public void before(){
        manager = new Manager("Alice", "AL00000", 20000,"HR");
    }

    @Test
    public void hasName(){
        assertEquals("Alice", manager.getName());
    }

    @Test
    public void hasNINo(){

        assertEquals("AL00000", manager.getNINo());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(20.5);
        assertEquals(20040.0, manager.raiseSalary(20.5), 0.01);
    }

    @Test
    public void hasBonus(){
        assertEquals(200, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        manager.setName("Juan");
        assertEquals("Juan", manager.getName());
    }

    @Test
    public void cannotChangeNameIfNull(){
        manager.setName(null);
        assertEquals("Alice", manager.getName());
    }

    @Test
    public void cannotAddNegativeSalary(){
        manager.raiseSalary(-20);
        assertEquals(20000, manager.raiseSalary(-20), 0.01);
    }

}

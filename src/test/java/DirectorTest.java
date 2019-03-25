import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before

    public void before(){
        director = new Director("Liam", "AL00000", 30000,"HR", 800000);
    }

    @Test
    public void hasName(){
        assertEquals("Liam", director.getName());
    }

    @Test
    public void hasNINo(){

        assertEquals("AL00000", director.getNINo());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, director.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("HR", director.getDeptName());
    }

//    @Test
//    public void canRaiseSalary(){
//        director.raiseSalary(20.50);
//        assertEquals(20020.5, director.getNewSalary(), 0.01);
//    }

    @Test
    public void hasBonus(){
        assertEquals(300, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(800000, director.getBudget());
    }




}

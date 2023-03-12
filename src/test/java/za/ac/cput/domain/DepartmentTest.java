package za.ac.cput.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    private Department department1;
    private Department department2;
    private Department department3;
    private Department department4;

    @BeforeEach
    void setUp() {
        department1 = new Department();
        department2 = new Department();
        department3 = department2;
        department4 = department1;
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void testEquality() {
        assertEquals(department1, department4);
    }

    @Test
    void testIdentity() {
        assertSame(department2, department3);
    }
    @Test
    void getDepartmentID() {
        System.out.println("Get Department ID");
        Department department1 = new Department();
        String expResult = " ";
        String result = department1.getDepartmentID();
    }

    @Test
    @Timeout(10)
    void getDepartmentName() {
        System.out.println("Get Department Name");
        Department department1 = new Department();
        String expResult = " ";
        String result = department1.getDepartmentName();
    }

    @Test
    @Disabled
    void getDepartmentEmail() {
        System.out.println("Get Department Email");
        Department department1 = new Department();
        String expResult = " ";
        String result = department1.getDepartmentEmail();
    }
}
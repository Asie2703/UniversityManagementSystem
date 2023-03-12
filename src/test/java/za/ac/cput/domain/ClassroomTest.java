/*
 * ClassroomTest.java
 * This is my test class for the Classroom class.
 * @author Mthandeni Mbobo - 218223579
 * 12 March 2023
 */

package za.ac.cput.domain;

import org.junit.jupiter.api.*;

class ClassroomTest {
    private static Classroom classroom1;
    private static Classroom classroom2;
    private static Classroom classroom3;

    @BeforeAll
    public void setUp(){
        classroom1 = new Classroom("1", "CPUT District 6", "Engineering Building",
                1, 1.13);

        classroom2 = new Classroom("2", "CPUT District 6", "Engineering Building",
                1, 1.19);

        classroom3 = new Classroom("3", "CPUT District 6", "Engineering Building",
                1, 1.1);
    }

    @AfterAll
    public static void tearDownClass() {
        classroom1 = null;
        classroom2 = null;
        classroom3 = null;
    }

    //Object equality test
    @Test
    public void testObjectEquality() {
        Assertions.assertEquals(classroom1, classroom1);
        Assertions.assertEquals(classroom2, classroom2);
        Assertions.assertEquals(classroom3, classroom3);
    }

    //Object identity test
    @Test
    public void testObjectIdentity() {
        Assertions.assertSame(classroom3, classroom3);
        Assertions.assertNotSame(classroom1, classroom2);
    }

    //Failing test
    @Test
    public void testEqualityFail() {
        Assertions.assertEquals(classroom1, classroom2);
        Assertions.assertEquals(classroom2, classroom3);
    }

    //Timeouts test


    //Disable test
    
}
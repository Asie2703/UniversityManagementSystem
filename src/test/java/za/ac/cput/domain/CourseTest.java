package za.ac.cput.domain;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    private Course crs1;
    private Course crs2;
    private Course crs3;
    @BeforeEach
    void setUp() {
    crs1 = new Course() ;
    crs2 = new Course() ;
    crs3 = crs1;

    }
    @Test
    void testEquality(){
        assertEquals(crs1,crs3);
    }

    @Test
    void testIdentity(){
        assertSame(crs1,crs3);
    }
    @Test
    void testFail(){
        assertEquals(crs1,crs2);
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        System.out.println("Timeout has passed");
    }

    @Test
    //Test is disabled
    @Disabled("Disabled until bug #42 has been resolved")

    void testWillBeSkipped() {
    }


}
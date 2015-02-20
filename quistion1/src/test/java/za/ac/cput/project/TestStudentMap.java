package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/19.
 */
public class TestStudentMap {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testStudentMap() throws Exception {
        StudentMap sm = new StudentMap();
        Assert.assertNotNull(sm);
    }

    @After
    public void tearDown() throws Exception {


    }
}

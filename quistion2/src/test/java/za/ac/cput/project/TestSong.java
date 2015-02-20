package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestSong {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSong() throws Exception {
        SongInterface si = new SongInterfaceImpl();
        si.addSong(new Song(321, "Daniel", "Padilla", "don"));
        Assert.assertNotNull(si);
    }

    @After
    public void tearDown() throws Exception {


    }
}

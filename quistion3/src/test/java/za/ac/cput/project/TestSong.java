package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.project.config.AppConfig;

/**
 * Created by student on 2015/02/20.
 */
public class TestSong {

    private SongInterface si;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        si = (SongInterface)ctx.getBean("song");
    }

    @Test
    public void testSong() throws Exception {

        si.addSong(new Song(110, "lenny", "werk", "nie"));
        Assert.assertNotNull(si);

    }

    @After
    public void tearDown() throws Exception {

    }
}

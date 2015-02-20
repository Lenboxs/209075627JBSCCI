package za.ac.cput.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.project.SongInterface;
import za.ac.cput.project.SongInterfaceImpl;

/**
 * Created by student on 2015/02/20.
 */
@Configuration
public class AppConfig {

    @Bean(name = "song")
    public SongInterface getService()
    {
        return new SongInterfaceImpl();
    }
}

package za.ac.cput.project;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by student on 2015/02/20.
 */
public interface SongInterface {

    List<Song> songs = new ArrayList<Song>();

    public void addSong(Song song);
    public void removeSong(int id);
    public void displaySong();
}

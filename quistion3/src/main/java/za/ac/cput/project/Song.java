package za.ac.cput.project;

/**
 * Created by student on 2015/02/20.
 */
public class Song {

    private int songid;
    private String songname;
    private String songalbum;
    private String songartist;

    public Song(int songid, String songname, String songalbum, String songartist) {
        this.songid = songid;
        this.songname = songname;
        this.songalbum = songalbum;
        this.songartist = songartist;
    }

    public int getSongid() {
        return songid;
    }

    public void setSongid(int songid) {
        this.songid = songid;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getSongalbum() {
        return songalbum;
    }

    public void setSongalbum(String songalbum) {
        this.songalbum = songalbum;
    }

    public String getSongartise() {
        return songartist;
    }

    public void setSongartise(String songartist) {
        this.songartist = songartist;
    }

}

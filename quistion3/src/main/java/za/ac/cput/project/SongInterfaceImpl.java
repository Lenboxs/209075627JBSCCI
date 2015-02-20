package za.ac.cput.project;

/**
 * Created by student on 2015/02/20.
 */
public class SongInterfaceImpl implements SongInterface{

    public void addSong(Song song)
    {
        songs.add(song);
    }

    public void removeSong(int id)
    {
        for(Song song: songs) {
            if(song.getSongid() == id)
                songs.remove(song);
        }
    }
    public void displaySong()
    {
        System.out.println("all students");
        for(Song song: songs) {
            System.out.println(song.getSongid()+" "+song.getSongname()+" "+song.getSongalbum()+" "+song.getSongartise());
        }
    }

    public static void main( String[] args )
    {
        SongInterface si = new SongInterfaceImpl();
        si.addSong(new Song(123, "john", "pew", "qwe"));
        si.addSong(new Song(546, "elton", "pom", "asdf"));
        si.addSong(new Song(700, "jenny", "len", "qweasd"));

        si.displaySong();

        si.removeSong(546);

        si.displaySong();
    }

}

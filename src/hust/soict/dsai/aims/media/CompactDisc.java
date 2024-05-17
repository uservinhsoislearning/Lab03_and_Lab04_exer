package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public String getArtist() {
        return artist;
    }
    public void addTrack(Track newtrack) {
        boolean checked = false;
        for (Track track : tracks){
            if (newtrack.equals(track)){
                checked = true;
                break;
            }
        }
        if (!checked){
            tracks.add(newtrack);
        }
    }
    public void removeTrack(Track oldtrack) {
        boolean checked = false;
        for (Track track : tracks){
            if (oldtrack.equals(track)){
                checked = true;
                break;
            }
        }
        if (checked){
            tracks.remove(oldtrack);
        }
    }
}

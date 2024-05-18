package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public CompactDisc(String title, String category, String director, float cost, String artist, ArrayList<Track> tracks) {
        super();
        this.artist = artist;
        this.tracks = tracks;
    }
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
    public int getLength(){
        int totallength = 0;
        for (Track track : tracks){
            if (track.getLength() > 0){
                totallength += track.getLength();
            }
        }
        return totallength;
    }
    public void play(){
        for (Track track : tracks){
            track.play();
        }
    }
}

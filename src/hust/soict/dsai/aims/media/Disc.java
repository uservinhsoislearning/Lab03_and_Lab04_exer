package hust.soict.dsai.aims.media;

public class Disc extends Media {
    protected float length;
    protected String director;
    public Disc(){};
    public Disc(float length, String director) {
        super();
        this.length = length;
        this.director = director;
    }
    public float getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }
}

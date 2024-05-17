package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    private String director;
    private int length;
    private static int nbDigitalVideoDisc = 0;
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc += 1;
        this.id = nbDigitalVideoDisc;
    }
    @Override
    public String toString(){
        return "[" + title + "] - [" + category + "] - [" + director + "] - [" + length + "]";
    }
    public boolean isMatch(int ID2)  {
        return ID2 == id;
    }
    public boolean isMatch(String title2) {
        return title2.equals(title);
    }
    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
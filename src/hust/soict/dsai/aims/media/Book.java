package hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media{

    private List<String> authors = new ArrayList<String>();
    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    public Book(){

    }
    public void addAuthor(String authorName){
        boolean checked = false;
        for (String name : authors){
            if (name.equals(authorName)){
                checked = true;
                break;
            }
        }
        if (!checked){
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName){
        boolean checked = false;
        for (String name : authors){
            if (name.equals(authorName)){
                checked = true;
                break;
            }
        }
        if (checked){
            authors.remove(authorName);
        }
    }
}
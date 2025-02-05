package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;


public class Store extends Media{
    public static final int MAX_NUMBER_OF_AVAILABLE_DISC = 21;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media md) {
        if (itemsInStore.size() == MAX_NUMBER_OF_AVAILABLE_DISC) {
            System.out.println("Unable to push more discs!");
        } else {
            itemsInStore.add(md);
            System.out.println("The disc has been added.");
        }
    }
    public void addMedia(Media... md) {
        for (Media md1 : md) {
            if (itemsInStore.size() == MAX_NUMBER_OF_AVAILABLE_DISC) {
                System.out.println("Unable to push more discs!");
            } else {
                itemsInStore.add(md1);
                System.out.println("The disc has been added.");
            }
        }
    }
    public void removeMedia(Media md) {
        if (itemsInStore.isEmpty()) {
            System.out.println("Unable to remove discs!");
        } else {
            for(int i = 0; i < itemsInStore.size(); i++) {
                if (itemsInStore.get(i).equals(md)) {
                    itemsInStore.remove(i);
                    break;
                }
            }
            System.out.println("The disc has been removed.");
        }
    }
    public void print() {
        System.out.println("-----------------------Store-----------------------");
        System.out.println("Number of item: " + itemsInStore.size());
        System.out.println();
        for (Media media : itemsInStore) {
            System.out.println(media);
        }
        System.out.println("---------------------------------------------------");
    }
    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println(media);
                return media;
            }
        }
        System.out.printf("No item with title %s found.\n", title);
        return null;
    }
}
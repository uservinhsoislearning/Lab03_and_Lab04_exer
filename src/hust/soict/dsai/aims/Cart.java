package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.*;

public class Cart extends Media {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public void addMedia(Media md) {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            System.out.println("Your cart is full!");
        } else {
            itemsOrdered.add(md);
            System.out.println("The media has been added.");
        }
    }
    public void addMedia(Media[] mdlist) {
        for (Media md: mdlist) {
            if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
                System.out.println("Your cart is full!");
                break;
            } else {
                itemsOrdered.add(md);
                System.out.println("The disc has been added.");
            }
        }
    }
    public void removeMedia(Media md) {
        if (itemsOrdered.isEmpty()) {
            System.out.println("Your cart is empty!");
        } else {
            for(int i = 0; i < itemsOrdered.size(); i++) {
                if (itemsOrdered.get(i).equals(md)) {
                    itemsOrdered.remove(i);
                    break;
                }
            }
            System.out.println("The disc has been removed.");
        }
    }
    public float totalCost() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(itemsOrdered.size());
        float res = 0;
        for (Media md: itemsOrdered) {
            if (md != itemsOrdered.get(randomIndex) && md != null) {
                res += md.getCost();
            }
        }
        return res;
    }
}

package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import java.util.*;

public class Cart extends Media{
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public void addMedia(Media md) {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            System.out.println("Your cart is full!");
        } else {
            itemsOrdered.add(md);
            System.out.println("The disc has been added.");
        }
    }
    public void addMedia(ArrayList<Media> mdlist) {
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
                if (itemsOrdered.get(i) == md) {
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
    public void print() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(i+1 + ". DVD - " + itemsOrdered.get(i).toString()
                    + ": [" + itemsOrdered.get(i).getCost() + "]$");
        }
        System.out.printf("Total cost: [ %.2f ]\n", totalCost());
        System.out.println("**************************************************");
    }
    public Media search(String title) {
        Media tmp = null;
        boolean found = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getTitle().equals(title)) {
                tmp = itemsOrdered.get(i);
                System.out.println(i+1 + ". DVD - "
                        + itemsOrdered.get(i).toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Your disc is not found!");
            return null;
        } else {
            return tmp;
        }
    }
    public Media search(int ID) {
        Media tmp = null;
        boolean found = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getId() == ID) {
                tmp = itemsOrdered.get(i);
                System.out.println(i+1 + ". DVD - "
                        + itemsOrdered.get(i).toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Your disc is not found!");
            return null;
        } else {
            return tmp;
        }
    }
    public void sort(boolean byCostTitle) {
        if (byCostTitle) {
            itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
            return;
        }
        itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }

    public void filter(String query) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().toLowerCase().contains(query.toLowerCase())) {
                System.out.println(media);
            }
        }
    }
}

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
//    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdlist) {
//        for (DigitalVideoDisc d: dvdlist) {
//            if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
//                System.out.println("Your cart is full!");
//                break;
//            } else {
//                itemsOrdered[qtyOrdered] = d;
//                qtyOrdered += 1;
//                System.out.println("The disc has been added.");
//            }
//        }
//    }
//    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
//        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
//            System.out.println("Your cart is full!");
//        } else if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
//            itemsOrdered[qtyOrdered] = dvd1;
//            qtyOrdered += 1;
//            System.out.println("The first disc has been added.");
//        } else {
//            itemsOrdered[qtyOrdered] = dvd1;
//            itemsOrdered[qtyOrdered + 1] = dvd2;
//            qtyOrdered += 2;
//            System.out.println("The two discs has been added.");
//        }
//    }
//    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
//        if (qtyOrdered == 0) {
//            System.out.println("Your cart is empty!");
//        } else {
//            int index = 0;
//            for(int i = 0; i < qtyOrdered; i++) {
//                if (itemsOrdered[i] == disc) {
//                    itemsOrdered[i] = null;
//                    index = i;
//                    break;
//                }
//            }
//            for(int j = index + 1; j < qtyOrdered; j++) {
//                itemsOrdered[j-1] = itemsOrdered[j];
//            }
//            qtyOrdered -= 1;
//            System.out.println("The disc has been removed.");
//        }
//    }
    public float totalCost() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(qtyOrdered);
        float res = 0;
        for (DigitalVideoDisc d: itemsOrdered) {
            if (d != itemsOrdered[randomIndex] && d != null) {
                res += d.getCost();
            }
        }
        return res;
    }
}

package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Book;
import java.util.*;

public class Aims {
    public static void main(String[] args) {

//        Cart anOrder = new Cart();
//
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
//                "Animation", "Roger Allers", 87, 19.95f);
//        anOrder.addDigitalVideoDisc(dvd1);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
//                "Science Fiction", "George Lucas", 87, 24.95f);
//        anOrder.addDigitalVideoDisc(dvd2);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
//                "Animation", 18.99f);
//        anOrder.addDigitalVideoDisc(dvd3);
//
//        System.out.println("Total cost is: " + anOrder.totalCost());
        List<Media> mediae = new ArrayList<Media>();

        CompactDisc cd = new CompactDisc();
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book();

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for (Media media : mediae) {
            System.out.println(media.toString());
        }
    }
}
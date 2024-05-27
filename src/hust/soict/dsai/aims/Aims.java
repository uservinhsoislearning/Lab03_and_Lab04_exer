package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Book;
import java.util.*;

public class Aims {
    private static final Store store = new Store();
    private static final Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);
    private static final Store availableMedia = new Store();
    private static int choice;
    private static List<Integer> acceptedChoices;
    public static void initializeStore() {

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars: Episode IV", "Sci-Fi", "George Lucas", 121, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 17.50f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 22.95f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Spirited Away", "Animation", "Hayao Miyazaki", 125, 19.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 24.50f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lord of the Rings", "Fantasy", "Peter Jackson", 201, 29.95f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 154, 18.99f);

        CompactDisc cd = new CompactDisc("Queen Best Songs", "Music", "None", 60, "Queen");

        cd.addTrack(new Track("Bohemian Rhapsody", 540));
        cd.addTrack(new Track("Another One Bites the Dust", 330));
        cd.addTrack(new Track("Killer Queen", 300));
        cd.addTrack(new Track("We Will Rock You", 200));
        cd.addTrack(new Track("Don't Stop Me Now", 350));

        Book book = new Book("Good Omens", "Novel", 15.99f);
        book.addAuthor("Terry Pratchett");
        book.addAuthor("Neil Gaiman");

        store.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, cd, book);
        availableMedia.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, cd, book);
    }
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");

        acceptedChoices = new ArrayList<>(Arrays.asList(0, 1, 2, 3));

        do {
            choice = scanner.nextInt();
            scanner.nextLine();
        } while (!acceptedChoices.contains(choice));

        switch (choice) {
            case 0:
                exit();
                break;
            case 1:
                storeMenu();
                break;
            case 2:
                updateStoreMenu();
                break;
            case 3:
                cartMenu();
                break;
        }

    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");

        acceptedChoices = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));

        do {
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            choice = scanner.nextInt();
            scanner.nextLine();
        } while (!acceptedChoices.contains(choice));

        switch (choice) {
            case 0:
                showMenu();
                break;
            case 1:
                filterCart();
                break;
            case 2:
                sortCartMenu();
                break;
            case 3:
                removeFromCart();
                break;
            case 4:
                playMedia();
                break;
            case 5:
                placeOrderMenu();
                break;
        }
    }
    public static void storeMenu() {

        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

        acceptedChoices = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));

        do {
            choice = scanner.nextInt();
            scanner.nextLine();
        } while (!acceptedChoices.contains(choice));

        switch (choice) {
            case 0:
                showMenu();
                break;
            case 1:
                mediaDetailsMenu();
                break;
            case 2:
                addToCart();
                break;
            case 3:
                playMedia();
                break;
            case 4:
                cartMenu();
                break;
        }
    }
    public static void updateStoreMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add a media");
        System.out.println("2. Remove a media");
        System.out.println("0. Back");
        System.out.println("Please choose a number: 0-1-2");

        acceptedChoices = new ArrayList<>(Arrays.asList(0, 1, 2));

        do {
            choice = scanner.nextInt();
            scanner.nextLine();
        } while (!acceptedChoices.contains(choice));

        switch (choice) {
            case 0:
                showMenu();
                break;
            case 1:
                addToStore();
                break;
            case 2:
                updateStoreMenu();
                break;
        }
    }
    public static void addToStore(){
        System.out.println("Available media: ");
        availableMedia.print();

    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    private static void playMedia() {
        System.out.println("All available media:");
        availableMedia.print();
        while (true) {
            System.out.println();
            System.out.println("Enter the title of media to play, or 0 to go back to store menu:");
            String query = scanner.nextLine().trim();

            if (query.equals("0")) {
                storeMenu();
                return;
            }

            System.out.println("Searching...");
            Media toPlay = store.searchByTitle(query);
            if (toPlay != null) {
                System.out.println("Playing: " + toPlay);
            }
        }
    }
    public static void exit() {
        System.out.println("Exiting...");
        scanner.close();
        System.exit(0);
    }
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
//        List<Media> mediae = new ArrayList<Media>();
//
//        CompactDisc cd = new CompactDisc();
//        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King",
//                "Animation", "Roger Allers", 87, 19.95f);
//        Book book = new Book();
//
//        mediae.add(cd);
//        mediae.add(dvd);
//        mediae.add(book);
//
//        for (Media media : mediae) {
//            System.out.println(media.toString());
//        }
    }
}
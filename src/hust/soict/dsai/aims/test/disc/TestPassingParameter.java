package hust.soict.dsai.aims.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void trueswap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String oldtitle = dvd1.getTitle();
        String oldcategory = dvd1.getCategory();
        String olddirector = dvd1.getDirector();
        int oldlength = dvd1.getLength();
        float oldcost = dvd1.getCost();
        dvd1 = new DigitalVideoDisc(dvd2.getTitle(), dvd2.getCategory(), dvd2.getDirector(), dvd2.getLength(), dvd2.getCost());
        dvd2.setTitle(oldtitle);
        dvd2.setCategory(oldcategory);
        dvd2.setDirector(olddirector);
        dvd2.setLength(oldlength);
        dvd2.setCost(oldcost);
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
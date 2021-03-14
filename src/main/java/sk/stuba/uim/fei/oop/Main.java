package sk.stuba.uim.fei.oop;

public class Main {
    public static void main(String[] args) {

        var absolvent = new Graduate("Ing.","Teodora", "Simon");

        absolvent.setFriends(new Graduate("Ing.","Sergej", "Vidakovic"), new Graduate("Ing.","Ivona", "Bires"));
        System.out.println(absolvent.akoText());
        System.out.println(absolvent.akoTextSTitulom());
        System.out.println(absolvent);
    }

}

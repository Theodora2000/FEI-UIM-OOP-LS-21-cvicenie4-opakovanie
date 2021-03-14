package sk.stuba.uim.fei.oop;

import java.util.Arrays;
//abstraktna trieda, nevieme spravit instanciu
public class Graduate extends Contact {

    private String academicTitle;


    //konstruktor nededim
    public Graduate(String firstname, String surname) {
        super(firstname, surname);//cez super volam rodicovsky konstruktor
        this.academicTitle = "";
    }

    public Graduate(String academicTitle, String firstname, String surname) {
        super(firstname, surname);
        this.academicTitle = academicTitle;
    }

    public String akoTextSTitulom() {
        return String.format("%s %s", this.academicTitle, super.akoText());

    }

    @Override
    public String akoText() {
        return String.format("%s %s", this.academicTitle, super.akoText());
    }

    @Override
    public String getZnamy() {
        var builder = new StringBuilder();
        builder.append("Moj znamy:\n");
        for (int i = 0; i < this.friends.length; i++) {
            builder.append(this.friends[i].akoText());
            builder.append("\n");
        }
        return builder.toString();
    }

}


package sk.stuba.uim.fei.oop;

import java.util.Arrays;

public abstract class Contact implements Znamy{
    //atributy
    private String firstname;
    private String surname;

    protected  Contact[] friends;
    //konstruktor
    public Contact(String firstname,String surname) {
        this.firstname = firstname;
        this.surname=surname;
    }

    public Contact(String fullName){
        var parts = fullName.split(" ");
        firstname = parts[0];
        surname=parts[1];
    }


    public void setFriends(Contact... newfriends){
        this.friends=newfriends;
    }

    public void setFriendsFromArray(Contact[] newfriends){
        this.friends=newfriends;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String akoText(){
        return String.format("%s %s", this.firstname, this.surname);
    }

    public abstract String getZnamy();

    @Override
    public String toString() {
        return String.format("Volam sa %s\n%s",this.akoText(), this.getZnamy());
    }
}

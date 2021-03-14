package sk.stuba.uim.fei.oop;

public class Contact {
    //atributy
    private String firstname;
    private String surname;

    Contact[] friends;
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
//staticka metoda
    public static Contact  parseFromfullName(String fullName){
        return new Contact(fullName);
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
}

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
    //kopia
    public Contact(Contact other){
        this.firstname = other.firstname;
        this.surname= other.surname;
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

    public Contact[] getFriends() {
        var friendsClone = new Contact[this.friends.length];
        for(int i = 0;i<this.friends.length;i++){
            friendsClone[i] = new Contact(this.friends[i]);
        }
        return friendsClone;
    }
}

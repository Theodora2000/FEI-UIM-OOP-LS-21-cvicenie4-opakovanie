package sk.stuba.uim.fei.oop;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

       var zoznam = new LinkedList<>();
       zoznam.add(new NoZnamy());
       zoznam.add(new Graduate("Ing.","Teodora", "Simon"));
       zoznam.add(1, new NoZnamy());
       System.out.println(zoznam.size());
       zoznam.add(new NoZnamy());
       zoznam.remove(2);


    }

}

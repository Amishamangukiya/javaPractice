package class11hw;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String>animals=new ArrayList<String>();
        animals.add("cow");
        animals.add("tiger");
        animals.add("horse");
        animals.add("goat");
        animals.add("sheep");
        System.out.println(animals);
        animals.remove("tiger");
        System.out.println("Domestic animals :"+animals);


    }
}

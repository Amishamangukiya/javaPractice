package class11hw;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer>people=new HashMap<>();
        people.put("Ram",25);
        people.put("Shyam",28);
        people.put("Ghanshyam",30);
        for (String i: people.keySet()){
            System.out.println("Name:"+i+" Age: "+people.get(i));
        }
    }
}

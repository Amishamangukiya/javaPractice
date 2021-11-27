package address;

public class String1 {


    public static void main(String[] args) {
        String greeting="hi";
        String txt="abcdefghijklmnopqrstuvwxyz";
        String name="amisha";
        System.out.println(greeting);
        System.out.println(txt.length());
        StringBuilder name1=new StringBuilder(name);
        name1.reverse();
        System.out.println(name1);
    }
}

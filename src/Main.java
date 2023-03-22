import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        /* write a program to create a hasmap with string as keys and integers as values and demonstrate the application of methods get(), put(), remove() and size().// */
        HashMap<String, Integer> map = new HashMap<>();

        map.put("sathish", 10);
        map.put("nithish", 30);
        map.put("sai", 20);

        System.out.println("Size of map is:- "
                + map.size());

        System.out.println(map);

        map.remove("sai");
        System.out.println(map);

        if (map.containsKey("sathish")) {
            Integer a = map.get("sathish");
            System.out.println("value for key"
                    + " \"sathish\" is:- " + a);

        }
    }
}

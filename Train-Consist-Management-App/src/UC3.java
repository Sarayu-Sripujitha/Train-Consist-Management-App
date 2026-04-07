import java.util.HashSet;

public class UC3 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management ===");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("================================");

        HashSet<String> bogies = new HashSet<>();

        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        bogies.add("BG101");
        bogies.add("BG102");

        for (String bogie : bogies) {
            System.out.println(bogie);
        }
    }
}
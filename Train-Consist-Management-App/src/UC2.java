import java.util.ArrayList;
import java.util.Scanner;

public class UC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> passengerBogies = new ArrayList<>();

        System.out.println("=== Train Consist Management ===");
        System.out.println("UC2 - Add Passenger Bogies to Train");

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            passengerBogies.add(sc.nextLine());
        }

        int removeIndex = sc.nextInt();
        if (removeIndex >= 0 && removeIndex < passengerBogies.size()) {
            passengerBogies.remove(removeIndex);
        }

        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        sc.close();
    }
}
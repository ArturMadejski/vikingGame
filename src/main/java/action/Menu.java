package action;

import java.util.Arrays;

public class Menu {


    public void welcome() throws InterruptedException {
        System.out.println("----------------------------------");
        System.out.println("- ! Welcome in world of Viking ! -");
        System.out.println("----------------------------------");
        Thread.sleep(3000);
        System.out.println("It will be a short battle between your chosen one and random PC viking");
        System.out.println("----------------------------------------------------------------------");
        Thread.sleep(3000);
        System.out.println("Important information numbers of HP and DP points are constant \n" +
                "but ActionPoints [AP] will be dynamic random changing");
        Thread.sleep(2000);
        System.out.println("For more fun \u263A ");
        Thread.sleep(3000);
        System.out.println("Lets play! Gods with you!");
        System.out.println("-----------------------------------------------------------");
        Thread.sleep(4000);
        System.out.println("Also in first step you decide who will be your player...");
        Thread.sleep(2000);

    }

    public static String[] menuCharacters = new String[]{
            "--------------------",
            " Select your viking:",
            "--------------------",
            "1. Ragnar",
            "2. Rollo",
            "3. Lagerta",
            "4. Flokki",
            "5. Bjorn",
            "--------------------",
    };

    public static String[] menuItems = new String[]{
            "and now take item...",
            "-----------------",
            "Select one item: ",
            "-----------------",
            "1. Shield",
            "2. Wine",
            "3. Axe",
            "------------------",
    };

    public void printMenuCharacters() {
            Arrays.stream(menuCharacters).forEach(System.out::println);
        }

    public void printMenuItems() {
            Arrays.stream(menuItems).forEach(System.out::println);
        }


}

package action;

import characters.*;
import items.Axe;
import items.Item;
import items.Shield;
import items.Wine;
import Exception.*;

import java.util.Random;
import java.util.Scanner;

public class GameOption {

    static Player player;
    static Player enemy;
    static Item item;
    static Menu menu = new Menu();

    public static void START() throws InterruptedException, VikingGameException {
        menu.welcome();
        menu.printMenuCharacters();
        choiceCharacter();
        choiceEnemy();
        fight();
        repeat();

    }

    public static void repeat() throws InterruptedException, VikingGameException {
        System.out.println("One more time ? Y / N");
        Scanner scan = new Scanner(System.in);
        char userChoice = scan.next().toLowerCase().charAt(0);
        switch (userChoice) {
            case 'y':
                START();
                break;
            case 'n':
                System.out.println("Bye Bye");
                break;

                default:
                    //throw new ChoiceNotFoundException(" There is no option, end game with exception");
                    System.out.println("There is no option...");
                    repeat();
        }
    }

    public static Player choiceCharacter() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int userChoice = in.nextInt();
        switch (userChoice) {
            case 1:
                player = new Ragnar(0, 0, 0);
                System.out.println("You're King Ragnar  -> " + player.toString());
                choiceItem();
                break;
            case 2:
                player = new Rollo(0, 0, 0);
                System.out.println("You're Rollo  -> " + player.toString());
                choiceItem();
                break;
            case 3:
                player = new Lagerta(0, 0, 0);
                System.out.println("You're beautiful Female Shield Bearer, Lagerta  -> " + player.toString());
                choiceItem();
                break;
            case 4:
                player = new Flokki(0, 0, 0);
                System.out.println("Ohh, Flokki, Flokki...  -> " + player.toString());
                choiceItem();
                break;
            case 5:
                player = new Bjorn(0, 0, 0);
                System.out.println("You're Bjorn, Ragnar's son  -> " + player.toString());
                choiceItem();
                break;
            default:
                System.out.println("You've chosen wrong number, try again...");
                choiceCharacter();

        }

        System.out.println("-----------------------------");
        return player;

    }
    public static Player choiceEnemy() throws InterruptedException {
        Random rand = new Random();
        int enemyChoice = rand.nextInt(5) + 1;
        switch (enemyChoice) {
            case 1:
                enemy = new Ragnar(0, 0, 0);
                System.out.println("You fight with King  -> " + enemy.toString());
                randomEnemyItem();
                break;
            case 2:
                enemy = new Rollo(0, 0, 0);
                System.out.println("You fight with Rollo  -> " + enemy.toString());
                randomEnemyItem();
                break;
            case 3:
                enemy = new Lagerta(0, 0, 0);
                System.out.println("You fight with Lagerta  -> " + enemy.toString());
                randomEnemyItem();
                break;
            case 4:
                enemy = new Flokki(0, 0, 0);
                System.out.println("You fight with Flokki  -> " + enemy.toString());
                randomEnemyItem();
                break;
            case 5:
                enemy = new Bjorn(0, 0, 0);
                System.out.println("You fight with Bjorn -> " + enemy.toString());
                randomEnemyItem();
                break;

        }
        return enemy;

    }

    public static Item choiceItem() throws InterruptedException {
        menu.printMenuItems();
        Scanner in = new Scanner(System.in);
        int userItemChoice = in.nextInt();

        switch (userItemChoice) {
            case 1:
                item = new Shield(0, 0);
                System.out.println("You've better defense now, with shield -> add +" + item.getItemDp());
                addShield();
                break;
            case 2:
                item = new Wine(0, 0);
                System.out.println("You drunk bastard... your DP is 20 less");
                addWine();
                break;
            case 3:
                item = new Axe(0, 0);
                System.out.println("Wow, you don't fuck in dance..");
                Thread.sleep(2000);
                System.out.println("you'r attack is amazing -> +" + item.getItemAp());
                addAxe();
                break;
            default:
                System.out.println("There is no option, you read word wine and think about ass, try again...");
                choiceItem();
        }
        return item;
    }

    public static Item randomEnemyItem() throws InterruptedException {
        System.out.println("And then your enemy select an item...");
        Thread.sleep(2000);
        Random rand = new Random();
        int pcChoice = rand.nextInt(3) +1;
        switch (pcChoice) {
            case 1:
                item = new Shield(0, 0);
                System.out.println("Enemy select shield -> add +" + item.getItemDp());
                addEnemyShield();
                break;
            case 2:
                item = new Wine(0, 0);
                System.out.println("You'r enemy was drunk...but be careful");
                addEnemyWine();
                break;
            case 3:
                item = new Axe(0, 0);
                System.out.println("Emeny really wants to kill you...");
                Thread.sleep(2000);
                System.out.println("he's attack is amazing -> +" + item.getItemAp());
                addEnemyAxe();
                break;
        }
        return item;
    }


    public static int addShield() {
        System.out.println("STATUS: " + player.toString() + "\nITEM: " + item.toString());
        System.out.println("NEW STATS: DP= " + (player.getDp() + item.getItemDp()));
        return player.setDp(player.getDp() + item.getItemDp());
    }
    public static int addWine() {
        System.out.println("STATUS: " + player.toString() + "\nITEM: " + item.toString());
        System.out.println("NEW STATS: DP= " + (player.getDp() + item.getItemDp()));
        return player.setDp(player.getDp() + item.getItemDp());
    }
    public static int addAxe() {
        System.out.println("STATUS: " + player.toString() + "\nITEM: " + item.toString());
        System.out.println("NEW STATS: AP= " + (player.getAp() + item.getItemAp()));
        return player.setAp(player.getAp() + item.getItemAp());
    }
    public static int addEnemyShield() {
        System.out.println("NEW ENEMY STATS: DP= " + (enemy.getDp() + item.getItemDp()));
        return enemy.setDp(enemy.getDp() + item.getItemDp());
    }
    public static int addEnemyWine() {
        System.out.println("NEW ENEMY STATS: DP= " + (enemy.getDp() + item.getItemDp()));
        return enemy.setDp(enemy.getDp() + item.getItemDp());
    }
    public static int addEnemyAxe() {
        System.out.println("NEW ENEMY STATS: AP= " + (enemy.getAp() + item.getItemAp()));
        return enemy.setAp(enemy.getAp() + item.getItemAp());
    }
    public static void fight() throws InterruptedException {
        System.out.println("----------------------------");
        System.out.println("Let's fight");
        System.out.println("-----------------------------");
        Thread.sleep(2500);
        int attackEnemy = (player.getHp() + player.getDp()) - enemy.getAp();
        int attackPlayer = (enemy.getHp() + enemy.getDp()) - player.getAp();

        if (attackPlayer <= 0) {
            System.out.println("You kill enemy...");
        } else {
            if (attackEnemy <= 0) {
                System.out.println("YOU GO TO VALHALLA, GAME OVER");
            } else {
                System.out.println("You attack first...");
                Thread.sleep(1500);
                System.out.println("...and you take " + attackPlayer + " points of enemy's life");
                System.out.println("Enemy turn...");
                Thread.sleep(1500);
                System.out.println("...he takes you " + attackEnemy + " points of life");
                player.setHp(attackEnemy);
                enemy.setHp(attackPlayer);

                /**
                 * In the next round I'll set new HP as a this deference -> HP + DP and enemy AP
                 * but because AP is random number this value of life can go up or down, its like
                 * lottery who win...
                 */  // i've to do sth with this!!!!
                System.out.println("--------------------------");
                System.out.println("Next round");
                fight();
            }
        }
    }


}

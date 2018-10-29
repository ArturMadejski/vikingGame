package characters;

import java.util.Random;

public class Player {

    int hp, ap, dp;

    Random random = new Random();

    public Player(int hp, int ap, int dp) {
        this.hp = hp;
        this.ap = getAp();
        this.dp = dp;
    }

    @Override
    public String toString() {
        return "HP=" + hp + ", AP=" + ap + ", DP=" + dp;
    }

    public int getHp() {
        return hp;
    }

    public int setHp(int hp) {
        this.hp = hp;
        return hp;
    }

    public int getAp() {
        return ap = random.nextInt(55) + 65;
    }

    public int setAp(int ap) {
        this.ap = ap;
        return ap;
    }

    public int getDp() {
        return dp;
    }

    public int setDp(int dp) {
        this.dp = dp;
        return dp;
    }
}

package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "resultDB")
public class ResultDB {

    @Column
    private int playerWin;
    @Column
    private int enemyWin;

    public ResultDB(int playerWin, int enemyWin) {
        this.playerWin = playerWin;
        this.enemyWin = enemyWin;
    }
    public ResultDB(){}

    public int getPlayerWin() {
        return playerWin;
    }

    public void setPlayerWin(int playerWin) {
        this.playerWin = playerWin;
    }

    public int getEnemyWin() {
        return enemyWin;
    }

    public void setEnemyWin(int enemyWin) {
        this.enemyWin = enemyWin;
    }


}

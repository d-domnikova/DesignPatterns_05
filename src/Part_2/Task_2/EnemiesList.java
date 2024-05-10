package Part_2.Task_2;

import java.util.ArrayList;
import java.util.List;

public class EnemiesList {
    private List<String> enemies;

    public EnemiesList() {
        this.enemies = new ArrayList<>();
    }

    public List<String> getEnemies() {
        return enemies;
    }

    public void addEnemy(String enemy) {
        enemies.add(enemy);
    }
    public void removeEnemy(String enemy) {
        enemies.remove(enemy);
    }
}
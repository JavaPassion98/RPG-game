package rpg.game.characters;

import java.util.Random;

public class Hunter extends Player {
    
    public Hunter(int attack, int hp, int initiative) {
        super(attack, hp, initiative);
    }
    
    @Override
    public int criticalHit() {
        Random random = new Random();
        int rand = random.nextInt(5);
        if(rand == 3) {
            return 2;
        } else 
            return 1;
    }      

    @Override
    public int defence() {
        Random random = new Random();
        int rand = random.nextInt(5);
        if(rand == 4) {
            return 0;
        } else 
            return 1;
    }        

    @Override
    public void promotion() {
        attack += 10;
        hp += 5;
        initiative += 3;
    }
}

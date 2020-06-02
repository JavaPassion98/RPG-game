package rpg.game.characters;

import java.util.Random;

/**
 *
 * @author Krystian
 */
public class Warrior extends Player {
    
    public Warrior(int attack, int hp, int initiative) {
        super(attack, hp, initiative);
    }
    
    @Override
    public int defence() {
        Random random = new Random();
        int rand = random.nextInt(4);
        if(rand == 2) {
            return 0;
        } else 
            return 1;       
    }       
       
    @Override
    public int criticalHit(){
        Random random = new Random();
        int rand = random.nextInt(5);
        if(rand == 3) {
            return 3;
        } else 
            return 1;
    }
        
}

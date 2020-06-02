package rpg.game.characters;

import java.util.Random;

public class Mage extends Player {
    
    public Mage(int attack, int hp, int initiative) {
        super(attack, hp, initiative);
    }           
            
    @Override
    public int criticalHit() {
        Random generator = new Random(5);
        int rnd = generator.nextInt();
        if(rnd == 2) 
            return 4;
        else return 1;
    }

    @Override
    public int defence() {
        return 1;
    }

    @Override
    public void promotion() {
        attack += 20;
        hp += 10;
        initiative += 1;
    }
    
}

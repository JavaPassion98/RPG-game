package rpg.game.characters;

import java.util.Random;

/**
 *
 * @author Krystian
 */
public class Mage extends Player {
    
    public Mage(int attack, int hp, int initiative) {
        super(attack, hp, initiative);
    }
    
    public void attack(Player player, Player enemy) {
        player.setHp(player.getHp() - enemy.getAttack());
    }    

    @Override
    public int getAttack() {
        return attack;
    }
    
    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    @Override
    public int getHp() {
        return hp;
    }
    
    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    @Override
    public int getInitiative() {
        return initiative;
    }
    
    @Override
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    
    @Override
    public int getAmountOfSkills() {
        return amountOfSkills;
    }
    
    @Override
    public void setAmountOfSkills(int amountOfSkills) {
        this.amountOfSkills = amountOfSkills;
    }
            
    public int fireBall() {
        Random generator = new Random(5);
        int rnd = generator.nextInt();
        if(rnd == 2) 
            return 4;
        else return 1;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.game.characters;

/**
 *
 * @author Krystian
 */
public abstract class Player implements Cloneable {
    
    protected int attack;
    protected int hp;
    protected int initiative;
    protected int amountOfSkills = 10;

    public Player(int attack, int hp, int initiative) {
        this.attack = attack;
        this.hp = hp;
        this.initiative = initiative;
    }
    
    public void attack(Player player, Player enemy) {
        player.setHp(player.getHp() - enemy.getAttack() * enemy.criticalHit() * player.defence());
    }    
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public abstract int criticalHit();
    public abstract int defence();

          public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getAmountOfSkills() {
        return amountOfSkills;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void setAmountOfSkills(int amountOfSkills) {
        this.amountOfSkills = amountOfSkills;
    }        
  
}

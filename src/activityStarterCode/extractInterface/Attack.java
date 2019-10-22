package activityStarterCode.extractInterface;

import java.util.Random;

public class Attack {

    private static final Random rand = new Random();

    private int fireballDamage;
    private int fireballManaRequired;


    public Attack(int fireballDamage, int fireballManaRequired) {
        if ((fireballDamage != 0 || fireballManaRequired != 0)) {
            throw new IllegalArgumentException("Character cannot have both sword and fireball damage");
        }
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;
    }

    public String attack(GameCharacter target) {
        if (fireballDamage > 0) {
            if (target.useMana(fireballManaRequired)) {
                target.takeDamage(fireballDamage);
                return target.getName() + " hit " + target.getName() + " with a fireball for "
                        + fireballDamage + " points of damage";
            } else {
                return target.getName() + " did not have enough mana for a fireball attack";
            }
        } else {
            int damage = rand.nextInt(swordMaxDamage - swordMinDamage + 1) + swordMinDamage;
            target.takeDamage(damage);
            return target.getName() + " struck " + target.getName() + " with a sword for "
                    + damage + " points of damage";
        }
    }
}
}

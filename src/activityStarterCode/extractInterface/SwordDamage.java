package activityStarterCode.extractInterface;

public class SwordDamage {
    private int swordMinDamage;
    private int  swordMaxDamage;
}

public SwordAttack(int swordMinDamage, int swordMaxDamage) {
    if ((swordMinDamage != 0 || swordMaxDamage != 0){
        throw new IllegalArgumentException("Character cannot have both sword and fireball damage");
    }

    this.swordMinDamage = swordMinDamage;
    this.swordMaxDamage = swordMaxDamage;
}

package activityStarterCode.extractInterface;


public class GameCharacter {

    private final String name;
    private int hitPoints, mana;
    private Attack attack;

    public GameCharacter(String name, int hitPoints, int mana, Attack attack) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.mana = mana;
        this.attack = attack;
    }


    public String getName (){
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMana() {
        return mana;
    }

    public void takeDamage(int damage) {
        hitPoints = Math.max(0, hitPoints - damage);
    }

    public boolean useMana(int amount) {
        if (mana >= amount) {
            mana -= amount;
            return true;
        } else {
            return false;
        }
    }
}

package characters;

public abstract class AnyCharacter {

    private String name;

    private int healthPoints;
    private int damage;
    private int armour;
    //    private int goldPieces;

    public AnyCharacter(String name, int healthPoints, int damage, int armour) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.armour = armour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }


}

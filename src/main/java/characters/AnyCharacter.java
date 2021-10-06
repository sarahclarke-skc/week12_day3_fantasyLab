package characters;

import equipments.ArmourType;

public abstract class AnyCharacter {

    private String name;

    private int healthPoints;
    private int damage;
    private ArmourType armour;
    //    private int goldPieces;

    public AnyCharacter(String name, int healthPoints, int damage, ArmourType armour) {
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

    public ArmourType getArmourType() {
        return armour;
    }

    public void setArmourType(ArmourType armour) {
        this.armour = armour;
    }


}

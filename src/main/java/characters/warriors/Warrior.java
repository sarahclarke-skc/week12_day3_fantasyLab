package characters.warriors;

import behaviours.ICanFight;
import characters.AnyCharacter;
import equipments.ArmourType;
import equipments.WeaponType;

import java.util.ArrayList;

public abstract class Warrior extends AnyCharacter implements ICanFight {

    private WeaponType currentWeapon;
    private ArrayList<WeaponType> weapons;

    public Warrior(String name, int healthPoints, int damage, ArmourType armour) {
        super(name, healthPoints, damage, armour);
        this.weapons = new ArrayList<>();
    };

    public ArrayList<WeaponType> getWeapons() {
        return weapons;
    };

    public void addWeapon(WeaponType weapon) {
        this.weapons.add(weapon);
    };

    public WeaponType getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(WeaponType currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public boolean checkWeaponInList(WeaponType weapon) {
        return weapons.contains(weapon);
    }

    public void changeWeapon(WeaponType weapon) {
        if (this.checkWeaponInList(weapon)) {
            this.setCurrentWeapon(weapon);
        }
    }

    public void fight(Knight knight, AnyCharacter defender) {
        int damage = knight.getCurrentWeapon().getStrength() * knight.getDamage();
        int healthPoint = defender.getHealthPoints();
        int result = healthPoint - damage;
        defender.setHealthPoints(result);
    }
}

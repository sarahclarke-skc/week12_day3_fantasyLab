package characters.warriors;

import characters.AnyCharacter;
import equipments.ArmourType;
import equipments.WeaponType;

import java.util.ArrayList;

public abstract class Warrior extends AnyCharacter {

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
}

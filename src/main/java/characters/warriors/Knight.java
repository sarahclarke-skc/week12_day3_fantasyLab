package characters.warriors;

import equipments.WeaponType;

public class Knight extends Warrior {

    public Knight(String name, int healthPoints, int damage, int armour) {
        super(name, healthPoints, damage, armour);

        super.addWeapon(WeaponType.SWORD);
        super.addWeapon(WeaponType.POTATO);
        super.setCurrentWeapon(this.getWeapons().get(0));
    }
}
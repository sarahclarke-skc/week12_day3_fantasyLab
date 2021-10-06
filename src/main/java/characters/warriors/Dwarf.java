package characters.warriors;

import equipments.WeaponType;

public class Dwarf extends Warrior {


    public Dwarf(String name, int healthPoints, int damage, int armour) {
        super(name, healthPoints, damage, armour);

        super.addWeapon(WeaponType.AXE);
        super.addWeapon(WeaponType.POTATO);
        super.setCurrentWeapon(this.getWeapons().get(0));
    }

}

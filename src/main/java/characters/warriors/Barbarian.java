package characters.warriors;

import equipments.ArmourType;
import equipments.WeaponType;

public class Barbarian extends Warrior {

//    warCry: increase some abilities /  give damage to enemy

    public Barbarian(String name, int healthPoints, int damage, ArmourType armour) {
        super(name, healthPoints, damage, armour);

        super.addWeapon(WeaponType.CLUB);
        super.addWeapon(WeaponType.POTATO);
        super.setCurrentWeapon(this.getWeapons().get(0));
    }

}

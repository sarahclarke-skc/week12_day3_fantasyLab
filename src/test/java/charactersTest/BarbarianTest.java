package charactersTest;

import characters.warriors.Barbarian;
import equipments.ArmourType;
import equipments.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian("BloodSeeker", 110, 3, ArmourType.HORNED_HELMET);
    }

    @Test
    public void hasWeaponsInArrayList() {
        assertEquals(2, this.barbarian.getWeapons().size());
    }

    @Test
    public void hasArmourType() {
        assertEquals(ArmourType.HORNED_HELMET, this.barbarian.getArmourType());
    }

    @Test
    public void hasDefaultWeapon() {
        assertEquals(WeaponType.CLUB, this.barbarian.getCurrentWeapon());
    }
}

package charactersTest;

import characters.warriors.Barbarian;
import equipments.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian("BloodSeeker", 110, 3, 15);
    }

    @Test
    public void hasWeaponsInArrayList() {
        assertEquals(2, this.barbarian.getWeapons().size());
    }

    @Test
    public void hasDefaultWeapon() {
        assertEquals(WeaponType.CLUB, this.barbarian.getCurrentWeapon());
    }
}

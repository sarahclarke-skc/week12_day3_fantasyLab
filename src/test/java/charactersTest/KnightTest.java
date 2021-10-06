package charactersTest;

import characters.warriors.Knight;
import equipments.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before() {
        knight = new Knight("Arthur", 120, 2, 20);
    }

    @Test
    public void hasWeaponsInArrayList() {
        assertEquals(2, this.knight.getWeapons().size());
    }

    @Test
    public void hasDefaultWeapon() {
        assertEquals(WeaponType.SWORD, this.knight.getCurrentWeapon());
    }

}

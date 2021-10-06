package charactersTest;

import characters.warriors.Dwarf;
import characters.warriors.Knight;
import equipments.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf("Kim Lee", 100, 4, 10);
    }

    @Test
    public void hasWeaponsInArrayList() {
        assertEquals(2, this.dwarf.getWeapons().size());
    }

    @Test
    public void hasDefaultWeapon() {
        assertEquals(WeaponType.AXE, this.dwarf.getCurrentWeapon());
    }

}

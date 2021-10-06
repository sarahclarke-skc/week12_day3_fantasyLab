package charactersTest;

import characters.AnyCharacter;
import characters.warriors.Barbarian;
import equipments.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnyCharacterTest {

    AnyCharacter anyCharacter;

    @Before
    public void before() {
        anyCharacter = new Barbarian("BloodSeeker", 110, 3, 15);
    }

    @Test
    public void hasName() {
        assertEquals("BloodSeeker", this.anyCharacter.getName());
    }

//    @Test
//    public void hasDefaultWeapon() {
//        assertEquals(WeaponType.CLUB, this.anyCharacter.);
//    }

}

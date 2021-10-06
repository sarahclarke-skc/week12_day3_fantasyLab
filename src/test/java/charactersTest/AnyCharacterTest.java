package charactersTest;

import characters.AnyCharacter;
import characters.warriors.Barbarian;
import equipments.ArmourType;
import equipments.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnyCharacterTest {

    AnyCharacter anyCharacter;

    @Before
    public void before() {
        anyCharacter = new Barbarian("BloodSeeker", 110, 3, ArmourType.HORNED_HELMET);
    }

    @Test
    public void hasName() {
        assertEquals("BloodSeeker", this.anyCharacter.getName());
    }

}

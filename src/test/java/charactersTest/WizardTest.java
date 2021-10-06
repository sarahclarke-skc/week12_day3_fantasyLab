package charactersTest;

import characters.spellCasters.Wizard;
import equipments.ArmourType;
import equipments.CreatureType;
import equipments.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {


    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard("Dumbledore", 90, 2, ArmourType.GOOD_CAPE);
    }

    @Test
    public void hasSpellsInArrayList() {
        assertEquals(2, this.wizard.getSpells().size());
    }

    @Test
    public void hasCurrentSpell() {
        assertEquals(SpellType.LIGHTNING_STRIKE, this.wizard.getCurrentSpell());
    }

    @Test
    public void hasCreaturesInArrayList() {
        assertEquals(2, this.wizard.getCreatures().size());
    }

    @Test
    public void hasCurrentCreature() {
        assertEquals(CreatureType.OGRE, this.wizard.getCurrentCreature());
    }

}

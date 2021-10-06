package charactersTest;

import characters.spellCasters.Warlock;
import equipments.ArmourType;
import equipments.CreatureType;
import equipments.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before() {
        warlock = new Warlock("Voldemort", 90, 2, ArmourType.EVIL_CAPE);
    }

    @Test
    public void hasSpellsInArrayList() {
        assertEquals(2, this.warlock.getSpells().size());
    }

    @Test
    public void hasCurrentSpell() {
        assertEquals(SpellType.FIREBALL, this.warlock.getCurrentSpell());
    }

    @Test
    public void hasCreaturesInArrayList() {
        assertEquals(2, this.warlock.getCreatures().size());
    }

    @Test
    public void hasCurrentCreature() {
        assertEquals(CreatureType.OGRE, this.warlock.getCurrentCreature());
    }

    @Test
    public void canChangeSpell() {
        this.warlock.changeSpell(SpellType.CURSE);
        assertEquals(SpellType.CURSE, this.warlock.getCurrentSpell());
    }

    @Test
    public void canNotChangeSpell() {
        this.warlock.changeSpell(SpellType.LIGHTNING_STRIKE);
        assertEquals(SpellType.FIREBALL, this.warlock.getCurrentSpell());
    }

    @Test
    public void canChangeCreature() {
        this.warlock.changeCreature(CreatureType.DRAGON);
        assertEquals(CreatureType.DRAGON, this.warlock.getCurrentCreature());
    }

    @Test
    public void canNotChangeCreature() {
        this.warlock.changeCreature(CreatureType.OWL);
        assertEquals(CreatureType.OGRE, this.warlock.getCurrentCreature());
    }

}

import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("lil dragon", 10, 10, 10);
    assertEquals("lil dragon", myPet.getName());
    assertEquals("alive", myPet.isAliveOrDead());
    assertEquals(10, myPet.getFoodLevel());
    assertEquals(10, myPet.getSleepLevel());
    assertEquals(10, myPet.getExerciseLevel());
  }

  @Test
  public void tamagotchi_isDead() {
    Tamagotchi myPet = new Tamagotchi("lil dragon", 10, 0, 10);
    assertEquals("lil dragon", myPet.getName());
    assertEquals("dead", myPet.isAliveOrDead());
  }
  @Test
  public void tamagotchi_isAlive() {
    Tamagotchi myPet = new Tamagotchi("lil dragon", 1, 1, 1);
    assertEquals("lil dragon", myPet.getName());
    assertEquals("alive", myPet.isAliveOrDead());
  }
}

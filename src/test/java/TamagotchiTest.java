import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("lil dragon", 10, 10, 10);
    assertEquals("lil dragon", myPet.getName());
    assertEquals("lil dragon is alive", myPet.isAliveOrDead());
    assertEquals(10, myPet.getFoodLevel());
    assertEquals(10, myPet.getSleepLevel());
    assertEquals(10, myPet.getExerciseLevel());
  }

  @Test
  public void tamagotchi_isDead() {
    Tamagotchi myPet = new Tamagotchi("lil dragon", 10, 0, 10);
    assertEquals("lil dragon", myPet.getName());
    assertEquals("lil dragon is dead", myPet.isAliveOrDead());
  }
  @Test
  public void tamagotchi_isAlive() {
    Tamagotchi myPet = new Tamagotchi("lil dragon", 1, 1, 1);
    assertEquals("lil dragon", myPet.getName());
    assertEquals("lil dragon is alive", myPet.isAliveOrDead());
  }
  @Test
  public void tamagotchi_increaseExercise() {
    Tamagotchi myPet = new Tamagotchi("lil dragon", 10, 10, 10);
    myPet.addExercise();
    assertEquals("lil dragon", myPet.getName());
    assertEquals(9, myPet.getFoodLevel());
    assertEquals(9, myPet.getSleepLevel());
    assertEquals(12, myPet.getExerciseLevel());
  }

  @Test
  public void tamagotchi_increaseFood() {
    Tamagotchi myPet = new Tamagotchi("lil dragon", 10, 10, 10);
    myPet.addFood();
    assertEquals("lil dragon", myPet.getName());
    assertEquals(12, myPet.getFoodLevel());
    assertEquals(9, myPet.getSleepLevel());
    assertEquals(9, myPet.getExerciseLevel());
  }

  @Test
  public void tamagotchi_increaseSleep() {
    Tamagotchi myPet = new Tamagotchi("lil dragon", 10, 10, 10);
    myPet.addSleep();
    assertEquals("lil dragon", myPet.getName());
    assertEquals(9, myPet.getFoodLevel());
    assertEquals(12, myPet.getSleepLevel());
    assertEquals(9, myPet.getExerciseLevel());
  }


}

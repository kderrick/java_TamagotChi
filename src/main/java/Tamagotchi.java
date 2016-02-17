public class Tamagotchi {
  private String mName;
  private int mSleepLevel;
  private int mFoodLevel;
  private int mExerciseLevel;
  private String mStatus;

  public Tamagotchi(String name, int sleepLevel, int foodLevel, int exerciseLevel) {
    mName = name;
    mSleepLevel = sleepLevel;
    mFoodLevel = foodLevel;
    mExerciseLevel = exerciseLevel;
    mStatus = "alive";
  }

  public String getName() {
    return mName;
  }

  public int getFoodLevel() {
    return mFoodLevel;
  }

  public String isAliveOrDead() {
    if((mFoodLevel == 0) || (mSleepLevel == 0) || (mExerciseLevel == 0)) {
      mStatus = mName + " " + "is dead";
    } else {
      mStatus = mName + " " + "is alive";
    }
    return mStatus;
  }

  public int getSleepLevel() {
    return mSleepLevel;
  }

  public int getExerciseLevel() {
    return mExerciseLevel;
  }

  public void addExercise() {
    mExerciseLevel += 2;
    mFoodLevel -= 1;
    mSleepLevel -= 1;
  }

  public void addFood() {
    mFoodLevel += 2;
    mSleepLevel -= 1;
    mExerciseLevel -= 1;
  }

  public void addSleep() {
    mSleepLevel += 2;
    mFoodLevel -= 1;
    mExerciseLevel -= 1;
  }
}

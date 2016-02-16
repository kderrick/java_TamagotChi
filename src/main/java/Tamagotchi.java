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
      mStatus = "dead";
    }
    return mStatus;
  }

  public int getSleepLevel() {
    return mSleepLevel;
  }

  public int getExerciseLevel() {
    return mExerciseLevel;
  }

  // public addExercise() {
  //
  // }
  //
  // public addFood() {
  //
  // }
  //
  // public addSleep() {
  //
  // }
  }

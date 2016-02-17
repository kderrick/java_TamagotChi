import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {


        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          String inputtedName = request.queryParams("name");
          model.put("name", request.session().attribute("name"));
          model.put("Sleep", request.session().attribute("mSleepLevel"));
          model.put("Food", request.session().attribute("mFoodLevel"));
          model.put("Exercise", request.session().attribute("mExerciseLevel"));
          model.put("template", "templates/index.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/welcome", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();

          String inputtedName = request.queryParams("name");
          Tamagotchi userTamagotchi = new Tamagotchi(inputtedName, 10, 10, 10);
          int displaySleep = userTamagotchi.getSleepLevel();
          int displayFood = userTamagotchi.getFoodLevel();
          int displayExercise = userTamagotchi.getExerciseLevel();


          request.session().attribute("tamagotchi", userTamagotchi);
          model.put("name", inputtedName);
          model.put("tamagotchiName", inputtedName);
          model.put("Sleep", displaySleep);
          model.put("Food", displayFood);
          model.put("Exercise", displayExercise);

          model.put("template", "templates/index.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/sleep", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();


          Tamagotchi tempTamagotchi = request.session().attribute("tamagotchi");

          tempTamagotchi.addSleep();

          String inputtedName = tempTamagotchi.getName();
          int displaySleep = tempTamagotchi.getSleepLevel();
          int displayFood = tempTamagotchi.getFoodLevel();
          int displayExercise = tempTamagotchi.getExerciseLevel();


          request.session().attribute("tamagotchi", tempTamagotchi);

          request.session().attribute("name", inputtedName);
          request.session().attribute("Sleep", displaySleep);
          request.session().attribute("Food", displayFood);
          request.session().attribute("Exercise", displayExercise);

          model.put("name", inputtedName);
          model.put("tamagotchiName", inputtedName);
          model.put("Sleep", displaySleep);
          model.put("Food", displayFood);
          model.put("Exercise", displayExercise);

          model.put("template", "templates/index.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/food", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();


          Tamagotchi tempTamagotchi = request.session().attribute("tamagotchi");

          tempTamagotchi.addFood();

          String inputtedName = tempTamagotchi.getName();
          int displaySleep = tempTamagotchi.getSleepLevel();
          int displayFood = tempTamagotchi.getFoodLevel();
          int displayExercise = tempTamagotchi.getExerciseLevel();


          request.session().attribute("tamagotchi", tempTamagotchi);

          request.session().attribute("name", inputtedName);
          request.session().attribute("Sleep", displaySleep);
          request.session().attribute("Food", displayFood);
          request.session().attribute("Exercise", displayExercise);

          model.put("name", inputtedName);
          model.put("tamagotchiName", inputtedName);
          model.put("Sleep", displaySleep);
          model.put("Food", displayFood);
          model.put("Exercise", displayExercise);

          model.put("template", "templates/index.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/exercise", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();


          Tamagotchi tempTamagotchi = request.session().attribute("tamagotchi");

          tempTamagotchi.addExercise();

          String inputtedName = tempTamagotchi.getName();
          int displaySleep = tempTamagotchi.getSleepLevel();
          int displayFood = tempTamagotchi.getFoodLevel();
          int displayExercise = tempTamagotchi.getExerciseLevel();


          request.session().attribute("tamagotchi", tempTamagotchi);

          request.session().attribute("name", inputtedName);
          request.session().attribute("Sleep", displaySleep);
          request.session().attribute("Food", displayFood);
          request.session().attribute("Exercise", displayExercise);

          model.put("name", inputtedName);
          model.put("tamagotchiName", inputtedName);
          model.put("Sleep", displaySleep);
          model.put("Food", displayFood);
          model.put("Exercise", displayExercise);

          model.put("template", "templates/index.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

    }
}

//long startTime = System.nanoTime();    checks time elapsed
// ... the code being measured ...
//long estimatedTime = System.nanoTime() - startTime;

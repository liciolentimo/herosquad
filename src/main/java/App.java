import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import java.util.ArrayList;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/squads/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/squadForm.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/heroes/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/heroForm.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    // get("/squads", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("squads", Squad.all());
    //   model.put("template", "templates/squadList.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    



  }
}
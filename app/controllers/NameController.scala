package controllers

import play.api.mvc.{Action, Controller}
import play.api.libs.json.Json
import play.api.Routes

case class Name(value: String)

object NameController extends Controller {

  implicit val fooWrites = Json.writes[Name]

  def getName = Action {
    Ok(Json.toJson(Name("Hello from Name")))
  }

  def javascriptRoutes2 = Action { 
  	implicit request =>
    Ok(Routes.javascriptRouter("jsRoutes")(routes.javascript.NameController.getName)).as(JAVASCRIPT)
  }

}
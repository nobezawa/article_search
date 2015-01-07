package Json

/**
 * Created by nobezawa on 2015/01/07.
 */

import spray.json._

class Json {

  case class TvJson(tv_url: String)

  object MyJsonProtocol extends DefaultJsonProtocol {
    implicit val articleFormat = jsonFormat1(TvJson)
  }

  class MyJsonLogic {
    import MyJsonProtocol._

    def parseJson(source: String): Unit = {
      println("json")
      println(source.parseJson.convertTo[TvJson])
    }
  }

}

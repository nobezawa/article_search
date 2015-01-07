package Http

import scalaj.http._

/**
 * Created by nobezawa on 2015/01/07.
 */
class HttpClient {
  val url = "http://172.30.82.32:8362/tv/api/v2/items.json"

  def request_json: String = {
    val response: HttpResponse[String] = Http(url).param("codevalue", "AREAM2105").param("codetype", "aream").asString
    response.body
  }

}

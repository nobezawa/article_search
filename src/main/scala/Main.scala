package scala

import Http.HttpClient
import Json.Json

import scala.slick.jdbc._
import scala.slick.driver.MySQLDriver.simple._

/**
 * Created by nobezawa on 2014/12/29.
 */
object Main {

  def main(args: Array[String]): Unit = {
    println("Hello World")
    val client = new HttpClient()
    val json = new Json
    val my_json = new json.MyJsonLogic
    my_json.parseJson(client.request_json)
  }

//  class Article(tag: Tag) extends Table[(Int, String, String)](tag, "articles") {
//    def id = column[Int]("id", O.PrimaryKey)
//    def title = column[String]("title")
//    def description = column[String]("description")
//    def * = (id, title, description)
//  }
//
//  val articles = TableQuery[Article]
//
//  def db_select() = {
//    Database.forURL("jdbc:mysql://localhost/scala_test?user=root&password=",
//      driver = "com.mysql.jdbc.Driver") withSession {
//        implicit session =>
//          //DBアクセスコードはここへ記
//          articles foreach {
//            case (id, title, description) =>
//              println("  " + id + " " + title + " " + description)
//          }
//      }
//  }

}

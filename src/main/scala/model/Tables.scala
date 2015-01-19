package model
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = scala.slick.driver.MySQLDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: scala.slick.driver.JdbcProfile
  import profile.simple._
  import scala.slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import scala.slick.jdbc.{ GetResult => GR }

  /** DDL for all tables. Call .create to execute. */
  lazy val ddl = Articles.ddl

  /**
   * Entity class storing rows of table Articles
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param title Database column title DBType(VARCHAR), Length(255,true)
   *  @param description Database column description DBType(TEXT), Length(65535,true)
   */
  case class ArticlesRow(id: Int, title: String, description: String)
  /** GetResult implicit for fetching ArticlesRow objects using plain SQL queries */
  implicit def GetResultArticlesRow(implicit e0: GR[Int], e1: GR[String]): GR[ArticlesRow] = GR {
    prs =>
      import prs._
      ArticlesRow.tupled((<<[Int], <<[String], <<[String]))
  }
  /** Table description of table articles. Objects of this class serve as prototypes for rows in queries. */
  class Articles(_tableTag: Tag) extends Table[ArticlesRow](_tableTag, "articles") {
    def * = (id, title, description) <> (ArticlesRow.tupled, ArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, title.?, description.?).shaped.<>({ r => import r._; _1.map(_ => ArticlesRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column title DBType(VARCHAR), Length(255,true) */
    val title: Column[String] = column[String]("title", O.Length(255, varying = true))
    /** Database column description DBType(TEXT), Length(65535,true) */
    val description: Column[String] = column[String]("description", O.Length(65535, varying = true))
  }
  /** Collection-like TableQuery object for table Articles */
  lazy val Articles = new TableQuery(tag => new Articles(tag))
}
import scala.util.{Success, Try}

object Application extends App {

  args.toList match {
    case a :: b :: _ =>
      (Try(a.toInt), Try(b.toInt)) match {
        case (Success(ai), Success(bi)) =>
          val res = SophisticMLAlgorithm1.calculate(ai, bi)
          print(s"SophisticMLAlgorithm1.calculate($ai, $bi) = $res")
        case _ => usage()
      }
    case _ => usage()
  }

  private def usage(): Unit = println("Usage: <app> <int-1> <int-2>")

}

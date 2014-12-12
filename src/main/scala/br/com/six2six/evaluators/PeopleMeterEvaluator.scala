package br.com.six2six.evaluators

import scala.collection.JavaConversions._
import br.com.six2six.{ Executor, Stature }

object PeopleMeterEvaluator {

  def evaluate(heigth: Double): Stature = heigth match {
    case heigth if heigth < 160                 => Stature.SHORT
    case heigth if heigth > 160 && heigth < 175 => Stature.MEDIUM
    case heigth if heigth > 175                 => Stature.TALL
  }

  def main(args: Array[String]): Unit = {
    val executor = Executor("people_meter.tlc")

    List(159, 161).foreach( height => {
      val stature = executor.evaluate(Map("height" -> height)).getValueTo("stature")
      println(s"Heigth $height is considered ${evaluate(stature.head)}")
    })
  }
}
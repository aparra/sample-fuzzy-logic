package br.com.six2six

import java.io.FileNotFoundException
import net.sourceforge.jFuzzyLogic.FIS

case class Executor(fuzzyFile: String) {

  val fuzzLogic: FIS = Option(FIS.load(s"src/main/fuzzy/$fuzzyFile")) match {
    case Some(fuzzyLogic) => fuzzyLogic
    case _                => throw new FileNotFoundException(s"File not found: $fuzzyFile")
  }

  def evaluate(params: Map[String, Double]): Executor = {
    params.foreach { case (varName, value) => fuzzLogic.setVariable(varName, value) }
    fuzzLogic.evaluate
    this
  }

  def getValueTo(vars: String*): Seq[Double] = vars.map { name => fuzzLogic.getVariable(name).getValue }
}
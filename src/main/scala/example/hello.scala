package supermarket.example

import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExportTopLevel



object TutorialApp {
  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

/*  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }
*/
  def main(args: Array[String]): Unit = {
    appendPar(document.body, "Hello World")

    val par = document.createElement("p")
    val txt = document.createTextNode("no one can stop main() function.")
    par.appendChild(txt)
    document.body.appendChild(par)
  }
}

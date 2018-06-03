package supermarket.example

import org.scalajs.dom
import dom.document
import dom.html
import scala.scalajs.js.annotation.JSExportTopLevel
import scala.scalajs.js.annotation.JSExport


@JSExportTopLevel("TutorialApp")
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

  var quant: Int = 0

  @JSExport
  def changetxt(target: html.Div): Unit = {
    target.innerHTML = quant.toString
  }

  @JSExport
  def push(target: html.Div): Unit = {
    if (quant<10) {quant = quant+1} else {dom.window.alert("That's maximum.")}
    target.innerHTML = quant.toString
  }

  @JSExport
  def pop(target: html.Div): Unit = {
    if (quant>0) {quant = quant-1} else {dom.window.alert("That's minimum.")}
    target.innerHTML = quant.toString
  }



  def main(args: Array[String]): Unit = {
    appendPar(document.body, "Hello World")

    val par = document.createElement("p")
    val txt = document.createTextNode("no one can stop main() function.")
    par.appendChild(txt)
    document.body.appendChild(par)
  }
}

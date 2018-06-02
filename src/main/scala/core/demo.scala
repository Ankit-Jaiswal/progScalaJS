package supermarket.core

case object demo {
  import shop._

  val colgate = Item("Colgate Toothpaste","200gm",74.50)
  val maggie = Item("Nestle Maggie","pack of 4",96)
  val amulGold = Item("Amul Gold milk","500ml",25)
  val glucose = Item("GluconD","Orange",64)
  val chini = Item("Sugar","2kg",56)
  val tataNamak = Item("Tata Salt","1Kg",15)
  val tataChaiPrem = Item("Tata Tea Premium","250gm", 132)

  val itmlst = Vector(colgate,maggie,amulGold,glucose,chini,tataNamak,tataChaiPrem)
  def showItems = itmlst.foreach { println }

  def addSome: Cart = {
    colgate.push
    maggie.push
    glucose.push
    tataNamak.push
    chini.push
    glucose.push
    amulGold.push
    tataChaiPrem.push
  }

  def bill = shop.billedCart
  def showBill = bill foreach {case (itm,value) => println(itm._1 + " -> " + itm._2 + " -> " + value)}
  def showTotal = shop.total
}

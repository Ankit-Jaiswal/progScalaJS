package supermarket.core

case object shop {
  type Cart = scala.collection.mutable.Map[Item,Int]
  val cart: Cart = scala.collection.mutable.Map[Item,Int]()

//  def clearCart: Cart = cart.clear()
  def billedCart = cart.map(x => (x -> x._1.price * x._2))
  def subtotal = billedCart.values
  def total: Double = if (cart.isEmpty) {0.0} else { subtotal.reduceLeft(_+_) }

  case class Item(val name: String, val spec: String, val price: Double){
    def push: Cart =
      if (cart contains this) {
        cart(this) = cart(this) + 1
        cart
      }
      else { cart += (this -> 1) }

    def pop: Cart =
      if (!(cart contains this)) {cart}
      else if (cart(this) == 1) {cart -= this}
      else {
        cart(this) = cart(this) - 1
        cart
      }
  }

  def main(args: Array[String]): Unit = {

  }


}

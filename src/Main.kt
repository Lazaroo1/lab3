fun main() {
    val burger = Burger("Doble queso", 510.0)
    val pizza = Pizza("Peperoni", 802.0)
    val iceCream = Icecream("Vainilla", 252.0)
    val juice = Juice("Arandanos", 306.0)

    println(burger.cook())
    println(pizza.cook())
    println(iceCream.cook())
    println(juice.cook())

    println(juice.pour())

    println(iceCream.eat())

    val discounted = burger.discountedPrice(25.0)
    println("Hamburguesa con 25% de descuento: Q$discounted")
}

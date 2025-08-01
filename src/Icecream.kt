// hereda de Food e implementa Dessert
class Icecream(name: String, price: Double) : Food(name, price), Dessert {
    override fun cook(): String {
        return "Enfriando el helado $name en congelador"
    }

    override fun eat(): String {
        return "Comiendo el helado $name "
    }
}

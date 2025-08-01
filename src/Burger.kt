class Burger(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Asando la hamburguesa $name en la parrilla"
    }
}

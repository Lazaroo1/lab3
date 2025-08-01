class Juice(name: String, price: Double) : Drink(name, price) {
    override fun pour(): String {
        return "Sirviendo el jugo $name en el vaso"
    }

    override fun cook(): String {
        return "Licuando la fruta para hacer jugo $name"
    }
}

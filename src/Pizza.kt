class Pizza(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Horneando la pizza $name a fuego medio"
    }
}

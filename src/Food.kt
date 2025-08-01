// Clase base para todos los alimentos
abstract class Food(val name: String, val price: Double) {
    // Función abstracta que cada comida debe implementar
    abstract fun cook(): String
}

fun Food.discountedPrice(discountPercent: Double): Double {
    return price - (price * discountPercent / 100)
}

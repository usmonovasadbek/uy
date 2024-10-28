fun main() {
    val showroom = CarShowroom()

    showroom.addCar(Car("BMW", "nexia ", 2020, 79999.99))
    showroom.addCar(Car("jentra", "matiz", 2018, 22000.00))
    showroom.addCar(Car("malibu", "spark", 2019, 26000.00))
    showroom.addCar(Car("captiva", "Damas", 2021, 55999.99))

    showroom.listCars()

    showroom.findCarsByPrice(30000.00)
}

data class Car(
    val model: String,
    val manufacturer: String,
    val year: Int,
    val price: Double
)

class CarShowroom {
    private val cars = mutableListOf<Car>()

    fun addCar(car: Car) {
        cars.add(car)
        println("Avtomobil qo'shildi: $car")
    }

    fun listCars() {
        if (cars.isEmpty()) {
            println("Katalogda hech qanday avtomobil yo'q.")
        } else {
            println("Katalogdagi avtomobillar:")
            for (car in cars) {
                println(car)
            }
        }
    }

    fun findCarsByPrice(maxPrice: Double) {
        val foundCars = cars.filter { it.price <= maxPrice }
        if (foundCars.isEmpty()) {
            println("Narxi $maxPrice dan past avtomobillar topilmadi.")
        } else {
            println("Narxi $maxPrice dan past avtomobillar:")
            for (car in foundCars) {
                println(car)
            }
        }
    }
}


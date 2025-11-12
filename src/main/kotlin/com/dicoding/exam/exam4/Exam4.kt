package com.dicoding.exam.exam4

// TODO
open class Car(val name: String, val year: Int) {
    open fun getCarInfo(): String {
        return "$name keluaran tahun $year"
    }
}

// TODO
class ElectricCar(name: String, year: Int, val batteryCapacity: Int) : Car(name, year) {
    override fun getCarInfo(): String {
        return "$name keluaran tahun $year dengan kapasitas baterai $batteryCapacity kWh"
    }
}
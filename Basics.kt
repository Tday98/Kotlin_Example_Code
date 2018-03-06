/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

import java.util.*

const val integral: Char = '\u222B'
const val greeting: String = "Hello"
@JvmField val sample1: Byte = 0x3A
fun main(args: Array<String>) {
    var sample2  = 58
    var heartRate  = 85
    var deposits: Double = 135002796.toDouble()
    val acceleration: Float = 9.800.toFloat()
    var mass: Float = 14.6.toFloat()
    var distance: Double = 129.763001

    var lost = true
    var expensive = true

    var choice = 2

    var name = "Karen"

    print("Sample1: ")
    println(sample1)
    print("Sample2: ")
    println(sample2)
    print("heartRate: ")
    println(heartRate)
    print("deposits: ")
    println(deposits)
    print("acceleration: ")
    println(acceleration)
    print("mass: ")
    println(mass)
    print("distance: ")
    println(distance)
    print("lost: ")
    println(lost)
    print("expensive: ")
    println(expensive)
    print("choice: ")
    println(choice)
    print("integral: ")
    println(integral)
    println()

    print("Those are all the values... Here is the rest of the program")
    println()

    if (sample1 == sample2.toByte())
        println("They are equal")
    else
        println("They are not equal")

    if (heartRate in 40..80)
        println("Heart rate is normal")
    else
        println("Heart rate is not normal")

    if (deposits > 100000000)
        println("You are exceedingly wealthy")
    else
        println("Sorry you are so poor")

    val force = mass * acceleration

    println("force = ${force} and, ${distance} is the distance")

    if (lost and expensive)
        println("I am really sorry! I will get the manager.")
    else
        println("Here is a coupon for 10% off.")

    when(choice) {
        1 -> println("You chose 1.")
        2 -> println("You chose 2.")
        3 -> println("You chose 3.")
        else -> {
            println("You made an unknown choice.")
        }
    }

    println("${integral} is an integral.")

    for (i in 5..10) {
        println("i = ${i}")
    }

    var age: Int = 0
    while (age < 6) {
        println("age = ${age}")
        age += 1
    }

    println(greeting + " " + name)
}
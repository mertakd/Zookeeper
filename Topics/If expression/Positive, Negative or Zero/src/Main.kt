fun main() {
    val a = readln().toInt().toString()
    val b = readln().toInt().toString()

    println(if (a < b) {
        "negative"
    } else if (a > b) {
        "positive"
    } else {
        "zero"
    })
}

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    coroutineScope {
        launch {
            startClock(5, "tick")
        }
        launch {
            startClock(7, "tack")
        }
        launch {
            startClock(10, "tuck")
        }
    }
}

suspend fun startClock(seconds: Int, sound: String) {
    for (i in 0 until seconds - 1) {
        delay(1000L)
        println("$sound (${i + 1})\t")
    }
    delay(1000)
    println("$sound ($seconds) = BOOM")
}

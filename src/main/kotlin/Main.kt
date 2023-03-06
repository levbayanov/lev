import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException

fun main() {

    val file = File("C:\\Users\\levba\\IdeaProjects\\KotlinProgect\\src\\main\\resources\\input.txt")
    try {
        BufferedReader(FileReader(file)).use { br ->
            var line: String?
            while (br.readLine().also { line = it } != null) {
                println(line)
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}

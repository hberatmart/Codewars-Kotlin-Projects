package catmouse

fun catMouse(s: String): String {
    val sSize = s.length
    return if (sSize <= 5) {
        "Caught!"
    } else {
        "Escaped!"
    }
}

fun main(){
    catMouse("C...m")
}

/*
For example:
Input: "C....m"
Output: "Escaped!"
 */

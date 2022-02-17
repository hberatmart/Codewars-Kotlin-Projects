fun dutyFree(normPrice:Int, discount:Int, hol:Int): Int {
    return (hol * 100 / normPrice / discount)
}

fun main() {
    dutyFree(12,50, 1000)
}

//input : dutyFree(12, 50, 1000)
// output : 166
package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var i = 0
        var result = 0
        while (i < bill.size) {
            if (i != k) result += bill[i]
            i++
        }
        if (b - result/2 > 0) return (b - result/2).toString()
        else return "bon appetit"
    }
}

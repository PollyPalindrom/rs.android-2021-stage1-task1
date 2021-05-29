package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val charArray = inputString.toCharArray()
        val result = ArrayList<String>()
        var i = 0
        var bracketType = 0
        val brackets = charArrayOf('<', '[', '(')
        val closingBrackets = charArrayOf('>', ']', ')')
        var flg = 0
        for (i in charArray.indices) {
            bracketType = brackets.indexOf(charArray[i])
            if (bracketType != -1) {
                var temp = ""
                for (i1 in i + 1 until charArray.size) {
                    if (charArray[i1] == closingBrackets[bracketType] && flg == 0) break
                    temp += charArray[i1].toString()
                    if (charArray[i1] == charArray[i]) flg++
                    if (charArray[i1] == closingBrackets[bracketType]) flg--
                }
                result.add(temp)
            }
        }
        return result.toTypedArray()
    }
}

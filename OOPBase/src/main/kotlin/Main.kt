fun main(args: Array<String>) {
   val number= listOf<Int>(13,65,3,67,-3,1)
    val x = findMax(number)
    println(x)
}

fun findMax (inputList: List<Int>): Int {
    var max = Int.MIN_VALUE
    for (i in inputList.indices) {
        if (max < inputList[i]) {
           max = inputList[i]
        }
    }
    return max
}

fun printList (inputList: List <Any>) {
    for (i in inputList.indices){
        println(inputList[i])
    }
}


// задачи по теме if-else
fun ifFirstTask() {
    var x = 6
    var y = 8

    if (y != 0) {
        print(x / y)
    } else {
        println ("делит на ноль нельзя ")
    }

    println ("программа закончина ")
}

fun ifSecondTask() {
    var p = 3
    var b = 6
    var fn = p + b
    if (fn > 0) {
        println ("больше ноля ")
    }else {
        println ("меньше ноля ")
    }
}

fun ifThirdTask() {
    val month = 12
    if (month == 12) {
        println("december")
    }
    else if (month == 11) {
        println("november")
    }
    else if (month == 10) {
        println("october")
    }
    else if (month == 9 ) {
        println("september")
    }
    else if (month == 8 ){
        println("avgisy")
    }else {
}






}

fun iftask4(){
    val month = 12
    if (month == 12) {
        println("december")
    }
    else if (month == 11) {
        println("november")
    }
    else if (month == 10) {
        println("october")
    }
    else if (month == 9 ) {
        println("september")
    }
    else if (month == 8 ){
        println("avgisy")
    }else {

    }
}


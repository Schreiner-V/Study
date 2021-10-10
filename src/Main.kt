/*
Необходимо создать программу, которая будет решать судоку
Судоку: Двумерный массив, 9 на 9
*/

fun main(){
    val BaseArray = test()
    for (string in BaseArray){
        for (element in string){
            print("$element \t")
        }
        println()
    }
}

fun test():Array<Array<Int>>{
    val table: Array<Array<Int>> = Array(9) { Array(9, { 0 }) }

    table[0][1] = 6
    table[1][1] = 5
    table[2][1] = 1

    table[1][4] = 6
    table[1][5] = 1
    table[2][4] = 9

    table[1][7] = 8
    table[0][8] = 4
    table[2][8] = 3


    table[3][0] = 2
    table[5][0] = 9

    table[4][3] = 6
    table[5][3] = 7
    table[3][4] = 8
    table[4][5] = 4

    table[5][7] = 4
    table[3][8] = 7


    table[7][0] = 3
    table[6][1] = 9

    table[6][4] = 7
    table[7][4] = 1

    table[6][6] = 5
    table[7][8] = 8

    return table
}



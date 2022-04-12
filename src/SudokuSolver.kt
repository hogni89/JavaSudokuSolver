package main.kotlin

fun main() {

    val gridSize = 9

    val board = listOf(
        listOf(0,8,0,6,0,5,0,3,0),
        listOf(3,0,5,0,0,4,0,9,6),
        listOf(0,0,7,2,0,3,0,8,0),
        listOf(5,0,0,3,4,6,7,0,0),
        listOf(0,0,6,8,5,0,3,0,0),
        listOf(0,0,0,0,2,7,5,6,0),
        listOf(8,6,0,0,7,0,0,5,0),
        listOf(0,0,0,0,3,0,0,2,0),
        listOf(1,0,4,0,0,0,0,7,3)
    )

    printBoard(board)
}

fun printBoard(board: List<List<Int>>) {
    println("Printing Sudoku board..")
    for (i in 0..8) {
        if (i % 3 == 0 && i != 0) {
            println("-----------")
        }
        for (j in 0..8) {
            if(j % 3 == 0 && j != 0) {
                print("|")
            }
            print(board[i][j])
        }
        println()   // print new line after each row
    }
}


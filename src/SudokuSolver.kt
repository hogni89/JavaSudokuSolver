package main.kotlin

fun main() {

    val board = mutableListOf(
        mutableListOf(0,8,0,6,0,5,0,3,0),
        mutableListOf(3,0,5,0,0,4,0,9,6),
        mutableListOf(0,0,7,2,0,3,0,8,0),
        mutableListOf(5,0,0,3,4,6,7,0,0),
        mutableListOf(0,0,6,8,5,0,3,0,0),
        mutableListOf(0,0,0,0,2,7,5,6,0),
        mutableListOf(8,6,0,0,7,0,0,5,0),
        mutableListOf(0,0,0,0,3,0,0,2,0),
        mutableListOf(1,0,4,0,0,0,0,7,3)
    )

    println("Starting Sudoku board:")
    printBoard(board)
    println()

    if( solve(board) ) {
        println("Board solved!")
        printBoard(board)
    } else {
        println("Board not solvable!")
    }

}

fun solve(board: MutableList<MutableList<Int>>) : Boolean {

    for ( i in 0..8 ) {
        for ( j in 0..8 ) {
            if ( board[i][j] == 0 ) {
                for ( n in 1 .. 9 ) {
                    if (isNumberLegalAtPosition(board,i,j,n)) {
                        board[i][j] = n
                        if(solve(board)) {
                            return true
                        } else {
                            board[i][j] = 0
                        }
                    }
                }
                return false
            }
        }
    }
    return true
}

fun isNumberLegalAtPosition(board: MutableList<MutableList<Int>>, row: Int, column: Int, number: Int) : Boolean {
    return numberLegalInRow(board, row, number)
            && numberLegalInColumn(board, column, number)
            && numberLegalInBox(board, row, column, number)
}

fun numberLegalInRow(board: MutableList<MutableList<Int>>, row: Int, number: Int) : Boolean {
    for (i in 0..8) {
        if (board[row][i] == number)
            return false
    }
    return true
}

fun numberLegalInColumn(board: MutableList<MutableList<Int>>, column: Int, number: Int) : Boolean {
    for (i in 0..8) {
        if(board[i][column] == number)
            return false
    }
    return true
}

fun numberLegalInBox(board: MutableList<MutableList<Int>>, row: Int, column: Int, number: Int) : Boolean {
    val boxRow = row - row % 3
    val boxColumn = column - column % 3

    for ( i in boxRow..boxRow + 2) {
        for ( j in boxColumn..boxColumn + 2 ) {
            if (board[i][j] == number)
                return false
        }
    }
    return true
}


fun printBoard(board: MutableList<MutableList<Int>>) {
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


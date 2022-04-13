package main.kotlin

data class solutionEntry(
    val number: Int,
    val row: Int,
    val column: Int
) {
    fun print() {
        val i = row+1
        val j = column+1
        println("At row $i, column $j, add number $number")
    }
}

fun main() {

    val board = mutableListOf(
        mutableListOf(2,0,0,5,0,7,4,0,6),
        mutableListOf(0,0,0,0,0,1,0,0,0),
        mutableListOf(0,0,0,0,0,0,2,3,0),
        mutableListOf(0,0,0,0,2,0,0,0,0),
        mutableListOf(8,6,0,3,1,0,0,0,0),
        mutableListOf(0,4,5,0,0,0,0,0,0),
        mutableListOf(0,0,9,0,0,0,7,0,0),
        mutableListOf(0,0,6,9,5,0,0,0,0),
        mutableListOf(0,0,1,0,0,6,0,0,0)
    )

    val staringBoard = cloneBoard(board)

    println("Starting Sudoku board:")
    printBoard(board)
    println()

    if( solve(board) ) {
        println("Board solved!")
        printBoard(board)
        println()
        println("Numbers in solution: ")
        printBoard(invertBoard(staringBoard,board))

        println()
        println("Entries in solution")
        getBoardEntries(invertBoard(staringBoard,board)).map { it.print() }

    } else {
        println("Board not solvable!")
    }
}

fun getBoardEntries(board: MutableList<MutableList<Int>>) : List<solutionEntry> {
    val entries : MutableList<solutionEntry> = mutableListOf()
    for (row in 0 until board.size) {
        for (column in 0 until board[row].size) {
            if (board[row][column] != 0) {
                entries.add(solutionEntry(board[row][column],row,column))
            }
        }
    }
    return entries.toList()
}

fun cloneBoard(board: MutableList<MutableList<Int>>) : MutableList<MutableList<Int>> {
    val clonedBoard : MutableList<MutableList<Int>> = mutableListOf()
    for (i in 0 until board.size) {
        val row : MutableList<Int> = mutableListOf()
        for (j in 0 until board[i].size) {
            row.add(j,board[i][j])
        }
        clonedBoard.add(i,row)
    }
    return clonedBoard
}

fun invertBoard(board1: MutableList<MutableList<Int>>, board2: MutableList<MutableList<Int>>) : MutableList<MutableList<Int>> {
    val clonedBoard : MutableList<MutableList<Int>> = mutableListOf()
    for (i in 0 until board1.size) {
        val row : MutableList<Int> = mutableListOf()
        for (j in 0 until board1[i].size) {
            val n = board1[i][j]
            val m = board2[i][j]
            row.add(j,m-n)
        }
        clonedBoard.add(i,row)
    }
    return clonedBoard
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


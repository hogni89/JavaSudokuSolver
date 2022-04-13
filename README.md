Simple Sudoku solver written in Kotlin.
The program starts with an unsolved board, and tries to solve the board with recursion.

The program creates some artifacts, that can be further explored and used in other projects:
1) Solved board
2) Inverted board for solutions
3) A list of all entries in the solution

My thinking is to do a spin-off project, where a user can put in an board where the user is stuck, and then get a hint (one number from the solution list) in order to assist the user one step closer to the solution

Print from successfull run:

Starting Sudoku board:
200507406
000001000
000000230
000020000
860310000
045000000
009000700
006950000
001006000

Board solved!
213587496
694231578
758469231
937624185
862315947
145798623
589143762
376952814
421876359

Numbers in solution: 
013080090
694230578
758469001
937604185
002005947
100798623
580143062
370002814
420870359

Entries in solution
At row 1, column 2, add number 1
At row 1, column 3, add number 3
At row 1, column 5, add number 8
At row 1, column 8, add number 9
At row 2, column 1, add number 6
At row 2, column 2, add number 9
At row 2, column 3, add number 4
At row 2, column 4, add number 2
At row 2, column 5, add number 3
At row 2, column 7, add number 5
At row 2, column 8, add number 7
At row 2, column 9, add number 8
At row 3, column 1, add number 7
At row 3, column 2, add number 5
At row 3, column 3, add number 8
At row 3, column 4, add number 4
At row 3, column 5, add number 6
At row 3, column 6, add number 9
At row 3, column 9, add number 1
At row 4, column 1, add number 9
At row 4, column 2, add number 3
At row 4, column 3, add number 7
At row 4, column 4, add number 6
At row 4, column 6, add number 4
At row 4, column 7, add number 1
At row 4, column 8, add number 8
At row 4, column 9, add number 5
At row 5, column 3, add number 2
At row 5, column 6, add number 5
At row 5, column 7, add number 9
At row 5, column 8, add number 4
At row 5, column 9, add number 7
At row 6, column 1, add number 1
At row 6, column 4, add number 7
At row 6, column 5, add number 9
At row 6, column 6, add number 8
At row 6, column 7, add number 6
At row 6, column 8, add number 2
At row 6, column 9, add number 3
At row 7, column 1, add number 5
At row 7, column 2, add number 8
At row 7, column 4, add number 1
At row 7, column 5, add number 4
At row 7, column 6, add number 3
At row 7, column 8, add number 6
At row 7, column 9, add number 2
At row 8, column 1, add number 3
At row 8, column 2, add number 7
At row 8, column 6, add number 2
At row 8, column 7, add number 8
At row 8, column 8, add number 1
At row 8, column 9, add number 4
At row 9, column 1, add number 4
At row 9, column 2, add number 2
At row 9, column 4, add number 8
At row 9, column 5, add number 7
At row 9, column 7, add number 3
At row 9, column 8, add number 5
At row 9, column 9, add number 9

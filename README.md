Simple Sudoku solver written in Kotlin.
The program starts with an unsolved board, and tries to solve the board with recursion.

The program creates some artifacts, that can be further explored and used in other projects:
1) Solved board
2) Inverted board for solutions
3) A list of all entries in the solution

My thinking is to do a spin-off project, where a user can put in an board where the user is stuck, and then get a hint (one number from the solution list) in order to assist the user one step closer to the solution

Print from successfull run:

Starting Sudoku board:</br>
200507406</br>
000001000</br> 
000000230</br> 
000020000</br> 
860310000</br> 
045000000</br> 
009000700</br> 
006950000</br> 
001006000</br> 

Board solved!</br>
213587496</br>
694231578</br>
758469231</br>
937624185</br>
862315947</br>
145798623</br>
589143762</br>
376952814</br>
421876359</br>

Numbers in solution: </br>
013080090</br>
694230578</br>
758469001</br>
937604185</br>
002005947</br>
100798623</br>
580143062</br>
370002814</br>
420870359</br>

Entries in solution</br>
At row 1, column 2, add number 1</br>
At row 1, column 3, add number 3</br>
At row 1, column 5, add number 8</br>
At row 1, column 8, add number 9</br>
At row 2, column 1, add number 6</br>
At row 2, column 2, add number 9</br>
At row 2, column 3, add number 4</br>
At row 2, column 4, add number 2</br>
At row 2, column 5, add number 3</br>
At row 2, column 7, add number 5</br>
At row 2, column 8, add number 7</br>
At row 2, column 9, add number 8</br>
At row 3, column 1, add number 7</br>
At row 3, column 2, add number 5</br>
At row 3, column 3, add number 8</br>
At row 3, column 4, add number 4</br>
At row 3, column 5, add number 6</br>
At row 3, column 6, add number 9</br>
At row 3, column 9, add number 1</br>
At row 4, column 1, add number 9</br>
At row 4, column 2, add number 3</br>
At row 4, column 3, add number 7</br>
At row 4, column 4, add number 6</br>
At row 4, column 6, add number 4</br>
At row 4, column 7, add number 1</br>
At row 4, column 8, add number 8</br>
At row 4, column 9, add number 5</br>
At row 5, column 3, add number 2</br>
At row 5, column 6, add number 5</br>
At row 5, column 7, add number 9</br>
At row 5, column 8, add number 4</br>
At row 5, column 9, add number 7</br>
At row 6, column 1, add number 1</br>
At row 6, column 4, add number 7</br>
At row 6, column 5, add number 9</br>
At row 6, column 6, add number 8</br>
At row 6, column 7, add number 6</br>
At row 6, column 8, add number 2</br>
At row 6, column 9, add number 3</br>
At row 7, column 1, add number 5</br>
At row 7, column 2, add number 8</br>
At row 7, column 4, add number 1</br>
At row 7, column 5, add number 4</br>
At row 7, column 6, add number 3</br>
At row 7, column 8, add number 6</br>
At row 7, column 9, add number 2</br>
At row 8, column 1, add number 3</br>
At row 8, column 2, add number 7</br>
At row 8, column 6, add number 2</br>
At row 8, column 7, add number 8</br>
At row 8, column 8, add number 1</br>
At row 8, column 9, add number 4</br>
At row 9, column 1, add number 4</br>
At row 9, column 2, add number 2</br>
At row 9, column 4, add number 8</br>
At row 9, column 5, add number 7</br>
At row 9, column 7, add number 3</br>
At row 9, column 8, add number 5</br>
At row 9, column 9, add number 9</br>

Problem Statement
John and Olivia once start fighting when Olivia sees John talking with another girl. So. you tell
them to play the game of love in which you give them an array A of size N. Now, the game will
play in turns in which a player must decrease the value at the smallest index (with a non-zero
value) in A by x (x > 0). The player who cannot make a move will lose the game.
You being a loyal friend of Olivia, wants her to win. So. tell Olivia whether she should move first or
second to win this game.
Assume both players will play optimally at every step of the game.
Input
The first line contains a single integer T (1 s T s 1000) - the number of test cases.
The first line of each test case contains a single integer N (1 s N s 100) - the size of the array A
on which the game is to be played.
The second line contains n integers A1. A2. .... AN (1 ≤ Ai ≤ 10^9).
Output
For each test case, Return on a new line whether Olivia should move "first" or "second" (without s
quotes) to win the game.
Example
Sample Input:
2
3
213
2
11
Sample Output:
first
second
Sample Explanation:
For the first test case, Olivia will remove 2 from the 1st index, then John has to remove 1 from the
2nd index, and finally, Olivia will remove 3 from the 3rd index.
For the second test case, John has to remove 1 from the 1st index, then Olivia removes 1 from the
2nd index.
Input:
2
4
4321
12345
Output:
first
second
Explanation:
For the first test case.Olivia removes 4 from 1st index, then John removes 3 from 2nd index, Olivia
remoues 2 from 3rd indey and finallu to remoues 1 from 4th indey
Sandy Planks

Problem Statement
Sandy, a young boy from a quaint town, has been assigned a task by his father. He possesses a
collection of N wooden planks, each numbered from 1 to N, with colors of either black or white.
Sandy's objective is to unify the color of all the planks. However, a touch of magic resides within
the winds of his small town. Whenever he alters the color of the i-th plank (denoted by Si) to a
new color P. certain events unfold:
For 2 s i s N, if Si equals the color of Si-1, the color of the (i-1)th plank changes to P.
For 1 s i s N-1, if Si equals the color of Si+1, the color of the (i+1)th plank changes to P.
This iterative process extends to the newly colored planks. If no neighboring planks share the same
color, no changes occur to the neighbors.
Imagine Sandy's planks with the initial coloring: BBWWWB. If Sandy modifies the color of the
fourth plank (which is white) to black, then the final coloring of the planks will be: BBBBBB.
Sandy has the liberty to select any of the N planks and alter its color as many times as needed. The
challenge is to determine the minimum number of times Ryan must repaint a plank to achieve a
uniform color across all planks.
Constraints:
1 ≤ T ≤ 10
1 N ≤ 10^5
The string S consists only of characters 'B' and 'W'.
The sum of N over all test cases doesn't exceed 10^5.
Your Task - You don't need to read input or print anything. Complete the function sandyPlanks0
which takes string S of length N.Return a single integer representing the minimum number of
times Ryan has to paint a single plank to achieve a uniform color across all planks.

Simple Input:
4
6
BBWWWB
5
WWBWB
2
BB
9
WWBBBBBWW

Simple Output:
1
2
0
1

Exaplanation - 
Test case 1: The first test case is already described in the question.

Test case 2: Ryan can paint the third plank to W
. After doing so the color string of planks become WWWWB
. Then he can again paint the third plank to the color B
. After doing so the string goes through following transitions:

The color of third plank changes to B
. ( The string becomes WWBWB
)
The color of second and fourth plank changes to B
. ( The string becomes WBBBB
)
The color of first plank changes to B
. ( The string becomes BBBBB
)
Finally, all planks have same color.

Test case 3: All planks have the same color.

Test case 4: Ryan can paint any of the planks numbered from 3
to 7
to W
, and all these planks will be colored to W
!

Wired Function
Problem Statement:
Going through your old stuff you found a weird function F
defined as :
F(N) = summation of ((N-i+1)*log(i)) for i from 1 to N.
Find the maximum value of b such that F(N) = c*log(a) +b
where a, b and c are any arbitrary non negative integers
satisfying the equality.
(Note that the base of log is 10 everywhere).
Since the answer can be huge, find answer % 1000000007.
Input:
First line of the input contains T denoting number of test
cases.
Next T lines contains a single integer N for that test case.
Constraints :
1 <= T <= 100
1 <= N <= 1000000000000000000 (10^18)
Output:
Return the (maximum value of b) modulo 1000000007 such
that F(N) = c*log(a) + b where a, b and c are non negative
integers, for each test case in a single line.
Example:
Sample input:
4
1
2
5
12
Sample output:
0
1
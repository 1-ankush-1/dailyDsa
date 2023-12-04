You are given three integers: n, k, and q. There are q queries, each defined by two integers, l and r. Your task is to find the probability that when you randomly choose k numbers between 1 to n (inclusive), the greatest common divisor (gcd) of those numbers falls within the range [l, r](inclusive).

Note that the probability of selection of each number in 1 to n is same (uniform distribution), and is independent of previously chosen numbers i. e. each of the k numbers are randomly chosen.

If the answer of your query is rational number p/q, report it as p*q -1 modulo (1000000007)
Input
The first line contains 3 integers, n, k and q.
1<=n, q<=100000
1<=k<=10000000

q lines follow, each containing 2 integers l and r (1<=l<=r<=n)
Output
Output q lines, each containing a single integer, the answer to the query.
Example
Input:
10 2 5
1 1
4 4
1 4
3 5
2 6

Output:
910000007
710000005
440000004
410000003
810000006
any one solve this question
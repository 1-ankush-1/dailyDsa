Array Product
Problem Statement
Given an array A of length N i.e. A = [A1, A2, ... , AN].
Given an integer K, find the number of pairs (i, j) such that i
< j and (A[i] _ A[i]) mod K = 0.
Problem Explanation:
Given an array A of length N and an integer K, the problem
is to count the pairs of indices (i, j) where i < j and the
product of the elements at indices i and j is divisible by K. In
other words, you need to find how many pairs of array
elements have a product thal leaves no remainder when
divided by K.
Input
First line contains an integer T - The number of test cases.
For each test case, the first line contains two space-
separated integers N and K.
Second line contains N space-separated integers A1, A2, ...
AN.
Constraints:
1 <= T <= 10
1 <= N <= 10^4
1 <= K <= 10^3
1 <= Ai <= 10^6
Output
Output number of pairs (i, j) such that i < j and (A[i] _ A[i])
mod K = 0 for each test case in a new line.
Example
Input 1:
64
123456
2

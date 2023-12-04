question for Date 22-10-2023 -> Problem Statement

Given an array A of N integers, For each i (1 ≤ i ≤ N) your task is to find the value of x+y, where x is the largest number less than i such that A[x]>A[i] and (A[x] is the element present at position x.) y is the smallest number greater than i such that A[y]>A[i] If there is no x < i such that A[x] > A[i], then take x=-1. Similarly, if there is no y>i such that A[y]>A[i], then take y=-1.

Input

First line consists of a single integer denoting N

Second line consists of N space separated integers denoting the array A.

Constraints:

1 ≤ N ≤ 10^5

1 ≤ A[i]≤ 10^9

Output

Return a Array of integers, denoting x+y for each element i(1 ≤ i

≤N)

Example

Sample Input

5

54132

Sample Output

-20613

Explanation:-

For element 5:- x=-1(No element exist greater than 5 in left), y=-1 (No element exist greater than 5 in right)

For element 4:- x=1, y=-1

For element 3:- x=2, y=-1

For element 2-x=4, y=-1

For element 1:-x=2, y=4

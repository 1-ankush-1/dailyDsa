You have given an array of size N , you have to find the index of the smaller element to the right which must have largest distance from that element .

if smaller element is not present print -1 for that number . return the array which contain these indices .

Example 1:

Input: N=5

Arr[] = {3, 1, 5, 2, 4}

Output: 3 -1 4 -1 -1

Explanation: Arr[3] is the farthest smallest element to the right of Arr[0].

Arr[4] is the farthest smallest element to the right of Arr[2].

And for the rest of the elements, there is no smaller element to their right.

Example 2:

Input:

N=5

Arr[] = {1, 2, 3, 4, 0}

Output: 4 4 4 4 -1

Explanation: Arr[4] is the farthest smallest element to the right of Arr[0], Arr[1],Arr[2],Arr[3].

there is no smaller element to their right of 0 therefore -1



Constraints:

1 ≤ N ≤ 10^4

0 ≤ Arr[i] ≤ 1e^9
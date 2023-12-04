## `LOGIC`

- Initialize an array `sumOfXY` to store the sum of x and y for each element.
- Initialize variables `x` to store the greatest value and `y` to store the smallest value.
- Iterate through a loop from 1 to n (1-indexed) for each element i in the array A.
  - Initialize `left` to -1 and `right` to -1.
  - Find the greatest value `x` till i (less than i) by iterating from 0 to i-1.
    - If A[x] > A[i], update `left` to x.
  - Find the smallest value `y` after i (greater than i) by iterating from i+1 to n-1.
    - If A[y] > A[i], update `right` to y.
  - Calculate the sum of x + y.
  - Store the sum in the `sumOfXY` array for the current element i.
- Return the `sumOfXY` array.

This logic ensures that for each element in the array, it finds the greatest value `x` to the left and the smallest value `y` to the right, and then calculates the sum of x + y, storing it in the result array.

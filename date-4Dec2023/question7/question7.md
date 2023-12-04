You are given a tree rooted at 1 (root is at level 1). The entire tree can

be created in the following fashion:- > Nodes at odd level have 2 children. So node 1 has two children,

nodes 2 and 3.

> Nodes at even level have 4 children. So node 2 has 4 children, nodes

4, 5, 6, and 7. Similarly node 3 has 4 children, nodes 8, 9, 10, and 11. This process goes on infinitely. Node 4 has 2 children, nodes 12 and 13, node 5 has 2 children, nodes 14 and 15, and so on.

Now you are given an integer N, you need to report the path from the

root to the node.

Input:

The first and the only line of input contains an integer N.

Constraints:

1 <= N <= 10^16

Output

Return an arr of integers the path from the root to the node N in the form of space separated integers.

Example:

Sample Input:

14

Sample Output:

19514
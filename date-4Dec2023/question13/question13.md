Rohan Garden
Problem Statement
Rohan is tending to his garden, which boasts N apple trees. In the beginning, each tree is adorned
with Ai apples, and an additional batch of M apples awaits attachment to these trees for the
purpose of testing the laws of gravity.
Within a span of one minute, a maximum of Bi apples have the potential to descend from the ith
tree.
Kindly aid Rohan in ascertaining the shortest duration he must patiently await before comfortably
taking a seat beneath any apple tree.
Problem Explanation: Imagine Rohan has a garden with N apple trees. Each tree already has
some apples hanging on it, represented by the number Ai. He also has a batch of M apples that he
wants to attach to these trees for an experiment.
In every passing minute, each tree can drop a maximum of Bi apples due to gravity.
Rohan wants to know the shortest time he needs to wait until he can sit under any tree in his
garden without worrying about apples falling on him. In other words, he wants to figure out how
long it will take until all the apples, both those already on the trees and the ones he's adding, have
fallen down.
So, the task is to help Rohan determine the minimum time he should wait before he can relax
under the trees without getting hit by falling apples.
Input
The first line contains two space-separated integers - N and M indicating the number of apple
trees and the number of apples to be attached.
Each of the next N lines contains two integers Ai and Bi specifying the initial count of apples and
rate of fall of apples per minute for ith tree.
Constraints:
1 <= N <= 2*105
0 <= Ai <= 10^6
1 <= M, Bi <= 10^6
Output
Return minimum time Rohan has to wait
Example
Input 1:
36
43
74
15
Output 1:
2.
Explanation:
Attach 2. 1. 3 apples to 1st. 2nd. 3rd tree respectively. Then, 2. 2, 1 minutes are required for all
apples to fall from 1st. 2nd, 3rd tree respectively. So. Wait time is max(2, 2, 1) = 2.
Input 2:
24
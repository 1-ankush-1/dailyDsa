The Clash of the Houses
Problem Statement
This is a time of conflict in Westeros as Viserys Targaryen,
the king of all seven kingdoms, rejected the hand of Lady
Laena Velaryon. So, the Velaryon soldiers are not deemed
trustworthy anymore. The Targaryen soldiers have to keep
an eye on them.
You are given a sequential order of N soldiers standing in a
line. The order is provided as a binary string, with 0
representing Velaryon soldiers, and 1 representing the
Targaryen soldiers. Viserys wants each contiguous segmer
of N/2 soldiers to contain an even number of Targaryen
soldiers.
Formally you are given a binary string of length N, where N
is an even natural number. Each character of the string is
either '0' or '1'. You want to rearrange the elements of the
string in such a way that the final string contains an even
number of 1s in each contiguous subsegment of length N/
Your task is to find out whether there exists a
rearrangement of the soldiers that satisfies the above
conditions.
Input
The first line contains an integer T, the number of test
cases. Then, T test cases follow.
The first line of each test case contains an even positive
integer N, the length of the line.
The second line of each test case contains a binary string
of length N, representing the current arrangement of
soldiers.
Constraints:
The Fraud
Problem Statement
Charles has organized a tennis tournament between Alice
and Bob. The two players will play N matches against each
other. The thing is, Charles is not an honest person and his
only motivation in organizing this toumnament is to earn as
much money as possible.
He thus allows match-fixers to fix some matches, and as a
result, the outcome of some the matches are already
predetermined. Further, he knows the tournament should
not get too lopsided otherwise spectators will start losing
interest. Thus, he orders the players that in no consecutive
sequence of matches should one player win M more
matches than the other player.
Formally, you will be given a string S of length N consisting
of characters 'A, B' or 'U'. If the ith character in the string is
'A, then Alice is pre-determined to win the ith match, and if
it is 'B' then Bob will win it. If the ith character is 'U', then
the ith match has not been fixed and either of the players
can win it.
Thus you need to replace each 'U' with either 'A' or 'B', such
that for any substring, In(A) - n(B)| <M holds. Here, n(A)
and n(B) represents the number of A's and B's in the
substring respectively. If a string satisfies these conditions,
we say that it is valid. Print the total number of valid strings
modulo 998244353
Input
The first line contains two space-separated integers N and
M
The second line contains a string S of length N, consisting
only of characters 'A', 'B' and 'U'.
Constraints:
1 N ≤ 200
2sMsN +1
Output
Return a single integer - the total number of valid
tournaments modulo 998244353.
Example
Sample Input 1:
63
ABUABU
Sample Output 1:
Sample Explanation 1:
Four different strings can be obtained by replacing U with A
or B. They are
ABAABA
ABAABB
ABBABA
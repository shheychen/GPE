Time Limit: 30 sec
Description
===========
Given two strings a and b we define a*b to be their concatenation. For example, if a = "abc" and b = "def" then a*b = "abcdef". If we think of concatenation as multiplication, exponentiation by a non-negative integer is defined in the normal way: a^0 = "" (the empty string) and a^(n+1) = a*(a^n).

Each test case is a line of input representing s, a string of printable characters. For each s you should print the largest n such that s = a^n for some string a. The length of s will be at least 1 and will not exceed 1 million characters. A line containing a period follows the last test case.

Sample Input
------------
abcd
<br>
aaaa
<br>
ababab
<br>
.
Sample Output
-------------
1
<br>
4
<br>
3

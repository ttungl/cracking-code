#Problem Statement
Two phrases are anagrams if they are permutations of each other, ignoring spaces and capitalization. For example, "Aaagmnrs" is an anagram of "anagrams", and "TopCoder" is an anagram of "Drop Cote". Given a phrases, remove each phrase that is an anagram of an earlier phrase, and return the remaining phrases in their original order.

#Definition
Class: Aaagmnrs
Method: anagrams
Parameters: String[]
Returns: String[]
Method signature: String[] anagrams(String[] phrases)
(be sure your method is public)

#Limits
Time limit (s): 840.000
Memory limit (MB): 64

#Constraints
- phrases contains between 2 and 50 elements, inclusive.
- Each element of phrases contains between 1 and 50 characters, inclusive.
- Each element of phrases contains letters ('a'-'z' and 'A'-'Z') and spaces (' ') only.
- Each element of phrases contains at least one letter.

#Examples
0)
{ "Aaagmnrs", "TopCoder", "anagrams", "Drop Cote" }
Returns: { "Aaagmnrs", "TopCoder" }
The examples above.
1)
{ "SnapDragon vs tomek", "savants groped monk", "Adam vents prongs ok" }
Returns: { "SnapDragon vs tomek" }
2)
{ "Radar ghost jilts Kim", "patched hers first", "DEPTH FIRST SEARCH", "DIJKSTRAS ALGORITHM" }
Returns: { "Radar ghost jilts Kim", "patched hers first" }

#Disclaimer:

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.

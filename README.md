# FindCountElementOfBiggestArea
Ruby on Rails Job Opportunity Rockyou - Challenge

#Instructions:
Given a matrix composed of integer values
An area is defined when several identical value are connected together (either horizontally or vertically)

For example with the following matrix:

[0 0 0 2 2]
|1 1 7 2 2|
|2 2 7 2 1|
|2 1 7 4 4|
|2 7 7 4 4|
|4 6 6 0 4|
|4 4 6 4 4|
[4 4 6 4 4]

we can find the following areas:
[0 0 0 * *]
|* * * * *|
|* * * * *|
|* * * * *|
|* * * * *|
|* * * * *|
|* * * * *|
[* * * * *]

[* * * 2 2]
|* * * 2 2|
|* * * 2 *|
|* * * * *|
|* * * * *|
|* * * * *|
|* * * * *|
[* * * * *]

[* * * * *]
|1 1 * * *|
|* * * * *|
|* * * * *|
|* * * * *|
|* * * * *|
|* * * * *|
[* * * * *]

And so on...

The test consists in implementing the function "FindCountElementOfBiggestArea", which return the number of elements of the Matrix's biggest area (the biggest area is the area having the maximal number of element)
For example with the above matrix, the biggest area is:
[* * * * *]
|* * * * *|
|* * * * *|
|* * * 4 4|
|* * * 4 4|
|* * * * 4|
|* * * 4 4|
[* * * 4 4]

And so the function must return 9 (the area is composed of 9 elements)

#Requirements:
Code must be structured, easily comprehensible and efficient.

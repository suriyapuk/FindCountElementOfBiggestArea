# FindCountElementOfBiggestArea
Ruby on Rails Job Opportunity Rockyou - Challenge
<br><br>
# Instructions:
Given a matrix composed of integer values<br>
An area is defined when several identical value are connected together (either horizontally or vertically)
<br><br>
For example with the following matrix:
<br><br>
0  0  0  2  2 <br>
1  1  7  2  2 <br>
2  2  7  2  1 <br>
2  1  7  4  4 <br>
2  7  7  4  4 <br>
4  6  6  0  4 <br>
4  4  6  4  4 <br>
4  4  6  4  4 <br>
<br>
we can find the following areas:<br>
0  0  0  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
<br>
*  *  *  2  2 <br>
*  *  *  2  2 <br>
*  *  *  2  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
<br>
*  *  *  *  * <br>
1  1  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
<br>
And so on...
<br><br>
The test consists in implementing the function "FindCountElementOfBiggestArea", which return the number of elements of the Matrix's biggest area (the biggest area is the area having the maximal number of element)<br>
For example with the above matrix, the biggest area is:<br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  *  * <br>
*  *  *  4  4 <br>
*  *  *  4  4 <br>
*  *  *  *  4 <br>
*  *  *  4  4 <br>
*  *  *  4  4 <br>
<br>
And so the function must return 9 (the area is composed of 9 elements)
<br><br>
# Requirements:<br>
Code must be structured, easily comprehensible and efficient.

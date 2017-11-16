# FindCountElementOfBiggestArea
Ruby on Rails Job Opportunity Rockyou - Challenge
<br><br>
# Instructions:
Given a matrix composed of integer values<br>
An area is defined when several identical value are connected together (either horizontally or vertically)
<br><br>
For example with the following matrix:
<br><br>
0&nbsp;&nbsp;0&nbsp;&nbsp;0&nbsp;&nbsp;2&nbsp;&nbsp;2 <br>
1&nbsp;&nbsp;1&nbsp;&nbsp;7&nbsp;&nbsp;2&nbsp;&nbsp;2 <br>
2&nbsp;&nbsp;2&nbsp;&nbsp;7&nbsp;&nbsp;2&nbsp;&nbsp;1 <br>
2&nbsp;&nbsp;1&nbsp;&nbsp;7&nbsp;&nbsp;4&nbsp;&nbsp;4 <br>
2&nbsp;&nbsp;7&nbsp;&nbsp;7&nbsp;&nbsp;4&nbsp;&nbsp;4 <br>
4&nbsp;&nbsp;6&nbsp;&nbsp;6&nbsp;&nbsp;0&nbsp;&nbsp;4 <br>
4&nbsp;&nbsp;4&nbsp;&nbsp;6&nbsp;&nbsp;4&nbsp;&nbsp;4 <br>
4&nbsp;&nbsp;4&nbsp;&nbsp;6&nbsp;&nbsp;4&nbsp;&nbsp;4 <br>
<br>
we can find the following areas:<br>
0&nbsp;&nbsp;0&nbsp;&nbsp;0&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
<br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;2&nbsp;&nbsp;2 <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;2&nbsp;&nbsp;2 <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;2&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
<br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
1&nbsp;&nbsp;1&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
<br>
And so on...
<br><br>
The test consists in implementing the function "FindCountElementOfBiggestArea", which return the number of elements of the Matrix's biggest area (the biggest area is the area having the maximal number of element)<br>
For example with the above matrix, the biggest area is:<br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;* <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;4&nbsp;&nbsp;4 <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;4&nbsp;&nbsp;4 <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;4 <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;4&nbsp;&nbsp;4 <br>
*&nbsp;&nbsp;*&nbsp;&nbsp;*&nbsp;&nbsp;4&nbsp;&nbsp;4 <br>
<br>
And so the function must return 9 (the area is composed of 9 elements)
<br><br>

# Requirements: <br>
Code must be structured, easily comprehensible and efficient.

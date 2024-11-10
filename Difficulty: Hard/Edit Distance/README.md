<h2><a href="https://www.geeksforgeeks.org/problems/edit-distance3702/1?page=1&difficulty=Hard&sortBy=submissions">Edit Distance</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given two strings <strong>s1</strong> and <strong>s2. </strong>Return the minimum number of operations required to convert <strong>s1 </strong>to <strong>s2</strong>.<br>The possible operations are permitted:</span></p>
<ol>
<li><span style="font-size: 14pt;">Insert a character at any position of the string.</span></li>
<li><span style="font-size: 14pt;">Remove any character from the string.</span></li>
<li><span style="font-size: 14pt;">Replace any character from the string with any other character.</span></li>
</ol>
<p><span style="font-size: 14pt;"><strong>Examples:<br></strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "geek", s2 = "gesek"
<strong>Output:</strong>&nbsp;1
<strong>Explanation: </strong>One operation is required, inserting 's' between two 'e'.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input : </strong>s1 = "gfg", s2 = "gfg"
<strong>Output: </strong>0
<strong>Explanation: </strong>Both strings are same.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input : </strong>s1 = "abc", s2 = "def"
<strong>Output: </strong>3
<strong>Explanation:</strong> All characters need to be replaced to convert str1 to str2, requiring 3 replacement operations.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ s1.length(), s2.length() ≤ 100<br>Both&nbsp;the strings are in&nbsp;lowercase.</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Goldman Sachs</code>&nbsp;<code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Dynamic Programming</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;
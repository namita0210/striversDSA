# striversDSA
practise for dsa in java
<h5>HINTS FOR EACH QUESTION</h5>
<li>1. Matrix Zeroes:
<br>
  <a href="https://www.linkedin.com/pulse/matrix-traversal-methods-divyansh-sareen/"> refer this link for different types of matrix traversals like - row, column , DFS, and BFS</a>
</li>
<li>
  2. Pascal's Triangle
  <ul>Numbers in the pascal's triangle correspond to the binomial coefficients</ul>
  <ul>The n'th row in the pascal's triangle represents the coefficients of expansion (a+b)^n </ul>
  <ul>You might notice that they do (n-1) C (r-1) that is because in programming languages indexing starts from 0.</ul>
  <ul>The binomial coefficient often represented as (n,k) meaning choose k from n. represents the number of ways to choose <i>k</i> elements from <i>n</i> elements</ul>
  <ul>
    <p>Vector in Java deals more with concurrent access and synchronization among threads in a single program rather than parallelism or distribution across multiple systems.

Parallel computing involves performing multiple computations simultaneously, typically on different parts of the data or using multiple processing units. Distributed computing, on the other hand, involves multiple systems or computers working together on a task, often across a network.

In the case of Vector, it manages concurrent access among threads in a single program by allowing them to access and modify it in a synchronized manner, ensuring thread safety. It doesn't distribute the tasks across different systems; rather, it synchronizes access among threads within the same program.

So, Vector deals more with concurrency and thread safety within a program rather than parallelism or distribution across different systems.</p>
</ul>
</li>
<li>3. Next Permutation
  <ul>
    Step I : Start from the right side of the array and find the first element that breaks the descending order. This element will be the pivot <br>
      1. Start from the right: 3, 2, 1 (descending). <br>
      2. First element from the right that breaks the descending order is 2 (at index 1).
  </ul>
  <ul>
    Step II : Find the Rightmost Successor to the Pivot. From right to left, find the smallest number larger than the pivot. <br>
      1. 1. Smallest number larger than 2 to the right: 3.
  </ul>
  <ul>
    Step III : Swap the Pivot with its Rightmost Successor. Swap the pivot element with the rightmost successor found in the previous step.<br>
      1. Swap 2 with 3.<br>
      Array after swap: [1, 3, 2]
  </ul>
  <ul>
    Step IV : Reverse the Elements After the Pivot. Reverse the order of elements after the pivot (because they were in descending order, they should be in ascending order 
     now). <br>
      1. Elements after the pivot (at index 1): [2]. <br>
      2. Reverse these elements: [2] (no change as it's already in ascending order).
      Array after reversal: [1, 3, 2]
  </ul>
  <ul>
    Final Result: [1, 3, 2] <br>
    So, the next lexicographically greater permutation of the array [1, 2, 3] is [1, 3, 2].
  </ul>
</li>
<li>LeetCode Question: Given an array like : {2,3,5,6,11} and an int k. You want to find the missing # in the array at kth position.</li>

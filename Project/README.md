FloodIt!
Question 1:
The red line appears linear or linearithmic (O(n) or O(nlogn)), indicated by its relatively steady, less steep incline.
The gray line seems to have a polynomial growth (O(n^2) or higher), suggested by its steeper and possibly quadratic or exponential curve as the board size increases.

Question 2:
For the flood function,
given that it uses a HashSet for quick lookups and adds elements to the LinkedList only if they are not already present in the HashSet,
the expected time complexity is closer to O(n) for each operation, assuming the number of neighbors is constant and does not scale with the board size.
This matches the red line in the graph if we assume the red line corresponds to this optimized flood function.

Question 3:
If we assume that the red line is the result of the optimized flood function,
then yes, the analysis matches the graph, showing a linear or nearly linear time complexity.

Question 4:
The flood function uses a LinkedList in conjunction with a HashSet.
The LinkedList is efficient for sequential additions, and the HashSet provides O(1) lookup time, making this combination more time-efficient than using a LinkedList alone.
The red line suggests that this is quite efficient, but further improvements might be possible with a more direct access data structure like an ArrayList, or by optimizing the neighbor calculation.

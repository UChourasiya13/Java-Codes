/*Sara loves patterns, today she encounters an interesting pattern and wants to write a code that can print the pattern of a given height N. As Sara is weak in programming help her to code it.

The pattern for height 6 will be :-

0 4 8 12 16 20

6 10 14 18 22 26

12 16 20 24 28 32

18 22 26 30 34 38

24 28 32 36 40 44

30 34 38 42 46 50 */

class Solution {
	public void pattern(int N) {
		// Your code goes here
       for(int i = 0 ; i < N ; i ++){
           int margin = 12*i ; //margin of a problem
            for(int j = 0 ; j < N ; j++){
               int add = 4*j ;
               System.out.print( add+ margin + " ") ;
            }
            System.out.println() ;
        }
	}
}

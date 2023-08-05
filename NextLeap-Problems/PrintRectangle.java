/*Give integer values M and N. Using the character ‘*’ draw a rectangle of height M and breadth N. */
class Solution {
	public void rectangleDraw(int M, int N) {
		// Your code goes here
        for(int i = 1 ; i <= M ; i ++){
            for(int j = 1 ; j <= N ; j++){
                if(i==1 || i==M || j==1 || j==N){
                    System.out.print("*");
                }
                else { System.out.print(" ") ;}
            }
            System.out.println() ;
        }
	}
}

package MenuProgram;

public class LoopMain1{

		public static void main(String[] args) {
			int r=4;
			for(int i=1;i<=r;i++) { 
				//loop for blank space
				for(int b=1;b<=r-i;b++) {
					System.out.print(" ");
				}
			    for(int j=1;j<=i;j++) { 
			    	System.out.print(i+" ");
			    }
			    System.out.println();
			}
		}
	}
	/*
	1
	2 3
	4 5 6
	7 8 9 10

	*/

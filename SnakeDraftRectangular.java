public class SnakeDraftRectangular {

	public static void main(String[] args) {
		System.out.println("snakeDraft");
		print(snakeDraft(3,10));
		System.out.println("rectanuglarize");
		print(rectanuglarize(3,2));
	}
	public static int[][] rectanuglarize(int width, int height) {
		int[][] answer = new int[width][height];
		int l = 1;
		for (int i = 0; i<width; i++) {
			for (int z=0;z<height; z++, l++) {
				answer[i][z] = l;
			}
		}
		return answer;
	}
	public static int[][] snakeDraft(int rounds, int players){
		int[][] answer = new int[rounds][players];
		for (int i = 0; i<rounds; i++) {
			for (int d =0,b =players ;d<players ; d++, b--) {				
				if (i%2 !=0) {
					answer[i][d] = b;
				}				
				if (i%2 == 0 ) {
					answer[i][d] = d+1;					
				}									
			}		
		}
		return answer;
	}
	public static void print(int[][] printable) {
		for (int i = 0; i<printable.length; i++) {
			for (int z = 0; z<printable[0].length; z++) {
				System.out.print(printable[i][z]);
			}
			System.out.println("");
		}
	}
}
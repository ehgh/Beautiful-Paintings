import java.util.*;

public class BeautifulPaintings{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < n; i++){
			A[i] = scanner.nextInt();
		}
		int score = cost(A, n);
		System.out.println(n - score);
		scanner.close();
	}

	//O(nlog(n))  refer to next method for O(n)
	private static int cost(int[] A, int n){
		int score = 1;
		Arrays.sort(A);
		int temp =1;
		for (int i = 0 ; i < n-1; i++){
			if(A[i+1] == A[i]){
				temp += 1;
			}
			else{
				if(temp > score){
					score = temp;
				}
				temp = 1;
			}
		}
		if(temp > score){
			score = temp;
		}
		return score; 
	}
	
	//O(n)
//	private static int cost(int[] A, int n){
//		int score = 1;
//		int size = A[0];
//		for (int i = 0; i<n; i++){
//			if (A[i] > size)
//				size = A[i];
//		}
//		int[] count = new int[size+1];
//		for (int i = 0 ; i < n; i++){
//			count[A[i]]++;
//			if(count[A[i]]>score)
//				score = count[A[i]];
//		}
//		return score; 
//	}
	
}
package hamigua;
import java.util.Scanner;

public class hw3_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int idx=0;
		int num=5;
		int arr[]=new int[100];
		 	
		for(int i=0; i<num; i++) {
			arr[i] =sc.nextInt();	
		}
		idx = num -1;
		while (idx>=0) {
			System.out.printf("%d\n",arr[idx]);
			idx--;
		}
		

	}

}

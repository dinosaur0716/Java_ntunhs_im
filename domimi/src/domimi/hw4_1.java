package domimi;
import java.util.Scanner;

public class hw4_1 {

	public static void main(String[] args) {
		String temp="";
		Scanner sc=new Scanner(System.in);
		System.out.print("這是陪你聊程式!你可以問我一些問題\n");
		while(true) {
			System.out.print("你說:");
			temp=sc.next();
			 temp=temp.replace("會不會","會");
			 temp=temp.replace("能不能","能");
			 temp=temp.replace("?","!");
			 temp=temp.replace("你能","我能");
			 temp=temp.replace("你會","我會");
			 temp=temp.replace("嗎", "");
			System.out.print("我說:");
			System.out.print("我會"+temp.substring(4)+"\n");
			if(temp.equals("0")) {
				System.out.print("離開聊天程序");
				break;
			}
		}

	}

}

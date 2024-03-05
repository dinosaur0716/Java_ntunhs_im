package jj;
import java.util.Scanner;
public class hw2 {
static Scanner sc=new Scanner(System.in);
static String fever ;
static String cough ;
static String Lazy ;
static String highbool ;
static String dry ;
static String sweats ;


	public static void main(String[] args) {
		System.out.println("歡迎使用醫療診斷系統，請依序回答以下問題");
		System.out.println("請問你最近是否有發燒");
		fever=sc.next();
		if(fever.toLowerCase().equals("y")) 
		{
			System.out.println("請問你最近是否有咳嗽");
			cough=sc.next();
			if(cough.toLowerCase().equals("y")) {
				System.out.println("請問你最近是否有疲倦");
				if(Lazy.toLowerCase().equals("y")) {
					System.out.println("先生/小姐您可能感冒");
				}
				else {
					System.out.println("先生/小姐您可能獲得其他系統");
				}
				
			}else {
					System.out.println("請問你最近是否有高血壓");
					highbool=sc.next();
					if(highbool.toLowerCase().equals("y")) {
						System.out.println("請問你最近是否有口乾");
						dry=sc.next();
						if(dry.toLowerCase().equals("y")) {
							System.out.println("先生/小姐您可能獲得肝病");
						}else {
							System.out.println("先生/小姐您可能獲得其他系統");
						}
					}else 
					{
						System.out.println("請問你最近是否盜汗");
						sweats=sc.next();
						if(sweats.toLowerCase().equals("y")) 
						{
							System.out.println("先生/小姐您可能獲得肺病");
							
						}
						else {
							System.out.println("先生/小姐您可能獲得其他系統");
						}
					}
				}
		}
		else {
			System.out.println("你很正常");
		}
		
	}

}

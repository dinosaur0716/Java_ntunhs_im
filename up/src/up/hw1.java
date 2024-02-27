package up;

import java.lang.Math;
import java.util.Scanner;


public class hw1 {
	static int pv;
	static double fv;
	static final double interest=0.05;
	static int interval;
	
	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		System.out.print("Plz input your PV");
		pv=scn.nextInt();
		System.out.print("Plz input your interval");
		interval=scn.nextInt();
		
		fv=pv* Math.pow((1+interest),interval);
		
		System.out.println("My pv is "+pv+" and after "+interval+" year it would be "+fv);
	}

}

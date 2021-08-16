package com.ltts;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innings d=new Innings();
		Scanner s= new Scanner(System.in);
		System.out.println("Sample Input:");
		System.out.println("Enter the team name:");
		d.setTeamname(s.next());
		System.out.println("Enter session:");
		d.setInningsname(s.next());
		System.out.println("Enter runs:");
		d.setRuns(s.nextInt());
		System.out.println("Sample Output");
		System.out.println("Name: "+d.getTeamname());
		System.out.println("Scored: "+d.getRuns());
		
		if(("Second".equals(d.getInningsname()))) {
			System.out.println("Match Ended.");
			
		}
		else {
			System.out.println("Need "+(d.getRuns()+1)+" to win");
		}
		s.close();
	}

}

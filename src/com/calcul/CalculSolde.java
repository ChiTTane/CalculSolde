package com.calcul;

import java.util.Scanner;
import org.apache.log4j.Logger;
public class CalculSolde {
	
	public static float solde=10000;
	public static boolean state=true;
	public static void main(String[] args) {
//		Logger logger=Logger.getLogger(CalculSolde.class.getName());;
//		 TODO Auto-generated method stub
		try {
			Scanner inputSolde = new Scanner(System.in);
			Scanner inputOperation = new Scanner(System.in);
			while(CalculSolde.state) {
				System.out.println("Please enter the ammount of money");


				float ammount = inputSolde.nextFloat();
				System.out.println("Please select the type of operation : Withdraw/Deposit/stop");
				String operation = inputOperation.nextLine();
				CalculSolde.applyOperation(ammount,operation);
				System.out.println("Your balance is :"+CalculSolde.solde);
			}
			inputSolde.close();
			inputOperation.close();
		}catch(Exception e) {
			System.out.println("Error :"+e);
		}
		
		
	}
	public static void applyOperation(float ammount,String operation) {
		switch(operation){
		case "withdraw":
			CalculSolde.solde-=ammount;
			break;
		case "deposit":
			CalculSolde.solde+=ammount;
			break;
		case "stop":
			CalculSolde.state=false;
			break;
		 default:
				System.out.println("Please enter a valid operation : withdraw/deposit/stop");
				break;
		}
		

		}

	}

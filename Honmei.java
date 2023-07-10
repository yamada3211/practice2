package keiba;

import java.util.Scanner;

public class Honmei {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Hose hose = new Hose();
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		while(Hose.horseList.size() > 4 ) {
		System.out.println("本命か対抗、穴か選んでください");

		String a = scanner.next();

		if(a.equals("本命") && count == 0 ) {
			Hose.uma();
			count++;
		}else if(a.equals("対抗") && count == 1) {
			Hose.uma();
			count++;
		}else if(a.equals("穴") && count == 2) {
			Hose.uma();
			count++;
		}else {
			System.out.println("本命から順に選んでください");
		}
	
		}
	}
}
//		 Hose hose = new Hose();
//	        Scanner scanner = new Scanner(System.in);
//	        for (int i = 0; i < 3; i++) {
//	            System.out.println("本命か対抗か穴か選んでください");
//	            String input = scanner.next();
//	            switch (input) {
//	                case "本命":
//	                case "対抗":
//	                case "穴":
//	                    Hose.uma();
//	                    break;
//	                default:
//	                    System.out.println("無効な入力です。もう一度入力してください。");
//	                    i--;
//	                    break;
//	            }
//	        }
		


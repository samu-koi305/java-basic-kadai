package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	HashMap<String,String> jyankenMap = new HashMap<String,String>();
	Scanner sc = new Scanner(System.in);
	String choice = "";
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		int end = 0;
		while(end == 0) {
			choice = sc.next();
			switch(choice) {
			case "r","s","p" ->{
				end = 1;
			}
			default -> System.out.println("正しいじゃんけんの手ではありません");
			}
		}
		return choice;
	}
	
	public String getRandom() {
		String opJyanken[] = {"r","s","p"};
		return opJyanken[(int)(Math.floor(Math.random()*3))];
	}
	
	public void playGame() {
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
		
		String op = getRandom();
		String opMap = jyankenMap.get(op);
		
		System.out.println("自分の手は" + jyankenMap.get(choice) + ",対戦相手の手は" + opMap);
		
		if(choice.equals(op)) {
			System.out.println("あいこです");
		}
		if(choice.equals("r") && op.equals("s") ||
				 choice.equals("s") && op.equals("p") ||
				 choice.equals("p") && op.equals("r"))  {
			     System.out.println("自分の勝ちです");
		}
		if(choice.equals("p") && op.equals("s") ||
				 choice.equals("r") && op.equals("p") ||
				 choice.equals("s") && op.equals("r"))  {
			System.out.println("相手の勝ちです");
		}
		
	}


}

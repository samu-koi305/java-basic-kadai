package kadai_015;

import java.util.Scanner;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Car_Chapter15 car = new Car_Chapter15();
		
		System.out.println("ギア変更する");
		Scanner sc = new Scanner(System.in);
		int gc = Integer.parseInt(sc.next());
		car.gearChange(gc);
		car.run();

		sc.close();
	}

}

package kadai_015;

public class Car_Chapter15 {
		private int gear = 1;
		private int speed = 10;
		
		public void gearChange(final int afterGear) {
			switch(afterGear) {
				case 1 -> this.speed = 10;
				case 2 -> this.speed = 20;
				case 3 -> this.speed = 30;
				case 4 -> this.speed = 40;
				case 5 -> this.speed = 50;
			default -> this.speed = 10;
			}
			this.gear = afterGear;

		}
		public void run() {
			if(this.gear <= 5 && this.gear > 0) {
				System.out.println("ギアチェンジ後の速度は" + this.speed + "km/秒");
				return;
			}else {
				System.out.println("ギアは１～５速です");
				System.out.println("速度は" + this.speed + "km/秒");
				return;
			}
			
		}
	}


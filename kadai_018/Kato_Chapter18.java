package kadai_018;

abstract public class Kato_Chapter18 {
	String familyName;
	String givenName;
	String address;

	public void commonIntroduce() {
		this.familyName = "加藤";
		this.address = "東京都中野区〇×";
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}

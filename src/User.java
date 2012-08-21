// thisわすれない

public class User{

	public Integer 	id;
	public String 	firstName;
	public String	lastName;

	//コンストラクタ
	public User(){
		this.id = null;
		this.firstName = null;
		this.lastName = null;
	}

	//インスタンスメソッドshowName
	public void showName(){
		System.out.println(this.firstName + ":" + this.lastName);

	}

	//メインメソッド #4番目の問い
	public static void main(String[] args){
		User id1  = new User();
		User id2  = new User();
		User id3  = new User();
		User id4  = new User();
		User id5  = new User();
		User id6  = new User();
		User id7  = new User();
		User id8  = new User();
		User id9  = new User();
		User id10 = new User();

		id1.id = 1;
		id1.firstName	= "武田";
		id1.lastName	= "憲隆";

		id2.id = 2;		
		id2.firstName	= "高木";
		id2.lastName	= "香";

		id3.id = 3;
		id3.firstName	= "徳永";
		id3.lastName	= "裕介";

		id4.id = 4;
		id4.firstName	= "柴田";
		id4.lastName	= "伊織";

		id5.id = 5;
		id5.firstName	= "長尾";
		id5.lastName	= "有希子";

		id6.id = 6;
		id6.firstName	= "酒見";
		id6.lastName	= "真悟";

		id7.id = 7;
		id7.firstName	= "竹末";
		id7.lastName	= "憲和";

		id8.id = 8;
		id8.firstName	= "國崎";
		id8.lastName	= "宏治";

		id9.id = 9;
		id9.firstName	= "割鞘";
		id9.lastName	= "洋介";

		id10.id = 10;		
		id10.firstName	= "榎枝";
		id10.lastName	= "大悟";

//#7 - 教師クラス---------------------------------------------------------------------
		Teacher taId1 = new Teacher();
		Teacher taId2 = new Teacher();
		Teacher taId3 = new Teacher();
		Teacher taId4 = new Teacher();
		Teacher taId5 = new Teacher();
		Teacher taId6 = new Teacher();
		Teacher taId7 = new Teacher();

		taId1.subject = "デザイン";
		taId1.firstName	= "長澤";
		taId1.lastName	= "大輔";

		taId2.subject = "デザイン";
		taId2.firstName	= "ラディ";
		taId2.lastName	= "ジェイソン";

		taId3.subject = "Web/アプリ";
		taId3.firstName	= "薄井";
		taId3.lastName	= "隆";

		taId4.subject = "3DCG";
		taId4.firstName	= "山本";
		taId4.lastName	= "浩司";

		taId5.subject = "デザイン";
		taId5.firstName	= "ハナブサ";
		taId5.lastName	= "ノブユキ";

		taId6.subject = "Web/アプリ";
		taId6.firstName	= "コヌマ";
		taId6.lastName	= "ヨシツグ";

		taId7.subject = "Web/アプリ";
		taId7.firstName	= "渡部";
		taId7.lastName	= "昇治";

// #4 - １０名分表示するようにしなさい。	
		id1.showName();
		id2.showName();
		id3.showName();
		id4.showName();
		id5.showName();
		id6.showName();
		id7.showName();
		id8.showName();
		id9.showName();
		id10.showName();

// #生徒全員分　＋　講師全員分を表示しなさい。
		taId1.showName();
		taId2.showName();
		taId3.showName();
		taId4.showName();
		taId5.showName();
		taId6.showName();
		taId7.showName();

	}



}

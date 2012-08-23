

//最新8/22


//package jp.co.dhw.review2;
// thisわすれない

public class User{

	public Integer 	id;
	public String 	firstName;
	public String	lastName;

	
	//コンストラクタ
	public User(Integer id1, String firstName1 , String lastName1) {
			this.id = id1;
			this.firstName = firstName1;
			this.lastName = lastName1;
		}
	
	//インスタンスメソッドshowName
	public void showName(){
		System.out.println(this.firstName + ":" + this.lastName);

	}

	//メインメソッド #4番目の問い
	public static void main(String[] args){
		
//		for(User u: users.legth){
//			u.show();
//		}
//		for(int i=0; i< s.)
		User[] users ={
				new User(1,	"武田", "憲隆"),
				new User(2,	"高木", "香"),
				new User(3,	"徳永", "香"),
				new User(4,	"徳永", "裕介"),
				new	User(5, "柴田", "伊織"),
				new User(6, "酒見", "真悟"),
				new User(7, "竹末", "憲和"),
				new User(8, "國崎", "宏治"),
				new User(9, "割鞘", "洋介"),
				new User(10, "榎枝", "大悟")
		};

//#7 - 教師クラス---------------------------------------------------------------------
		Teacher[] teachers ={
				new Teacher(1, "長澤","大輔","デザイン"),
				new Teacher(2, "ラディ", "ジェイソン", "デザイン"),
				new Teacher(3, "薄井", "隆", "Web/アプリ"),
				new Teacher(4, "山本", "浩司", "3DCG"),
				new	Teacher(5, "ハナブサ", "ノブユキ", "デザイン"),
				new Teacher(6, "コヌマ", "ヨシツグ", "Web/アプリ"),
				new Teacher(7, "渡部", "昇治", "Web/アプリ")
		};

// #4 - １０名分表示するようにしなさい。
		for (int i = 0; i < users.length; i++) {
			users[i].showName();			
		}
// #生徒全員分　＋　講師全員分を表示しなさい。
		for (int i = 0; i < teachers.length; i++) {
			teachers[i].showName();
		}
	}
}

	

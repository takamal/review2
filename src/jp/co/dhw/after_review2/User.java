package jp.co.dhw.after_review2;

public class User{
	Integer id;
	String	firstName;
	String	lastName;

//コンストラクタ - ＃３インスタンス生成時に引数によって初期化できるようにしてください。		
	public User(Integer i, String f, String l){
		this.id = i;
		this.firstName = f;
		this.lastName = l;
	}

// ＃２コンソールに出力する。
	public void showName(){
		System.out.println(this.firstName + "：" + this.lastName);
	}

	public static void main(String[] args){
		User[] users = {
			new Student(1,"武田","憲隆"),
			new Student(2,"高木","香"),
			new Student(3,"柴田","伊織"),
			new Student(4,"長尾","有希子"),
			new Student(5,"酒見","真悟"),
			new Student(6,"武末","憲和"),
			new Student(7,"國崎","宏治"),
			new Student(8,"割鞘","洋介"),
			new Student(9,"榎枝","大悟"),
			new Student(10,"今田","尭"),
			new Student(11,"松隈","恭子"),
			new Student(12,"花田","恒一"),
			new Student(13,"内藤","初美"),
			new Student(14,"原田","清司"),
			new Student(15,"永野","修平"),
			new Student(16,"奈木野","純一"),
			new Student(17,"山之内","洋平"),
			new Student(18,"鐘ヶ江","耕治"),
			new Student(19,"野口","龍真"),
			new Student(20,"山野","兼治"),
			new Student(21,"皆川","洋介"),
			new Teacher(1,"長澤","大輔","デザイン"),
			new	Teacher(2,"ラディ","ジェイソン","デザイン"),
			new Teacher(3,"薄井","隆","Web/アプリ"),
			new Teacher(4,"山本","浩司","3DCG"),
			new Teacher(5,"ハナブサ","ノブユキ","デザイン"),
			new Teacher(6,"コヌマ","ヨシツグ","Web/アプリ"),
			new Teacher(7,"渡部","昇治","Web/アプリ")
		};
		

		for (Integer i = 0; i < users.length ;i++ ) {
			users[i].showName();
		}
	}
}
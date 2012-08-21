public class Teacher extends User {

	//#6 教科“subject”というインスタンス変数をもつ	
	public String subject;

	//#6コンストラクタ		
	public Teacher(){
		this.subject = null;
	}

	public String getSubject(){
		return this.subject;
	}

	//@override
	public void showName(){
		// System.out.println(this.firstName + ":" + this.lastName);
		// super.class.User.showName;
		super.showName();
		System.out.println("教科：" + this.subject);
	}
}
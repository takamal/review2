public class Teacher extends User {

	//#6 教科“subject”というインスタンス変数をもつ	
	public String subject;

	//#6コンストラクタ		
	public Teacher(Integer i,String f, String l,String s){
		super(i,f,l);
		this.subject = s;
	}

	public String getSubject(){
		return this.subject;
	}

	@Override
	public void showName(){
//		super.showName();
		System.out.print(this.firstName + ":" + this.lastName);

		System.out.println("教科：" + this.subject);
	}
}
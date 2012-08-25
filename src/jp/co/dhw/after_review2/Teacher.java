//＃５　クラス作成
package jp.co.dhw.after_review2;

public class Teacher extends User{

		public String subject;

		public Teacher(Integer i, String f, String l,String s){
			super(i, f, l);
			this.subject = s;
		}

		public String getSubject(){
			return this.subject;
		}

		@Override
		public void showName(){
			super.showName();
			System.out.println("教科→" + this.getSubject());
		}

}
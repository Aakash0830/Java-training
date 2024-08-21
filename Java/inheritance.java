package practice;

 class university{
	String uni_name="Ksr University";
	int coun_code=2607;
	String place="Tiruchengode";
	String dept="AIML";
	int fees=100000;
	
}
 
 class student extends university{
	 String Stu_name="sachin";
	 int stu_id=1011;
	 int age=18;
	 String address="komarapalayam";
	 String phoneNumber="7695958854";
	 String email="sachinsundar5678@gmail.com";
	 static void stu(String nam) {
		 System.out.println("I have already Joined in another college...");
		 System.out.println(nam);;
	 }
 }
 
 class faculty extends student{
	 String fac_name="Krish";
	 int fac_id=4298;
	 String designation="Assistant Professor";
 }

public class inheritance {

	public static void main(String[] args) {
		
		student stu=new student();
		System.out.println(stu.uni_name);
		faculty fa=new faculty();
		System.out.println(fa.place);
		System.out.println(fa.Stu_name);
		fa.stu("KPR college");
	}

}

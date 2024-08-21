package practice;
class Person{
		private String name;
		private int age;
		public Person(String name,int age) {
			this.name=name;
			this.age=age;
		}
	public String getName() {
		return name;
	}
	

	public int getAge() {
		return age;
	}
		
	
	public void set(int age) {
		if(age>0) {
			this.age=age;
		}
		else {
		System.out.println("Invalid age");
		}
	}
	
		
	}
	public class class_Person {
    public static void main(String[] args) {
        Person person1=new Person("Alice",-1);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        person1.set(-1);
		
	}

}

class Employee{
	 public String name;
	 public int age;
	 public void display(){
		System.out.println(name);
		System.out.println(age);
	}
}
public class day2{
	public static void main(String[] args){
		Employee e1=new Employee();
		e1.name="Priyam";
		e1.age=20;
		e1.display();
		
		Employee e2=new Employee();
		e2.name="Hardik";
		e2.age=24;
		e2.display();
		
	}
	
}
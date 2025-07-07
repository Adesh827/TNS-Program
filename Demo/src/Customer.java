import java.util.*;
public class Customer {
	static Scanner sc=new Scanner(System.in);
    int id;
    String name;
    int age;
    Customer(){
    	System.out.println("Default constructur");
    }
    
    Customer(int id,String name,int age){
    	this.id=id;
    	this.name=name;
    	this.age=age;
    }
	public int getId() {
		return id;
	}

	public void setId() {
		System.out.println("enter id");
		this.id = sc.nextInt();
	}

	public String getName() {
		return name;
	}

	public void setName() {
		System.out.println("enter name");
		this.name = sc.next();
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		System.out.println("enter age");
		this.age = sc.nextInt();
	}
	public static void main(String args[]) {
    	
    	Customer c1= new Customer();
    	c1.setAge();
    	c1.setId();
    	c1.setName();
    	System.out.println(c1.getId()+" "+c1.getName()+" "+c1.getAge());
    }
}


public class Person {
private String name;
private int age;


// constructor
 Person(String name, int age){
	this.name = name; // this.name refers to the instance variable
	this.age = age;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	
}

public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>=0) {
		this.age = age;
	}
	else {
		System.out.println("Age cannot be negative. Setting age to 0");
		this.age=0;
	}
	
}

public void display() {
	System.out.println("Name:  " + name +" " + "Age:  " + age);
	
}
public static void main(String[] args) {
	
	Person p1 = new Person("Alice",78);
	
	System.out.println("Initial Details");
	System.out.println("Name: " + p1.getName());
	System.out.println("Age:  " + p1.getAge());
	p1.setAge(-7);
	p1.setName("John");
	System.out.println("Updated Details:");
p1.display();
}
}

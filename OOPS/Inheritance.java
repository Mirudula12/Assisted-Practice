
class Animal {
	int age=40;
	void msg() {
    System.out.println("Parent class:"+age);
	}
}


class Dog extends Animal  {
	int age=60;
	void bark() {
	System.out.println("\nSingle inheritance");
    System.out.println("Child class1:" + (age+20));
	}
}

class BabyDog extends Dog{
	void bark1() {
		System.out.println("\nMultilevel inheritance");
		System.out.println("Baby child class:" + (age+30));
	}
}

interface Male {
	public void display();
}
interface Female {
	public void display();
}

class Cat extends Animal implements Male,Female {
	int age=20;
	
	public void display() {
		System.out.println("\nMultiple Inheritance");
	}
	
	void meow() {
		System.out.println("Child class2:" + age);
	}
}


public class Inheritance {

	public static void main(String[] args) {

		System.out.println("---Hybrid Inheritance---");
		BabyDog b = new BabyDog();
		b.bark();
		b.bark1();
		
		Dog d = new Dog();
		System.out.println("\nHierarchical Inheritance");
		d.msg();
		
		Cat c = new Cat();
		c.display();
		c.meow();
		

	}

}

package in.ac.sharda;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal a=new Animal();//class one
		a.speak();
		a.walk();
		Dog d=new Dog();//class two(if 'Animal' is used, then bite() won't work;)
		d.speak();
		d.walk();
		d.bite();
		Animal c=new Cat();//class three(same error, if 'animal' is used...
		c.speak();
		c.walk();
		Tiger t=new Tiger();
		t.walk();
		t.speak();
		Tiger e=new Tiger();
		System.out.println(t.equals(e));//false due to different memory allocation, same with t==e.
		//above 'equals() overridden
	}

}

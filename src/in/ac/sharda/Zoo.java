package in.ac.sharda;

import java.util.List;
import java.util.ArrayList;
public class Zoo{
	private List<Animal> animals;
	
	public Zoo() {
		/*this.a=new Animal();
		this.d=new Dog();
		this.cat=new Cat();
		this.tiger=new Tiger();
		this.dog=new Dog();*/
		this.animals=new ArrayList<>();
		
	}
	public void add(Animal a) {     //behavior
		this.animals.add(a);
	}
	public void feed() {         //behavior
		
		/*for(Animal a: animals) {
			a.eat();
		}*/ //sequential operation(time consuming)
		animals.parallelStream()
		.forEach(a-> a.eat());
	}
	public void count() {
		int c=0;
		for(Animal a: animals) {
			c+=1;
			
		}
		System.out.println("No of animals is: "+c);
	}
}

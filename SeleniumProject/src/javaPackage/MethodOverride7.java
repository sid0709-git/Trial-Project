package javaPackage;

public class MethodOverride7 {

	public static void main(String[] args) {
		MethodOverride5 mo5 = new MethodOverride6 ();
		mo5.cook();
		mo5.eat();
		mo5.wash();
		
		//mo5.pizza();//undefined
		
	}
}


// we defined pizza() method in- MethodOverride6 class but it is undefined in MethodOverride7 because--
// We assigned parent class reference to child class object. it is called as "Dynamic Method Dispatch"
//In MethodOverride6 and MethodOverride5 'cook'method is common,so its took cook method from child class [MethodOverride6]
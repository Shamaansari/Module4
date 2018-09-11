
public class Inheritance_main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Car_parent_class p = new Car_parent_class();
		System.out.println(p.price=10);
		p.start();
		p.stopping();
		p.refueling();
		
		
		BMW_child_class c = new BMW_child_class();
		System.out.println(c.mod= 123);
		c.BMW();
		
		
		System.out.println("Overiding start method : ");
		
		p.start();// parent class start method
		c.start();// child class child method
		
		// when c.start() is called, it first go to child class and searches for that function
		 * 
		 * 
		 * 
		 */
		
		//new Car_parent_class();
		new BMW_child_class();// when child class constructor is called, it will first call parent class construtor
		// and then child class along with overriden methd of child class as shown below
		
		Car_parent_class c1 = new BMW_child_class(); // another way of calling. Only function of super class is called
		// If any function is overriden that will be called
		c1.start();
		c1.stopping();
		c1.refueling();
	
		
		
		
	
	
	}
	
	

}

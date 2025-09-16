import java.util.*; //Calls both the Linked List and Iterator
public class Main
{
	public static void main(String[] args) {
	    LinkedList<String> cars = new LinkedList<>();
	    cars.add("Volvo"); //Adds the string to cars
	    cars.add("BMW");
	    cars.add("Mercedes");
	    cars.add("Optimus Prime");
	    
	    ListIterator<String> it = cars.listIterator();
	    
	    System.out.println("Has previous?: " + it.hasPrevious());
	    System.out.println("Has next?: " + it.hasNext());
	    
	    System.out.println("Next: " + it.next()); //Goes through the contents of "cars"
	    System.out.println("Next: " + it.next());
	    System.out.println("Next: " + it.next());
	    System.out.println("Next: " + it.next());
	    
	    System.out.println("Previous: " + it.previous()); //Goes back to the previous content of "cars"
	    System.out.println("Previous: " + it.previous());
	    System.out.println("Previous: " + it.previous());
	    System.out.println("Previous: " + it.previous());
	    
	    while(it.hasNext()){
	        String car = it.next(); //Used to make using the if statement easier and checks for the remaining "next" contents
	        
	        if(car.contains("o") || car.contains("O")){ //Checks for "cars" content with an O and removes them
	            it.remove();
	        }
	    }
	    
	    System.out.println("Cars without an O: " + cars); //Displays cars without an o in the overall Linked List
}
}

import com.marist.inheritance.Animal;
import com.marist.inheritance.Horse;


public class TestInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Horse horse = new Horse();
		horse.overloadOne(1);
		
		Animal a = new Horse();
		//a.overloadOne("nikhil"); // This fails, because the jvm tries to search for overloadOne in Animal
		
	}

}

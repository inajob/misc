
public class ConstPersona implements Persona {

	@Override
	public void hello() {
		System.out.println("Hello im Const Persona.");
		System.out.println("You have no choice.");
	}

	@Override
	public String askName() {
		System.out.println("Your Name is Taro!");
		return "Taro";
	}

	@Override
	public String askHobby() {
		System.out.println("Your hobby is Programming!");
		return "Programming";
	}

	@Override
	public void bye() {
		System.out.println("Bye");
	}

}

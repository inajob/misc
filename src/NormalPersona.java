import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NormalPersona implements Persona {
	BufferedReader reader;
	public NormalPersona(){
	    reader =
	          new BufferedReader(new InputStreamReader(System.in));
	}
	@Override
	public void hello() {
		System.out.println("Hello im Normal Persona.");
	}

	@Override
	public String askName() {
		System.out.println("What's your name?");
		try {
			return reader.readLine();
		} catch (IOException e) {
			return "nanashi";
		}
	}

	@Override
	public String askHobby() {
		System.out.println("What's your hobby?");
		try {
			return reader.readLine();
		} catch (IOException e) {
			return "neet";
		}
	}

	@Override
	public void bye() {
		System.out.println("Bye");
	}

}

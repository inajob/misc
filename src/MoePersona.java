import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MoePersona implements Persona {
	BufferedReader reader;
	String name;
	public MoePersona(){
	    reader =
	          new BufferedReader(new InputStreamReader(System.in));
	}
	@Override
	public void hello() {
		System.out.println("こんにちはっ！お兄ちゃん。");
	}

	@Override
	public String askName() {
		System.out.println("お兄ちゃんの名前を教えてっ！");
		try {
			name = reader.readLine();
			return name;
		} catch (IOException e) {
			name = "名無し";
			return name;
		}
	}

	@Override
	public String askHobby() {
		System.out.println(name+"お兄ちゃんの趣味を教えてほしいなっ！");
		try {
			return reader.readLine();
		} catch (IOException e) {
			return "ニート";
		}
	}

	@Override
	public void bye() {
		System.out.println("ありがとうっ！ばいばい！");
	}

}

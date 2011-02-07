import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JapanesePersona implements Persona {
	BufferedReader reader;
	public JapanesePersona(){
	    reader =
	          new BufferedReader(new InputStreamReader(System.in));
	}
	@Override
	public void hello() {
		System.out.println("こんにちは　私は日本人の方用のペルソナです.");
	}

	@Override
	public String askName() {
		System.out.println("あなたの名前は何ですか?");
		try {
			return reader.readLine();
		} catch (IOException e) {
			return "nanashi";
		}
	}

	@Override
	public String askHobby() {
		System.out.println("あなたの趣味は何ですか?");
		try {
			return reader.readLine();
		} catch (IOException e) {
			return "neet";
		}
	}

	@Override
	public void bye() {
		System.out.println("ありがとうございます　さようなら");
	}

}

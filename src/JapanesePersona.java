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
		System.out.println("����ɂ��́@���͓��{�l�̕��p�̃y���\�i�ł�.");
	}

	@Override
	public String askName() {
		System.out.println("���Ȃ��̖��O�͉��ł���?");
		try {
			return reader.readLine();
		} catch (IOException e) {
			return "nanashi";
		}
	}

	@Override
	public String askHobby() {
		System.out.println("���Ȃ��̎�͉��ł���?");
		try {
			return reader.readLine();
		} catch (IOException e) {
			return "neet";
		}
	}

	@Override
	public void bye() {
		System.out.println("���肪�Ƃ��������܂��@���悤�Ȃ�");
	}

}

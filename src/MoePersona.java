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
		System.out.println("����ɂ��͂��I���Z�����B");
	}

	@Override
	public String askName() {
		System.out.println("���Z�����̖��O�������Ă��I");
		try {
			name = reader.readLine();
			return name;
		} catch (IOException e) {
			name = "������";
			return name;
		}
	}

	@Override
	public String askHobby() {
		System.out.println(name+"���Z�����̎�������Ăق����Ȃ��I");
		try {
			return reader.readLine();
		} catch (IOException e) {
			return "�j�[�g";
		}
	}

	@Override
	public void bye() {
		System.out.println("���肪�Ƃ����I�΂��΂��I");
	}

}

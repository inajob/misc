
/*
 * �N���C�A���g�����EN��JA�����󂯎��@��̓I�ɂǂ�Persona���o������Factory�Ŕ��f
 * �l������o���킯
 * 	�J���p�e�X�g�R�[�h�@�ˁ@���i�p�R�[�h
 * 	���[�J���C�Y
 * 
 * 	�������a�ɂȂ�i�����A�g�������N���C�A���g���ʂɔc������K�v���Ȃ��j
 * 	�����̃p�����[�^�ŏo��������d�g��
 * 	�N���C�A���g���łǂ��I�Ԃ��𓮓I�ɕ����Ȃǂ���
 * 
 * Task
 * �ڋq���疼�O�Ǝ�𕷂��o��
 * ���A�˖��O�ˎ�ˈ��A�@�̏��ŏ�������
 * �Ȃ�ׂ��ڋq�ɍ�����������������悤�ɂ������i�p��Ɠ��{��A����̂Ȃ��悤�Ɂ@�Ȃǁj
 * ���܂̂Ƃ���͂Ƃ肠�������삷��΂悢���ǌ�قǍ����ւ��\��
 * 
 * ConsoleClient�ȊO�ɂ����̃t�@�N�g���𗘗p����ꏊ������H�@�ˁ@Factory���ʂɂ��闝�R�H
 * 	JA��EN�ł̏o���킯������Ƃ������Ƃ������ł���
 * 	JA��EN�łǂ�Persona���o�邩��Factory�̐ӔC�@�i�J���ː��i�A�r���ŕύX������j
 */
public class ConsoleClient {
	private Persona p;
	private PersonaFactory pf;
	public ConsoleClient(){
		pf = new PersonaFactory();
	}
	public void run(){
		String name,hobby;
		p = pf.create(PersonaFactory.LANG.JA);
		System.out.println("============================");
		p.hello();
		name  = p.askName();
		hobby = p.askHobby();
		p.bye();
		System.out.println("============================");
		
		System.out.println("name:" + name);
		System.out.println("hobby:" + hobby);
	}
	public static void main(String[] args) {
		ConsoleClient ccClient = new ConsoleClient();
		ccClient.run();
	}

}

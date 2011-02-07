
public class PersonaFactory {
	public enum LANG {JA,EN};
	public Persona create(LANG lang){
		if(lang==LANG.JA){
			return new JapanesePersona();
		}else{
			return new NormalPersona();
		}
	}
}


/*
 * クライアントからはENかJAかを受け取り　具体的にどのPersonaを出すかをFactoryで判断
 * 考えられる出しわけ
 * 	開発用テストコード　⇒　製品用コード
 * 	ローカライズ
 * 
 * 	結合が疎になる（作り方、使い方をクライアントが個別に把握する必要がない）
 * 	何かのパラメータで出し分ける仕組み
 * 	クライアント側でどれを選ぶかを動的に聞くなどする
 * 
 * Task
 * 顧客から名前と趣味を聞き出す
 * 挨拶⇒名前⇒趣味⇒挨拶　の順で処理する
 * なるべく顧客に合った聞き方をするようにしたい（英語と日本語、失礼のないように　など）
 * いまのところはとりあえず動作すればよいけど後ほど差し替え予定
 * 
 * ConsoleClient以外にもこのファクトリを利用する場所がある？　⇒　Factoryが別にある理由？
 * 	JAとENでの出しわけがあるということを強制できる
 * 	JAとENでどのPersonaが出るかはFactoryの責任　（開発⇒製品、途中で変更したり）
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

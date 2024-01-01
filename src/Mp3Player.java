
public interface Mp3Player {
//	インターフェイス(interface) → ルールをプログラミング
	public abstract void play();
	public abstract void stop();
	public abstract void next();
	public abstract void back();
//	abstract を使ってそれぞれの ルール(メソッド名のみ)を 作っています
//	メソッド名のみで処理内容は書かないメソッドの事を「抽象メソッド」といいます。
//	このため「abstract(抽象的な)」というキーワードをつけます。
}

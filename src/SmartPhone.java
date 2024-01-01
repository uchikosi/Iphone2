
	public class SmartPhone extends Phone implements Mp3Player, NewFunction{
	}
//	インターフェイス(interface) → ルールをプログラミング
//	extendsに継承、implementsに実装を行うクラスを書く
//	クラスにインターフェイスを実装するには implements を指定しなく てはいけません。
//	また Mp3Player で 作ったルール(メソッド)は必ず SmartPhone クラスで上書きし、処理 内容を記述する必要があります。
//	Mp3Player がインタフェース（ルール）なので、必ず SmartPhone クラスには Mp3Playerで作ったルール(メソッド)と同じ
//	メソッドを書き、さらに処理内容を書かなく てはいけません。
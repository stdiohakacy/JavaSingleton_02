package creational.Singleton._02;

public class Client {
	public static void main(String[] args) {
		LazyInitSingleton singleton = LazyInitSingleton.getInstance();
		System.out.println(singleton);
	}
}

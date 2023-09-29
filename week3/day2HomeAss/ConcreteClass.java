package week3.day2HomeAss;

public class ConcreteClass extends JavaConnection{

	public static void main(String[] args) {
		JavaConnection javaconnection = new JavaConnection();
		javaconnection.connect();
		javaconnection.disconnect();
		javaconnection.executeUpdate();
	}
}

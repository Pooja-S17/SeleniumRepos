package week3.day2HomeAss;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
		System.out.println("Connected to database");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected to database");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Executed the update to database");
	}

}


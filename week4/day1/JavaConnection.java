package week4.day1;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {
	
	public void connect() {
		System.out.println("Connect");
		
	}

	public void disconnect() {
		System.out.println("disconnect");
		
	}
	
	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}
	
	public void executeQuery() {
		System.out.println("executeQuery");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JavaConnection javaConnection = new JavaConnection();
		
		javaConnection.connect();
		javaConnection.executeQuery();
		javaConnection.executeUpdate();
		javaConnection.disconnect();
		
	}

}

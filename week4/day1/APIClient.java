package week4.day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
        System.out.println("Send request to: " + endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Send request to: " + endpoint);
        System.out.println("Request body: " + requestBody);
        System.out.println("Request status: "+ requestStatus);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		APIClient apiClient= new APIClient();
		
		apiClient.sendRequest("endpoint");
		apiClient.sendRequest("requestBody", "requestStatus", false);
				
				
		
	}

}

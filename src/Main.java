import javax.xml.ws.Endpoint;

public class Main {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9000/Servidor/Servidor", new Implementacao());
	}
}

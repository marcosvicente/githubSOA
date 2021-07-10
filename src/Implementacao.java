import javax.jws.WebService;

@WebService(endpointInterface = "Servidor.BaseInterface")
public class Implementacao implements BaseInterface{
	@Override
	public String mensagem() {
		return "Hello Word!";
	}
}

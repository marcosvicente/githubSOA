import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service Endpoint Interface
//@WebService
@WebService(name = "Servidor")
@SOAPBinding(style = Style.RPC)
public interface BaseInterface {
	@WebMethod String mensagem();

}

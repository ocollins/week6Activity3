package example;/**
 * Created by student on 2/21/17.
 * @author O Collins 
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    try {
      TemperatureConversionsLocator locator = new TemperatureConversionsLocator();
      Activator service = locator.get();
      // If authorization is required
      //((TemperatureConversionsSoapBindingStub)service).setUsername("user3");
      //((TemperatureConversionsSoapBindingStub)service).setPassword("pass3");
      // invoke business method
      service.businessMethod();
    } catch (javax.xml.rpc.ServiceException ex) {
      ex.printStackTrace();
    } catch (java.rmi.RemoteException ex) {
      ex.printStackTrace();
    }  
  }
}

package gov.weather;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

import static org.junit.Assert.*;

/**
 * Created by student on 2/21/17.
 *
 * @author O Collins
 */
public class NdfdXMLBindingStubTest {
    @Test
    public void latLonListZipCode() throws Exception {
            NdfdXMLBindingStub bindingStub = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();

            String response = bindingStub.latLonListZipCode("53711");
            String latlong = unmarshResult(response);
            //assertEquals("Result did not match expectec value ", "???", response);

            assertEquals("43.0798,-89.3875", latlong);

        }

    private String unmarshResult(String response) throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
        try{
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(response));
            return dwml.getLatLonList();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


}
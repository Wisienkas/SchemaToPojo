package dk.reibke.s2p.xsd.runner;

import dk.reibke.s2p.xsd.generated.ObjectFactory;
import dk.reibke.s2p.xsd.generated.PurchaseOrderType;

import javax.xml.datatype.XMLGregorianCalendar;

import dk.reibke.s2p.xsd.generated.USAddress;
import org.apache.xerces.jaxp.datatype.DatatypeFactoryImpl;

import java.math.BigInteger;

public class XsdRunner {

    public static void main(String[] args) {

        ObjectFactory objectFactory = new ObjectFactory();
        PurchaseOrderType purchaseOrderType = objectFactory.createPurchaseOrderType();
        XMLGregorianCalendar xmlGregorianCalendar =
                DatatypeFactoryImpl.newDefaultInstance().newXMLGregorianCalendar("2023-03-14");
        purchaseOrderType.setOrderDate(xmlGregorianCalendar);
        USAddress usAddress = objectFactory.createUSAddress();
        usAddress.setCity("New York");
        usAddress.setName("somewhere");
        usAddress.setZip(BigInteger.valueOf(123123L));
        usAddress.setStreet("Backlane");
        usAddress.setState("New York");
        purchaseOrderType.setBillTo(usAddress);

        System.out.println(purchaseOrderType);
    }


}

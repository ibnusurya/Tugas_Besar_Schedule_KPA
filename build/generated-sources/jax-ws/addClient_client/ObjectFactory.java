
package addClient_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the addClient_client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Tambah_QNAME = new QName("http://addClient/", "tambah");
    private final static QName _HelloResponse_QNAME = new QName("http://addClient/", "helloResponse");
    private final static QName _TambahResponse_QNAME = new QName("http://addClient/", "tambahResponse");
    private final static QName _Hello_QNAME = new QName("http://addClient/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: addClient_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tambah }
     * 
     */
    public Tambah createTambah() {
        return new Tambah();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link TambahResponse }
     * 
     */
    public TambahResponse createTambahResponse() {
        return new TambahResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tambah }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addClient/", name = "tambah")
    public JAXBElement<Tambah> createTambah(Tambah value) {
        return new JAXBElement<Tambah>(_Tambah_QNAME, Tambah.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addClient/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TambahResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addClient/", name = "tambahResponse")
    public JAXBElement<TambahResponse> createTambahResponse(TambahResponse value) {
        return new JAXBElement<TambahResponse>(_TambahResponse_QNAME, TambahResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addClient/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}

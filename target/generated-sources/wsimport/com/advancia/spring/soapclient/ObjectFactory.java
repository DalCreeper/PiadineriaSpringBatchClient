
package com.advancia.spring.soapclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.advancia.spring.soapclient package. 
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

    private final static QName _AddDough_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "addDough");
    private final static QName _AddDoughResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "addDoughResponse");
    private final static QName _AddMeatBase_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "addMeatBase");
    private final static QName _AddMeatBaseResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "addMeatBaseResponse");
    private final static QName _AddOptionalElements_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "addOptionalElements");
    private final static QName _AddOptionalElementsResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "addOptionalElementsResponse");
    private final static QName _AddSauces_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "addSauces");
    private final static QName _AddSaucesResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "addSaucesResponse");
    private final static QName _DeleteDough_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "deleteDough");
    private final static QName _DeleteDoughResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "deleteDoughResponse");
    private final static QName _DeleteMeatBase_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "deleteMeatBase");
    private final static QName _DeleteMeatBaseResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "deleteMeatBaseResponse");
    private final static QName _DeleteOptionalElements_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "deleteOptionalElements");
    private final static QName _DeleteOptionalElementsResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "deleteOptionalElementsResponse");
    private final static QName _DeleteSauces_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "deleteSauces");
    private final static QName _DeleteSaucesResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "deleteSaucesResponse");
    private final static QName _GetDoughById_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "getDoughById");
    private final static QName _GetDoughByIdResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "getDoughByIdResponse");
    private final static QName _GetMeatBaseById_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "getMeatBaseById");
    private final static QName _GetMeatBaseByIdResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "getMeatBaseByIdResponse");
    private final static QName _GetOptionalElementsById_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "getOptionalElementsById");
    private final static QName _GetOptionalElementsByIdResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "getOptionalElementsByIdResponse");
    private final static QName _GetSaucesById_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "getSaucesById");
    private final static QName _GetSaucesByIdResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "getSaucesByIdResponse");
    private final static QName _LoadComponents_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "loadComponents");
    private final static QName _LoadComponentsResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "loadComponentsResponse");
    private final static QName _Test_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "test");
    private final static QName _TestResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "testResponse");
    private final static QName _UpdateDough_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "updateDough");
    private final static QName _UpdateDoughResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "updateDoughResponse");
    private final static QName _UpdateMeatBase_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "updateMeatBase");
    private final static QName _UpdateMeatBaseResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "updateMeatBaseResponse");
    private final static QName _UpdateOptionalElements_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "updateOptionalElements");
    private final static QName _UpdateOptionalElementsResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "updateOptionalElementsResponse");
    private final static QName _UpdateSauces_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "updateSauces");
    private final static QName _UpdateSaucesResponse_QNAME = new QName("http://soap.api.PiadineriaAdvancia.advancia.com/", "updateSaucesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.advancia.spring.soapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoadComponentsResponse }
     * 
     */
    public LoadComponentsResponse createLoadComponentsResponse() {
        return new LoadComponentsResponse();
    }

    /**
     * Create an instance of {@link LoadComponentsResponse.Return }
     * 
     */
    public LoadComponentsResponse.Return createLoadComponentsResponseReturn() {
        return new LoadComponentsResponse.Return();
    }

    /**
     * Create an instance of {@link AddDough }
     * 
     */
    public AddDough createAddDough() {
        return new AddDough();
    }

    /**
     * Create an instance of {@link AddDoughResponse }
     * 
     */
    public AddDoughResponse createAddDoughResponse() {
        return new AddDoughResponse();
    }

    /**
     * Create an instance of {@link AddMeatBase }
     * 
     */
    public AddMeatBase createAddMeatBase() {
        return new AddMeatBase();
    }

    /**
     * Create an instance of {@link AddMeatBaseResponse }
     * 
     */
    public AddMeatBaseResponse createAddMeatBaseResponse() {
        return new AddMeatBaseResponse();
    }

    /**
     * Create an instance of {@link AddOptionalElements }
     * 
     */
    public AddOptionalElements createAddOptionalElements() {
        return new AddOptionalElements();
    }

    /**
     * Create an instance of {@link AddOptionalElementsResponse }
     * 
     */
    public AddOptionalElementsResponse createAddOptionalElementsResponse() {
        return new AddOptionalElementsResponse();
    }

    /**
     * Create an instance of {@link AddSauces }
     * 
     */
    public AddSauces createAddSauces() {
        return new AddSauces();
    }

    /**
     * Create an instance of {@link AddSaucesResponse }
     * 
     */
    public AddSaucesResponse createAddSaucesResponse() {
        return new AddSaucesResponse();
    }

    /**
     * Create an instance of {@link DeleteDough }
     * 
     */
    public DeleteDough createDeleteDough() {
        return new DeleteDough();
    }

    /**
     * Create an instance of {@link DeleteDoughResponse }
     * 
     */
    public DeleteDoughResponse createDeleteDoughResponse() {
        return new DeleteDoughResponse();
    }

    /**
     * Create an instance of {@link DeleteMeatBase }
     * 
     */
    public DeleteMeatBase createDeleteMeatBase() {
        return new DeleteMeatBase();
    }

    /**
     * Create an instance of {@link DeleteMeatBaseResponse }
     * 
     */
    public DeleteMeatBaseResponse createDeleteMeatBaseResponse() {
        return new DeleteMeatBaseResponse();
    }

    /**
     * Create an instance of {@link DeleteOptionalElements }
     * 
     */
    public DeleteOptionalElements createDeleteOptionalElements() {
        return new DeleteOptionalElements();
    }

    /**
     * Create an instance of {@link DeleteOptionalElementsResponse }
     * 
     */
    public DeleteOptionalElementsResponse createDeleteOptionalElementsResponse() {
        return new DeleteOptionalElementsResponse();
    }

    /**
     * Create an instance of {@link DeleteSauces }
     * 
     */
    public DeleteSauces createDeleteSauces() {
        return new DeleteSauces();
    }

    /**
     * Create an instance of {@link DeleteSaucesResponse }
     * 
     */
    public DeleteSaucesResponse createDeleteSaucesResponse() {
        return new DeleteSaucesResponse();
    }

    /**
     * Create an instance of {@link GetDoughById }
     * 
     */
    public GetDoughById createGetDoughById() {
        return new GetDoughById();
    }

    /**
     * Create an instance of {@link GetDoughByIdResponse }
     * 
     */
    public GetDoughByIdResponse createGetDoughByIdResponse() {
        return new GetDoughByIdResponse();
    }

    /**
     * Create an instance of {@link GetMeatBaseById }
     * 
     */
    public GetMeatBaseById createGetMeatBaseById() {
        return new GetMeatBaseById();
    }

    /**
     * Create an instance of {@link GetMeatBaseByIdResponse }
     * 
     */
    public GetMeatBaseByIdResponse createGetMeatBaseByIdResponse() {
        return new GetMeatBaseByIdResponse();
    }

    /**
     * Create an instance of {@link GetOptionalElementsById }
     * 
     */
    public GetOptionalElementsById createGetOptionalElementsById() {
        return new GetOptionalElementsById();
    }

    /**
     * Create an instance of {@link GetOptionalElementsByIdResponse }
     * 
     */
    public GetOptionalElementsByIdResponse createGetOptionalElementsByIdResponse() {
        return new GetOptionalElementsByIdResponse();
    }

    /**
     * Create an instance of {@link GetSaucesById }
     * 
     */
    public GetSaucesById createGetSaucesById() {
        return new GetSaucesById();
    }

    /**
     * Create an instance of {@link GetSaucesByIdResponse }
     * 
     */
    public GetSaucesByIdResponse createGetSaucesByIdResponse() {
        return new GetSaucesByIdResponse();
    }

    /**
     * Create an instance of {@link LoadComponents }
     * 
     */
    public LoadComponents createLoadComponents() {
        return new LoadComponents();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link UpdateDough }
     * 
     */
    public UpdateDough createUpdateDough() {
        return new UpdateDough();
    }

    /**
     * Create an instance of {@link UpdateDoughResponse }
     * 
     */
    public UpdateDoughResponse createUpdateDoughResponse() {
        return new UpdateDoughResponse();
    }

    /**
     * Create an instance of {@link UpdateMeatBase }
     * 
     */
    public UpdateMeatBase createUpdateMeatBase() {
        return new UpdateMeatBase();
    }

    /**
     * Create an instance of {@link UpdateMeatBaseResponse }
     * 
     */
    public UpdateMeatBaseResponse createUpdateMeatBaseResponse() {
        return new UpdateMeatBaseResponse();
    }

    /**
     * Create an instance of {@link UpdateOptionalElements }
     * 
     */
    public UpdateOptionalElements createUpdateOptionalElements() {
        return new UpdateOptionalElements();
    }

    /**
     * Create an instance of {@link UpdateOptionalElementsResponse }
     * 
     */
    public UpdateOptionalElementsResponse createUpdateOptionalElementsResponse() {
        return new UpdateOptionalElementsResponse();
    }

    /**
     * Create an instance of {@link UpdateSauces }
     * 
     */
    public UpdateSauces createUpdateSauces() {
        return new UpdateSauces();
    }

    /**
     * Create an instance of {@link UpdateSaucesResponse }
     * 
     */
    public UpdateSaucesResponse createUpdateSaucesResponse() {
        return new UpdateSaucesResponse();
    }

    /**
     * Create an instance of {@link Dough }
     * 
     */
    public Dough createDough() {
        return new Dough();
    }

    /**
     * Create an instance of {@link MeatBase }
     * 
     */
    public MeatBase createMeatBase() {
        return new MeatBase();
    }

    /**
     * Create an instance of {@link OptionalElements }
     * 
     */
    public OptionalElements createOptionalElements() {
        return new OptionalElements();
    }

    /**
     * Create an instance of {@link Sauces }
     * 
     */
    public Sauces createSauces() {
        return new Sauces();
    }

    /**
     * Create an instance of {@link LoadComponentsResponse.Return.Entry }
     * 
     */
    public LoadComponentsResponse.Return.Entry createLoadComponentsResponseReturnEntry() {
        return new LoadComponentsResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDough }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddDough }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "addDough")
    public JAXBElement<AddDough> createAddDough(AddDough value) {
        return new JAXBElement<AddDough>(_AddDough_QNAME, AddDough.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoughResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddDoughResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "addDoughResponse")
    public JAXBElement<AddDoughResponse> createAddDoughResponse(AddDoughResponse value) {
        return new JAXBElement<AddDoughResponse>(_AddDoughResponse_QNAME, AddDoughResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMeatBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMeatBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "addMeatBase")
    public JAXBElement<AddMeatBase> createAddMeatBase(AddMeatBase value) {
        return new JAXBElement<AddMeatBase>(_AddMeatBase_QNAME, AddMeatBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMeatBaseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMeatBaseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "addMeatBaseResponse")
    public JAXBElement<AddMeatBaseResponse> createAddMeatBaseResponse(AddMeatBaseResponse value) {
        return new JAXBElement<AddMeatBaseResponse>(_AddMeatBaseResponse_QNAME, AddMeatBaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOptionalElements }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddOptionalElements }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "addOptionalElements")
    public JAXBElement<AddOptionalElements> createAddOptionalElements(AddOptionalElements value) {
        return new JAXBElement<AddOptionalElements>(_AddOptionalElements_QNAME, AddOptionalElements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOptionalElementsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddOptionalElementsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "addOptionalElementsResponse")
    public JAXBElement<AddOptionalElementsResponse> createAddOptionalElementsResponse(AddOptionalElementsResponse value) {
        return new JAXBElement<AddOptionalElementsResponse>(_AddOptionalElementsResponse_QNAME, AddOptionalElementsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSauces }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSauces }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "addSauces")
    public JAXBElement<AddSauces> createAddSauces(AddSauces value) {
        return new JAXBElement<AddSauces>(_AddSauces_QNAME, AddSauces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSaucesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSaucesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "addSaucesResponse")
    public JAXBElement<AddSaucesResponse> createAddSaucesResponse(AddSaucesResponse value) {
        return new JAXBElement<AddSaucesResponse>(_AddSaucesResponse_QNAME, AddSaucesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDough }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDough }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "deleteDough")
    public JAXBElement<DeleteDough> createDeleteDough(DeleteDough value) {
        return new JAXBElement<DeleteDough>(_DeleteDough_QNAME, DeleteDough.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDoughResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDoughResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "deleteDoughResponse")
    public JAXBElement<DeleteDoughResponse> createDeleteDoughResponse(DeleteDoughResponse value) {
        return new JAXBElement<DeleteDoughResponse>(_DeleteDoughResponse_QNAME, DeleteDoughResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeatBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteMeatBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "deleteMeatBase")
    public JAXBElement<DeleteMeatBase> createDeleteMeatBase(DeleteMeatBase value) {
        return new JAXBElement<DeleteMeatBase>(_DeleteMeatBase_QNAME, DeleteMeatBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeatBaseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteMeatBaseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "deleteMeatBaseResponse")
    public JAXBElement<DeleteMeatBaseResponse> createDeleteMeatBaseResponse(DeleteMeatBaseResponse value) {
        return new JAXBElement<DeleteMeatBaseResponse>(_DeleteMeatBaseResponse_QNAME, DeleteMeatBaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOptionalElements }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteOptionalElements }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "deleteOptionalElements")
    public JAXBElement<DeleteOptionalElements> createDeleteOptionalElements(DeleteOptionalElements value) {
        return new JAXBElement<DeleteOptionalElements>(_DeleteOptionalElements_QNAME, DeleteOptionalElements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOptionalElementsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteOptionalElementsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "deleteOptionalElementsResponse")
    public JAXBElement<DeleteOptionalElementsResponse> createDeleteOptionalElementsResponse(DeleteOptionalElementsResponse value) {
        return new JAXBElement<DeleteOptionalElementsResponse>(_DeleteOptionalElementsResponse_QNAME, DeleteOptionalElementsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSauces }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteSauces }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "deleteSauces")
    public JAXBElement<DeleteSauces> createDeleteSauces(DeleteSauces value) {
        return new JAXBElement<DeleteSauces>(_DeleteSauces_QNAME, DeleteSauces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSaucesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteSaucesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "deleteSaucesResponse")
    public JAXBElement<DeleteSaucesResponse> createDeleteSaucesResponse(DeleteSaucesResponse value) {
        return new JAXBElement<DeleteSaucesResponse>(_DeleteSaucesResponse_QNAME, DeleteSaucesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoughById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDoughById }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "getDoughById")
    public JAXBElement<GetDoughById> createGetDoughById(GetDoughById value) {
        return new JAXBElement<GetDoughById>(_GetDoughById_QNAME, GetDoughById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoughByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDoughByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "getDoughByIdResponse")
    public JAXBElement<GetDoughByIdResponse> createGetDoughByIdResponse(GetDoughByIdResponse value) {
        return new JAXBElement<GetDoughByIdResponse>(_GetDoughByIdResponse_QNAME, GetDoughByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeatBaseById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMeatBaseById }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "getMeatBaseById")
    public JAXBElement<GetMeatBaseById> createGetMeatBaseById(GetMeatBaseById value) {
        return new JAXBElement<GetMeatBaseById>(_GetMeatBaseById_QNAME, GetMeatBaseById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeatBaseByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMeatBaseByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "getMeatBaseByIdResponse")
    public JAXBElement<GetMeatBaseByIdResponse> createGetMeatBaseByIdResponse(GetMeatBaseByIdResponse value) {
        return new JAXBElement<GetMeatBaseByIdResponse>(_GetMeatBaseByIdResponse_QNAME, GetMeatBaseByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptionalElementsById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOptionalElementsById }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "getOptionalElementsById")
    public JAXBElement<GetOptionalElementsById> createGetOptionalElementsById(GetOptionalElementsById value) {
        return new JAXBElement<GetOptionalElementsById>(_GetOptionalElementsById_QNAME, GetOptionalElementsById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptionalElementsByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOptionalElementsByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "getOptionalElementsByIdResponse")
    public JAXBElement<GetOptionalElementsByIdResponse> createGetOptionalElementsByIdResponse(GetOptionalElementsByIdResponse value) {
        return new JAXBElement<GetOptionalElementsByIdResponse>(_GetOptionalElementsByIdResponse_QNAME, GetOptionalElementsByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaucesById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSaucesById }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "getSaucesById")
    public JAXBElement<GetSaucesById> createGetSaucesById(GetSaucesById value) {
        return new JAXBElement<GetSaucesById>(_GetSaucesById_QNAME, GetSaucesById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaucesByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSaucesByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "getSaucesByIdResponse")
    public JAXBElement<GetSaucesByIdResponse> createGetSaucesByIdResponse(GetSaucesByIdResponse value) {
        return new JAXBElement<GetSaucesByIdResponse>(_GetSaucesByIdResponse_QNAME, GetSaucesByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadComponents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadComponents }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "loadComponents")
    public JAXBElement<LoadComponents> createLoadComponents(LoadComponents value) {
        return new JAXBElement<LoadComponents>(_LoadComponents_QNAME, LoadComponents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadComponentsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadComponentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "loadComponentsResponse")
    public JAXBElement<LoadComponentsResponse> createLoadComponentsResponse(LoadComponentsResponse value) {
        return new JAXBElement<LoadComponentsResponse>(_LoadComponentsResponse_QNAME, LoadComponentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Test }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDough }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDough }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "updateDough")
    public JAXBElement<UpdateDough> createUpdateDough(UpdateDough value) {
        return new JAXBElement<UpdateDough>(_UpdateDough_QNAME, UpdateDough.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDoughResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDoughResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "updateDoughResponse")
    public JAXBElement<UpdateDoughResponse> createUpdateDoughResponse(UpdateDoughResponse value) {
        return new JAXBElement<UpdateDoughResponse>(_UpdateDoughResponse_QNAME, UpdateDoughResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeatBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateMeatBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "updateMeatBase")
    public JAXBElement<UpdateMeatBase> createUpdateMeatBase(UpdateMeatBase value) {
        return new JAXBElement<UpdateMeatBase>(_UpdateMeatBase_QNAME, UpdateMeatBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeatBaseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateMeatBaseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "updateMeatBaseResponse")
    public JAXBElement<UpdateMeatBaseResponse> createUpdateMeatBaseResponse(UpdateMeatBaseResponse value) {
        return new JAXBElement<UpdateMeatBaseResponse>(_UpdateMeatBaseResponse_QNAME, UpdateMeatBaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOptionalElements }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateOptionalElements }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "updateOptionalElements")
    public JAXBElement<UpdateOptionalElements> createUpdateOptionalElements(UpdateOptionalElements value) {
        return new JAXBElement<UpdateOptionalElements>(_UpdateOptionalElements_QNAME, UpdateOptionalElements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOptionalElementsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateOptionalElementsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "updateOptionalElementsResponse")
    public JAXBElement<UpdateOptionalElementsResponse> createUpdateOptionalElementsResponse(UpdateOptionalElementsResponse value) {
        return new JAXBElement<UpdateOptionalElementsResponse>(_UpdateOptionalElementsResponse_QNAME, UpdateOptionalElementsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSauces }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateSauces }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "updateSauces")
    public JAXBElement<UpdateSauces> createUpdateSauces(UpdateSauces value) {
        return new JAXBElement<UpdateSauces>(_UpdateSauces_QNAME, UpdateSauces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSaucesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateSaucesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.api.PiadineriaAdvancia.advancia.com/", name = "updateSaucesResponse")
    public JAXBElement<UpdateSaucesResponse> createUpdateSaucesResponse(UpdateSaucesResponse value) {
        return new JAXBElement<UpdateSaucesResponse>(_UpdateSaucesResponse_QNAME, UpdateSaucesResponse.class, null, value);
    }

}


package com.qas.ondemand_2011_03;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "QAPortType", targetNamespace = "http://www.qas.com/OnDemand-2011-03")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.qas.ondemand_2011_03.ObjectFactory.class,
    org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_secext_1_0.ObjectFactory.class,
    org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0.ObjectFactory.class,
    org.w3._2000._09.xmldsig.ObjectFactory.class
})
public interface QAPortType {


    /**
     * 
     * @param body
     * @return
     *     returns com.qas.ondemand_2011_03.QASearchResult
     */
    @WebMethod(operationName = "DoSearch", action = "http://www.qas.com/OnDemand-2011-03/DoSearch")
    @WebResult(name = "QASearchResult", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
    public QASearchResult doSearch(
        @WebParam(name = "QASearch", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
        QASearch body);

    /**
     * 
     * @param body
     * @return
     *     returns com.qas.ondemand_2011_03.Picklist
     */
    @WebMethod(operationName = "DoRefine", action = "http://www.qas.com/OnDemand-2011-03/DoRefine")
    @WebResult(name = "Picklist", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
    public Picklist doRefine(
        @WebParam(name = "QARefine", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
        QARefine body);

    /**
     * 
     * @param body
     * @return
     *     returns com.qas.ondemand_2011_03.Address
     */
    @WebMethod(operationName = "DoGetAddress", action = "http://www.qas.com/OnDemand-2011-03/DoGetAddress")
    @WebResult(name = "Address", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
    public Address doGetAddress(
        @WebParam(name = "QAGetAddress", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
        QAGetAddress body);

    /**
     * 
     * @param body
     * @return
     *     returns com.qas.ondemand_2011_03.QAData
     */
    @WebMethod(operationName = "DoGetData", action = "http://www.qas.com/OnDemand-2011-03/DoGetData")
    @WebResult(name = "QAData", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
    public QAData doGetData(
        @WebParam(name = "QAGetData", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
        QAGetData body);

    /**
     * 
     * @param body
     * @return
     *     returns com.qas.ondemand_2011_03.QADataMapDetail
     */
    @WebMethod(operationName = "DoGetDataMapDetail", action = "http://www.qas.com/OnDemand-2011-03/DoGetDataMapDetail")
    @WebResult(name = "QADataMapDetail", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
    public QADataMapDetail doGetDataMapDetail(
        @WebParam(name = "QAGetDataMapDetail", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
        QAGetDataMapDetail body);

    /**
     * 
     * @param body
     * @return
     *     returns com.qas.ondemand_2011_03.QALicenceInfo
     */
    @WebMethod(operationName = "DoGetLicenseInfo", action = "http://www.qas.com/OnDemand-2011-03/DoGetLicenseInfo")
    @WebResult(name = "QALicenceInfo", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
    public QALicenceInfo doGetLicenseInfo(
        @WebParam(name = "QAGetLicenseInfo", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
        QAGetLicenseInfo body);

    /**
     * 
     * @param body
     * @return
     *     returns com.qas.ondemand_2011_03.QASystemInfo
     */
    @WebMethod(operationName = "DoGetSystemInfo", action = "http://www.qas.com/OnDemand-2011-03/DoGetSystemInfo")
    @WebResult(name = "QASystemInfo", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
    public QASystemInfo doGetSystemInfo(
        @WebParam(name = "QAGetSystemInfo", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
        QAGetSystemInfo body);

    /**
     * 
     * @param body
     * @return
     *     returns com.qas.ondemand_2011_03.QAExampleAddresses
     */
    @WebMethod(operationName = "DoGetExampleAddresses", action = "http://www.qas.com/OnDemand-2011-03/DoGetExampleAddresses")
    @WebResult(name = "QAExampleAddresses", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
    public QAExampleAddresses doGetExampleAddresses(
        @WebParam(name = "QAGetExampleAddresses", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
        QAGetExampleAddresses body);

    /**
     * 
     * @param body
     * @return
     *     returns com.qas.ondemand_2011_03.QALayouts
     */
    @WebMethod(operationName = "DoGetLayouts", action = "http://www.qas.com/OnDemand-2011-03/DoGetLayouts")
    @WebResult(name = "QALayouts", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
    public QALayouts doGetLayouts(
        @WebParam(name = "QAGetLayouts", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
        QAGetLayouts body);

    /**
     * 
     * @param body
     * @return
     *     returns com.qas.ondemand_2011_03.QAPromptSet
     */
    @WebMethod(operationName = "DoGetPromptSet", action = "http://www.qas.com/OnDemand-2011-03/DoGetPromptSet")
    @WebResult(name = "QAPromptSet", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
    public QAPromptSet doGetPromptSet(
        @WebParam(name = "QAGetPromptSet", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
        QAGetPromptSet body);

    /**
     * 
     * @param body
     * @return
     *     returns com.qas.ondemand_2011_03.QASearchOk
     */
    @WebMethod(operationName = "DoCanSearch", action = "http://www.qas.com/OnDemand-2011-03/DoCanSearch")
    @WebResult(name = "QASearchOk", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
    public QASearchOk doCanSearch(
        @WebParam(name = "QACanSearch", targetNamespace = "http://www.qas.com/OnDemand-2011-03", partName = "body")
        QACanSearch body);

}
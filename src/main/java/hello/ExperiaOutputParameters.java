
package hello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.qas.ondemand_2011_03.Address;
import com.qas.ondemand_2011_03.QAInformation;




@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "QAInformation","Address"
})
@XmlRootElement(name = "Envelope")
public class ExperiaOutputParameters {

	@XmlElement(name="Header")
    @XmlElementWrapper
    protected QAInformation objQAInfo;
	
	
	@XmlElement(name="Body")
    @XmlElementWrapper
    protected Address objAddress;


	public QAInformation getObjQAInfo() {
		return objQAInfo;
	}


	public void setObjQAInfo(QAInformation objQAInfo) {
		this.objQAInfo = objQAInfo;
	}


	public Address getObjAddress() {
		return objAddress;
	}


	public void setObjAddress(Address objAddress) {
		this.objAddress = objAddress;
	}

	

    

}

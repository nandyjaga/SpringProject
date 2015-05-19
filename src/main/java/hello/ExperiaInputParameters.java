
package hello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.qas.ondemand_2011_03.QAAuthentication;
import com.qas.ondemand_2011_03.QASearch;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "QAAuthentication","QASearch"
})
@XmlRootElement(name = "Envelope")
public class ExperiaInputParameters {

	@XmlElement(name="Header")
    @XmlElementWrapper
    protected QAAuthentication qaAuth;
	
	public QAAuthentication getQaAuth() {
		return qaAuth;
	}

	public void setQaAuth(QAAuthentication qaAuth) {
		this.qaAuth = qaAuth;
	}

	@XmlElement(name="Body")
    @XmlElementWrapper
    protected QASearch qaSearch;

	public QASearch getQaSearch() {
		return qaSearch;
	}

	public void setQaSearch(QASearch qaSearch) {
		this.qaSearch = qaSearch;
	}

    

}

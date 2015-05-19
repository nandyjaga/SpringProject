
package hello;

import java.text.SimpleDateFormat;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.qas.ondemand_2011_03.EngineIntensityType;
import com.qas.ondemand_2011_03.EngineType;
import com.qas.ondemand_2011_03.QAAuthentication;
import com.qas.ondemand_2011_03.QAQueryHeader;
import com.qas.ondemand_2011_03.QASearch;

import hello.wsdl.Forecast;
import hello.wsdl.ForecastReturn;
import hello.wsdl.GetCityForecastByZIP;
import hello.wsdl.GetCityForecastByZIPResponse;
import hello.wsdl.Temp;

public class WeatherClient extends WebServiceGatewaySupport {

	public ExperiaOutputParameters getSearchAddress() {
		
		QAAuthentication qaAuthRequestObj = new QAAuthentication();
		qaAuthRequestObj.setUsername("ws_2184_ext");
		qaAuthRequestObj.setPassword("@Nzd3v0la2015");
		
		QAQueryHeader qaQueryHeaderRequest = new QAQueryHeader();
		qaQueryHeaderRequest.setQAAuthentication(qaAuthRequestObj);
		
		EngineType engineEnum = new EngineType();
		engineEnum.setIntensity(EngineIntensityType.CLOSE);
		
		
		QASearch qaSearchRequest = new QASearch();
		qaSearchRequest.setCountry("AUE");
		qaSearchRequest.setSearch("Level 3 833 col");
		qaSearchRequest.setEngine(engineEnum );
		
		ExperiaInputParameters request = new ExperiaInputParameters();
		request.setQaAuth(qaAuthRequestObj);
		request.setQaSearch(qaSearchRequest);
		
		
		System.out.println();
		System.out.println("Requesting forecast for Address");

		ExperiaOutputParameters response = (ExperiaOutputParameters) getWebServiceTemplate().marshalSendAndReceive(
				request,
				new SoapActionCallback(
						"http://www.qas.com/OnDemand-2011-03/DoGetAddress"));

		return response;
	}
	
	/*public GetCityForecastByZIPResponse getCityForecastByZip(String zipCode) {
		GetCityForecastByZIP request = new GetCityForecastByZIP();
		request.setZIP(zipCode);

		System.out.println();
		System.out.println("Requesting forecast for " + zipCode);

		GetCityForecastByZIPResponse response = (GetCityForecastByZIPResponse) getWebServiceTemplate().marshalSendAndReceive(
				request,
				new SoapActionCallback(
						"http://ws.cdyne.com/WeatherWS/GetCityForecastByZIP"));

		return response;
	}*/

	public void printResponse(GetCityForecastByZIPResponse response) {
		ForecastReturn forecastReturn = response.getGetCityForecastByZIPResult();

		if (forecastReturn.isSuccess()) {
			System.out.println();
			System.out.println("Forecast for " + forecastReturn.getCity() + ", "
					+ forecastReturn.getState());

			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			for (Forecast forecast : forecastReturn.getForecastResult().getForecast()) {
				System.out.print(format.format(forecast.getDate().toGregorianCalendar().getTime()));
				System.out.print(" ");
				System.out.print(forecast.getDesciption());
				System.out.print(" ");
				Temp temperature = forecast.getTemperatures();
				System.out.print(temperature.getMorningLow() + "\u00b0-"
						+ temperature.getDaytimeHigh() + "\u00b0 ");
				System.out.println();
			}
		} else {
			System.out.println("No forecast received");
		}
	}

}

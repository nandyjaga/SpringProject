package hello;

import java.util.concurrent.atomic.AtomicLong;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qas.ondemand_2011_03.Address;
import com.qas.ondemand_2011_03.EngineIntensityType;
import com.qas.ondemand_2011_03.EngineType;
import com.qas.ondemand_2011_03.QAAuthentication;
import com.qas.ondemand_2011_03.QAQueryHeader;
import com.qas.ondemand_2011_03.QASearch;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public ExperiaInputParameters  greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(WeatherConfiguration.class);
		WeatherClient weatherClient = ctx.getBean(WeatherClient.class);
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
		
		
		
		String zipCode = "94304";
		ExperiaOutputParameters response = weatherClient.getSearchAddress();
	
		//weatherClient.printResponse(response);
		//Address forecastReturn = response.getObjAddress();
		return  request;
        
    }
}

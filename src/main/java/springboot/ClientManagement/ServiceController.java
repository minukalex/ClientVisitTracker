package springboot.ClientManagement;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springboot.ClientManagement.Model.ClientVisitModel;

import javax.validation.Valid;

@RestController
public class ServiceController {
	@Autowired
	private MongoDbManager mongoDBManager;
	
	@RequestMapping("/")
	public String home() {
		return "Spring boot is working!";
	}
	@RequestMapping(value = "/getClientData", method = RequestMethod.GET)
	public Collection getClientData() {
		System.out.println("hai");
		Collection result = mongoDBManager.getAllService("clientVisitModel");
		return result;
	}


	@RequestMapping(value = "/saveData", method = RequestMethod.POST)
	public ClientVisitModel saveClientVisitData(@Valid @RequestBody ClientVisitModel clientVisitModel) {

		mongoDBManager.saveData(clientVisitModel);
		return clientVisitModel;
	}


}

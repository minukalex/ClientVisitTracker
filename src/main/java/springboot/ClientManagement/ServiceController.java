package springboot.ClientManagement;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
		Collection result = mongoDBManager.getAllService("cilentdata");
		return result;
	}
}

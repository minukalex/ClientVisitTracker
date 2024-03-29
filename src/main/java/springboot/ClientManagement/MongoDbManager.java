package springboot.ClientManagement;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.mongodb.BasicDBObject;
import springboot.ClientManagement.Model.ClientVisitModel;

@Component
public class MongoDbManager {
	@Autowired
	private MongoOperations mongoOperations;

	
	public Collection getAllService(String collectionName) {
		return mongoOperations.findAll(BasicDBObject.class, collectionName);
	}

	public void saveData(ClientVisitModel clientVisitModel) {
		mongoOperations.save(clientVisitModel);
	}
}

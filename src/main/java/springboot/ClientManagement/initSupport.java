package springboot.ClientManagement;
import com.mongodb.*;

import java.lang.management.ManagementFactory;
import java.net.UnknownHostException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@Configuration
@EnableConfigurationProperties
public class initSupport {
	  @Value("${mongoDB.url}")
		private String url;

		@Value("${mongoDB.port}")
		private int port;

		@Value("${mongoDB.database}")
		private String db;
		
		@Value("${mongoDB.auth}")
		private boolean authEnabled;
		
		@Bean
		public MongoDbFactory mongoDbFactory() throws UnknownHostException{
			if (authEnabled) {
				String uriString = "mongodb://"+"@"+url+":"+port+"/"+db+"?authSource="+db+"&authMode=scram-sha1";
				MongoClientURI uri = new MongoClientURI(uriString);
				return new SimpleMongoDbFactory(uri);
			}else    
			{
				return new SimpleMongoDbFactory(new MongoClient(url, port), db);
			}
		}

		@Bean
		public MappingMongoConverter mongoConverter() throws Exception {
			MongoMappingContext mappingContext = new MongoMappingContext();
	        DbRefResolver dbRefResolver = new DefaultDbRefResolver(mongoDbFactory());
	        MappingMongoConverter mongoConverter = new MappingMongoConverter(dbRefResolver, mappingContext);
		    mongoConverter.setMapKeyDotReplacement("_");
		    return mongoConverter;
		}
		
		@Bean
		public MongoOperations mongoOperations() throws Exception{
			return new MongoTemplate(mongoDbFactory(), mongoConverter());
		}
}

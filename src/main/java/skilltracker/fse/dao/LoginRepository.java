package skilltracker.fse.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import skilltracker.fse.entity.User;

public interface LoginRepository extends MongoRepository<User, String> {
	
	@Query("{ '_id': ?0, 'password': ?1 }")
	public List<User> fetchUser(String userid, String password);

}

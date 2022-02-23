package mongodemo.example1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mongodemo.example1.dto.student;

@Repository
public interface bookrepo extends MongoRepository<student, String> {

}

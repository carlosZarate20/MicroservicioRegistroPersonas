package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import model.Person;

public interface PersonRepository extends CrudRepository<Person, String>{

	Person findOne(Long id);

	void delete(Long id);

}

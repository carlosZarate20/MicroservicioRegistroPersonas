package service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Person;
import repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public List getAllPersons() {
		
		List person = new ArrayList<>();
		personRepository.findAll().forEach(person::add);
		
		return person;
	}
	
	public Person getPerson(Long id) {
		return personRepository.findOne(id);
	}
	
	public void addPerson(Person person) {
		personRepository.save(person);
	}
	
	public void updatePerson(Long id, Person person) {
		personRepository.save(person);
	}
	
	public void deletePerson(Long id) {
		personRepository.delete(id);
	}
	
}

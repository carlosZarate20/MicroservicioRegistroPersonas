package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import model.Person;
import service.PersonService;

@RestController
@RequestMapping(value="/persons")
public class PersonController {

	@Autowired	
	private PersonService personService;
	
	@RequestMapping(method = RequestMethod.GET,produces = {"application/json"})
	public List getAllPersons() {
		return personService.getAllPersons();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,produces = {"application/json"})
	public Person getPerson(@PathVariable Long id) {
		return personService.getPerson(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,produces = {"application/json"})
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
	
	@RequestMapping(value= "/{id}", method = RequestMethod.PUT,produces = {"application/json"})
	public void updatePerson(@RequestBody Person person, @PathVariable Long id) {
		personService.updatePerson(id, person);
	}
	
	@RequestMapping(value= "/{id}", method = RequestMethod.DELETE,produces = {"application/json"})
	public void deletePerson(@PathVariable Long id) {
		personService.deletePerson(id);
	}
	
}

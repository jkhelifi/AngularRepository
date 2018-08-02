package tn.sofrecom.firstproject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.sofrecom.firstproject.business.interfaces.IPersonManagement;
import tn.sofrecom.firstproject.entities.Person;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({ "/person" })
public class PersonManagementService {

	@Autowired
	IPersonManagement iPersonManagement;

	@GetMapping
	public List<Person> getAllPersons() {
		List<Person> persons = new ArrayList<Person>();
		persons = iPersonManagement.fetchAllPersons();
		return persons;
	}

	@PutMapping
	public boolean modifierPersonne(@RequestBody Person person) {
		iPersonManagement.updatePerson(person);
		return true;
	}

	@GetMapping("/{pwd}/{email}")
	public Person getPersonByPwdAndEmail(String pwd, String email) {

		try {
			return iPersonManagement.getPersonByPwdAndEmail(pwd, email);
		} catch (Exception e) {
			return null;
		}

	}
}

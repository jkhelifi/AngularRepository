package tn.sofrecom.firstproject.business.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.sofrecom.firstproject.business.interfaces.IPersonManagement;
import tn.sofrecom.firstproject.dao.PersonRepository;
import tn.sofrecom.firstproject.entities.Person;

/***
 * person management class implementation
 * 
 * @author j.khelifi
 *
 */
@Service
public class PersonManagementImpl implements IPersonManagement {

	@Autowired
	private PersonRepository personRepository;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean addPerson(Person person) {
		personRepository.save(person);
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean updatePerson(Person person) {
		personRepository.save(person);
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Person> fetchAllPersons() {

		return personRepository.findAll();
	}

	@Override
	public Person getPersonByPwdAndEmail(String pwd, String email) {
		
		return personRepository.getPersonByPwdAndEmail(pwd, email);
	}

	

}

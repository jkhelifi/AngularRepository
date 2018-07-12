package tn.sofrecom.firstproject.business.impls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import tn.sofrecom.firstproject.business.interfaces.IPersonManagement;
import tn.sofrecom.firstproject.dao.PersonRepository;
import tn.sofrecom.firstproject.entities.Person;

/***
 * person management class implementation
 * 
 * @author j.khelifi
 *
 */
public class PersonManagementImpl implements IPersonManagement {

	@Autowired
	private PersonRepository personRepository;
	@PersistenceContext
	EntityManager entity;

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
	public Person fetchPersonById(Integer id) {

		return personRepository.findOne(id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Person> fetchAllPersons() {

		return personRepository.findAll();
	}

}

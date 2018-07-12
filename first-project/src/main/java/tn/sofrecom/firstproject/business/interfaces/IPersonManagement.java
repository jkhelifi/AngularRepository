package tn.sofrecom.firstproject.business.interfaces;

import java.util.List;

import tn.sofrecom.firstproject.entities.Person;

/***
 * person management interface
 * 
 * @author j.khelifi
 *
 */
public interface IPersonManagement {
	/**
	 * add person
	 * 
	 * @param person
	 *            person
	 * @return true if person added
	 */
	Boolean addPerson(Person person);

	/**
	 * update person
	 * 
	 * @param person
	 *            person
	 * @return true if person updated
	 */
	Boolean updatePerson(Person person);

	/***
	 * fetch person by id
	 * 
	 * @param id
	 *            id of Person
	 * @return person
	 */
	Person fetchPersonById(Integer id);

	/***
	 * fetch all persons
	 * 
	 * @return List of persons
	 */
	List<Person> fetchAllPersons();

}

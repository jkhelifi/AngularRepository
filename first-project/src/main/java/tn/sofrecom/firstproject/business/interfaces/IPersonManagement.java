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
	 * fetch all persons
	 * 
	 * @return List of persons
	 */
	List<Person> fetchAllPersons();

	/***
	 * get person by pwd && email
	 * 
	 * @param pwd
	 *            password of user
	 * @param email
	 *            email of user
	 * @return person
	 */
	Person getPersonByPwdAndEmail(String pwd, String email);

}

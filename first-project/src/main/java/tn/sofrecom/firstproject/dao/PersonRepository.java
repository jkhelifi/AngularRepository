package tn.sofrecom.firstproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.sofrecom.firstproject.entities.Person;

/***
 * person repository interface for entity: Person
 * 
 * @author j.khelifi
 *
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {

	@Query("select p from Person p WHERE p.password=:pwd and p.email=:em")
	public Person getPersonByPwdAndEmail(@Param("pwd") String pwd,  @Param("em") String email);
}

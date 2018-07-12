package tn.sofrecom.firstproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.sofrecom.firstproject.entities.Person;

/***
 * person repository interface for entity: Person
 * 
 * @author j.khelifi
 *
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {

}

package com.g2tech.test.demo1.repo;

import java.util.List;

import com.g2tech.test.demo1.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByLastName(@Param("lastName") String name);
    List<Person> findAll();

}
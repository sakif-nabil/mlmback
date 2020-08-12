package com.mlmbackend.demo.dao;

import com.mlmbackend.demo.entities.tree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface TreeRepository extends JpaRepository<tree,Long> {

}

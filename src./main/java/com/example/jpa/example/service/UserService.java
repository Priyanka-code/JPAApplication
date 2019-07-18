package com.example.jpa.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.jpa.example.entity.User;

@Repository
@Transactional
public class UserService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insertUser(User user) {
		entityManager.persist(user);
		return user.getId();
	}
	
	public User find(long id) {
		entityManager.find(User.class, id);
		return entityManager.find(User.class, id);

	}

	public List<User> findAll(){
		Query query = entityManager.createNamedQuery("query_find_all_users", User.class);
		return query.getResultList();
	}
}

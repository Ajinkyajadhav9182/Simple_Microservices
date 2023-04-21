package com.user_service.service;

import com.user_service.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Saving extends MongoRepository<User, Integer> {
}

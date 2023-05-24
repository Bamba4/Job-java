package com.bamba;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonRepository extends MongoRepository<Person, String> {
    // Définir des méthodes de requête personnalisées si nécessaire
    // ...
}

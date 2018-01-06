package com.hsnthn.repository;

import com.hsnthn.model.Proverb;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProverbRepository extends MongoRepository<Proverb, String> {

    @Query(value = "{'text': {$regex : ?0, $options: 'i'}}")
    List<Proverb> findByTextRegex(String text);


}

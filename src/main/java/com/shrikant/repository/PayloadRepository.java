package com.shrikant.repository;

import com.shrikant.entity.Payload;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayloadRepository extends CrudRepository<Payload,Integer> {


    Payload findById(int id);

    @Query("SELECT p FROM Payload p WHERE p.shipperId = :id")
    List<Payload> findPayloadByShipperId(@Param("id") int id);
}

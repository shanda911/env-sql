package com.demo.envsql.repo;

import com.demo.envsql.model.Locker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LockerRepository extends CrudRepository<Locker, Long>{
    List<Locker> findAll();
    Locker save(Locker locker);
}

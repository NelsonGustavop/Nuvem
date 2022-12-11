package com.Slayer.aot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Slayer.aot.domain.Os;

@Repository
public interface OsRepository extends JpaRepository<Os, Integer>{

}

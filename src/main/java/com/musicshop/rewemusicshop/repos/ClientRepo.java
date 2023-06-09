package com.musicshop.rewemusicshop.repos;

import com.musicshop.rewemusicshop.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface ClientRepo extends JpaRepository<Client, Long> {

    Optional<Client> findByName(String name);

    boolean existsByNameAndDob(String name, LocalDate dob);

}

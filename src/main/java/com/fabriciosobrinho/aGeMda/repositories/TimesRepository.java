package com.fabriciosobrinho.aGeMda.repositories;

import com.fabriciosobrinho.aGeMda.models.TimesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimesRepository extends JpaRepository<TimesModel, Integer>{
}
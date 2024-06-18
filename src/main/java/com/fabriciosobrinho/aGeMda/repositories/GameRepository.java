package com.fabriciosobrinho.aGeMda.repositories;

import com.fabriciosobrinho.aGeMda.models.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<GameModel, Integer>{
}
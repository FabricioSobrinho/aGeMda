package com.fabriciosobrinho.aGeMda.repositories;

import com.fabriciosobrinho.aGeMda.models.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerModel, Integer>{
}

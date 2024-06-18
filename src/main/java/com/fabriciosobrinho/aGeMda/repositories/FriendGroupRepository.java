package com.fabriciosobrinho.aGeMda.repositories;

import com.fabriciosobrinho.aGeMda.models.FriendGroupModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendGroupRepository extends JpaRepository<FriendGroupModel, Integer>{
}
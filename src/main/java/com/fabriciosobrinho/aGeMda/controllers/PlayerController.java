package com.fabriciosobrinho.aGeMda.controllers;

import com.fabriciosobrinho.aGeMda.dtos.PlayerRecordDto;
import com.fabriciosobrinho.aGeMda.models.PlayerModel;
import com.fabriciosobrinho.aGeMda.repositories.PlayerRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    PlayerRepository playerRepository;

    @GetMapping("/players")
    public ResponseEntity<List<PlayerModel>> index() {
        List<PlayerModel> jogadores = playerRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(jogadores);
    }

    @PostMapping("/players")
    public ResponseEntity<PlayerModel> createApartamento(@RequestBody @Valid PlayerRecordDto apartamentoRecordDto) {
        var apartamentoModel = new PlayerModel();
        BeanUtils.copyProperties(apartamentoRecordDto, apartamentoModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(playerRepository.save(apartamentoModel));
    }

}

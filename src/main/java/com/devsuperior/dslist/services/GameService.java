package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//com anotação @Service nos injetamos esse componente no sistema asssim poderemos usar os outros componentes do sistema aqui.
@Service
public class GameService {
    // Aqui injetamos uma dependencia do GameRepository dentro do meu GameService!!
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        var result= gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}

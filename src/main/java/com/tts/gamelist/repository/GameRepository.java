package com.tts.gamelist.repository;
import com.tts.gamelist.model.Game;

import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {

}


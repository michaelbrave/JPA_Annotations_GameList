package com.tts.gamelist.controller;

import com.tts.gamelist.repository.GameRepository;
import com.tts.gamelist.model.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GameController {

  @Autowired
  private GameRepository gameRepository;

  @GetMapping(value = "/")
  public String index(Game game){
    return "index"; //was game/index
  }

  private Game game;
  @PostMapping(value = "/")
  public String addGame(Game game, Model model){
    gameRepository.save(new Game(game.getGameName(), game.getGenre(), game.getYearReleased()));
    model.addAttribute("gameName", game.getGameName());
    model.addAttribute("genre", game.getGenre());
    model.addAttribute("yearReleased", game.getYearReleased());
    return "library"; //was game/library
  }
  
public Game getGame() {
	return game;
}
public void setGame(Game game) {
	this.game = game;
}
}
package com.tts.gamelist.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Game {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	  @Column(name = "gameName")
	  private String gameName;
	  @Column(name = "genre")
	  private String genre;
	  @Column(name = "yearReleased")
	  private String yearReleased;


	  @CreationTimestamp
	  private Date createdOn;

	  public Game() {
	  }

	  public Game(String gameName, String genre, String yearReleased) {
	    this.gameName = gameName;
	    this.genre = genre;
	    this.yearReleased = yearReleased;

	  }

	  public Long getId() {
	    return id;
	  }

	  public String getGameName() {
	    return gameName;
	  }

	  public void setGameName(String gameName) {
	    this.gameName = gameName;
	  }

	  public String getGenre() {
	    return genre;
	  }

	  public void setGenre(String genre) {
	    this.genre = genre;
	  }

	  public String getYearReleased() {
	    return yearReleased;
	  }

	  public void setYearReleased(String yearReleased) {
	    this.yearReleased = yearReleased;
	  }

	  public Date getCreatedOn() {
	    return createdOn;
	  }

	  public void setCreatedOn(Date createdOn) {
	    this.createdOn = createdOn;
	  }

	  @Override
	  public String toString() {
	    return "Game{" +
	            "id=" + id +
	            ", gameName='" + gameName + '\'' +
	            ", genre='" + genre + '\'' +
	            ", yearReleased=" + yearReleased +
	            '}';
	  }
}

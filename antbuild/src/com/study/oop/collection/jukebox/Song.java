package com.study.oop.collection.jukebox;

public class Song {

	String title;
	String artist;
	String rating;
	String bpm;
	
	public Song(String t, String a, String r, String b){
		this.title = t;
		this.artist = a;
		this.rating = r;
		this.bpm = b;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

	public String getBpm() {
		return bpm;
	}
	
	public String toString(){
		return title;
	}
}

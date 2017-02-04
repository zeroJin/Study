package com.study.oop.collection.jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Jukebox1 {

	ArrayList<Song> songList = new ArrayList<Song>();
	
	public static void main(String[] args) {
		new Jukebox1().go();
	}
	
	//out songList
	public void go(){
		getSongs();
//		Collections.sort(songList);
		System.out.println(songList);
	}
	//get SongsList
	private void getSongs() {
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null){
				//调用添加每行歌名到list
				addSong(line);
			}
//			System.out.println(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addSong(String line) {
		
		String[] tokens = line.split("/");
		
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
//		System.out.println("===" + tokens[1]);
	}
}

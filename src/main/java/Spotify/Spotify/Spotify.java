package Spotify.Spotify;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Spotify 
{
	ArrayList<String> users = new ArrayList<String>();
	int i = 0;
	public void AddUsers(String userName){
		users.add(i, userName);
		i++;
	 }
	
	 static String[] singers = {"Hayko Cepkin", "Tarkan", "Teoman"};
	 static String[] albumsHaykoCepkim = {"Sandik", "Tanısma Bitti"};
	 static String[] albumsTarkan = {"Karma", "Dudu"};
	 static String[] albumsTeoman = {"OnYedi", "Yavas Yavas"};
	 
	 ArrayList<String> albums = new ArrayList<String>();
	 
	 public void FindSingers(String search){
		 for(int a = 0; a<singers.length; a++){
			 if((search.toUpperCase()).equals(singers[a].toUpperCase())){
	                System.out.println("Wanted Singer: "+ singers[a]);
	                break;
	         }
		 }
	 }
	 public void ListSingers(){
		 for(int a = 0; a<singers.length; a++){
			 System.out.println("Singers : " + singers[a]);
		 }
	 }
	 public void ListAlbums(){
		 
		 albums.add(albumsHaykoCepkim[0]);
		 albums.add(albumsHaykoCepkim[1]);
		 albums.add(albumsTarkan[0]);
		 albums.add(albumsTarkan[1]);
		 albums.add(albumsTeoman[0]);
		 albums.add(albumsTeoman[1]);
		 for(int i = 0; i < albums.size(); i++){
			 System.out.println((i+1)+"-) "+albums.get( i ));
	     }
	 
	 }
	 public void FindAlbums(String search){
		 albums.add(albumsHaykoCepkim[0]);
		 albums.add(albumsHaykoCepkim[1]);
		 albums.add(albumsTarkan[0]);
		 albums.add(albumsTarkan[1]);
		 albums.add(albumsTeoman[0]);
		 albums.add(albumsTeoman[1]);
		 for(int a = 0; a<albums.size(); a++){
			 if((search.toUpperCase()).equals(albums.get(a).toUpperCase())){
	                System.out.println("Wanted Album: "+ albums.get(a));
	         }
		 }
	 }
	 public void ListSingerAlbums(String search){
		 for(int a=0; a<2; a++){
			if(search.toUpperCase().equals("TARKAN")){
				System.out.println(albumsTarkan[a]);
			}else if(search.toUpperCase().equals("TEOMAN")){
			 	System.out.println(albumsTeoman[a]);
			}else if(search.toUpperCase().equals("HAYKO CEPKIN")){
			 	System.out.println(albumsHaykoCepkim[a]);
			} else {
				System.out.println("Invalid singer name");
			}
		 }
	 }
}

package Spotify.Spotify;

import org.junit.Test;

public class SpotifyTest {
	
	@Test
	public void TestFindSingers(){
		Spotify spotify = new Spotify();
		spotify.FindSingers("Tarkan");
	}
	@Test
	public void TestAddUsers(){
		Spotify spotify = new Spotify();
		spotify.AddUsers("Deniz");
		spotify.AddUsers("Erdem");
	}
	@Test
	public void TestListSingers(){
		Spotify spotify = new Spotify();
		spotify.ListSingers();
	}
	@Test
	public void TestListAlbums(){
		Spotify spotify = new Spotify();
		spotify.ListAlbums();
	}
	@Test
	public void TestFindAlbums(){
		Spotify spotify = new Spotify();
		spotify.FindAlbums("Dudu");
	}
	@Test
	public void TestListSingerAlbums(){
		Spotify spotify = new Spotify();
		spotify.ListSingerAlbums("Teoman");
	}
	
}

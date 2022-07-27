import java.util.LinkedList;
import java.util.ArrayList;
public class Album{
  String name;
  String artist;
  ArrayList<Song> songs;
  public Album(String name, String artist){
    this.name = name;
    this.artist = artist;
    songs = new ArrayList<Song>();
  }
  //returns true if song was added successfully
  public boolean addSong(String title, double duration){
    return this.songs.add(new Song(title, duration));
  }
  //returns Song if exists, otherwise null
  private Song findSong(String title){
    for(Song song: songs){
      if(song.getTitle().equals(title)){
        return song;
      }
    }
    return null;
  }
  //returns true if exists, false otherwise
  public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
    if(trackNumber< 0 || trackNumber>songs.size()){
      System.out.println("index out of bounds");
      return false;
    }
    Song song = songs.get(trackNumber-1);
    if(!playlist.contains(song)){
      playlist.add(song);
      return false;
    }
    return true;
  }
  //returns true if exists and added successfully. otherwise false
  public boolean addToPlayList(String title, LinkedList<Song> playlist){
    return playlist.add(this.findSong(title));
  }
}

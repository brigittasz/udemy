import java.util.LinkedList;
import java.util.ArrayList;
public class Album{
  String name;
  String artist;
  SongList songs;
  public Album(String name, String artist){
    this.name = name;
    this.artist = artist;
    songs = new SongList();
  }
  //returns true if song was added successfully
  public boolean addSong(String title, double duration){
    return this.songs.add(new Song(title, duration));
  }
  
  //returns true if exists, false otherwise
  public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
    Song checkedSong = songs.findSong(trackNumber);
    if(checkedSong != null ){
      playlist.add(checkedSong);
      return true;
    }
    return false;
  }
  //returns true if exists and added successfully. otherwise false
  public boolean addToPlayList(String title, LinkedList<Song> playlist){
    Song song = songs.findSong(title);
    if(song != null){
      playlist.add(song);
      return true;
    }
    return false;
  }
  private class SongList{
    private ArrayList<Song> songs;
    public SongList(){
      this.songs = new ArrayList<Song>();
    }
    public boolean add(Song song){
      if(songs.contains(song)){
        return false;
      }
      this.songs.add(song);
      return true;
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
    public Song findSong(int trackNumber){
      int index = trackNumber -1;
      if((index > 0 && index<songs.size())){
        return songs.get(index);
      }
      return null;
    }
  }
  
}

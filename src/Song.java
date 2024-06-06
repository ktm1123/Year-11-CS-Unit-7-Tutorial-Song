import java.util.ArrayList;
public class Song {
    private String name;
    private String artist;

    private ArrayList<String> listeners = new ArrayList<String>();
    public Song(String n, String a){
        name = n;
        artist = a;
    }

    public String getTitle(){
        return name;
    }

    public String getArtist(){
        return artist;
    }

    public int howMany(ArrayList<String> list){
        int newCount = 0;
        for (String x: list){
            x = x.toLowerCase();
            if (!listeners.contains(x)){
                listeners.add(x);
                newCount++;
            }
        }
        return newCount;
    }





}
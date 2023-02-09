// Create a trackList of type HashMap
// Add in at least 4 songs that are stored by title
// Pull out one of the songs by its track title
// Print out all the track names and lyrics in the format Track: Lyrics
import java.util.HashMap;
import java.util.Set;

public class Tracks {
    public static void main (String[] args) {
        HashMap<String, String> tracks = new HashMap<String, String>();
        tracks.put("Como La Flor", "con tanto amor");
        tracks.put("Bidi Bidi Bom Bom", "cada vez que lo veo pasar");
        tracks.put("No Me Queda Mas", "que perderme en un abismo de tristeza y lagrimas");
        tracks.put("Si Una Vez", "ese error es cosa de ayer");  
        System.out.println(tracks.get("Si Una Vez"));
        Set<String> keys = tracks.keySet();
        for (String key:keys) {
            System.out.printf("Track name: %s Lyrics: %s \n", key, tracks.get(key));
        }
    }
}
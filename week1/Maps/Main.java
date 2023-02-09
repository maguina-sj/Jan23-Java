import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> countryCapitals = new HashMap<String, String>();
        countryCapitals.put("USA", "Washington DC");
        countryCapitals.put("Peru", "Lima");
        countryCapitals.put("South Korea", "Seoul");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Mexico", "Ciudad de Mexico");

// Add five countries and capitals to the 'countryCapitals' map

        // Print all keys from the map
        Set<String> keys = countryCapitals.keySet();
        for (String key: keys){
            System.out.println(key);
            System.out.println(countryCapitals.get(key));
            System.out.printf("The capital of %s is %s \n", key, countryCapitals.get(key));
// Print two countries and their capitals ('The capital of Oman is Muscat.')
        }

        
        

    }
}
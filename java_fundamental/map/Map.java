import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("song1", "this is song1");
        map.put("song2", "this is song2");
        map.put("song3", "this is song3");
        map.put("song4", "this is song4");
    
    
        String name = map.get("song3");

        
        for (String key : map.keySet()) {
            System.out.println(String.format("Track: %s:Lyrics: %s", key, map.get(key)));
        }
    }
    }
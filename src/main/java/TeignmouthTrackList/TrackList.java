package TeignmouthTrackList;
import java.util.HashMap;

public class TrackList {
    private HashMap<String, String> songMap;

    public TrackList() {
        this.songMap = new HashMap<String, String> ();
        this.songMap.put("Tired To Death", "feel the power in the air bloody bodies running down the street try it again please it again");
        this.songMap.put("Very Ill", "I wonder whether the girls are mad, And I wonder whether they mean to kill, And I wonder if William Bond will die, For assuredly he is very ill");
        this.songMap.put("Wild World", "Feel the wild world in the air, Leddy body's running down the sraight, Try it again, Please it again, Can't control my mind, Can't control my mind, Feel the wild world in the air, You must be very ill, When you be lackey, Feel the wild world");
        this.songMap.put("Fiorina", "My journey will not end, Something compells me, I travel through the darkness To be by your side");
    }

    public String getSong(String title) {
        if (songMap.containsKey(title)) {
            return songMap.get(title);
        }

        return "Sorry, this song does not exists in this track list.";
    }
}

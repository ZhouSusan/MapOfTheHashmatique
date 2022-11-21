package TeignmouthTrackList;
import static org.junit.jupiter.api.Assertions.*;

class TrackListTest {

    @org.junit.jupiter.api.Test
    void getSongTest() {
        TrackList trackList = new TrackList();
        assertAll(() -> assertEquals( "I wonder whether the girls are mad, And I wonder whether they mean to kill, " +
                        "And I wonder if William Bond will die, For assuredly he is very ill", trackList.getSong("Very Ill")),
                () -> assertEquals( "feel the power in the air bloody bodies running down the street try it again please it again", trackList.getSong("Tired To Death")),
                () -> assertEquals( "My journey will not end, Something compells me, I travel through the darkness To be by your side", trackList.getSong("Fiorina")),
                () -> assertEquals("Feel the wild world in the air, Leddy body's running down the sraight, Try it again, Please it again, Can't control my mind," +
                        " Can't control my mind, Feel the wild world in the air, You must be very ill, When you be lackey, Feel the wild world", trackList.getSong("Wild World")));
    }
}
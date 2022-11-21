package TeignmouthTrackList;

public class Main {
    public static void main(String[] args) {
        TrackList trackList = new TrackList();
        System.out.format("Song lyric : %s",trackList.getSong("Very Ill"));
        System.out.println("\n************************************************");
        trackList.printAll();
    }
}
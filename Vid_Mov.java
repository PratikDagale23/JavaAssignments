import java.util.Scanner;

class VideoTape {
    private String title;
    private int duration;

    public VideoTape(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void displayInformation() {
        System.out.println("Video Tape Information:");
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class Movie extends VideoTape {
    private String genre;

    public Movie(String title, int duration, String genre) {
        super(title, duration);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Genre: " + genre);
    }
}

class MusicVideo extends VideoTape {
    private String artist;

    public MusicVideo(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Artist: " + artist);
    }
}

public class Vid_Mov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title of the video tape: ");
        String title = scanner.nextLine();

        System.out.print("Enter the duration of the video tape (in minutes): ");
        int duration = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter the genre of the movie (or N/A for Music Video): ");
        String genre = scanner.nextLine();

        VideoTape videoTape;
        if (genre.equalsIgnoreCase("N/A")) {
            System.out.print("Enter the artist of the music video: ");
            String artist = scanner.nextLine();
            videoTape = new MusicVideo(title, duration, artist);
        } else {
            videoTape = new Movie(title, duration, genre);
        }

        System.out.println();
        videoTape.displayInformation();
    }
}

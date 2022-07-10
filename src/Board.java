import java.util.ArrayList;

public class Board {
    private String title;
    private int boardId;
    private ArrayList<User> guests = new ArrayList<>();
    private ArrayList<User> admins = new ArrayList<>();
    private ArrayList<List> lists = new ArrayList<>();

    public Board(String title, int boardId) {
        this.title = title;
        this.boardId = boardId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
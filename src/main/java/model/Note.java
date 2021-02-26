package model;

public class Note {
    private int id;
    private String title;
    private String content;
    private NoteType noteType;
private Login login;

    public Note(int id, String title, String content, NoteType noteType, Login login) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.noteType = noteType;
        this.login = login;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Note(String title, String content, NoteType noteType, Login login) {
        this.title = title;
        this.content = content;
        this.noteType = noteType;
        this.login = login;
    }

    public Note(String title, String content, NoteType noteType) {
        this.title = title;
        this.content = content;
        this.noteType = noteType;
    }


    public Note(int id, String title, String content, NoteType noteType) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.noteType = noteType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public NoteType getNoteType() {
        return noteType;
    }

    public void setNoteType(NoteType noteType) {
        this.noteType = noteType;
    }


}

package jot.guardgalaxy.com.jot.models;

/**
 * Created by dray on 4/19/2017.
 *
 * Builder class for JotNote
 */

public class JotNoteBuilder {
    private String title = "Untitled";
    private String body;
    private String tag = "";
    private String timeStamp;

    public JotNoteBuilder(String body, String timeStamp) {
        setBody(body);
        setTimeStamp(timeStamp);
    }

    public String getTitle() {
        return title;
    }

    public JotNoteBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public JotNoteBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public JotNoteBuilder setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public JotNoteBuilder setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public JotNote toJotNote() {
        return new JotNote(title, body, tag, timeStamp);
    }
}

package jot.guardgalaxy.com.jot.models;

/**
 * Created by dray on 4/19/2017.
 *
 * Note containing a title, body, tag, and time stamp
 */

public class JotNote {
    private String title, body, tag, timeStamp;

    //Please use JotNoteBuilder instead of overloading constructors
    public JotNote(String title, String body, String tag, String timeStamp) {
        setTitle(title);
        setBody(body);
        setTag(tag);
        setTimeStamp(timeStamp);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}

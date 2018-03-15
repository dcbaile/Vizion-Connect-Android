package com.vizionchurch.vizionconnect.models;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;

public class Snippet implements Serializable, Parcelable
{

    private String publishedAt;
    private String title;
    private String description;
    private Thumbnails thumbnails;
    public final static Parcelable.Creator<Snippet> CREATOR = new Creator<Snippet>() {
        @SuppressWarnings({
                "unchecked"
        })
        public Snippet createFromParcel(Parcel in) {
            return new Snippet(in);
        }

        public Snippet[] newArray(int size) {
            return (new Snippet[size]);
        }

    }
            ;
    private final static long serialVersionUID = -2638420056027106329L;

    protected Snippet(Parcel in) {
        this.publishedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnails = ((Thumbnails) in.readValue(Thumbnails.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Snippet() {
    }
    /**
     *
     * @param publishedAt
     * @param title
     * @param description
     * @param thumbnails
     */
    public Snippet(String publishedAt, String title, String description, Thumbnails thumbnails) {
        super();
        this.publishedAt = publishedAt;
        this.title = title;
        this.description = description;
        this.thumbnails = thumbnails;
    }

    public String getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    @Override
    public String toString() {
        return (publishedAt + title + description + thumbnails.toString());
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(publishedAt);
        dest.writeValue(title);
        dest.writeValue(description);
        dest.writeValue(thumbnails);
    }

    public int describeContents() {
        return 0;
    }

}
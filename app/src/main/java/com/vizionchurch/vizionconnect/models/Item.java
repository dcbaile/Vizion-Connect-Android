package com.vizionchurch.vizionconnect.models;
import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Serializable, Parcelable
{

    private String id;
    private Snippet snippet;
    public final static Parcelable.Creator<Item> CREATOR = new Creator<Item>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        public Item[] newArray(int size) {
            return (new Item[size]);
        }

    }
            ;
    private final static long serialVersionUID = -6743991625310343364L;

    protected Item(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.snippet = ((Snippet) in.readValue((Snippet.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Item() {
    }

    /**
     *
     * @param id
     * @param snippet
     */
    public Item(String id, Snippet snippet) {
        super();
        this.id = id;
        this.snippet = snippet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    @Override
    public String toString() {
        return (id + snippet.toString());
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(snippet);
    }

    public int describeContents() {
        return 0;
    }

}
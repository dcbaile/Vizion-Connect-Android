package com.vizionchurch.vizionconnect.models;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public class Video implements Serializable, Parcelable
{
    private List<Item> items = null;
    public final static Parcelable.Creator<Video> CREATOR = new Creator<Video>() {

        @SuppressWarnings({
                "unchecked"
        })
        public Video createFromParcel(Parcel in) {
            return new Video(in);
        }

        public Video[] newArray(int size) {
            return (new Video[size]);
        }
    }
            ;
    private final static long serialVersionUID = -6281603761252110051L;

    protected Video(Parcel in) {
        in.readList(this.items, (com.vizionchurch.vizionconnect.models.Item.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Video() {
    }

    /**
     *
     * @param items
     */
    public Video(List<Item> items) {
        super();
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return items.toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(items);
    }

    public int describeContents() {
        return 0;
    }

}
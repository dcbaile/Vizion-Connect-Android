package com.vizionchurch.vizionconnect.models;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;


public class Medium implements Serializable, Parcelable
{

    private String url;
    public final static Parcelable.Creator<Medium> CREATOR = new Creator<Medium>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Medium createFromParcel(Parcel in) {
            return new Medium(in);
        }

        public Medium[] newArray(int size) {
            return (new Medium[size]);
        }

    }
            ;
    private final static long serialVersionUID = 6146706928027902017L;

    protected Medium(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Medium() {
    }

    /**
     *
     * @param url
     */
    public Medium(String url) {
        super();
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return url;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
    }

    public int describeContents() {
        return 0;
    }

}
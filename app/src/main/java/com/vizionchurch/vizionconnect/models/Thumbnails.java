package com.vizionchurch.vizionconnect.models;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

public class Thumbnails implements Serializable, Parcelable
{

    private Medium medium;
    private High high;
    public final static Parcelable.Creator<Thumbnails> CREATOR = new Creator<Thumbnails>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Thumbnails createFromParcel(Parcel in) {
            return new Thumbnails(in);
        }

        public Thumbnails[] newArray(int size) {
            return (new Thumbnails[size]);
        }

    }
            ;
    private final static long serialVersionUID = -8845173721973349384L;

    protected Thumbnails(Parcel in) {
        this.medium = ((Medium) in.readValue((Medium.class.getClassLoader())));
        this.high = ((High) in.readValue((High.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Thumbnails() {
    }

    /**
     *
     * @param high
     * @param medium
     */
    public Thumbnails(Medium medium, High high) {
        super();
        this.medium = medium;
        this.high = high;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return(medium.toString() + high.toString());
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(medium);
        dest.writeValue(high);
    }

    public int describeContents() {
        return 0;
    }

}
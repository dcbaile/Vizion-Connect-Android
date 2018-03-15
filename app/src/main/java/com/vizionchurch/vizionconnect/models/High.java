package com.vizionchurch.vizionconnect.models;

        import java.io.Serializable;
        import android.os.Parcel;
        import android.os.Parcelable;


public class High implements Serializable, Parcelable
{

    private String url;
    public final static Parcelable.Creator<High> CREATOR = new Creator<High>() {


        @SuppressWarnings({
                "unchecked"
        })
        public High createFromParcel(Parcel in) {
            return new High(in);
        }

        public High[] newArray(int size) {
            return (new High[size]);
        }

    }
            ;
    private final static long serialVersionUID = 1742328297307312931L;

    protected High(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public High() {
    }

    /**
     *
     * @param url
     */
    public High(String url) {
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
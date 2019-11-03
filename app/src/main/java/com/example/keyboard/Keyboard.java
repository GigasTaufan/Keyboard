package com.example.keyboard;

import android.os.Parcel;
import android.os.Parcelable;

class Keyboard implements Parcelable {
    private String name;
    private String detail;
    private String price;
    private int photo;


    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getPrice() {
        return price;
    }

    void setPrice(String price) {
        this.price = price;
    }

    String getDetail() {
        return detail;
    }

    void setDetail(String detail) {
        this.detail = detail;
    }

    int getPhoto() {
        return photo;
    }

    void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.detail);
        dest.writeString(this.price);
        dest.writeInt(this.photo);
    }

    public Keyboard() {
    }

    protected Keyboard(Parcel in) {
        this.name = in.readString();
        this.detail = in.readString();
        this.price = in.readString();
        this.photo = in.readInt();
    }

    public static final Parcelable.Creator<Keyboard> CREATOR = new Parcelable.Creator<Keyboard>() {
        @Override
        public Keyboard createFromParcel(Parcel source) {
            return new Keyboard(source);
        }

        @Override
        public Keyboard[] newArray(int size) {
            return new Keyboard[size];
        }
    };
}

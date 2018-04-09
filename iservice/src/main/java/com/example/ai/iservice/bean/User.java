package com.example.ai.iservice.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chenwanfeng on 2018/4/9.
 */

public class User implements Parcelable {

    public String name;
    public String school;

    public User() {

    }

    public User(String name, String school) {
        this.name = name;
        this.school = school;
    }

    protected User(Parcel in) {
        this.name = in.readString();
        this.school = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.school);
    }
}

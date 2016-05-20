package com.doubledotlabs.letters;

import android.os.Parcel;
import android.os.Parcelable;

public class Letter implements Parcelable {

    String letter;
    double x, y, z;

    public Letter(String letter, double x, double y, double z) {
        this.letter = letter;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    protected Letter(Parcel in) {
        letter = in.readString();
        x = in.readDouble();
        y = in.readDouble();
        z = in.readDouble();
    }

    public static final Creator<Letter> CREATOR = new Creator<Letter>() {
        @Override
        public Letter createFromParcel(Parcel in) {
            return new Letter(in);
        }

        @Override
        public Letter[] newArray(int size) {
            return new Letter[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(letter);
        dest.writeDouble(x);
        dest.writeDouble(y);
        dest.writeDouble(z);
    }
}

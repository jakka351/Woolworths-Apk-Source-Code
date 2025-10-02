package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes6.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new AnonymousClass1();
    public final MaxInputValidator d;
    public final MaxInputValidator e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* renamed from: com.google.android.material.timepicker.TimeModel$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        public final TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.f = i4;
        this.j = i >= 12 ? 1 : 0;
        this.d = new MaxInputValidator(59);
        this.e = new MaxInputValidator(i4 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int b() {
        if (this.f == 1) {
            return this.g % 24;
        }
        int i = this.g;
        if (i % 12 == 0) {
            return 12;
        }
        return this.j == 1 ? i - 12 : i;
    }

    public final void c(int i) {
        if (this.f == 1) {
            this.g = i;
        } else {
            this.g = (i % 12) + (this.j != 1 ? 0 : 12);
        }
    }

    public final void d(int i) {
        if (i != this.j) {
            this.j = i;
            int i2 = this.g;
            if (i2 < 12 && i == 1) {
                this.g = i2 + 12;
            } else {
                if (i2 < 12 || i != 0) {
                    return;
                }
                this.g = i2 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.g == timeModel.g && this.h == timeModel.h && this.f == timeModel.f && this.i == timeModel.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.f);
    }
}

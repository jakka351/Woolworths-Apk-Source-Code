package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new AnonymousClass1();
    public final String d;
    public final AtomicLong e;

    /* renamed from: com.google.firebase.perf.metrics.Counter$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<Counter> {
        @Override // android.os.Parcelable.Creator
        public final Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Counter[] newArray(int i) {
            return new Counter[i];
        }
    }

    public Counter(String str) {
        this.d = str;
        this.e = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeLong(this.e.get());
    }

    public Counter(Parcel parcel) {
        this.d = parcel.readString();
        this.e = new AtomicLong(parcel.readLong());
    }
}

package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new AnonymousClass1();
    public long d;
    public long e;

    /* renamed from: com.google.firebase.perf.util.Timer$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<Timer> {
        @Override // android.os.Parcelable.Creator
        public final Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Timer[] newArray(int i) {
            return new Timer[i];
        }
    }

    public Timer() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long a() {
        return new Timer().e - this.e;
    }

    public final long b(Timer timer) {
        return timer.e - this.e;
    }

    public final void c() {
        this.d = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.e = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }

    public Timer(long j, long j2) {
        this.d = j;
        this.e = j2;
    }
}

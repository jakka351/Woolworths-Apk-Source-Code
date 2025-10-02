package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes6.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new AnonymousClass1();
    public final Calendar d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public String j;

    /* renamed from: com.google.android.material.datepicker.Month$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        public final Month createFromParcel(Parcel parcel) {
            return Month.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = UtcDates.c(calendar);
        this.d = calendarC;
        this.e = calendarC.get(2);
        this.f = calendarC.get(1);
        this.g = calendarC.getMaximum(7);
        this.h = calendarC.getActualMaximum(5);
        this.i = calendarC.getTimeInMillis();
    }

    public static Month a(int i, int i2) {
        Calendar calendarG = UtcDates.g(null);
        calendarG.set(1, i);
        calendarG.set(2, i2);
        return new Month(calendarG);
    }

    public static Month b(long j) {
        Calendar calendarG = UtcDates.g(null);
        calendarG.setTimeInMillis(j);
        return new Month(calendarG);
    }

    public final String c() {
        if (this.j == null) {
            this.j = UtcDates.b("yMMMM", Locale.getDefault()).format(new Date(this.d.getTimeInMillis()));
        }
        return this.j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.d.compareTo(month.d);
    }

    public final int d(Month month) {
        if (!(this.d instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.e - this.e) + ((month.f - this.f) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.e == month.e && this.f == month.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.e);
    }
}

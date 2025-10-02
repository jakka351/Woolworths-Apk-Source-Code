package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new AnonymousClass1();
    public final Month d;
    public final Month e;
    public final DateValidator f;
    public final Month g;
    public final int h;
    public final int i;
    public final int j;

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public static final class Builder {
        public static final /* synthetic */ int c = 0;

        /* renamed from: a, reason: collision with root package name */
        public Long f14561a;
        public DateValidator b;

        static {
            UtcDates.a(Month.a(1900, 0).i);
            UtcDates.a(Month.a(2100, 11).i);
        }
    }

    public interface DateValidator extends Parcelable {
        boolean d0(long j);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.d = month;
        this.e = month2;
        this.g = month3;
        this.h = i;
        this.f = dateValidator;
        if (month3 != null && month.d.compareTo(month3.d) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.d.compareTo(month2.d) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > UtcDates.g(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.j = month.d(month2) + 1;
        this.i = (month2.f - month.f) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.d.equals(calendarConstraints.d) && this.e.equals(calendarConstraints.e) && Objects.equals(this.g, calendarConstraints.g) && this.h == calendarConstraints.h && this.f.equals(calendarConstraints.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.g, Integer.valueOf(this.h), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeInt(this.h);
    }
}

package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public final Operator d;
    public final ArrayList e;
    public static final AnonymousClass1 f = new AnonymousClass1();
    public static final AnonymousClass2 g = new AnonymousClass2();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new AnonymousClass3();

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$1, reason: invalid class name */
    public class AnonymousClass1 implements Operator {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final boolean a(long j, ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.d0(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$2, reason: invalid class name */
    public class AnonymousClass2 implements Operator {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final boolean a(long j, ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.d0(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final int getId() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$3, reason: invalid class name */
    public class AnonymousClass3 implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        public final CompositeDateValidator createFromParcel(Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i = parcel.readInt();
            Operator operator = CompositeDateValidator.g;
            if (i != 2 && i == 1) {
                operator = CompositeDateValidator.f;
            }
            arrayList.getClass();
            return new CompositeDateValidator(arrayList, operator);
        }

        @Override // android.os.Parcelable.Creator
        public final CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    public interface Operator {
        boolean a(long j, ArrayList arrayList);

        int getId();
    }

    public CompositeDateValidator(ArrayList arrayList, Operator operator) {
        this.e = arrayList;
        this.d = operator;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean d0(long j) {
        return this.d.a(j, this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.e.equals(compositeDateValidator.e) && this.d.getId() == compositeDateValidator.d.getId();
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.e);
        parcel.writeInt(this.d.getId());
    }
}

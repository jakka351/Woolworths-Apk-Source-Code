package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableDouble extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new AnonymousClass1();
    public double e;

    /* renamed from: androidx.databinding.ObservableDouble$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ObservableDouble> {
        @Override // android.os.Parcelable.Creator
        public final ObservableDouble createFromParcel(Parcel parcel) {
            double d = parcel.readDouble();
            ObservableDouble observableDouble = new ObservableDouble();
            observableDouble.e = d;
            return observableDouble;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableDouble[] newArray(int i) {
            return new ObservableDouble[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.e);
    }
}

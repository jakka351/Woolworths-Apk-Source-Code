package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableInt extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new AnonymousClass1();
    public int e;

    /* renamed from: androidx.databinding.ObservableInt$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ObservableInt> {
        @Override // android.os.Parcelable.Creator
        public final ObservableInt createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ObservableInt observableInt = new ObservableInt();
            observableInt.e = i;
            return observableInt;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableInt[] newArray(int i) {
            return new ObservableInt[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
    }
}

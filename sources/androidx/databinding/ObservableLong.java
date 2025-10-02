package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableLong extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new AnonymousClass1();
    public long e;

    /* renamed from: androidx.databinding.ObservableLong$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ObservableLong> {
        @Override // android.os.Parcelable.Creator
        public final ObservableLong createFromParcel(Parcel parcel) {
            long j = parcel.readLong();
            ObservableLong observableLong = new ObservableLong();
            observableLong.e = j;
            return observableLong;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableLong[] newArray(int i) {
            return new ObservableLong[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.e);
    }
}

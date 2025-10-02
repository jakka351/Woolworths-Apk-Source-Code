package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableByte extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new AnonymousClass1();
    public byte e;

    /* renamed from: androidx.databinding.ObservableByte$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ObservableByte> {
        @Override // android.os.Parcelable.Creator
        public final ObservableByte createFromParcel(Parcel parcel) {
            byte b = parcel.readByte();
            ObservableByte observableByte = new ObservableByte();
            observableByte.e = b;
            return observableByte;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableByte[] newArray(int i) {
            return new ObservableByte[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.e);
    }
}

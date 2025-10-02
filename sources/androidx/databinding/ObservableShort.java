package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableShort extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new AnonymousClass1();
    public short e;

    /* renamed from: androidx.databinding.ObservableShort$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ObservableShort> {
        @Override // android.os.Parcelable.Creator
        public final ObservableShort createFromParcel(Parcel parcel) {
            short s = (short) parcel.readInt();
            ObservableShort observableShort = new ObservableShort();
            observableShort.e = s;
            return observableShort;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableShort[] newArray(int i) {
            return new ObservableShort[i];
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

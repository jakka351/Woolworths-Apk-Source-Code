package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableFloat extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new AnonymousClass1();
    public float e;

    /* renamed from: androidx.databinding.ObservableFloat$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ObservableFloat> {
        @Override // android.os.Parcelable.Creator
        public final ObservableFloat createFromParcel(Parcel parcel) {
            float f = parcel.readFloat();
            ObservableFloat observableFloat = new ObservableFloat();
            observableFloat.e = f;
            return observableFloat;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableFloat[] newArray(int i) {
            return new ObservableFloat[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.e);
    }
}

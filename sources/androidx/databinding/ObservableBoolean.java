package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableBoolean extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new AnonymousClass1();
    public boolean e;

    /* renamed from: androidx.databinding.ObservableBoolean$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ObservableBoolean> {
        @Override // android.os.Parcelable.Creator
        public final ObservableBoolean createFromParcel(Parcel parcel) {
            return new ObservableBoolean(parcel.readInt() == 1);
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableBoolean[] newArray(int i) {
            return new ObservableBoolean[i];
        }
    }

    public ObservableBoolean(boolean z) {
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void i(boolean z) throws Throwable {
        if (z != this.e) {
            this.e = z;
            synchronized (this) {
                try {
                    PropertyChangeRegistry propertyChangeRegistry = this.d;
                    if (propertyChangeRegistry == null) {
                        return;
                    }
                    propertyChangeRegistry.b(0, this, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e ? 1 : 0);
    }
}

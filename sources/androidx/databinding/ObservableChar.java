package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableChar extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new AnonymousClass1();
    public char e;

    /* renamed from: androidx.databinding.ObservableChar$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ObservableChar> {
        @Override // android.os.Parcelable.Creator
        public final ObservableChar createFromParcel(Parcel parcel) {
            char c = (char) parcel.readInt();
            ObservableChar observableChar = new ObservableChar();
            observableChar.e = c;
            return observableChar;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableChar[] newArray(int i) {
            return new ObservableChar[i];
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

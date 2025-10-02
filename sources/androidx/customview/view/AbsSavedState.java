package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint
/* loaded from: classes2.dex */
public abstract class AbsSavedState implements Parcelable {
    public final Parcelable d;
    public static final AbsSavedState e = new AnonymousClass1();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new AnonymousClass2();

    /* renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    public class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState() {
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }

    /* renamed from: androidx.customview.view.AbsSavedState$2, reason: invalid class name */
    public class AnonymousClass2 implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbsSavedState.e;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AbsSavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.e;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.d = parcelable == e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.d = parcelable == null ? e : parcelable;
    }
}

package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint
/* loaded from: classes2.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new AnonymousClass1();
    public final ArrayList d;
    public final ArrayList e;

    /* renamed from: androidx.fragment.app.BackStackState$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.d);
        parcel.writeTypedList(this.e);
    }

    public BackStackState(Parcel parcel) {
        this.d = parcel.createStringArrayList();
        this.e = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}

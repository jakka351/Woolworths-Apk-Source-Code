package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint
/* loaded from: classes2.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new AnonymousClass1();
    public ArrayList d;
    public ArrayList e;
    public BackStackRecordState[] f;
    public int g;
    public String h = null;
    public ArrayList i = new ArrayList();
    public ArrayList j = new ArrayList();
    public ArrayList k;

    /* renamed from: androidx.fragment.app.FragmentManagerState$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState createFromParcel(Parcel parcel) {
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.h = null;
            fragmentManagerState.i = new ArrayList();
            fragmentManagerState.j = new ArrayList();
            fragmentManagerState.d = parcel.createStringArrayList();
            fragmentManagerState.e = parcel.createStringArrayList();
            fragmentManagerState.f = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
            fragmentManagerState.g = parcel.readInt();
            fragmentManagerState.h = parcel.readString();
            fragmentManagerState.i = parcel.createStringArrayList();
            fragmentManagerState.j = parcel.createTypedArrayList(BackStackState.CREATOR);
            fragmentManagerState.k = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
            return fragmentManagerState;
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.d);
        parcel.writeStringList(this.e);
        parcel.writeTypedArray(this.f, i);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeStringList(this.i);
        parcel.writeTypedList(this.j);
        parcel.writeTypedList(this.k);
    }
}

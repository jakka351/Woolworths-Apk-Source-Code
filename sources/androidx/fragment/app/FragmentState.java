package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

@SuppressLint
/* loaded from: classes2.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new AnonymousClass1();
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final String p;
    public final int q;
    public final boolean r;

    /* renamed from: androidx.fragment.app.FragmentState$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment2) {
        this.d = fragment2.getClass().getName();
        this.e = fragment2.mWho;
        this.f = fragment2.mFromLayout;
        this.g = fragment2.mInDynamicContainer;
        this.h = fragment2.mFragmentId;
        this.i = fragment2.mContainerId;
        this.j = fragment2.mTag;
        this.k = fragment2.mRetainInstance;
        this.l = fragment2.mRemoving;
        this.m = fragment2.mDetached;
        this.n = fragment2.mHidden;
        this.o = fragment2.mMaxState.ordinal();
        this.p = fragment2.mTargetWho;
        this.q = fragment2.mTargetRequestCode;
        this.r = fragment2.mUserVisibleHint;
    }

    public final Fragment a(FragmentFactory fragmentFactory, ClassLoader classLoader) {
        Fragment fragmentA = fragmentFactory.a(classLoader, this.d);
        fragmentA.mWho = this.e;
        fragmentA.mFromLayout = this.f;
        fragmentA.mInDynamicContainer = this.g;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.h;
        fragmentA.mContainerId = this.i;
        fragmentA.mTag = this.j;
        fragmentA.mRetainInstance = this.k;
        fragmentA.mRemoving = this.l;
        fragmentA.mDetached = this.m;
        fragmentA.mHidden = this.n;
        fragmentA.mMaxState = Lifecycle.State.values()[this.o];
        fragmentA.mTargetWho = this.p;
        fragmentA.mTargetRequestCode = this.q;
        fragmentA.mUserVisibleHint = this.r;
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbO = androidx.constraintlayout.core.state.a.o(128, "FragmentState{");
        sbO.append(this.d);
        sbO.append(" (");
        sbO.append(this.e);
        sbO.append(")}:");
        if (this.f) {
            sbO.append(" fromLayout");
        }
        if (this.g) {
            sbO.append(" dynamicContainer");
        }
        int i = this.i;
        if (i != 0) {
            sbO.append(" id=0x");
            sbO.append(Integer.toHexString(i));
        }
        String str = this.j;
        if (str != null && !str.isEmpty()) {
            sbO.append(" tag=");
            sbO.append(str);
        }
        if (this.k) {
            sbO.append(" retainInstance");
        }
        if (this.l) {
            sbO.append(" removing");
        }
        if (this.m) {
            sbO.append(" detached");
        }
        if (this.n) {
            sbO.append(" hidden");
        }
        String str2 = this.p;
        if (str2 != null) {
            androidx.compose.ui.input.pointer.a.w(sbO, " targetWho=", str2, " targetRequestCode=");
            sbO.append(this.q);
        }
        if (this.r) {
            sbO.append(" userVisibleHint");
        }
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readInt() != 0;
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.n = parcel.readInt() != 0;
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readInt();
        this.r = parcel.readInt() != 0;
    }
}

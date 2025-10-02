package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

@SuppressLint
/* loaded from: classes2.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new AnonymousClass1();
    public final int[] d;
    public final ArrayList e;
    public final int[] f;
    public final int[] g;
    public final int h;
    public final String i;
    public final int j;
    public final int k;
    public final CharSequence l;
    public final int m;
    public final CharSequence n;
    public final ArrayList o;
    public final ArrayList p;
    public final boolean q;

    /* renamed from: androidx.fragment.app.BackStackRecordState$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(BackStackRecord backStackRecord) {
        int size = backStackRecord.f2759a.size();
        this.d = new int[size * 6];
        if (!backStackRecord.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.e = new ArrayList(size);
        this.f = new int[size];
        this.g = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) backStackRecord.f2759a.get(i2);
            int i3 = i + 1;
            this.d[i] = op.f2760a;
            ArrayList arrayList = this.e;
            Fragment fragment2 = op.b;
            arrayList.add(fragment2 != null ? fragment2.mWho : null);
            int[] iArr = this.d;
            iArr[i3] = op.c ? 1 : 0;
            iArr[i + 2] = op.d;
            iArr[i + 3] = op.e;
            int i4 = i + 5;
            iArr[i + 4] = op.f;
            i += 6;
            iArr[i4] = op.g;
            this.f[i2] = op.h.ordinal();
            this.g[i2] = op.i.ordinal();
        }
        this.h = backStackRecord.f;
        this.i = backStackRecord.i;
        this.j = backStackRecord.t;
        this.k = backStackRecord.j;
        this.l = backStackRecord.k;
        this.m = backStackRecord.l;
        this.n = backStackRecord.m;
        this.o = backStackRecord.n;
        this.p = backStackRecord.o;
        this.q = backStackRecord.p;
    }

    public final void a(BackStackRecord backStackRecord) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.d;
            boolean z = true;
            if (i >= iArr.length) {
                backStackRecord.f = this.h;
                backStackRecord.i = this.i;
                backStackRecord.g = true;
                backStackRecord.j = this.k;
                backStackRecord.k = this.l;
                backStackRecord.l = this.m;
                backStackRecord.m = this.n;
                backStackRecord.n = this.o;
                backStackRecord.o = this.p;
                backStackRecord.p = this.q;
                return;
            }
            FragmentTransaction.Op op = new FragmentTransaction.Op();
            int i3 = i + 1;
            op.f2760a = iArr[i];
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            op.h = Lifecycle.State.values()[this.f[i2]];
            op.i = Lifecycle.State.values()[this.g[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            op.c = z;
            int i5 = iArr[i4];
            op.d = i5;
            int i6 = iArr[i + 3];
            op.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            op.f = i8;
            i += 6;
            int i9 = iArr[i7];
            op.g = i9;
            backStackRecord.b = i5;
            backStackRecord.c = i6;
            backStackRecord.d = i8;
            backStackRecord.e = i9;
            backStackRecord.b(op);
            i2++;
        }
    }

    public final BackStackRecord b(FragmentManager fragmentManager) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        a(backStackRecord);
        backStackRecord.t = this.j;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                backStackRecord.n(1);
                return backStackRecord;
            }
            String str = (String) arrayList.get(i);
            if (str != null) {
                ((FragmentTransaction.Op) backStackRecord.f2759a.get(i)).b = fragmentManager.c.b(str);
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.d);
        parcel.writeStringList(this.e);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeInt(this.m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeStringList(this.o);
        parcel.writeStringList(this.p);
        parcel.writeInt(this.q ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.d = parcel.createIntArray();
        this.e = parcel.createStringArrayList();
        this.f = parcel.createIntArray();
        this.g = parcel.createIntArray();
        this.h = parcel.readInt();
        this.i = parcel.readString();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.l = (CharSequence) creator.createFromParcel(parcel);
        this.m = parcel.readInt();
        this.n = (CharSequence) creator.createFromParcel(parcel);
        this.o = parcel.createStringArrayList();
        this.p = parcel.createStringArrayList();
        this.q = parcel.readInt() != 0;
    }
}

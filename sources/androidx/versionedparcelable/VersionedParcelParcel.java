package androidx.versionedparcelable;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;

@RestrictTo
/* loaded from: classes2.dex */
class VersionedParcelParcel extends VersionedParcel {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(0), new ArrayMap(0), new ArrayMap(0));
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            Parcel parcel = this.e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel b() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new VersionedParcelParcel(parcel, iDataPosition, i, a.o(new StringBuilder(), this.h, "  "), this.f3816a, this.b, this.c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean g() {
        return this.e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] h() {
        Parcel parcel = this.e;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence i() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean j(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i4;
        }
        return this.k == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int k() {
        return this.e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final Parcelable m() {
        return this.e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String n() {
        return this.e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(int i) {
        a();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        u(0);
        u(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void s(byte[] bArr) {
        Parcel parcel = this.e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void t(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(int i) {
        this.e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void w(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void x(String str) {
        this.e.writeString(str);
    }

    public VersionedParcelParcel(Parcel parcel, int i, int i2, String str, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}

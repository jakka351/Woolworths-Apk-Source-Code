package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
/* loaded from: classes2.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new AnonymousClass1();
    public final int d;
    public final int e;
    public final int f;

    /* renamed from: androidx.media3.common.StreamKey$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        public final StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    static {
        Util.E(0);
        Util.E(1);
        Util.E(2);
    }

    public StreamKey(Parcel parcel) {
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.d - streamKey2.d;
        if (i != 0) {
            return i;
        }
        int i2 = this.e - streamKey2.e;
        return i2 == 0 ? this.f - streamKey2.f : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.d == streamKey.d && this.e == streamKey.e && this.f == streamKey.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.d * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        return this.d + "." + this.e + "." + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}

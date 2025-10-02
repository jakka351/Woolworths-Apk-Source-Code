package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

@UnstableApi
/* loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new AnonymousClass1();
    public final SchemeData[] d;
    public int e;
    public final String f;
    public final int g;

    /* renamed from: androidx.media3.common.DrmInitData$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public final DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }

    public final DrmInitData a(String str) {
        return Objects.equals(this.f, str) ? this : new DrmInitData(str, false, this.d);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C.f2848a;
        return uuid.equals(schemeData3.e) ? uuid.equals(schemeData4.e) ? 0 : 1 : schemeData3.e.compareTo(schemeData4.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (Objects.equals(this.f, drmInitData.f) && Arrays.equals(this.d, drmInitData.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            String str = this.f;
            this.e = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeTypedArray(this.d, 0);
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.f = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.d = schemeDataArr;
        this.g = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new AnonymousClass1();
        public int d;
        public final UUID e;
        public final String f;
        public final String g;
        public final byte[] h;

        /* renamed from: androidx.media3.common.DrmInitData$SchemeData$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public final SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.e = uuid;
            this.f = str;
            str2.getClass();
            this.g = MimeTypes.m(str2);
            this.h = bArr;
        }

        public final boolean a(UUID uuid) {
            UUID uuid2 = C.f2848a;
            UUID uuid3 = this.e;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Objects.equals(this.f, schemeData.f) && Objects.equals(this.g, schemeData.g) && Objects.equals(this.e, schemeData.e) && Arrays.equals(this.h, schemeData.h);
        }

        public final int hashCode() {
            if (this.d == 0) {
                int iHashCode = this.e.hashCode() * 31;
                String str = this.f;
                this.d = Arrays.hashCode(this.h) + b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
            }
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.e;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeByteArray(this.h);
        }

        public SchemeData(Parcel parcel) {
            this.e = new UUID(parcel.readLong(), parcel.readLong());
            this.f = parcel.readString();
            String string = parcel.readString();
            int i = Util.f2928a;
            this.g = string;
            this.h = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = Util.f2928a;
        this.d = schemeDataArr;
        this.g = schemeDataArr.length;
    }
}

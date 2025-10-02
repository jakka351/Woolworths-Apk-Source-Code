package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new AnonymousClass1();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
            parcelableVolumeInfo.d = parcel.readInt();
            parcelableVolumeInfo.f = parcel.readInt();
            parcelableVolumeInfo.g = parcel.readInt();
            parcelableVolumeInfo.h = parcel.readInt();
            parcelableVolumeInfo.e = parcel.readInt();
            return parcelableVolumeInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.e);
    }
}

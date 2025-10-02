package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.input.pointer.a;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new AnonymousClass1();
    public final String d;
    public final Uri e;
    public final String f;
    public final List g;
    public final byte[] h;
    public final String i;
    public final byte[] j;
    public final ByteRange k;

    /* renamed from: androidx.media3.exoplayer.offline.DownloadRequest$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public final DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    public static class Builder {
    }

    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new AnonymousClass1();
        public final long d;
        public final long e;

        /* renamed from: androidx.media3.exoplayer.offline.DownloadRequest$ByteRange$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<ByteRange> {
            @Override // android.os.Parcelable.Creator
            public final ByteRange createFromParcel(Parcel parcel) {
                return new ByteRange(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ByteRange[] newArray(int i) {
                return new ByteRange[i];
            }
        }

        public ByteRange(Parcel parcel) {
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            Assertions.b(j >= 0);
            Assertions.b(j2 >= 0 || j2 == -1);
            this.d = j;
            this.e = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.d == byteRange.d && this.e == byteRange.e;
        }

        public final int hashCode() {
            return (((int) this.d) * 961) + ((int) this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
        }
    }

    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        int i = Util.f2928a;
        this.d = string;
        this.e = Uri.parse(parcel.readString());
        this.f = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.g = Collections.unmodifiableList(arrayList);
        this.h = parcel.createByteArray();
        this.i = parcel.readString();
        this.j = parcel.createByteArray();
        this.k = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.d.equals(downloadRequest.d) && this.e.equals(downloadRequest.e) && Objects.equals(this.f, downloadRequest.f) && this.g.equals(downloadRequest.g) && Arrays.equals(this.h, downloadRequest.h) && Objects.equals(this.i, downloadRequest.i) && Arrays.equals(this.j, downloadRequest.j) && Objects.equals(this.k, downloadRequest.k);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 961)) * 31;
        String str = this.f;
        int iD = a.d((this.g.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.h);
        String str2 = this.i;
        int iD2 = a.d((iD + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.j);
        ByteRange byteRange = this.k;
        return iD2 + (byteRange != null ? byteRange.hashCode() : 0);
    }

    public final String toString() {
        return this.f + ":" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeString(this.e.toString());
        parcel.writeString(this.f);
        List list = this.g;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.h);
        parcel.writeString(this.i);
        parcel.writeByteArray(this.j);
        parcel.writeParcelable(this.k, 0);
    }
}

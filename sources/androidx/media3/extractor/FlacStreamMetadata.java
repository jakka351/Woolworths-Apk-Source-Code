package androidx.media3.extractor;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Collections;

@UnstableApi
/* loaded from: classes2.dex */
public final class FlacStreamMetadata {

    /* renamed from: a, reason: collision with root package name */
    public final int f3238a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final SeekTable k;
    public final Metadata l;

    public static class SeekTable {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f3239a;
        public final long[] b;

        public SeekTable(long[] jArr, long[] jArr2) {
            this.f3239a = jArr;
            this.b = jArr2;
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, bArr.length);
        parsableBitArray.m(i * 8);
        this.f3238a = parsableBitArray.g(16);
        this.b = parsableBitArray.g(16);
        this.c = parsableBitArray.g(24);
        this.d = parsableBitArray.g(24);
        int iG = parsableBitArray.g(20);
        this.e = iG;
        this.f = d(iG);
        this.g = parsableBitArray.g(3) + 1;
        int iG2 = parsableBitArray.g(5) + 1;
        this.h = iG2;
        this.i = a(iG2);
        this.j = parsableBitArray.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final Format c(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.l;
        if (metadata2 != null) {
            metadata = metadata2.b(metadata);
        }
        Format.Builder builder = new Format.Builder();
        builder.m = MimeTypes.m("audio/flac");
        builder.n = i;
        builder.C = this.g;
        builder.D = this.e;
        builder.E = Util.w(this.h);
        builder.p = Collections.singletonList(bArr);
        builder.k = metadata;
        return new Format(builder);
    }

    public FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, SeekTable seekTable, Metadata metadata) {
        this.f3238a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = seekTable;
        this.l = metadata;
    }
}

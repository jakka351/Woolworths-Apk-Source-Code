package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
/* loaded from: classes2.dex */
public final class TrackSampleTable {

    /* renamed from: a, reason: collision with root package name */
    public final Track f3342a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        Assertions.b(iArr.length == jArr2.length);
        Assertions.b(jArr.length == jArr2.length);
        Assertions.b(iArr2.length == jArr2.length);
        this.f3342a = track;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int iA = Util.a(jArr, j, true); iA < jArr.length; iA++) {
            if ((this.g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}

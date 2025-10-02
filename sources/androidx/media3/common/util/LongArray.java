package androidx.media3.common.util;

import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class LongArray {

    /* renamed from: a, reason: collision with root package name */
    public int f2915a;
    public long[] b;

    public LongArray() {
        this(32);
    }

    public final void a(long j) {
        int i = this.f2915a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.f2915a;
        this.f2915a = i2 + 1;
        jArr2[i2] = j;
    }

    public final void b(long[] jArr) {
        int length = this.f2915a + jArr.length;
        long[] jArr2 = this.b;
        if (length > jArr2.length) {
            this.b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.b, this.f2915a, jArr.length);
        this.f2915a = length;
    }

    public final long c(int i) {
        if (i >= 0 && i < this.f2915a) {
            return this.b[i];
        }
        StringBuilder sbR = YU.a.r(i, "Invalid index ", ", size is ");
        sbR.append(this.f2915a);
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public LongArray(int i) {
        this.b = new long[i];
    }
}

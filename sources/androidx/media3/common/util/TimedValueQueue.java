package androidx.media3.common.util;

import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class TimedValueQueue<V> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f2926a = new long[10];
    public Object[] b = new Object[10];
    public int c;
    public int d;

    public final synchronized void a(long j, Object obj) {
        if (this.d > 0) {
            if (j <= this.f2926a[((this.c + r0) - 1) % this.b.length]) {
                b();
            }
        }
        c();
        int i = this.c;
        int i2 = this.d;
        Object[] objArr = this.b;
        int length = (i + i2) % objArr.length;
        this.f2926a[length] = j;
        objArr[length] = obj;
        this.d = i2 + 1;
    }

    public final synchronized void b() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public final void c() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.f2926a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, objArr, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.f2926a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, objArr, i3, this.c);
        }
        this.f2926a = jArr;
        this.b = objArr;
        this.c = 0;
    }

    public final Object d(long j, boolean z) {
        Object objG = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.f2926a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objG = g();
            j2 = j3;
        }
        return objG;
    }

    public final synchronized Object e() {
        return this.d == 0 ? null : g();
    }

    public final synchronized Object f(long j) {
        return d(j, true);
    }

    public final Object g() {
        Assertions.f(this.d > 0);
        Object[] objArr = this.b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public final synchronized int h() {
        return this.d;
    }
}

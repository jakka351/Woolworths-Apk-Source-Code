package androidx.media3.common.util;

import java.util.NoSuchElementException;

@UnstableApi
/* loaded from: classes2.dex */
public final class LongArrayQueue {

    /* renamed from: a, reason: collision with root package name */
    public int f2916a;
    public int b;
    public long[] c;
    public int d;

    public final long a() {
        int i = this.b;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.c;
        int i2 = this.f2916a;
        long j = jArr[i2];
        this.f2916a = this.d & (i2 + 1);
        this.b = i - 1;
        return j;
    }
}

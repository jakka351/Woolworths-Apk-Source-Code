package com.fasterxml.jackson.core.util;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes4.dex */
public class BufferRecycler {
    public static final int[] c = {8000, 8000, 2000, 2000};
    public static final int[] d = {4000, 4000, 200, 200};

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f14218a = new AtomicReferenceArray(4);
    public final AtomicReferenceArray b = new AtomicReferenceArray(4);

    public final byte[] a(int i) {
        int i2 = c[i];
        if (i2 <= 0) {
            i2 = 0;
        }
        byte[] bArr = (byte[]) this.f14218a.getAndSet(i, null);
        return (bArr == null || bArr.length < i2) ? new byte[i2] : bArr;
    }

    public final char[] b(int i, int i2) {
        int i3 = d[i];
        if (i2 < i3) {
            i2 = i3;
        }
        char[] cArr = (char[]) this.b.getAndSet(i, null);
        return (cArr == null || cArr.length < i2) ? new char[i2] : cArr;
    }
}

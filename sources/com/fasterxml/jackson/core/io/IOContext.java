package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;

/* loaded from: classes4.dex */
public class IOContext {

    /* renamed from: a, reason: collision with root package name */
    public final ContentReference f14197a;
    public final Object b;
    public JsonEncoding c;
    public final boolean d;
    public final BufferRecycler e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public char[] i;
    public char[] j;
    public char[] k;

    public IOContext(BufferRecycler bufferRecycler, ContentReference contentReference, boolean z) {
        this.e = bufferRecycler;
        this.f14197a = contentReference;
        this.b = contentReference.d;
        this.d = z;
    }

    public static void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public final byte[] b() {
        a(this.h);
        byte[] bArrA = this.e.a(3);
        this.h = bArrA;
        return bArrA;
    }

    public final char[] c(int i) {
        a(this.k);
        char[] cArrB = this.e.b(3, i);
        this.k = cArrB;
        return cArrB;
    }

    public final void d(byte[] bArr) {
        byte[] bArr2 = this.h;
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        this.h = null;
        this.e.f14218a.set(3, bArr);
    }

    public final void e(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = this.f;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            this.f = null;
            this.e.f14218a.set(0, bArr);
        }
    }
}

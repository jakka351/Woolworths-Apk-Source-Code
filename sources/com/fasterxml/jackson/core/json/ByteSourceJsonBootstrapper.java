package com.fasterxml.jackson.core.json;

import YU.a;
import com.fasterxml.jackson.core.io.IOContext;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class ByteSourceJsonBootstrapper {

    /* renamed from: a, reason: collision with root package name */
    public final IOContext f14210a;
    public final byte[] c;
    public int e;
    public int h;
    public boolean g = true;
    public final InputStream b = null;
    public int d = 0;
    public final boolean f = false;

    public ByteSourceJsonBootstrapper(IOContext iOContext, byte[] bArr, int i) {
        this.f14210a = iOContext;
        this.c = bArr;
        this.e = i;
    }

    public static void b(String str) throws CharConversionException {
        throw new CharConversionException(a.h("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    public final boolean a(int i) throws IOException {
        int i2;
        int i3 = this.e - this.d;
        while (i3 < i) {
            InputStream inputStream = this.b;
            if (inputStream == null) {
                i2 = -1;
            } else {
                int i4 = this.e;
                byte[] bArr = this.c;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.e += i2;
            i3 += i2;
        }
        return true;
    }
}

package com.bumptech.glide.util;

import androidx.camera.core.impl.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class ContentLengthInputStream extends FilterInputStream {
    public final long d;
    public int e;

    public ContentLengthInputStream(InputStream inputStream, long j) {
        super(inputStream);
        this.d = j;
    }

    public final void a(int i) throws IOException {
        if (i >= 0) {
            this.e += i;
            return;
        }
        long j = this.e;
        long j2 = this.d;
        if (j2 - j <= 0) {
            return;
        }
        StringBuilder sbT = b.t(j2, "Failed to read all expected data, expected: ", ", but read: ");
        sbT.append(this.e);
        throw new IOException(sbT.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.d - this.e, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        a(i3);
        return i3;
    }
}

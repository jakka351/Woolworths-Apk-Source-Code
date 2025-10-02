package com.google.firebase.encoders.proto;

import java.io.OutputStream;

/* loaded from: classes.dex */
final class LengthCountingOutputStream extends OutputStream {
    public long d;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.d++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.d += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.d += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

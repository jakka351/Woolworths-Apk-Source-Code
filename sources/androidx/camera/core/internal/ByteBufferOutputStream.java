package androidx.camera.core.internal;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class ByteBufferOutputStream extends OutputStream {
    @Override // java.io.OutputStream
    public final void write(int i) {
        throw null;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        bArr.getClass();
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 != 0) {
            throw null;
        }
    }
}

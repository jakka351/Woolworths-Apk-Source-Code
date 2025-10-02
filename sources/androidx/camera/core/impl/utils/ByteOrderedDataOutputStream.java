package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
class ByteOrderedDataOutputStream extends FilterOutputStream {
    public final OutputStream d;
    public ByteOrder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteOrderedDataOutputStream(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.d = outputStream;
        this.e = byteOrder;
    }

    public final void a(int i) throws IOException {
        ByteOrder byteOrder = this.e;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.d;
        if (byteOrder == byteOrder2) {
            outputStream.write(i & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i >>> 24) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write(i & 255);
        }
    }

    public final void b(short s) throws IOException {
        ByteOrder byteOrder = this.e;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.d;
        if (byteOrder == byteOrder2) {
            outputStream.write(s & 255);
            outputStream.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s >>> 8) & 255);
            outputStream.write(s & 255);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.d.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.d.write(bArr, i, i2);
    }
}

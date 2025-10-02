package androidx.camera.core.impl.utils;

import java.io.DataInput;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
final class ByteOrderedDataInputStream extends InputStream implements DataInput {
    public int d;

    static {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int available() {
        throw null;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() {
        this.d++;
        throw null;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.d++;
        throw null;
    }

    @Override // java.io.DataInput
    public final byte readByte() throws EOFException {
        int i = this.d + 1;
        this.d = i;
        if (i > 0) {
            throw new EOFException();
        }
        throw null;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.d += 2;
        throw null;
    }

    @Override // java.io.DataInput
    public final double readDouble() throws EOFException {
        readLong();
        throw null;
    }

    @Override // java.io.DataInput
    public final float readFloat() throws EOFException {
        readInt();
        throw null;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException {
        int i3 = this.d + i2;
        this.d = i3;
        if (i3 <= 0) {
            throw null;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readInt() throws EOFException {
        int i = this.d + 4;
        this.d = i;
        if (i > 0) {
            throw new EOFException();
        }
        throw null;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public final long readLong() throws EOFException {
        int i = this.d + 8;
        this.d = i;
        if (i > 0) {
            throw new EOFException();
        }
        throw null;
    }

    @Override // java.io.DataInput
    public final short readShort() throws EOFException {
        int i = this.d + 2;
        this.d = i;
        if (i > 0) {
            throw new EOFException();
        }
        throw null;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.d += 2;
        throw null;
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.d++;
        throw null;
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws EOFException {
        int i = this.d + 2;
        this.d = i;
        if (i > 0) {
            throw new EOFException();
        }
        throw null;
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        if (Math.min(i, 0 - this.d) > 0) {
            throw null;
        }
        this.d = this.d;
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        throw null;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws EOFException {
        int length = this.d + bArr.length;
        this.d = length;
        if (length > 0) {
            throw new EOFException();
        }
        throw null;
    }
}

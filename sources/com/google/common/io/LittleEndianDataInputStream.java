package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.primitives.Ints;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes6.dex */
public final class LittleEndianDataInputStream extends FilterInputStream implements DataInput {
    public final byte a() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (-1 != i) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        int i = ByteStreams.f14924a;
        ByteStreams.b(this, bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        byte bA = a();
        byte bA2 = a();
        return Ints.d(a(), a(), bA2, bA);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        byte bA = a();
        byte bA2 = a();
        byte bA3 = a();
        byte bA4 = a();
        byte bA5 = a();
        return ((a() & 255) << 56) | ((a() & 255) << 48) | ((a() & 255) << 40) | ((bA5 & 255) << 32) | ((bA4 & 255) << 24) | ((bA3 & 255) << 16) | ((bA2 & 255) << 8) | (bA & 255);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        return Ints.d((byte) 0, (byte) 0, a(), a());
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return (int) ((FilterInputStream) this).in.skip(i);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        ByteStreams.b(this, bArr, i, i2);
    }
}

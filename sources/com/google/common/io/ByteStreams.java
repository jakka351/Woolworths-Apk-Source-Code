package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes6.dex */
public final class ByteStreams {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14924a = 0;

    /* renamed from: com.google.common.io.ByteStreams$1, reason: invalid class name */
    public class AnonymousClass1 extends OutputStream {
        public final String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            bArr.getClass();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            bArr.getClass();
            Preconditions.m(i, i2 + i, bArr.length);
        }
    }

    public static class ByteArrayDataInputStream implements ByteArrayDataInput {
        @Override // java.io.DataInput
        public final boolean readBoolean() {
            throw null;
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            throw null;
        }

        @Override // java.io.DataInput
        public final char readChar() {
            throw null;
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            throw null;
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            throw null;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readInt() {
            throw null;
        }

        @Override // java.io.DataInput
        public final String readLine() {
            throw null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            throw null;
        }

        @Override // java.io.DataInput
        public final short readShort() {
            throw null;
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) {
            throw null;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    public static class ByteArrayDataOutputStream implements ByteArrayDataOutput {
        @Override // java.io.DataOutput
        public final void write(int i) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeBoolean(boolean z) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeByte(int i) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeBytes(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeChar(int i) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeChars(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeDouble(double d) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeFloat(float f) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeInt(int i) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeLong(long j) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeShort(int i) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeUTF(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void write(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    static {
        new AnonymousClass1();
    }

    public static byte[] a(int i, ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static void b(LittleEndianDataInputStream littleEndianDataInputStream, byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(YU.a.e(i2, "len (", ") cannot be negative"));
        }
        Preconditions.m(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = littleEndianDataInputStream.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            } else {
                i3 += i4;
            }
        }
        if (i3 != i2) {
            throw new EOFException(androidx.camera.core.impl.b.j(i3, i2, "reached end of stream after reading ", " bytes; ", " bytes expected"));
        }
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return a(i, arrayDeque);
                }
                i2 += i3;
                i += i3;
            }
            iMin = Ints.e(iMin * (iMin < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(2147483639, arrayDeque);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final class LimitedInputStream extends FilterInputStream {
        public long d;
        public long e;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.d);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.e = this.d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            if (this.d == 0) {
                return -1;
            }
            int i = ((FilterInputStream) this).in.read();
            if (i != -1) {
                this.d--;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.e == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.d = this.e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.d));
            this.d -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.d;
            if (j == 0) {
                return -1;
            }
            int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
            if (i3 != -1) {
                this.d -= i3;
            }
            return i3;
        }
    }
}

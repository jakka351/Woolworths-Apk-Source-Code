package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final Logger b = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean c = UnsafeUtil.f;

    /* renamed from: a, reason: collision with root package name */
    public CodedOutputStreamWriter f15087a;

    /* loaded from: classes6.dex */
    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        public final byte[] d;
        public final int e;
        public int f;

        public AbstractBufferedEncoder(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.d = bArr;
            this.e = bArr.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int g0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void s0(byte b) {
            int i = this.f;
            this.f = i + 1;
            this.d[i] = b;
        }

        public final void t0(int i) {
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            byte[] bArr = this.d;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        public final void u0(long j) {
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            byte[] bArr = this.d;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.f = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.f = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.f = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        public final void v0(int i, int i2) {
            w0((i << 3) | i2);
        }

        public final void w0(int i) {
            boolean z = CodedOutputStream.c;
            byte[] bArr = this.d;
            if (z) {
                while ((i & (-128)) != 0) {
                    int i2 = this.f;
                    this.f = i2 + 1;
                    UnsafeUtil.k(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                int i3 = this.f;
                this.f = i3 + 1;
                UnsafeUtil.k(bArr, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                int i4 = this.f;
                this.f = i4 + 1;
                bArr[i4] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            int i5 = this.f;
            this.f = i5 + 1;
            bArr[i5] = (byte) i;
        }

        public final void x0(long j) {
            boolean z = CodedOutputStream.c;
            byte[] bArr = this.d;
            if (z) {
                while ((j & (-128)) != 0) {
                    int i = this.f;
                    this.f = i + 1;
                    UnsafeUtil.k(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i2 = this.f;
                this.f = i2 + 1;
                UnsafeUtil.k(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                int i3 = this.f;
                this.f = i3 + 1;
                bArr[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            int i4 = this.f;
            this.f = i4 + 1;
            bArr[i4] = (byte) j;
        }
    }

    public static class ArrayEncoder extends CodedOutputStream {
        public final byte[] d;
        public final int e;
        public int f;

        public ArrayEncoder(byte[] bArr, int i) {
            if (((bArr.length - i) | i) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.d = bArr;
            this.f = 0;
            this.e = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void P(int i, ByteString byteString) throws OutOfSpaceException {
            p0(i, 2);
            q0(byteString.size());
            byteString.z(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void Q(int i, int i2, byte[] bArr) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i, this.d, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.d, this.f, iRemaining);
                this.f += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(iRemaining)), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void c(int i, int i2) throws OutOfSpaceException {
            p0(i, 5);
            i0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void d(int i, String str) throws OutOfSpaceException {
            p0(i, 2);
            int i2 = this.f;
            try {
                int iB0 = CodedOutputStream.b0(str.length() * 3);
                int iB02 = CodedOutputStream.b0(str.length());
                byte[] bArr = this.d;
                if (iB02 == iB0) {
                    int i3 = i2 + iB02;
                    this.f = i3;
                    int iD = Utf8.f15122a.d(i3, g0(), str, bArr);
                    this.f = i2;
                    q0((iD - i2) - iB02);
                    this.f = iD;
                } else {
                    q0(Utf8.d(str));
                    this.f = Utf8.f15122a.d(this.f, g0(), str, bArr);
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f = i2;
                f0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void e(int i, long j) throws OutOfSpaceException {
            p0(i, 0);
            r0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void g(int i, int i2) throws OutOfSpaceException {
            p0(i, 0);
            k0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int g0() {
            return this.e - this.f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void h0(byte b) throws OutOfSpaceException {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void i0(int i) throws OutOfSpaceException {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                int i3 = i2 + 1;
                this.f = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.f = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.f = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void j0(long j) throws OutOfSpaceException {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                int i2 = i + 1;
                this.f = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.f = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.f = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.f = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.f = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.f = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.f = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k(int i, int i2) throws OutOfSpaceException {
            p0(i, 0);
            q0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k0(int i) throws OutOfSpaceException {
            if (i >= 0) {
                q0(i);
            } else {
                r0(i);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void l0(int i, MessageLite messageLite) throws OutOfSpaceException {
            p0(i, 2);
            q0(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void m(int i, long j) throws OutOfSpaceException {
            p0(i, 1);
            j0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void m0(int i, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            p0(i, 2);
            q0(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.h(messageLite, this.f15087a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n(int i, boolean z) throws OutOfSpaceException {
            p0(i, 0);
            h0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n0(int i, MessageLite messageLite) throws OutOfSpaceException {
            p0(1, 3);
            k(2, i);
            l0(3, messageLite);
            p0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i, ByteString byteString) throws OutOfSpaceException {
            p0(1, 3);
            k(2, i);
            P(3, byteString);
            p0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void p0(int i, int i2) throws OutOfSpaceException {
            q0((i << 3) | i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void q0(int i) throws OutOfSpaceException {
            boolean z = CodedOutputStream.c;
            byte[] bArr = this.d;
            if (!z || Android.a() || g0() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        int i2 = this.f;
                        this.f = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                    }
                }
                int i3 = this.f;
                this.f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                int i4 = this.f;
                this.f = i4 + 1;
                UnsafeUtil.k(bArr, i4, (byte) i);
                return;
            }
            int i5 = this.f;
            this.f = i5 + 1;
            UnsafeUtil.k(bArr, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                int i7 = this.f;
                this.f = i7 + 1;
                UnsafeUtil.k(bArr, i7, (byte) i6);
                return;
            }
            int i8 = this.f;
            this.f = i8 + 1;
            UnsafeUtil.k(bArr, i8, (byte) (i6 | 128));
            int i9 = i >>> 14;
            if ((i9 & (-128)) == 0) {
                int i10 = this.f;
                this.f = i10 + 1;
                UnsafeUtil.k(bArr, i10, (byte) i9);
                return;
            }
            int i11 = this.f;
            this.f = i11 + 1;
            UnsafeUtil.k(bArr, i11, (byte) (i9 | 128));
            int i12 = i >>> 21;
            if ((i12 & (-128)) == 0) {
                int i13 = this.f;
                this.f = i13 + 1;
                UnsafeUtil.k(bArr, i13, (byte) i12);
            } else {
                int i14 = this.f;
                this.f = i14 + 1;
                UnsafeUtil.k(bArr, i14, (byte) (i12 | 128));
                int i15 = this.f;
                this.f = i15 + 1;
                UnsafeUtil.k(bArr, i15, (byte) (i >>> 28));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void r0(long j) throws OutOfSpaceException {
            boolean z = CodedOutputStream.c;
            byte[] bArr = this.d;
            if (z && g0() >= 10) {
                while ((j & (-128)) != 0) {
                    int i = this.f;
                    this.f = i + 1;
                    UnsafeUtil.k(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i2 = this.f;
                this.f = i2 + 1;
                UnsafeUtil.k(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            int i4 = this.f;
            this.f = i4 + 1;
            bArr[i4] = (byte) j;
        }
    }

    /* loaded from: classes6.dex */
    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void P(int i, ByteString byteString) {
            p0(i, 2);
            q0(byteString.size());
            byteString.z(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void Q(int i, int i2, byte[] bArr) {
            if (this.f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            if (this.f > 0) {
                throw null;
            }
            byteBuffer.remaining();
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void c(int i, int i2) {
            y0(14);
            v0(i, 5);
            t0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void d(int i, String str) throws OutOfSpaceException {
            p0(i, 2);
            int length = str.length() * 3;
            int iB0 = CodedOutputStream.b0(length);
            int i2 = iB0 + length;
            int i3 = this.e;
            if (i2 > i3) {
                q0(Utf8.f15122a.d(0, length, str, new byte[length]));
                if (this.f > 0) {
                    throw null;
                }
                throw null;
            }
            int i4 = this.f;
            if (i2 > i3 - i4) {
                throw null;
            }
            try {
                int iB02 = CodedOutputStream.b0(str.length());
                byte[] bArr = this.d;
                if (iB02 == iB0) {
                    int i5 = i4 + iB02;
                    this.f = i5;
                    int iD = Utf8.f15122a.d(i5, i3 - i5, str, bArr);
                    this.f = i4;
                    w0((iD - i4) - iB02);
                    this.f = iD;
                } else {
                    int iD2 = Utf8.d(str);
                    w0(iD2);
                    this.f = Utf8.f15122a.d(this.f, iD2, str, bArr);
                }
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f = i4;
                f0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void e(int i, long j) {
            y0(20);
            v0(i, 0);
            x0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void g(int i, int i2) {
            y0(20);
            v0(i, 0);
            if (i2 >= 0) {
                w0(i2);
            } else {
                x0(i2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void h0(byte b) {
            if (this.f == this.e) {
                throw null;
            }
            s0(b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void i0(int i) {
            y0(4);
            t0(i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void j0(long j) {
            y0(8);
            u0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k(int i, int i2) {
            y0(20);
            v0(i, 0);
            w0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k0(int i) {
            if (i >= 0) {
                q0(i);
            } else {
                r0(i);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void l0(int i, MessageLite messageLite) {
            p0(i, 2);
            q0(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void m(int i, long j) {
            y0(18);
            v0(i, 1);
            u0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void m0(int i, MessageLite messageLite, Schema schema) {
            p0(i, 2);
            q0(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.h(messageLite, this.f15087a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n(int i, boolean z) {
            y0(11);
            v0(i, 0);
            s0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n0(int i, MessageLite messageLite) {
            p0(1, 3);
            k(2, i);
            l0(3, messageLite);
            p0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i, ByteString byteString) {
            p0(1, 3);
            k(2, i);
            P(3, byteString);
            p0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void p0(int i, int i2) {
            q0((i << 3) | i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void q0(int i) {
            y0(5);
            w0(i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void r0(long j) {
            y0(10);
            x0(j);
        }

        public final void y0(int i) {
            if (this.e - this.f < i) {
                throw null;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class HeapNioEncoder extends ArrayEncoder {
    }

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str));
        }

        public OutOfSpaceException(RuntimeException runtimeException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException);
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    /* loaded from: classes6.dex */
    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        public final OutputStream g;

        public OutputStreamEncoder(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.g = outputStream;
        }

        public final void A0(int i) throws IOException {
            if (this.e - this.f < i) {
                y0();
            }
        }

        public final void B0(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f;
            int i4 = this.e;
            int i5 = i4 - i3;
            byte[] bArr2 = this.d;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f = i4;
            y0();
            if (i7 > i4) {
                this.g.write(bArr, i6, i7);
            } else {
                System.arraycopy(bArr, i6, bArr2, 0, i7);
                this.f = i7;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void P(int i, ByteString byteString) {
            p0(i, 2);
            q0(byteString.size());
            byteString.z(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void Q(int i, int i2, byte[] bArr) throws IOException {
            B0(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i = this.f;
            int i2 = this.e;
            int i3 = i2 - i;
            byte[] bArr = this.d;
            if (i3 >= iRemaining) {
                byteBuffer.get(bArr, i, iRemaining);
                this.f += iRemaining;
                return;
            }
            byteBuffer.get(bArr, i, i3);
            int i4 = iRemaining - i3;
            this.f = i2;
            y0();
            while (i4 > i2) {
                byteBuffer.get(bArr, 0, i2);
                this.g.write(bArr, 0, i2);
                i4 -= i2;
            }
            byteBuffer.get(bArr, 0, i4);
            this.f = i4;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void c(int i, int i2) throws IOException {
            A0(14);
            v0(i, 5);
            t0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void d(int i, String str) throws IOException {
            p0(i, 2);
            try {
                int length = str.length() * 3;
                int iB0 = CodedOutputStream.b0(length);
                int i2 = iB0 + length;
                int i3 = this.e;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int iD = Utf8.f15122a.d(0, length, str, bArr);
                    q0(iD);
                    B0(bArr, 0, iD);
                    return;
                }
                if (i2 > i3 - this.f) {
                    y0();
                }
                int iB02 = CodedOutputStream.b0(str.length());
                int i4 = this.f;
                byte[] bArr2 = this.d;
                try {
                    if (iB02 == iB0) {
                        int i5 = i4 + iB02;
                        this.f = i5;
                        int iD2 = Utf8.f15122a.d(i5, i3 - i5, str, bArr2);
                        this.f = i4;
                        w0((iD2 - i4) - iB02);
                        this.f = iD2;
                    } else {
                        int iD3 = Utf8.d(str);
                        w0(iD3);
                        this.f = Utf8.f15122a.d(this.f, iD3, str, bArr2);
                    }
                } catch (Utf8.UnpairedSurrogateException e) {
                    this.f = i4;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                f0(str, e3);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void e(int i, long j) throws IOException {
            A0(20);
            v0(i, 0);
            x0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void g(int i, int i2) throws IOException {
            A0(20);
            v0(i, 0);
            if (i2 >= 0) {
                w0(i2);
            } else {
                x0(i2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void h0(byte b) throws IOException {
            if (this.f == this.e) {
                y0();
            }
            s0(b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void i0(int i) throws IOException {
            A0(4);
            t0(i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void j0(long j) throws IOException {
            A0(8);
            u0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k(int i, int i2) throws IOException {
            A0(20);
            v0(i, 0);
            w0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k0(int i) throws IOException {
            if (i >= 0) {
                q0(i);
            } else {
                r0(i);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void l0(int i, MessageLite messageLite) {
            p0(i, 2);
            q0(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void m(int i, long j) throws IOException {
            A0(18);
            v0(i, 1);
            u0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void m0(int i, MessageLite messageLite, Schema schema) {
            p0(i, 2);
            q0(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.h(messageLite, this.f15087a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n(int i, boolean z) throws IOException {
            A0(11);
            v0(i, 0);
            s0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n0(int i, MessageLite messageLite) throws IOException {
            p0(1, 3);
            k(2, i);
            l0(3, messageLite);
            p0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i, ByteString byteString) throws IOException {
            p0(1, 3);
            k(2, i);
            P(3, byteString);
            p0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void p0(int i, int i2) {
            q0((i << 3) | i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void q0(int i) {
            A0(5);
            w0(i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void r0(long j) throws IOException {
            A0(10);
            x0(j);
        }

        public final void y0() throws IOException {
            this.g.write(this.d, 0, this.f);
            this.f = 0;
        }

        public final void z0() {
            if (this.f > 0) {
                y0();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void P(int i, ByteString byteString) {
            p0(i, 2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void Q(int i, int i2, byte[] bArr) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void c(int i, int i2) {
            p0(i, 5);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void d(int i, String str) {
            p0(i, 2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void e(int i, long j) {
            p0(i, 0);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void g(int i, int i2) {
            p0(i, 0);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int g0() {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void h0(byte b) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void i0(int i) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void j0(long j) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k(int i, int i2) {
            p0(i, 0);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k0(int i) {
            if (i >= 0) {
                q0(i);
                throw null;
            }
            r0(i);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void l0(int i, MessageLite messageLite) {
            p0(2, 2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void m(int i, long j) {
            p0(i, 1);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void m0(int i, MessageLite messageLite, Schema schema) {
            p0(i, 2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n(int i, boolean z) {
            p0(i, 0);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n0(int i, MessageLite messageLite) {
            p0(1, 3);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i, ByteString byteString) {
            p0(1, 3);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void p0(int i, int i2) {
            q0((i << 3) | i2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void q0(int i) {
            if ((i & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void r0(long j) {
            if ((j & (-128)) != 0) {
                throw null;
            }
            throw null;
        }
    }

    /* loaded from: classes6.dex */
    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        public long d;

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void P(int i, ByteString byteString) throws OutOfSpaceException {
            p0(i, 2);
            q0(byteString.size());
            byteString.z(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void Q(int i, int i2, byte[] bArr) throws OutOfSpaceException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = 0 - j;
                long j3 = this.d;
                if (j2 >= j3) {
                    UnsafeUtil.d.d(bArr, i, j3, j);
                    this.d += j;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, Integer.valueOf(i2)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                byteBuffer.remaining();
                throw null;
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException(e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void c(int i, int i2) throws OutOfSpaceException {
            p0(i, 5);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void d(int i, String str) throws OutOfSpaceException {
            p0(i, 2);
            long j = this.d;
            try {
                if (CodedOutputStream.b0(str.length()) == CodedOutputStream.b0(str.length() * 3)) {
                    throw null;
                }
                q0(Utf8.d(str));
                throw null;
            } catch (Utf8.UnpairedSurrogateException unused) {
                this.d = j;
                throw null;
            } catch (IllegalArgumentException e) {
                throw new OutOfSpaceException(e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void e(int i, long j) throws OutOfSpaceException {
            p0(i, 0);
            r0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void g(int i, int i2) throws OutOfSpaceException {
            p0(i, 0);
            k0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int g0() {
            return (int) (0 - this.d);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void h0(byte b) throws OutOfSpaceException {
            long j = this.d;
            if (j >= 0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, 1));
            }
            this.d = 1 + j;
            UnsafeUtil.j(j, b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void i0(int i) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void j0(long j) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k(int i, int i2) throws OutOfSpaceException {
            p0(i, 0);
            q0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k0(int i) throws OutOfSpaceException {
            if (i >= 0) {
                q0(i);
            } else {
                r0(i);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void l0(int i, MessageLite messageLite) throws OutOfSpaceException {
            p0(i, 2);
            q0(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void m(int i, long j) throws OutOfSpaceException {
            p0(i, 1);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void m0(int i, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            p0(i, 2);
            q0(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.h(messageLite, this.f15087a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n(int i, boolean z) throws OutOfSpaceException {
            p0(i, 0);
            h0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void n0(int i, MessageLite messageLite) throws OutOfSpaceException {
            p0(1, 3);
            k(2, i);
            l0(3, messageLite);
            p0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i, ByteString byteString) throws OutOfSpaceException {
            p0(1, 3);
            k(2, i);
            P(3, byteString);
            p0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void p0(int i, int i2) throws OutOfSpaceException {
            q0((i << 3) | i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void q0(int i) throws OutOfSpaceException {
            if (this.d <= 0) {
                while ((i & (-128)) != 0) {
                    long j = this.d;
                    this.d = j + 1;
                    UnsafeUtil.j(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.d;
                this.d = 1 + j2;
                UnsafeUtil.j(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.d;
                if (j3 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, 1));
                }
                if ((i & (-128)) == 0) {
                    this.d = 1 + j3;
                    UnsafeUtil.j(j3, (byte) i);
                    return;
                } else {
                    this.d = j3 + 1;
                    UnsafeUtil.j(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void r0(long j) throws OutOfSpaceException {
            if (this.d <= 0) {
                while ((j & (-128)) != 0) {
                    long j2 = this.d;
                    this.d = j2 + 1;
                    UnsafeUtil.j(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.d;
                this.d = 1 + j3;
                UnsafeUtil.j(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.d;
                if (j4 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.d), 0L, 1));
                }
                if ((j & (-128)) == 0) {
                    this.d = 1 + j4;
                    UnsafeUtil.j(j4, (byte) j);
                    return;
                } else {
                    this.d = j4 + 1;
                    UnsafeUtil.j(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }
    }

    public static int S(int i, ByteString byteString) {
        return T(byteString) + Z(i);
    }

    public static int T(ByteString byteString) {
        int size = byteString.size();
        return b0(size) + size;
    }

    public static int U(int i) {
        return Z(i) + 4;
    }

    public static int V(int i) {
        return Z(i) + 8;
    }

    public static int W(int i, MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(schema) + (Z(i) * 2);
    }

    public static int X(int i) {
        if (i >= 0) {
            return b0(i);
        }
        return 10;
    }

    public static int Y(String str) {
        int length;
        try {
            length = Utf8.d(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.f15103a).length;
        }
        return b0(length) + length;
    }

    public static int Z(int i) {
        return b0(i << 3);
    }

    public static int a0(int i, int i2) {
        return b0(i2) + Z(i);
    }

    public static int b0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int c0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int d0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long e0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public abstract void P(int i, ByteString byteString);

    public abstract void c(int i, int i2);

    public abstract void d(int i, String str);

    public abstract void e(int i, long j);

    public final void f0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws OutOfSpaceException {
        b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f15103a);
        try {
            q0(bytes.length);
            Q(0, bytes.length, bytes);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public abstract void g(int i, int i2);

    public abstract int g0();

    public abstract void h0(byte b2);

    public abstract void i0(int i);

    public abstract void j0(long j);

    public abstract void k(int i, int i2);

    public abstract void k0(int i);

    public abstract void l0(int i, MessageLite messageLite);

    public abstract void m(int i, long j);

    public abstract void m0(int i, MessageLite messageLite, Schema schema);

    public abstract void n(int i, boolean z);

    public abstract void n0(int i, MessageLite messageLite);

    public abstract void o0(int i, ByteString byteString);

    public abstract void p0(int i, int i2);

    public abstract void q0(int i);

    public abstract void r0(long j);
}

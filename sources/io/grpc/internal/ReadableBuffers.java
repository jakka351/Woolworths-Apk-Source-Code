package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.Detachable;
import io.grpc.HasByteBuffer;
import io.grpc.KnownLength;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* loaded from: classes7.dex */
public final class ReadableBuffers {

    /* renamed from: a, reason: collision with root package name */
    public static final ReadableBuffer f24076a = new ByteArrayWrapper(new byte[0], 0, 0);

    /* renamed from: io.grpc.internal.ReadableBuffers$1, reason: invalid class name */
    class AnonymousClass1 extends ForwardingReadableBuffer {
        @Override // io.grpc.internal.ForwardingReadableBuffer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public static class ByteArrayWrapper extends AbstractReadableBuffer {
        public int d;
        public final int e;
        public final byte[] f;
        public int g = -1;

        public ByteArrayWrapper(byte[] bArr, int i, int i2) {
            Preconditions.f("offset must be >= 0", i >= 0);
            Preconditions.f("length must be >= 0", i2 >= 0);
            int i3 = i2 + i;
            Preconditions.f("offset + length exceeds array boundary", i3 <= bArr.length);
            this.f = bArr;
            this.d = i;
            this.e = i3;
        }

        @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
        public final void B() {
            this.g = this.d;
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final ReadableBuffer Q(int i) {
            a(i);
            int i2 = this.d;
            this.d = i2 + i;
            return new ByteArrayWrapper(this.f, i2, i);
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final void Z1(int i, int i2, byte[] bArr) {
            System.arraycopy(this.f, this.d, bArr, i, i2);
            this.d += i2;
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final void l0(ByteBuffer byteBuffer) {
            Preconditions.j(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            a(iRemaining);
            byteBuffer.put(this.f, this.d, iRemaining);
            this.d += iRemaining;
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final void p2(OutputStream outputStream, int i) throws IOException {
            a(i);
            outputStream.write(this.f, this.d, i);
            this.d += i;
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final int readUnsignedByte() {
            a(1);
            int i = this.d;
            this.d = i + 1;
            return this.f[i] & 255;
        }

        @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
        public final void reset() {
            int i = this.g;
            if (i == -1) {
                throw new InvalidMarkException();
            }
            this.d = i;
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final int s() {
            return this.e - this.d;
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final void skipBytes(int i) {
            a(i);
            this.d += i;
        }
    }

    public static class ByteReadableBufferWrapper extends AbstractReadableBuffer {
        public final ByteBuffer d;

        public ByteReadableBufferWrapper(ByteBuffer byteBuffer) {
            this.d = byteBuffer;
        }

        @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
        public final void B() {
            this.d.mark();
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final ReadableBuffer Q(int i) {
            a(i);
            ByteBuffer byteBuffer = this.d;
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.limit(byteBuffer.position() + i);
            byteBuffer.position(byteBuffer.position() + i);
            return new ByteReadableBufferWrapper(byteBufferDuplicate);
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final void Z1(int i, int i2, byte[] bArr) {
            a(i2);
            this.d.get(bArr, i, i2);
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final void l0(ByteBuffer byteBuffer) {
            Preconditions.j(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            a(iRemaining);
            ByteBuffer byteBuffer2 = this.d;
            int iLimit = byteBuffer2.limit();
            byteBuffer2.limit(byteBuffer2.position() + iRemaining);
            byteBuffer.put(byteBuffer2);
            byteBuffer2.limit(iLimit);
        }

        @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
        public final boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final void p2(OutputStream outputStream, int i) throws IOException {
            a(i);
            ByteBuffer byteBuffer = this.d;
            if (!byteBuffer.hasArray()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                outputStream.write(bArr);
            } else {
                outputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i);
                byteBuffer.position(byteBuffer.position() + i);
            }
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final int readUnsignedByte() {
            a(1);
            return this.d.get() & 255;
        }

        @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
        public final void reset() {
            this.d.reset();
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final int s() {
            return this.d.remaining();
        }

        @Override // io.grpc.internal.ReadableBuffer
        public final void skipBytes(int i) {
            a(i);
            ByteBuffer byteBuffer = this.d;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    public static final class BufferInputStream extends InputStream implements KnownLength, HasByteBuffer, Detachable {
        public ReadableBuffer d;

        @Override // java.io.InputStream
        public final int available() {
            return this.d.s();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.d.close();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            this.d.B();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return this.d.markSupported();
        }

        @Override // java.io.InputStream
        public final int read() {
            ReadableBuffer readableBuffer = this.d;
            if (readableBuffer.s() == 0) {
                return -1;
            }
            return readableBuffer.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public final void reset() {
            this.d.reset();
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            ReadableBuffer readableBuffer = this.d;
            int iMin = (int) Math.min(readableBuffer.s(), j);
            readableBuffer.skipBytes(iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            ReadableBuffer readableBuffer = this.d;
            if (readableBuffer.s() == 0) {
                return -1;
            }
            int iMin = Math.min(readableBuffer.s(), i2);
            readableBuffer.Z1(i, iMin, bArr);
            return iMin;
        }
    }
}

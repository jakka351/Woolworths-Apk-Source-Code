package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class CompositeReadableBuffer extends AbstractReadableBuffer {
    public static final AnonymousClass1 h = new AnonymousClass1();
    public static final AnonymousClass2 i = new AnonymousClass2();
    public static final AnonymousClass3 j = new AnonymousClass3();
    public static final AnonymousClass4 k = new AnonymousClass4();
    public static final AnonymousClass5 l = new AnonymousClass5();
    public final ArrayDeque d;
    public ArrayDeque e;
    public int f;
    public boolean g;

    /* renamed from: io.grpc.internal.CompositeReadableBuffer$1, reason: invalid class name */
    public class AnonymousClass1 implements NoThrowReadOperation<Void> {
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        public final int a(ReadableBuffer readableBuffer, int i, Object obj, int i2) {
            return readableBuffer.readUnsignedByte();
        }
    }

    /* renamed from: io.grpc.internal.CompositeReadableBuffer$2, reason: invalid class name */
    public class AnonymousClass2 implements NoThrowReadOperation<Void> {
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        public final int a(ReadableBuffer readableBuffer, int i, Object obj, int i2) {
            readableBuffer.skipBytes(i);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.CompositeReadableBuffer$3, reason: invalid class name */
    public class AnonymousClass3 implements NoThrowReadOperation<byte[]> {
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        public final int a(ReadableBuffer readableBuffer, int i, Object obj, int i2) {
            readableBuffer.Z1(i2, i, (byte[]) obj);
            return i2 + i;
        }
    }

    /* renamed from: io.grpc.internal.CompositeReadableBuffer$4, reason: invalid class name */
    public class AnonymousClass4 implements NoThrowReadOperation<ByteBuffer> {
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        public final int a(ReadableBuffer readableBuffer, int i, Object obj, int i2) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i);
            readableBuffer.l0(byteBuffer);
            byteBuffer.limit(iLimit);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.CompositeReadableBuffer$5, reason: invalid class name */
    public class AnonymousClass5 implements ReadOperation<OutputStream> {
        @Override // io.grpc.internal.CompositeReadableBuffer.ReadOperation
        public final int a(ReadableBuffer readableBuffer, int i, Object obj, int i2) {
            readableBuffer.p2((OutputStream) obj, i);
            return 0;
        }
    }

    public interface NoThrowReadOperation<T> extends ReadOperation<T> {
    }

    public interface ReadOperation<T> {
        int a(ReadableBuffer readableBuffer, int i, Object obj, int i2);
    }

    public CompositeReadableBuffer() {
        new ArrayDeque(2);
        this.d = new ArrayDeque();
    }

    @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
    public final void B() throws IOException {
        ArrayDeque arrayDeque = this.e;
        ArrayDeque arrayDeque2 = this.d;
        if (arrayDeque == null) {
            this.e = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.e.isEmpty()) {
            ((ReadableBuffer) this.e.remove()).close();
        }
        this.g = true;
        ReadableBuffer readableBuffer = (ReadableBuffer) arrayDeque2.peek();
        if (readableBuffer != null) {
            readableBuffer.B();
        }
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final ReadableBuffer Q(int i2) throws IOException {
        ReadableBuffer readableBufferQ;
        int i3;
        ReadableBuffer readableBufferQ2;
        if (i2 <= 0) {
            return ReadableBuffers.f24076a;
        }
        a(i2);
        this.f -= i2;
        ReadableBuffer readableBuffer = null;
        CompositeReadableBuffer compositeReadableBuffer = null;
        while (true) {
            ArrayDeque arrayDeque = this.d;
            ReadableBuffer readableBuffer2 = (ReadableBuffer) arrayDeque.peek();
            int iS = readableBuffer2.s();
            if (iS > i2) {
                readableBufferQ2 = readableBuffer2.Q(i2);
                i3 = 0;
            } else {
                if (this.g) {
                    readableBufferQ = readableBuffer2.Q(iS);
                    c();
                } else {
                    readableBufferQ = (ReadableBuffer) arrayDeque.poll();
                }
                ReadableBuffer readableBuffer3 = readableBufferQ;
                i3 = i2 - iS;
                readableBufferQ2 = readableBuffer3;
            }
            if (readableBuffer == null) {
                readableBuffer = readableBufferQ2;
            } else {
                if (compositeReadableBuffer == null) {
                    compositeReadableBuffer = new CompositeReadableBuffer(i3 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    compositeReadableBuffer.b(readableBuffer);
                    readableBuffer = compositeReadableBuffer;
                }
                compositeReadableBuffer.b(readableBufferQ2);
            }
            if (i3 <= 0) {
                return readableBuffer;
            }
            i2 = i3;
        }
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void Z1(int i2, int i3, byte[] bArr) {
        e(j, i3, bArr, i2);
    }

    public final void b(ReadableBuffer readableBuffer) throws IOException {
        boolean z = this.g;
        ArrayDeque arrayDeque = this.d;
        boolean z2 = z && arrayDeque.isEmpty();
        if (readableBuffer instanceof CompositeReadableBuffer) {
            CompositeReadableBuffer compositeReadableBuffer = (CompositeReadableBuffer) readableBuffer;
            ArrayDeque arrayDeque2 = compositeReadableBuffer.d;
            while (!arrayDeque2.isEmpty()) {
                arrayDeque.add((ReadableBuffer) arrayDeque2.remove());
            }
            this.f += compositeReadableBuffer.f;
            compositeReadableBuffer.f = 0;
            compositeReadableBuffer.close();
        } else {
            arrayDeque.add(readableBuffer);
            this.f = readableBuffer.s() + this.f;
        }
        if (z2) {
            ((ReadableBuffer) arrayDeque.peek()).B();
        }
    }

    public final void c() throws IOException {
        boolean z = this.g;
        ArrayDeque arrayDeque = this.d;
        if (!z) {
            ((ReadableBuffer) arrayDeque.remove()).close();
            return;
        }
        this.e.add((ReadableBuffer) arrayDeque.remove());
        ReadableBuffer readableBuffer = (ReadableBuffer) arrayDeque.peek();
        if (readableBuffer != null) {
            readableBuffer.B();
        }
    }

    @Override // io.grpc.internal.AbstractReadableBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.d;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((ReadableBuffer) arrayDeque.remove()).close();
            }
        }
        if (this.e != null) {
            while (!this.e.isEmpty()) {
                ((ReadableBuffer) this.e.remove()).close();
            }
        }
    }

    public final int d(ReadOperation readOperation, int i2, Object obj, int i3) throws IOException {
        a(i2);
        ArrayDeque arrayDeque = this.d;
        if (!arrayDeque.isEmpty() && ((ReadableBuffer) arrayDeque.peek()).s() == 0) {
            c();
        }
        while (i2 > 0 && !arrayDeque.isEmpty()) {
            ReadableBuffer readableBuffer = (ReadableBuffer) arrayDeque.peek();
            int iMin = Math.min(i2, readableBuffer.s());
            i3 = readOperation.a(readableBuffer, iMin, obj, i3);
            i2 -= iMin;
            this.f -= iMin;
            if (((ReadableBuffer) arrayDeque.peek()).s() == 0) {
                c();
            }
        }
        if (i2 <= 0) {
            return i3;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public final int e(NoThrowReadOperation noThrowReadOperation, int i2, Object obj, int i3) {
        try {
            return d(noThrowReadOperation, i2, obj, i3);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void l0(ByteBuffer byteBuffer) {
        e(k, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
    public final boolean markSupported() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (!((ReadableBuffer) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void p2(OutputStream outputStream, int i2) throws IOException {
        d(l, i2, outputStream, 0);
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final int readUnsignedByte() {
        return e(h, 1, null, 0);
    }

    @Override // io.grpc.internal.AbstractReadableBuffer, io.grpc.internal.ReadableBuffer
    public final void reset() {
        if (!this.g) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.d;
        ReadableBuffer readableBuffer = (ReadableBuffer) arrayDeque.peek();
        if (readableBuffer != null) {
            int iS = readableBuffer.s();
            readableBuffer.reset();
            this.f = (readableBuffer.s() - iS) + this.f;
        }
        while (true) {
            ReadableBuffer readableBuffer2 = (ReadableBuffer) this.e.pollLast();
            if (readableBuffer2 == null) {
                return;
            }
            readableBuffer2.reset();
            arrayDeque.addFirst(readableBuffer2);
            this.f = readableBuffer2.s() + this.f;
        }
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final int s() {
        return this.f;
    }

    @Override // io.grpc.internal.ReadableBuffer
    public final void skipBytes(int i2) {
        e(i, i2, null, 0);
    }

    public CompositeReadableBuffer(int i2) {
        new ArrayDeque(2);
        this.d = new ArrayDeque(i2);
    }
}

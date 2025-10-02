package io.grpc.internal;

import com.google.common.base.Preconditions;
import com.google.common.io.ByteStreams;
import io.grpc.Codec;
import io.grpc.Compressor;
import io.grpc.Drainable;
import io.grpc.KnownLength;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.StreamTracer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes7.dex */
public class MessageFramer implements Framer {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractStream f24058a;
    public WritableBuffer c;
    public final WritableBufferAllocator g;
    public final StatsTraceContext h;
    public boolean i;
    public int j;
    public long l;
    public int b = -1;
    public Compressor d = Codec.Identity.f23926a;
    public final OutputStreamAdapter e = new OutputStreamAdapter();
    public final ByteBuffer f = ByteBuffer.allocate(5);
    public int k = -1;

    public interface Sink {
        void o(WritableBuffer writableBuffer, boolean z, boolean z2, int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageFramer(Sink sink, WritableBufferAllocator writableBufferAllocator, StatsTraceContext statsTraceContext) {
        this.f24058a = (AbstractStream) sink;
        this.g = writableBufferAllocator;
        this.h = statsTraceContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int g(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof Drainable) {
            return ((Drainable) inputStream).a(outputStream);
        }
        int i = ByteStreams.f14924a;
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                break;
            }
            outputStream.write(bArr, 0, i2);
            j += i2;
        }
        Preconditions.c(j, "Message size overflow: %s", j <= 2147483647L);
        return (int) j;
    }

    @Override // io.grpc.internal.Framer
    public final Framer a(Compressor compressor) {
        Preconditions.j(compressor, "Can't pass an empty compressor");
        this.d = compressor;
        return this;
    }

    @Override // io.grpc.internal.Framer
    public final void b(InputStream inputStream) {
        if (this.i) {
            throw new IllegalStateException("Framer already closed");
        }
        this.j++;
        int i = this.k + 1;
        this.k = i;
        this.l = 0L;
        StatsTraceContext statsTraceContext = this.h;
        StreamTracer[] streamTracerArr = statsTraceContext.f24108a;
        StreamTracer[] streamTracerArr2 = statsTraceContext.f24108a;
        int i2 = 0;
        for (StreamTracer streamTracer : streamTracerArr) {
            streamTracer.e(i);
        }
        boolean z = this.d != Codec.Identity.f23926a;
        try {
            int iAvailable = ((inputStream instanceof KnownLength) || (inputStream instanceof ByteArrayInputStream)) ? inputStream.available() : -1;
            int iH = (iAvailable == 0 || !z) ? h(inputStream, iAvailable) : e(inputStream);
            if (iAvailable != -1 && iH != iAvailable) {
                throw Status.m.i(androidx.camera.core.impl.b.i(iH, iAvailable, "Message length inaccurate ", " != ")).a();
            }
            long j = iH;
            for (StreamTracer streamTracer2 : streamTracerArr2) {
                streamTracer2.g(j);
            }
            long j2 = this.l;
            for (StreamTracer streamTracer3 : streamTracerArr2) {
                streamTracer3.h(j2);
            }
            int i3 = this.k;
            long j3 = this.l;
            StreamTracer[] streamTracerArr3 = statsTraceContext.f24108a;
            int length = streamTracerArr3.length;
            while (i2 < length) {
                long j4 = j;
                streamTracerArr3[i2].f(i3, j3, j4);
                i2++;
                j = j4;
            }
        } catch (StatusRuntimeException e) {
            throw e;
        } catch (IOException e2) {
            throw Status.m.i("Failed to frame message").h(e2).a();
        } catch (RuntimeException e3) {
            throw Status.m.i("Failed to frame message").h(e3).a();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [io.grpc.internal.AbstractStream, io.grpc.internal.MessageFramer$Sink] */
    public final void c(BufferChainOutputStream bufferChainOutputStream, boolean z) {
        ArrayList arrayList = bufferChainOutputStream.d;
        Iterator it = arrayList.iterator();
        int iS = 0;
        while (it.hasNext()) {
            iS += ((WritableBuffer) it.next()).s();
        }
        int i = this.b;
        if (i >= 0 && iS > i) {
            Status status = Status.k;
            Locale locale = Locale.US;
            throw status.i("message too large " + iS + " > " + i).a();
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iS);
        WritableBuffer writableBufferA = this.g.a(5);
        writableBufferA.write(byteBuffer.array(), 0, byteBuffer.position());
        if (iS == 0) {
            this.c = writableBufferA;
            return;
        }
        int i2 = this.j - 1;
        ?? r4 = this.f24058a;
        r4.o(writableBufferA, false, false, i2);
        this.j = 1;
        for (int i3 = 0; i3 < arrayList.size() - 1; i3++) {
            r4.o((WritableBuffer) arrayList.get(i3), false, false, 0);
        }
        this.c = (WritableBuffer) YU.a.c(1, arrayList);
        this.l = iS;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [io.grpc.internal.AbstractStream, io.grpc.internal.MessageFramer$Sink] */
    @Override // io.grpc.internal.Framer
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        WritableBuffer writableBuffer = this.c;
        if (writableBuffer != null && writableBuffer.s() == 0 && this.c != null) {
            this.c = null;
        }
        WritableBuffer writableBuffer2 = this.c;
        this.c = null;
        this.f24058a.o(writableBuffer2, true, true, this.j);
        this.j = 0;
    }

    @Override // io.grpc.internal.Framer
    public final void d(int i) {
        Preconditions.q("max size already set", this.b == -1);
        this.b = i;
    }

    public final int e(InputStream inputStream) throws IOException {
        BufferChainOutputStream bufferChainOutputStream = new BufferChainOutputStream();
        OutputStream outputStreamC = this.d.c(bufferChainOutputStream);
        try {
            int iG = g(inputStream, outputStreamC);
            outputStreamC.close();
            int i = this.b;
            if (i < 0 || iG <= i) {
                c(bufferChainOutputStream, true);
                return iG;
            }
            Status status = Status.k;
            Locale locale = Locale.US;
            throw status.i("message too large " + iG + " > " + i).a();
        } catch (Throwable th) {
            outputStreamC.close();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [io.grpc.internal.AbstractStream, io.grpc.internal.MessageFramer$Sink] */
    public final void f(int i, int i2, byte[] bArr) {
        while (i2 > 0) {
            WritableBuffer writableBuffer = this.c;
            if (writableBuffer != null && writableBuffer.a() == 0) {
                WritableBuffer writableBuffer2 = this.c;
                this.c = null;
                this.f24058a.o(writableBuffer2, false, false, this.j);
                this.j = 0;
            }
            if (this.c == null) {
                this.c = this.g.a(i2);
            }
            int iMin = Math.min(i2, this.c.a());
            this.c.write(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [io.grpc.internal.AbstractStream, io.grpc.internal.MessageFramer$Sink] */
    @Override // io.grpc.internal.Framer
    public final void flush() {
        WritableBuffer writableBuffer = this.c;
        if (writableBuffer == null || writableBuffer.s() <= 0) {
            return;
        }
        WritableBuffer writableBuffer2 = this.c;
        this.c = null;
        this.f24058a.o(writableBuffer2, false, true, this.j);
        this.j = 0;
    }

    public final int h(InputStream inputStream, int i) throws IOException {
        if (i == -1) {
            BufferChainOutputStream bufferChainOutputStream = new BufferChainOutputStream();
            int iG = g(inputStream, bufferChainOutputStream);
            c(bufferChainOutputStream, false);
            return iG;
        }
        this.l = i;
        int i2 = this.b;
        if (i2 >= 0 && i > i2) {
            Status status = Status.k;
            Locale locale = Locale.US;
            throw status.i("message too large " + i + " > " + i2).a();
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i);
        if (this.c == null) {
            this.c = this.g.a(byteBuffer.position() + i);
        }
        f(0, byteBuffer.position(), byteBuffer.array());
        return g(inputStream, this.e);
    }

    @Override // io.grpc.internal.Framer
    public final boolean isClosed() {
        return this.i;
    }

    public class OutputStreamAdapter extends OutputStream {
        public OutputStreamAdapter() {
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            write(new byte[]{(byte) i}, 0, 1);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            MessageFramer.this.f(i, i2, bArr);
        }
    }

    public final class BufferChainOutputStream extends OutputStream {
        public final ArrayList d = new ArrayList();
        public WritableBuffer e;

        public BufferChainOutputStream() {
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            WritableBuffer writableBuffer = this.e;
            if (writableBuffer == null || writableBuffer.a() <= 0) {
                write(new byte[]{(byte) i}, 0, 1);
            } else {
                this.e.b((byte) i);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            WritableBufferAllocator writableBufferAllocator = MessageFramer.this.g;
            WritableBuffer writableBuffer = this.e;
            ArrayList arrayList = this.d;
            if (writableBuffer == null) {
                WritableBuffer writableBufferA = writableBufferAllocator.a(i2);
                this.e = writableBufferA;
                arrayList.add(writableBufferA);
            }
            while (i2 > 0) {
                int iMin = Math.min(i2, this.e.a());
                if (iMin == 0) {
                    WritableBuffer writableBufferA2 = writableBufferAllocator.a(Math.max(i2, this.e.s() * 2));
                    this.e = writableBufferA2;
                    arrayList.add(writableBufferA2);
                } else {
                    this.e.write(bArr, i, iMin);
                    i += iMin;
                    i2 -= iMin;
                }
            }
        }
    }
}

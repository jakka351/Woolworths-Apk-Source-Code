package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.grpc.Codec;
import io.grpc.Decompressor;
import io.grpc.Status;
import io.grpc.StreamTracer;
import io.grpc.internal.AbstractStream;
import io.grpc.internal.ReadableBuffers;
import io.grpc.internal.StreamListener;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes7.dex */
public class MessageDeframer implements Closeable, Deframer {
    public Listener d;
    public int e;
    public final StatsTraceContext f;
    public final TransportTracer g;
    public Decompressor h;
    public GzipInflatingBuffer i;
    public byte[] j;
    public int k;
    public State l;
    public int m;
    public boolean n;
    public CompositeReadableBuffer o;
    public CompositeReadableBuffer p;
    public long q;
    public boolean r;
    public int s;
    public int t;
    public boolean u;
    public volatile boolean v;

    /* renamed from: io.grpc.internal.MessageDeframer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24057a;

        static {
            int[] iArr = new int[State.values().length];
            f24057a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24057a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface Listener {
        void a(StreamListener.MessageProducer messageProducer);

        void b(int i);

        void c(boolean z);

        void f(Throwable th);
    }

    public static class SingleMessageProducer implements StreamListener.MessageProducer {
        public InputStream d;

        @Override // io.grpc.internal.StreamListener.MessageProducer
        public final InputStream next() {
            InputStream inputStream = this.d;
            this.d = null;
            return inputStream;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final /* synthetic */ State[] f;

        static {
            State state = new State("HEADER", 0);
            d = state;
            State state2 = new State("BODY", 1);
            e = state2;
            f = new State[]{state, state2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f.clone();
        }
    }

    public MessageDeframer(AbstractStream.TransportState transportState, int i, StatsTraceContext statsTraceContext, TransportTracer transportTracer) {
        Codec.Identity identity = Codec.Identity.f23926a;
        this.l = State.d;
        this.m = 5;
        this.p = new CompositeReadableBuffer();
        this.r = false;
        this.s = -1;
        this.u = false;
        this.v = false;
        this.d = transportState;
        this.h = identity;
        this.e = i;
        this.f = statsTraceContext;
        Preconditions.j(transportTracer, "transportTracer");
        this.g = transportTracer;
    }

    public final void a() {
        if (this.r) {
            return;
        }
        boolean z = true;
        this.r = true;
        while (!this.v && this.q > 0 && i()) {
            try {
                int iOrdinal = this.l.ordinal();
                if (iOrdinal == 0) {
                    h();
                } else {
                    if (iOrdinal != 1) {
                        throw new AssertionError("Invalid state: " + this.l);
                    }
                    g();
                    this.q--;
                }
            } catch (Throwable th) {
                this.r = false;
                throw th;
            }
        }
        if (this.v) {
            close();
            this.r = false;
            return;
        }
        if (this.u) {
            GzipInflatingBuffer gzipInflatingBuffer = this.i;
            if (gzipInflatingBuffer != null) {
                Preconditions.q("GzipInflatingBuffer is closed", true ^ gzipInflatingBuffer.h);
                z = gzipInflatingBuffer.n;
            } else if (this.p.f != 0) {
                z = false;
            }
            if (z) {
                close();
            }
        }
        this.r = false;
    }

    @Override // io.grpc.internal.Deframer
    public final void b(int i) {
        Preconditions.f("numMessages must be > 0", i > 0);
        if (isClosed()) {
            return;
        }
        this.q += i;
        a();
    }

    @Override // io.grpc.internal.Deframer
    public final void c(int i) {
        this.e = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.Deframer
    public final void close() {
        if (isClosed()) {
            return;
        }
        CompositeReadableBuffer compositeReadableBuffer = this.o;
        boolean z = true;
        boolean z2 = compositeReadableBuffer != null && compositeReadableBuffer.f > 0;
        try {
            if (this.i == null) {
                z = z2;
            } else {
                if (!z2) {
                    Preconditions.q("GzipInflatingBuffer is closed", !r3.h);
                    throw null;
                }
                this.i.close();
            }
            CompositeReadableBuffer compositeReadableBuffer2 = this.p;
            if (compositeReadableBuffer2 != null) {
                compositeReadableBuffer2.close();
            }
            CompositeReadableBuffer compositeReadableBuffer3 = this.o;
            if (compositeReadableBuffer3 != null) {
                compositeReadableBuffer3.close();
            }
            this.i = null;
            this.p = null;
            this.o = null;
            this.d.c(z);
        } catch (Throwable th) {
            this.i = null;
            this.p = null;
            this.o = null;
            throw th;
        }
    }

    @Override // io.grpc.internal.Deframer
    public final void d(Decompressor decompressor) {
        Preconditions.q("Already set full stream decompressor", this.i == null);
        this.h = decompressor;
    }

    @Override // io.grpc.internal.Deframer
    public final void e(ReadableBuffer readableBuffer) throws Throwable {
        boolean z;
        Throwable th;
        try {
            if (!isClosed() && !this.u) {
                if (this.i != null) {
                    Preconditions.q("GzipInflatingBuffer is closed", !r1.h);
                    throw null;
                }
                this.p.b(readableBuffer);
                try {
                    a();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    if (z) {
                        readableBuffer.close();
                    }
                    throw th;
                }
            }
            readableBuffer.close();
        } catch (Throwable th3) {
            z = true;
            th = th3;
        }
    }

    @Override // io.grpc.internal.Deframer
    public final void f() {
        boolean z;
        if (isClosed()) {
            return;
        }
        GzipInflatingBuffer gzipInflatingBuffer = this.i;
        if (gzipInflatingBuffer != null) {
            Preconditions.q("GzipInflatingBuffer is closed", !gzipInflatingBuffer.h);
            z = gzipInflatingBuffer.n;
        } else {
            z = this.p.f == 0;
        }
        if (z) {
            close();
        } else {
            this.u = true;
        }
    }

    public final void g() {
        InputStream sizeEnforcingInputStream;
        int i = this.s;
        long j = this.t;
        StatsTraceContext statsTraceContext = this.f;
        for (StreamTracer streamTracer : statsTraceContext.f24108a) {
            streamTracer.b(i, j);
        }
        this.t = 0;
        if (this.n) {
            Decompressor decompressor = this.h;
            if (decompressor == Codec.Identity.f23926a) {
                throw Status.m.i("Can't decode compressed gRPC message as compression not configured").a();
            }
            try {
                CompositeReadableBuffer compositeReadableBuffer = this.o;
                ReadableBuffer readableBuffer = ReadableBuffers.f24076a;
                ReadableBuffers.BufferInputStream bufferInputStream = new ReadableBuffers.BufferInputStream();
                Preconditions.j(compositeReadableBuffer, "buffer");
                bufferInputStream.d = compositeReadableBuffer;
                sizeEnforcingInputStream = new SizeEnforcingInputStream(decompressor.b(bufferInputStream), this.e, statsTraceContext);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            long j2 = this.o.f;
            for (StreamTracer streamTracer2 : statsTraceContext.f24108a) {
                streamTracer2.c(j2);
            }
            CompositeReadableBuffer compositeReadableBuffer2 = this.o;
            ReadableBuffer readableBuffer2 = ReadableBuffers.f24076a;
            ReadableBuffers.BufferInputStream bufferInputStream2 = new ReadableBuffers.BufferInputStream();
            Preconditions.j(compositeReadableBuffer2, "buffer");
            bufferInputStream2.d = compositeReadableBuffer2;
            sizeEnforcingInputStream = bufferInputStream2;
        }
        this.o.getClass();
        this.o = null;
        Listener listener = this.d;
        SingleMessageProducer singleMessageProducer = new SingleMessageProducer();
        singleMessageProducer.d = sizeEnforcingInputStream;
        listener.a(singleMessageProducer);
        this.l = State.d;
        this.m = 5;
    }

    public final void h() {
        int unsignedByte = this.o.readUnsignedByte();
        if ((unsignedByte & 254) != 0) {
            throw Status.m.i("gRPC frame header malformed: reserved bits not zero").a();
        }
        this.n = (unsignedByte & 1) != 0;
        CompositeReadableBuffer compositeReadableBuffer = this.o;
        compositeReadableBuffer.a(4);
        int unsignedByte2 = compositeReadableBuffer.readUnsignedByte() | (compositeReadableBuffer.readUnsignedByte() << 24) | (compositeReadableBuffer.readUnsignedByte() << 16) | (compositeReadableBuffer.readUnsignedByte() << 8);
        this.m = unsignedByte2;
        if (unsignedByte2 < 0 || unsignedByte2 > this.e) {
            Status status = Status.k;
            Locale locale = Locale.US;
            throw status.i("gRPC message exceeds maximum size " + this.e + ": " + unsignedByte2).a();
        }
        int i = this.s + 1;
        this.s = i;
        for (StreamTracer streamTracer : this.f.f24108a) {
            streamTracer.a(i);
        }
        TransportTracer transportTracer = this.g;
        transportTracer.b.a();
        transportTracer.f24113a.a();
        this.l = State.e;
    }

    public final boolean i() throws Throwable {
        int i;
        State state = State.e;
        StatsTraceContext statsTraceContext = this.f;
        int i2 = 0;
        try {
            if (this.o == null) {
                this.o = new CompositeReadableBuffer();
            }
            int i3 = 0;
            i = 0;
            while (true) {
                try {
                    int i4 = this.m - this.o.f;
                    if (i4 <= 0) {
                        if (i3 > 0) {
                            this.d.b(i3);
                            if (this.l == state) {
                                if (this.i != null) {
                                    statsTraceContext.a(i);
                                    this.t += i;
                                    return true;
                                }
                                statsTraceContext.a(i3);
                                this.t += i3;
                            }
                        }
                        return true;
                    }
                    if (this.i != null) {
                        try {
                            byte[] bArr = this.j;
                            if (bArr == null || this.k == bArr.length) {
                                this.j = new byte[Math.min(i4, 2097152)];
                                this.k = 0;
                            }
                            int iA = this.i.a(this.k, Math.min(i4, this.j.length - this.k), this.j);
                            GzipInflatingBuffer gzipInflatingBuffer = this.i;
                            int i5 = gzipInflatingBuffer.l;
                            gzipInflatingBuffer.l = 0;
                            i3 += i5;
                            int i6 = gzipInflatingBuffer.m;
                            gzipInflatingBuffer.m = 0;
                            i += i6;
                            if (iA != 0) {
                                CompositeReadableBuffer compositeReadableBuffer = this.o;
                                byte[] bArr2 = this.j;
                                int i7 = this.k;
                                ReadableBuffer readableBuffer = ReadableBuffers.f24076a;
                                compositeReadableBuffer.b(new ReadableBuffers.ByteArrayWrapper(bArr2, i7, iA));
                                this.k += iA;
                            } else if (i3 > 0) {
                                this.d.b(i3);
                                if (this.l == state) {
                                    if (this.i != null) {
                                        statsTraceContext.a(i);
                                        this.t += i;
                                        return false;
                                    }
                                    statsTraceContext.a(i3);
                                    this.t += i3;
                                    return false;
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        } catch (DataFormatException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        int i8 = this.p.f;
                        if (i8 != 0) {
                            int iMin = Math.min(i4, i8);
                            i3 += iMin;
                            this.o.b(this.p.Q(iMin));
                        } else if (i3 > 0) {
                            this.d.b(i3);
                            if (this.l == state) {
                                if (this.i != null) {
                                    statsTraceContext.a(i);
                                    this.t += i;
                                    return false;
                                }
                                statsTraceContext.a(i3);
                                this.t += i3;
                            }
                        }
                    }
                } catch (Throwable th) {
                    int i9 = i3;
                    th = th;
                    i2 = i9;
                    if (i2 > 0) {
                        this.d.b(i2);
                        if (this.l == state) {
                            if (this.i != null) {
                                statsTraceContext.a(i);
                                this.t += i;
                            } else {
                                statsTraceContext.a(i2);
                                this.t += i2;
                            }
                        }
                    }
                    throw th;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            i = 0;
        }
    }

    public final boolean isClosed() {
        return this.p == null && this.i == null;
    }

    @VisibleForTesting
    public static final class SizeEnforcingInputStream extends FilterInputStream {
        public final int d;
        public final StatsTraceContext e;
        public long f;
        public long g;
        public long h;

        public SizeEnforcingInputStream(InputStream inputStream, int i, StatsTraceContext statsTraceContext) {
            super(inputStream);
            this.h = -1L;
            this.d = i;
            this.e = statsTraceContext;
        }

        public final void a() {
            long j = this.g;
            long j2 = this.f;
            if (j > j2) {
                long j3 = j - j2;
                for (StreamTracer streamTracer : this.e.f24108a) {
                    streamTracer.c(j3);
                }
                this.f = this.g;
            }
        }

        public final void b() {
            long j = this.g;
            int i = this.d;
            if (j <= i) {
                return;
            }
            throw Status.k.i("Decompressed gRPC message exceeds maximum size " + i).a();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.h = this.g;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int i = ((FilterInputStream) this).in.read();
            if (i != -1) {
                this.g++;
            }
            b();
            a();
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.h == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.g = this.h;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j);
            this.g += jSkip;
            b();
            a();
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
            if (i3 != -1) {
                this.g += i3;
            }
            b();
            a();
            return i3;
        }
    }
}

package okhttp3.internal.http2;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.Sink;
import okio.Socket;
import okio.Source;
import okio.Timeout;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "Lokhttp3/internal/concurrent/Lockable;", "Lokio/Socket;", "FramingSource", "FramingSink", "Companion", "StreamTimeout", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Http2Stream implements Lockable, Socket {
    public static final /* synthetic */ int q = 0;
    public final int d;
    public final Http2Connection e;
    public final WindowCounter f;
    public long g;
    public long h;
    public final ArrayDeque i;
    public boolean j;
    public final FramingSource k;
    public final FramingSink l;
    public final StreamTimeout m;
    public final StreamTimeout n;
    public ErrorCode o;
    public IOException p;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "<init>", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class FramingSink implements Sink {
        public final boolean d;
        public final Buffer e = new Buffer();
        public boolean f;

        public FramingSink(boolean z) {
            this.d = z;
        }

        /* JADX WARN: Finally extract failed */
        public final void a(boolean z) throws SocketTimeoutException {
            long jMin;
            boolean z2;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.n.j();
                while (http2Stream.g >= http2Stream.h && !this.d && !this.f && http2Stream.f() == null) {
                    try {
                        try {
                            http2Stream.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        http2Stream.n.m();
                        throw th;
                    }
                }
                http2Stream.n.m();
                http2Stream.b();
                jMin = Math.min(http2Stream.h - http2Stream.g, this.e.e);
                http2Stream.g += jMin;
                z2 = z && jMin == this.e.e;
            }
            Http2Stream.this.n.j();
            try {
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.e.f(http2Stream2.d, z2, this.e, jMin);
            } finally {
                Http2Stream.this.n.m();
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws SocketTimeoutException {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.f26699a;
            synchronized (http2Stream) {
                if (this.f) {
                    return;
                }
                boolean z = http2Stream.f() == null;
                Http2Stream http2Stream2 = Http2Stream.this;
                if (!http2Stream2.l.d) {
                    if (this.e.e > 0) {
                        while (this.e.e > 0) {
                            a(true);
                        }
                    } else if (z) {
                        http2Stream2.e.f(http2Stream2.d, true, null, 0L);
                    }
                }
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    this.f = true;
                    http2Stream3.notifyAll();
                }
                Http2Stream.this.e.A.flush();
                Http2Stream.this.a();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() throws SocketTimeoutException {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.f26699a;
            synchronized (http2Stream) {
                http2Stream.b();
            }
            while (this.e.e > 0) {
                a(false);
                Http2Stream.this.e.A.flush();
            }
        }

        @Override // okio.Sink
        /* renamed from: n */
        public final Timeout getE() {
            return Http2Stream.this.n;
        }

        @Override // okio.Sink
        public final void w1(Buffer source, long j) throws SocketTimeoutException {
            Intrinsics.h(source, "source");
            TimeZone timeZone = _UtilJvmKt.f26699a;
            Buffer buffer = this.e;
            buffer.w1(source, j);
            while (buffer.e >= llqqqql.c0063006300630063c0063) {
                a(false);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class FramingSource implements Source {
        public final long d;
        public boolean e;
        public final Buffer f = new Buffer();
        public final Buffer g = new Buffer();
        public boolean h;

        public FramingSource(long j, boolean z) {
            this.d = j;
            this.e = z;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.h = true;
                Buffer buffer = this.g;
                j = buffer.e;
                buffer.a();
                http2Stream.notifyAll();
            }
            if (j > 0) {
                Http2Stream http2Stream2 = Http2Stream.this;
                TimeZone timeZone = _UtilJvmKt.f26699a;
                http2Stream2.e.e(j);
            }
            Http2Stream.this.a();
        }

        @Override // okio.Source
        /* renamed from: n */
        public final Timeout getE() {
            return Http2Stream.this.m;
        }

        @Override // okio.Source
        public final long q2(Buffer sink, long j) throws Throwable {
            boolean z;
            Throwable streamResetException;
            long jQ2;
            Intrinsics.h(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(androidx.camera.core.impl.b.k(j, "byteCount < 0: ").toString());
            }
            do {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    int i = Http2Stream.q;
                    http2Stream.e.getClass();
                    FramingSink framingSink = http2Stream.l;
                    z = true;
                    boolean z2 = framingSink.f || framingSink.d;
                    if (z2) {
                        http2Stream.m.j();
                    }
                    try {
                        if (http2Stream.f() == null || this.e) {
                            streamResetException = null;
                        } else {
                            streamResetException = http2Stream.p;
                            if (streamResetException == null) {
                                ErrorCode errorCodeF = http2Stream.f();
                                Intrinsics.e(errorCodeF);
                                streamResetException = new StreamResetException(errorCodeF);
                            }
                        }
                        if (this.h) {
                            throw new IOException("stream closed");
                        }
                        Buffer buffer = this.g;
                        long j2 = buffer.e;
                        if (j2 > 0) {
                            jQ2 = buffer.q2(sink, Math.min(j, j2));
                            WindowCounter.b(http2Stream.f, jQ2, 0L, 2);
                            long jA = http2Stream.f.a();
                            if (streamResetException == null && jA >= http2Stream.e.u.a() / 2) {
                                http2Stream.e.h(http2Stream.d, jA);
                                WindowCounter.b(http2Stream.f, 0L, jA, 1);
                            }
                            z = false;
                        } else {
                            if (this.e || streamResetException != null) {
                                z = false;
                            } else {
                                try {
                                    http2Stream.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                            jQ2 = -1;
                        }
                    } finally {
                        if (z2) {
                            http2Stream.m.m();
                        }
                    }
                }
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.e.t.a(http2Stream2.f);
            } while (z);
            if (jQ2 != -1) {
                return jQ2;
            }
            if (streamResetException == null) {
                return -1L;
            }
            throw streamResetException;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        @Override // okio.AsyncTimeout
        public final void l() {
            Http2Stream.this.e(ErrorCode.k);
            Http2Connection http2Connection = Http2Stream.this.e;
            synchronized (http2Connection) {
                long j = http2Connection.r;
                long j2 = http2Connection.q;
                if (j < j2) {
                    return;
                }
                http2Connection.q = j2 + 1;
                http2Connection.s = System.nanoTime() + 1000000000;
                TaskQueue.b(http2Connection.k, YU.a.o(new StringBuilder(), http2Connection.f, " ping"), 0L, new d(http2Connection, 0), 6);
            }
        }

        public final void m() throws SocketTimeoutException {
            if (k()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    static {
        new Companion(0);
    }

    public Http2Stream(int i, Http2Connection connection, boolean z, boolean z2, Headers headers) {
        Intrinsics.h(connection, "connection");
        this.d = i;
        this.e = connection;
        this.f = new WindowCounter(i);
        this.h = connection.v.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.i = arrayDeque;
        this.k = new FramingSource(connection.u.a(), z2);
        this.l = new FramingSink(z);
        this.m = new StreamTimeout();
        this.n = new StreamTimeout();
        if (headers == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r2 = this;
            java.util.TimeZone r0 = okhttp3.internal._UtilJvmKt.f26699a
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.k     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.e     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.h     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.l     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.d     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.h()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.k
            r1 = 0
            r2.c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            okhttp3.internal.http2.Http2Connection r0 = r2.e
            int r1 = r2.d
            r0.c(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.a():void");
    }

    public final void b() throws IOException {
        FramingSink framingSink = this.l;
        if (framingSink.f) {
            throw new IOException("stream closed");
        }
        if (framingSink.d) {
            throw new IOException("stream finished");
        }
        if (f() != null) {
            IOException iOException = this.p;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCodeF = f();
            Intrinsics.e(errorCodeF);
            throw new StreamResetException(errorCodeF);
        }
    }

    public final void c(ErrorCode errorCode, IOException iOException) {
        if (d(errorCode, iOException)) {
            this.e.A.e(this.d, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = _UtilJvmKt.f26699a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.o = errorCode;
            this.p = iOException;
            notifyAll();
            if (this.k.e) {
                if (this.l.d) {
                    return false;
                }
            }
            this.e.c(this.d);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        if (d(errorCode, null)) {
            this.e.g(this.d, errorCode);
        }
    }

    public final ErrorCode f() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.o;
        }
        return errorCode;
    }

    public final boolean g() {
        boolean z = (this.d & 1) == 1;
        this.e.getClass();
        return true == z;
    }

    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                FramingSource framingSource = this.k;
                if (framingSource.e || framingSource.h) {
                    FramingSink framingSink = this.l;
                    if (framingSink.d || framingSink.f) {
                        if (this.j) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(Headers headers, boolean z) {
        boolean zH;
        Intrinsics.h(headers, "headers");
        TimeZone timeZone = _UtilJvmKt.f26699a;
        synchronized (this) {
            try {
                if (this.j && headers.b(":status") == null && headers.b(":method") == null) {
                    this.k.getClass();
                } else {
                    this.j = true;
                    this.i.add(headers);
                }
                if (z) {
                    this.k.e = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.e.c(this.d);
    }
}

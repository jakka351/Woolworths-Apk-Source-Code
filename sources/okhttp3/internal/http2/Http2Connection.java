package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$schedule$2;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import okio.BufferedSink;
import okio.BufferedSource;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Builder", "ReaderRunnable", "Listener", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Http2Connection implements Closeable, Lockable {
    public static final Companion D = new Companion(0);
    public static final Settings E;
    public final Http2Writer A;
    public final ReaderRunnable B;
    public final LinkedHashSet C;
    public final Listener d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final String f;
    public int g;
    public int h;
    public boolean i;
    public final TaskRunner j;
    public final TaskQueue k;
    public final TaskQueue l;
    public final TaskQueue m;
    public final PushObserver n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final FlowControlListener t;
    public final Settings u;
    public Settings v;
    public final WindowCounter w;
    public long x;
    public long y;
    public final Socket z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final TaskRunner f26741a;
        public Socket b;
        public String c;
        public BufferedSource d;
        public BufferedSink e;
        public Listener f;
        public final PushObserver g;
        public int h;
        public FlowControlListener i;

        public Builder(TaskRunner taskRunner) {
            Intrinsics.h(taskRunner, "taskRunner");
            this.f26741a = taskRunner;
            this.f = Listener.d;
            this.g = PushObserver.f26745a;
            this.i = FlowControlListener.None.f26735a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "<init>", "()V", "", "OKHTTP_CLIENT_WINDOW_SIZE", "I", "INTERVAL_PING", "DEGRADED_PING", "AWAIT_PING", "DEGRADED_PONG_TIMEOUT_NS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Listener {
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 d;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "<init>", "()V", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1] */
        static {
            new Companion(0);
            d = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                @Override // okhttp3.internal.http2.Http2Connection.Listener
                public final void d(Http2Stream http2Stream) {
                    http2Stream.c(ErrorCode.j, null);
                }
            };
        }

        public void b(Http2Connection http2Connection, Settings settings) {
            Intrinsics.h(settings, "settings");
        }

        public abstract void d(Http2Stream http2Stream);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {
        public final Http2Reader d;

        public ReaderRunnable(Http2Reader http2Reader) {
            this.d = http2Reader;
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        
            if (r20 == false) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
        
            r2.i(okhttp3.Headers.f, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(final boolean r20, final int r21, okio.BufferedSource r22, final int r23) throws java.io.EOFException {
            /*
                Method dump skipped, instructions count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.a(boolean, int, okio.BufferedSource, int):void");
        }

        public final void b(int i, List list, boolean z) {
            Http2Connection http2Connection = Http2Connection.this;
            Companion companion = Http2Connection.D;
            if (i != 0 && (i & 1) == 0) {
                TaskQueue.b(http2Connection.l, http2Connection.f + '[' + i + "] onHeaders", 0L, new e(http2Connection, i, list, z), 6);
                return;
            }
            synchronized (http2Connection) {
                Http2Stream http2StreamB = http2Connection.b(i);
                if (http2StreamB != null) {
                    http2StreamB.i(_UtilJvmKt.h(list), z);
                    return;
                }
                if (http2Connection.i) {
                    return;
                }
                if (i <= http2Connection.g) {
                    return;
                }
                if (i % 2 == http2Connection.h % 2) {
                    return;
                }
                Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z, _UtilJvmKt.h(list));
                http2Connection.g = i;
                http2Connection.e.put(Integer.valueOf(i), http2Stream);
                TaskQueue.b(http2Connection.j.d(), http2Connection.f + '[' + i + "] onStream", 0L, new au.com.woolworths.feature.shop.onboarding.sdui.ui.f(3, http2Connection, http2Stream), 6);
            }
        }

        public final void d(final int i, final int i2, boolean z) {
            if (!z) {
                TaskQueue taskQueue = Http2Connection.this.k;
                String strO = YU.a.o(new StringBuilder(), Http2Connection.this.f, " ping");
                final Http2Connection http2Connection = Http2Connection.this;
                TaskQueue.b(taskQueue, strO, 0L, new Function0() { // from class: okhttp3.internal.http2.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Http2Connection http2Connection2 = http2Connection;
                        try {
                            http2Connection2.A.J(i, i2, true);
                        } catch (IOException e) {
                            ErrorCode errorCode = ErrorCode.g;
                            http2Connection2.a(errorCode, errorCode, e);
                        }
                        return Unit.f24250a;
                    }
                }, 6);
                return;
            }
            Http2Connection http2Connection2 = Http2Connection.this;
            synchronized (http2Connection2) {
                try {
                    if (i == 1) {
                        http2Connection2.p++;
                    } else if (i == 2) {
                        http2Connection2.r++;
                    } else if (i == 3) {
                        http2Connection2.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void e(int i, List list) {
            Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                if (http2Connection.C.contains(Integer.valueOf(i))) {
                    http2Connection.g(i, ErrorCode.g);
                    return;
                }
                http2Connection.C.add(Integer.valueOf(i));
                TaskQueue.b(http2Connection.l, http2Connection.f + '[' + i + "] onRequest", 0L, new e(http2Connection, i, list, 0), 6);
            }
        }

        public final void f(final int i, final ErrorCode errorCode) {
            final Http2Connection http2Connection = Http2Connection.this;
            Companion companion = Http2Connection.D;
            if (i == 0 || (i & 1) != 0) {
                Http2Stream http2StreamC = http2Connection.c(i);
                if (http2StreamC != null) {
                    synchronized (http2StreamC) {
                        if (http2StreamC.f() == null) {
                            http2StreamC.o = errorCode;
                            http2StreamC.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            TaskQueue.b(http2Connection.l, http2Connection.f + '[' + i + "] onReset", 0L, new Function0(i, errorCode) { // from class: okhttp3.internal.http2.f
                public final /* synthetic */ int e;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Http2Connection http2Connection2 = this.d;
                    int i2 = this.e;
                    ((PushObserver.Companion.PushObserverCancel) http2Connection2.n).getClass();
                    synchronized (http2Connection2) {
                        http2Connection2.C.remove(Integer.valueOf(i2));
                    }
                    return Unit.f24250a;
                }
            }, 6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.Http2Connection] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            Throwable th;
            ErrorCode errorCode;
            ?? r0 = Http2Connection.this;
            Http2Reader http2Reader = this.d;
            ErrorCode errorCode2 = ErrorCode.h;
            ?? r3 = 1;
            IOException e = null;
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                    errorCode = errorCode2;
                }
                if (!http2Reader.a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        r3 = errorCode2;
                        r0.a(r3, errorCode2, e);
                        _UtilCommonKt.b(http2Reader);
                        throw th;
                    }
                } while (http2Reader.a(false, this));
                errorCode = ErrorCode.f;
                try {
                    errorCode2 = ErrorCode.k;
                    r0.a(errorCode, errorCode2, null);
                    r3 = errorCode;
                } catch (IOException e3) {
                    e = e3;
                    errorCode2 = ErrorCode.g;
                    r0.a(errorCode2, errorCode2, e);
                    r3 = errorCode;
                    _UtilCommonKt.b(http2Reader);
                    return Unit.f24250a;
                }
                _UtilCommonKt.b(http2Reader);
                return Unit.f24250a;
            } catch (Throwable th4) {
                th = th4;
                r0.a(r3, errorCode2, e);
                _UtilCommonKt.b(http2Reader);
                throw th;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.c(4, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        settings.c(5, 16384);
        E = settings;
    }

    public Http2Connection(Builder builder) {
        this.d = builder.f;
        String str = builder.c;
        if (str == null) {
            Intrinsics.p("connectionName");
            throw null;
        }
        this.f = str;
        this.h = 3;
        TaskRunner taskRunner = builder.f26741a;
        this.j = taskRunner;
        TaskQueue taskQueueD = taskRunner.d();
        this.k = taskQueueD;
        this.l = taskRunner.d();
        this.m = taskRunner.d();
        this.n = builder.g;
        this.t = builder.i;
        Settings settings = new Settings();
        settings.c(4, 16777216);
        this.u = settings;
        this.v = E;
        this.w = new WindowCounter(0);
        this.y = r2.a();
        Socket socket = builder.b;
        if (socket == null) {
            Intrinsics.p("socket");
            throw null;
        }
        this.z = socket;
        BufferedSink bufferedSink = builder.e;
        if (bufferedSink == null) {
            Intrinsics.p("sink");
            throw null;
        }
        this.A = new Http2Writer(bufferedSink);
        BufferedSource bufferedSource = builder.d;
        if (bufferedSource == null) {
            Intrinsics.p("source");
            throw null;
        }
        this.B = new ReaderRunnable(new Http2Reader(bufferedSource));
        this.C = new LinkedHashSet();
        int i = builder.h;
        if (i != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            String name = str.concat(" ping");
            Function0 function0 = new Function0() { // from class: okhttp3.internal.http2.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    Http2Connection http2Connection = this.d;
                    long j = nanos;
                    Http2Connection.Companion companion = Http2Connection.D;
                    synchronized (http2Connection) {
                        long j2 = http2Connection.p;
                        long j3 = http2Connection.o;
                        if (j2 < j3) {
                            z = true;
                        } else {
                            http2Connection.o = j3 + 1;
                            z = false;
                        }
                    }
                    if (z) {
                        ErrorCode errorCode = ErrorCode.g;
                        http2Connection.a(errorCode, errorCode, null);
                        j = -1;
                    } else {
                        try {
                            http2Connection.A.J(1, 0, false);
                        } catch (IOException e) {
                            ErrorCode errorCode2 = ErrorCode.g;
                            http2Connection.a(errorCode2, errorCode2, e);
                        }
                    }
                    return Long.valueOf(j);
                }
            };
            Intrinsics.h(name, "name");
            taskQueueD.c(new TaskQueue$schedule$2(name, function0), nanos);
        }
    }

    public final void a(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = _UtilJvmKt.f26699a;
        try {
            d(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.e.isEmpty()) {
                array = null;
            } else {
                array = this.e.values().toArray(new Http2Stream[0]);
                this.e.clear();
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.c(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.A.close();
        } catch (IOException unused3) {
        }
        try {
            this.z.close();
        } catch (IOException unused4) {
        }
        this.k.f();
        this.l.f();
        this.m.f();
    }

    public final Http2Stream b(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.e.get(Integer.valueOf(i));
        }
        return http2Stream;
    }

    public final Http2Stream c(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.e.remove(Integer.valueOf(i));
            notifyAll();
        }
        return http2Stream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(ErrorCode.f, ErrorCode.k, null);
    }

    public final void d(ErrorCode errorCode) {
        synchronized (this.A) {
            synchronized (this) {
                if (this.i) {
                    return;
                }
                this.i = true;
                this.A.c(this.g, errorCode, _UtilCommonKt.f26698a);
            }
        }
    }

    public final void e(long j) {
        synchronized (this) {
            try {
                WindowCounter.b(this.w, j, 0L, 2);
                long jA = this.w.a();
                if (jA >= this.u.a() / 2) {
                    h(0, jA);
                    WindowCounter.b(this.w, 0L, jA, 1);
                }
                this.t.b(this.w);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.A.f);
        r6 = r2;
        r8.x += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.A
            r12.k1(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.x     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.y     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.e     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            okhttp3.internal.http2.Http2Writer r4 = r8.A     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.x     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.x = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.A
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.k1(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.f(int, boolean, okio.Buffer, long):void");
    }

    public final void g(int i, ErrorCode errorCode) {
        TaskQueue.b(this.k, this.f + '[' + i + "] writeSynReset", 0L, new e(this, i, errorCode, 2), 6);
    }

    public final void h(final int i, final long j) {
        TaskQueue.b(this.k, this.f + '[' + i + "] windowUpdate", 0L, new Function0() { // from class: okhttp3.internal.http2.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Http2Connection http2Connection = this.d;
                int i2 = i;
                long j2 = j;
                Http2Connection.Companion companion = Http2Connection.D;
                try {
                    http2Connection.A.E(i2, j2);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.g;
                    http2Connection.a(errorCode, errorCode, e);
                }
                return Unit.f24250a;
            }
        }, 6);
    }
}

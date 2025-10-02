package okhttp3.internal.connection;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Address;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/concurrent/Lockable;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier, Lockable {
    public final TaskRunner e;
    public final RealConnectionPool f;
    public final Route g;
    public final Socket h;
    public final Socket i;
    public final Handshake j;
    public final Protocol k;
    public final BufferedSource l;
    public final BufferedSink m;
    public final int n;
    public final ConnectionListener o;
    public Http2Connection p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final ArrayList w;
    public long x;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "<init>", "()V", "", "IDLE_CONNECTION_HEALTHY_NS", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public RealConnection(TaskRunner taskRunner, RealConnectionPool connectionPool, Route route, Socket rawSocket, Socket socket, Handshake handshake, Protocol protocol, RealBufferedSource source, RealBufferedSink sink, int i, ConnectionListener connectionListener) {
        Intrinsics.h(taskRunner, "taskRunner");
        Intrinsics.h(connectionPool, "connectionPool");
        Intrinsics.h(route, "route");
        Intrinsics.h(rawSocket, "rawSocket");
        Intrinsics.h(socket, "socket");
        Intrinsics.h(protocol, "protocol");
        Intrinsics.h(source, "source");
        Intrinsics.h(sink, "sink");
        this.e = taskRunner;
        this.f = connectionPool;
        this.g = route;
        this.h = rawSocket;
        this.i = socket;
        this.j = handshake;
        this.k = protocol;
        this.l = source;
        this.m = sink;
        this.n = i;
        this.o = connectionListener;
        this.v = 1;
        this.w = new ArrayList();
        this.x = Long.MAX_VALUE;
    }

    public static void e(OkHttpClient okHttpClient, Route failedRoute, IOException failure) {
        Intrinsics.h(failedRoute, "failedRoute");
        Intrinsics.h(failure, "failure");
        if (failedRoute.b.type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.f26694a;
            address.g.connectFailed(address.h.l(), failedRoute.b.address(), failure);
        }
        RouteDatabase routeDatabase = okHttpClient.C;
        synchronized (routeDatabase) {
            routeDatabase.f26719a.add(failedRoute);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: a, reason: from getter */
    public final Route getG() {
        return this.g;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Connection http2Connection, Settings settings) {
        Intrinsics.h(settings, "settings");
        synchronized (this) {
            try {
                int i = this.v;
                int i2 = (settings.f26747a & 8) != 0 ? settings.b[3] : Integer.MAX_VALUE;
                this.v = i2;
                if (i2 < i) {
                    RealConnectionPool realConnectionPool = this.f;
                    Address address = this.g.f26694a;
                    realConnectionPool.getClass();
                    Intrinsics.h(address, "address");
                    RealConnectionPool.AddressState addressState = (RealConnectionPool.AddressState) realConnectionPool.addressStates.get(address);
                    if (addressState != null) {
                        realConnectionPool.b(addressState);
                        throw null;
                    }
                } else if (i2 > i) {
                    RealConnectionPool realConnectionPool2 = this.f;
                    realConnectionPool2.e.c(realConnectionPool2.f, 0L);
                }
            } finally {
            }
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void c() {
        synchronized (this) {
            this.q = true;
        }
        this.o.getClass();
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() throws IOException {
        _UtilJvmKt.c(this.h);
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void d(Http2Stream http2Stream) {
        http2Stream.c(ErrorCode.j, null);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void f(RealCall realCall, IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.p != null) || (iOException instanceof ConnectionShutdownException)) {
                        z = !this.q;
                        this.q = true;
                        if (this.t == 0) {
                            if (iOException != null) {
                                e(realCall.d, this.g, iOException);
                            }
                            this.s++;
                        }
                    }
                } else if (((StreamResetException) iOException).d == ErrorCode.j) {
                    int i = this.u + 1;
                    this.u = i;
                    if (i > 1) {
                        z = !this.q;
                        this.q = true;
                        this.s++;
                    }
                } else if (((StreamResetException) iOException).d != ErrorCode.k || !realCall.s) {
                    z = !this.q;
                    this.q = true;
                    this.s++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.o.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(okhttp3.Address r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.g(okhttp3.Address, java.util.List):boolean");
    }

    public final boolean h(boolean z) throws SocketException {
        long j;
        TimeZone timeZone = _UtilJvmKt.f26699a;
        long jNanoTime = System.nanoTime();
        if (this.h.isClosed() || this.i.isClosed() || this.i.isInputShutdown() || this.i.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.p;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.i) {
                    return false;
                }
                if (http2Connection.r < http2Connection.q) {
                    if (jNanoTime >= http2Connection.s) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.x;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.i;
        BufferedSource source = this.l;
        Intrinsics.h(socket, "<this>");
        Intrinsics.h(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.X1();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void i() throws SocketException {
        this.x = System.nanoTime();
        Protocol protocol = this.k;
        if (protocol == Protocol.i || protocol == Protocol.j) {
            this.i.setSoTimeout(0);
            Object obj = this.o;
            FlowControlListener flowControlListener = obj instanceof FlowControlListener ? (FlowControlListener) obj : null;
            if (flowControlListener == null) {
                flowControlListener = FlowControlListener.None.f26735a;
            }
            Http2Connection.Builder builder = new Http2Connection.Builder(this.e);
            Socket socket = this.i;
            String peerName = this.g.f26694a.h.d;
            BufferedSource source = this.l;
            BufferedSink sink = this.m;
            Intrinsics.h(socket, "socket");
            Intrinsics.h(peerName, "peerName");
            Intrinsics.h(source, "source");
            Intrinsics.h(sink, "sink");
            builder.b = socket;
            String str = _UtilJvmKt.b + ' ' + peerName;
            Intrinsics.h(str, "<set-?>");
            builder.c = str;
            builder.d = source;
            builder.e = sink;
            builder.f = this;
            builder.h = this.n;
            Intrinsics.h(flowControlListener, "flowControlListener");
            builder.i = flowControlListener;
            Http2Connection http2Connection = new Http2Connection(builder);
            this.p = http2Connection;
            Http2Connection.D.getClass();
            Settings settings = Http2Connection.E;
            this.v = (settings.f26747a & 8) != 0 ? settings.b[3] : Integer.MAX_VALUE;
            Http2Writer http2Writer = http2Connection.A;
            synchronized (http2Writer) {
                try {
                    if (http2Writer.g) {
                        throw new IOException("closed");
                    }
                    Logger logger = Http2Writer.i;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(_UtilJvmKt.d(">> CONNECTION " + Http2.b.d(), new Object[0]));
                    }
                    http2Writer.d.S0(Http2.b);
                    http2Writer.d.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Http2Writer http2Writer2 = http2Connection.A;
            Settings settings2 = http2Connection.u;
            http2Writer2.getClass();
            Intrinsics.h(settings2, "settings");
            synchronized (http2Writer2) {
                try {
                    if (http2Writer2.g) {
                        throw new IOException("closed");
                    }
                    http2Writer2.b(0, Integer.bitCount(settings2.f26747a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & settings2.f26747a) == 0) {
                            z = false;
                        }
                        if (z) {
                            http2Writer2.d.writeShort(i);
                            http2Writer2.d.writeInt(settings2.b[i]);
                        }
                    }
                    http2Writer2.d.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (http2Connection.u.a() != 65535) {
                http2Connection.A.E(0, r2 - Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            }
            TaskQueue.b(http2Connection.j.d(), http2Connection.f, 0L, http2Connection.B, 6);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        Route route = this.g;
        sb.append(route.f26694a.h.d);
        sb.append(':');
        sb.append(route.f26694a.h.e);
        sb.append(", proxy=");
        sb.append(route.b);
        sb.append(" hostAddress=");
        sb.append(route.c);
        sb.append(" cipherSuite=");
        Handshake handshake = this.j;
        if (handshake == null || (obj = handshake.b) == null) {
            obj = DevicePublicKeyStringDef.NONE;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.k);
        sb.append('}');
        return sb.toString();
    }
}

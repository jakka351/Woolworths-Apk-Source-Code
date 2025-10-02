package okhttp3.internal.ws;

import androidx.camera.core.impl.b;
import androidx.compose.ui.platform.i;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloWebSocketClosedException;
import com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$webSocket$1;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$schedule$2;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnection$newWebSocketStreams$1;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.d;
import okhttp3.internal.ws.RealWebSocket.WriterTask;
import okhttp3.internal.ws.WebSocketExtensions;
import okhttp3.internal.ws.WebSocketReader;
import okio.Base64;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/concurrent/Lockable;", "Message", "Close", "Streams", "WriterTask", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {
    public static final List B;
    public boolean A;
    public final Request d;
    public final DefaultWebSocketEngine$open$webSocket$1 e;
    public final Random f;
    public final long g;
    public WebSocketExtensions h;
    public final long i;
    public final long j;
    public final String k;
    public RealCall l;
    public Task m;
    public WebSocketReader n;
    public WebSocketWriter o;
    public final TaskQueue p;
    public String q;
    public RealConnection$newWebSocketStreams$1 r;
    public final ArrayDeque s;
    public final ArrayDeque t;
    public long u;
    public boolean v;
    public int w;
    public String x;
    public boolean y;
    public int z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Close {

        /* renamed from: a, reason: collision with root package name */
        public final int f26770a;
        public final ByteString b;
        public final long c;

        public Close(int i, long j, ByteString byteString) {
            this.f26770a = i;
            this.b = byteString;
            this.c = j;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "<init>", "()V", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "MAX_QUEUE_SIZE", "", "CANCEL_AFTER_CLOSE_MILLIS", "DEFAULT_MINIMUM_DEFLATE_SIZE", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Message {

        /* renamed from: a, reason: collision with root package name */
        public final int f26771a;
        public final ByteString b;

        public Message(int i, ByteString data) {
            Intrinsics.h(data, "data");
            this.f26771a = i;
            this.b = data;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Streams implements Closeable {
        public final BufferedSource d;
        public final BufferedSink e;

        public Streams(BufferedSource source, BufferedSink sink) {
            Intrinsics.h(source, "source");
            Intrinsics.h(sink, "sink");
            this.d = source;
            this.e = sink;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class WriterTask extends Task {
        public WriterTask() {
            super(YU.a.o(new StringBuilder(), RealWebSocket.this.q, " writer"), true);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            RealWebSocket realWebSocket = RealWebSocket.this;
            try {
                return realWebSocket.o() ? 0L : -1L;
            } catch (IOException e) {
                RealWebSocket.k(realWebSocket, e, null, 2);
                return -1L;
            }
        }
    }

    static {
        new Companion(0);
        B = CollectionsKt.Q(Protocol.g);
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, DefaultWebSocketEngine$open$webSocket$1 defaultWebSocketEngine$open$webSocket$1, Random random, long j, long j2, long j3) {
        Intrinsics.h(taskRunner, "taskRunner");
        this.d = request;
        this.e = defaultWebSocketEngine$open$webSocket$1;
        this.f = random;
        this.g = j;
        this.h = null;
        this.i = j2;
        this.j = j3;
        this.p = taskRunner.d();
        this.s = new ArrayDeque();
        this.t = new ArrayDeque();
        this.w = -1;
        String str = request.b;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(YU.a.A("Request must be GET: ", str).toString());
        }
        ByteString byteString = ByteString.g;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.k = Base64.b(ByteString.Companion.d(bArr).data, Base64.f26779a);
    }

    public static void k(RealWebSocket realWebSocket, Exception exc, Response response, int i) {
        boolean z = (i & 4) == 0;
        realWebSocket.getClass();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        synchronized (realWebSocket) {
            try {
                if (realWebSocket.y) {
                    return;
                }
                realWebSocket.y = true;
                RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$1 = realWebSocket.r;
                WebSocketWriter webSocketWriter = realWebSocket.o;
                objectRef2.d = webSocketWriter;
                RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$12 = null;
                realWebSocket.o = null;
                if (webSocketWriter != null && realWebSocket.n == null) {
                    realConnection$newWebSocketStreams$12 = realConnection$newWebSocketStreams$1;
                }
                objectRef.d = realConnection$newWebSocketStreams$12;
                if (!z && objectRef2.d != null) {
                    TaskQueue.b(realWebSocket.p, realWebSocket.q + " writer close", 0L, new coil3.gif.a(13, objectRef2, objectRef), 2);
                }
                realWebSocket.p.f();
                try {
                    DefaultWebSocketEngine$open$webSocket$1 defaultWebSocketEngine$open$webSocket$1 = realWebSocket.e;
                    defaultWebSocketEngine$open$webSocket$1.f13635a.h(Unit.f24250a);
                    defaultWebSocketEngine$open$webSocket$1.b.l(new ApolloNetworkException("Web socket communication error", exc), false);
                    if (realConnection$newWebSocketStreams$1 != null) {
                        realConnection$newWebSocketStreams$1.cancel();
                    }
                    if (z) {
                        WebSocketWriter webSocketWriter2 = (WebSocketWriter) objectRef2.d;
                        if (webSocketWriter2 != null) {
                            _UtilCommonKt.b(webSocketWriter2);
                        }
                        Streams streams = (Streams) objectRef.d;
                        if (streams != null) {
                            _UtilCommonKt.b(streams);
                        }
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean a(ByteString bytes) {
        Intrinsics.h(bytes, "bytes");
        return n(2, bytes);
    }

    @Override // okhttp3.WebSocket
    public final boolean b(String str) {
        ByteString byteString = ByteString.g;
        return n(1, ByteString.Companion.b(str));
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void c(ByteString payload) {
        try {
            Intrinsics.h(payload, "payload");
            if (!this.y && (!this.v || !this.t.isEmpty())) {
                this.s.add(payload);
                m();
            }
        } finally {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void d(ByteString payload) {
        Intrinsics.h(payload, "payload");
        this.A = false;
    }

    @Override // okhttp3.WebSocket
    public final boolean e(int i, String str) {
        ByteString byteStringB;
        long j = this.j;
        synchronized (this) {
            try {
                WebSocketProtocol.f26773a.getClass();
                String strA = WebSocketProtocol.a(i);
                if (strA != null) {
                    throw new IllegalArgumentException(strA.toString());
                }
                if (str != null) {
                    ByteString byteString = ByteString.g;
                    byteStringB = ByteString.Companion.b(str);
                    if (byteStringB.data.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                } else {
                    byteStringB = null;
                }
                if (!this.y && !this.v) {
                    this.v = true;
                    this.t.add(new Close(i, j, byteStringB));
                    m();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void f(int i, String str) {
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            if (this.w != -1) {
                throw new IllegalStateException("already closed");
            }
            this.w = i;
            this.x = str;
        }
        DefaultWebSocketEngine$open$webSocket$1 defaultWebSocketEngine$open$webSocket$1 = this.e;
        defaultWebSocketEngine$open$webSocket$1.f13635a.h(Unit.f24250a);
        defaultWebSocketEngine$open$webSocket$1.b.l(new ApolloWebSocketClosedException("WebSocket Closed code='" + i + "' reason='" + str + '\'', null), false);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void g(ByteString bytes) {
        Intrinsics.h(bytes, "bytes");
        this.e.b.k(bytes.y());
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void h(String str) {
        this.e.b.k(str);
    }

    public final void i(Response response, Exchange exchange) throws ProtocolException {
        int i = response.g;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(b.r(sb, response.f, '\''));
        }
        String strB = Response.b("Connection", response);
        if (!"Upgrade".equalsIgnoreCase(strB)) {
            throw new ProtocolException(i.a('\'', "Expected 'Connection' header value 'Upgrade' but was '", strB));
        }
        String strB2 = Response.b("Upgrade", response);
        if (!"websocket".equalsIgnoreCase(strB2)) {
            throw new ProtocolException(i.a('\'', "Expected 'Upgrade' header value 'websocket' but was '", strB2));
        }
        String strB3 = Response.b("Sec-WebSocket-Accept", response);
        ByteString byteString = ByteString.g;
        String strB4 = Base64.b(ByteString.Companion.b(this.k + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").b(McElieceCCA2KeyGenParameterSpec.SHA1).data, Base64.f26779a);
        if (strB4.equals(strB3)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strB4 + "' but was '" + strB3 + '\'');
    }

    public final void j(OkHttpClient okHttpClient) {
        Request request = this.d;
        if (request.c.b("Sec-WebSocket-Extensions") != null) {
            k(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return;
        }
        OkHttpClient.Builder builderC = okHttpClient.c();
        EventListener$Companion$NONE$1 eventListener = EventListener.f26679a;
        Intrinsics.h(eventListener, "eventListener");
        builderC.e = new androidx.compose.runtime.snapshots.a(eventListener, 13);
        List protocols = B;
        Intrinsics.h(protocols, "protocols");
        ArrayList arrayListJ0 = CollectionsKt.J0(protocols);
        Protocol protocol = Protocol.j;
        if (!arrayListJ0.contains(protocol) && !arrayListJ0.contains(Protocol.g)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListJ0).toString());
        }
        if (arrayListJ0.contains(protocol) && arrayListJ0.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListJ0).toString());
        }
        if (arrayListJ0.contains(Protocol.f)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListJ0).toString());
        }
        if (arrayListJ0.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayListJ0.remove(Protocol.h);
        if (!arrayListJ0.equals(builderC.t)) {
            builderC.D = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayListJ0);
        Intrinsics.g(listUnmodifiableList, "unmodifiableList(...)");
        builderC.t = listUnmodifiableList;
        OkHttpClient okHttpClient2 = new OkHttpClient(builderC);
        Request.Builder builderB = request.b();
        builderB.c("Upgrade", "websocket");
        builderB.c("Connection", "Upgrade");
        builderB.c("Sec-WebSocket-Key", this.k);
        builderB.c("Sec-WebSocket-Version", "13");
        builderB.c("Sec-WebSocket-Extensions", "permessage-deflate");
        final Request request2 = new Request(builderB);
        RealCall realCall = new RealCall(okHttpClient2, request2, true);
        this.l = realCall;
        realCall.U1(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public final void onFailure(Call call, IOException iOException) {
                RealWebSocket.k(this.d, iOException, null, 6);
            }

            @Override // okhttp3.Callback
            public final void onResponse(Call call, Response response) throws SocketException {
                long j;
                Exchange exchange = response.p;
                int i = 4;
                try {
                    this.d.i(response, exchange);
                    RealCall realCall2 = exchange.f26713a;
                    if (realCall2.n) {
                        j = 0;
                        try {
                            throw new IllegalStateException("Check failed.");
                        } catch (IOException e) {
                            e = e;
                            RealWebSocket.k(this.d, e, response, 4);
                            _UtilCommonKt.b(response);
                            if (exchange != null) {
                                Exchange.b(exchange, j, null, 1);
                                return;
                            }
                            return;
                        }
                    }
                    realCall2.n = true;
                    realCall2.i.k();
                    ExchangeCodec.Carrier carrierI = exchange.d.i();
                    Intrinsics.f(carrierI, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
                    RealConnection realConnection = (RealConnection) carrierI;
                    int i2 = 0;
                    realConnection.i.setSoTimeout(0);
                    realConnection.c();
                    RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$1 = new RealConnection$newWebSocketStreams$1(exchange, realConnection.l, realConnection.m);
                    WebSocketExtensions.Companion companion = WebSocketExtensions.g;
                    Headers headers = response.i;
                    companion.getClass();
                    int size = headers.size();
                    Integer numI0 = null;
                    Integer numI02 = null;
                    int i3 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (i3 < size) {
                        if (headers.d(i3).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                            String strI = headers.i(i3);
                            int i4 = i2;
                            while (i4 < strI.length()) {
                                int iG = _UtilCommonKt.g(strI, ',', i4, i2, i);
                                int iF = _UtilCommonKt.f(strI, ';', i4, iG);
                                String strR = _UtilCommonKt.r(i4, iF, strI);
                                int i5 = iF + 1;
                                if (strR.equalsIgnoreCase("permessage-deflate")) {
                                    if (z) {
                                        z4 = true;
                                    }
                                    i4 = i5;
                                    while (i4 < iG) {
                                        int iF2 = _UtilCommonKt.f(strI, ';', i4, iG);
                                        int iF3 = _UtilCommonKt.f(strI, '=', i4, iF2);
                                        String strR2 = _UtilCommonKt.r(i4, iF3, strI);
                                        String strO = iF3 < iF2 ? StringsKt.O(_UtilCommonKt.r(iF3 + 1, iF2, strI), "\"", "\"") : null;
                                        int i6 = iF2 + 1;
                                        if (strR2.equalsIgnoreCase("client_max_window_bits")) {
                                            if (numI0 != null) {
                                                z4 = true;
                                            }
                                            numI0 = strO != null ? StringsKt.i0(strO) : null;
                                            if (numI0 == null) {
                                                i4 = i6;
                                                z4 = true;
                                            } else {
                                                i4 = i6;
                                            }
                                        } else if (strR2.equalsIgnoreCase("client_no_context_takeover")) {
                                            if (z2) {
                                                z4 = true;
                                            }
                                            if (strO != null) {
                                                z4 = true;
                                            }
                                            i4 = i6;
                                            z2 = true;
                                        } else {
                                            if (strR2.equalsIgnoreCase("server_max_window_bits")) {
                                                if (numI02 != null) {
                                                    z4 = true;
                                                }
                                                numI02 = strO != null ? StringsKt.i0(strO) : null;
                                                if (numI02 != null) {
                                                    i4 = i6;
                                                }
                                            } else if (strR2.equalsIgnoreCase("server_no_context_takeover")) {
                                                if (z3) {
                                                    z4 = true;
                                                }
                                                if (strO != null) {
                                                    z4 = true;
                                                }
                                                i4 = i6;
                                                z3 = true;
                                            }
                                            i4 = i6;
                                            z4 = true;
                                        }
                                    }
                                    z = true;
                                } else {
                                    z4 = true;
                                    i4 = i5;
                                }
                                i = 4;
                                i2 = 0;
                            }
                        }
                        i3++;
                        i = 4;
                        i2 = 0;
                    }
                    this.d.h = new WebSocketExtensions(z, numI0, z2, numI02, z3, z4);
                    if (z4 || numI0 != null || (numI02 != null && !new IntRange(8, 15, 1).g(numI02.intValue()))) {
                        RealWebSocket realWebSocket = this.d;
                        synchronized (realWebSocket) {
                            realWebSocket.t.clear();
                            realWebSocket.e(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    String name = _UtilJvmKt.b + " WebSocket " + request2.f26690a.k();
                    final RealWebSocket realWebSocket2 = this.d;
                    Intrinsics.h(name, "name");
                    WebSocketExtensions webSocketExtensions = realWebSocket2.h;
                    Intrinsics.e(webSocketExtensions);
                    synchronized (realWebSocket2) {
                        try {
                            realWebSocket2.q = name;
                            realWebSocket2.r = realConnection$newWebSocketStreams$1;
                            realWebSocket2.o = new WebSocketWriter(realConnection$newWebSocketStreams$1.e, realWebSocket2.f, webSocketExtensions.f26772a, webSocketExtensions.c, realWebSocket2.i);
                            realWebSocket2.m = realWebSocket2.new WriterTask();
                            long j2 = realWebSocket2.g;
                            if (j2 != 0) {
                                final long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
                                TaskQueue taskQueue = realWebSocket2.p;
                                String name2 = name.concat(" ping");
                                Function0 function0 = new Function0() { // from class: okhttp3.internal.ws.a
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        WebSocketWriter webSocketWriter;
                                        RealWebSocket realWebSocket3 = realWebSocket2;
                                        long j3 = nanos;
                                        List list = RealWebSocket.B;
                                        synchronized (realWebSocket3) {
                                            try {
                                                if (!realWebSocket3.y && (webSocketWriter = realWebSocket3.o) != null) {
                                                    int i7 = realWebSocket3.A ? realWebSocket3.z : -1;
                                                    realWebSocket3.z++;
                                                    realWebSocket3.A = true;
                                                    if (i7 != -1) {
                                                        StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                                        sb.append(realWebSocket3.g);
                                                        sb.append("ms (after ");
                                                        RealWebSocket.k(realWebSocket3, new SocketTimeoutException(YU.a.m(sb, i7 - 1, " successful ping/pongs)")), null, 2);
                                                    } else {
                                                        try {
                                                            ByteString payload = ByteString.g;
                                                            Intrinsics.h(payload, "payload");
                                                            webSocketWriter.a(9, payload);
                                                        } catch (IOException e2) {
                                                            RealWebSocket.k(realWebSocket3, e2, null, 2);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return Long.valueOf(j3);
                                    }
                                };
                                taskQueue.getClass();
                                Intrinsics.h(name2, "name");
                                taskQueue.c(new TaskQueue$schedule$2(name2, function0), nanos);
                            }
                            if (!realWebSocket2.t.isEmpty()) {
                                realWebSocket2.m();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    realWebSocket2.n = new WebSocketReader(realConnection$newWebSocketStreams$1.d, realWebSocket2, webSocketExtensions.f26772a, webSocketExtensions.e);
                    RealWebSocket realWebSocket3 = this.d;
                    try {
                        realWebSocket3.e.f13635a.h(Unit.f24250a);
                        while (realWebSocket3.w == -1) {
                            WebSocketReader webSocketReader = realWebSocket3.n;
                            Intrinsics.e(webSocketReader);
                            webSocketReader.a();
                        }
                    } catch (Exception e2) {
                        RealWebSocket.k(realWebSocket3, e2, null, 6);
                    } finally {
                        realWebSocket3.l();
                    }
                } catch (IOException e3) {
                    e = e3;
                    j = 0;
                }
            }
        });
    }

    public final void l() {
        boolean z;
        String str;
        WebSocketReader webSocketReader;
        RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$1;
        synchronized (this) {
            try {
                z = this.y;
                str = this.x;
                webSocketReader = this.n;
                this.n = null;
                if (this.v && this.t.isEmpty()) {
                    WebSocketWriter webSocketWriter = this.o;
                    if (webSocketWriter != null) {
                        this.o = null;
                        TaskQueue.b(this.p, this.q + " writer close", 0L, new d(webSocketWriter, 2), 2);
                    }
                    this.p.f();
                }
                realConnection$newWebSocketStreams$1 = this.o == null ? this.r : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z && realConnection$newWebSocketStreams$1 != null && this.w != -1) {
            DefaultWebSocketEngine$open$webSocket$1 defaultWebSocketEngine$open$webSocket$1 = this.e;
            Intrinsics.e(str);
            defaultWebSocketEngine$open$webSocket$1.a(this, str);
        }
        if (webSocketReader != null) {
            _UtilCommonKt.b(webSocketReader);
        }
        if (realConnection$newWebSocketStreams$1 != null) {
            _UtilCommonKt.b(realConnection$newWebSocketStreams$1);
        }
    }

    public final void m() {
        TimeZone timeZone = _UtilJvmKt.f26699a;
        Task task = this.m;
        if (task != null) {
            this.p.c(task, 0L);
        }
    }

    public final synchronized boolean n(int i, ByteString byteString) {
        if (!this.y && !this.v) {
            if (this.u + byteString.c() > llqqqql.c0063cc006300630063) {
                e(1001, null);
                return false;
            }
            this.u += byteString.c();
            this.t.add(new Message(i, byteString));
            m();
            return true;
        }
        return false;
    }

    public final boolean o() {
        RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$1;
        WebSocketWriter webSocketWriter;
        String str;
        synchronized (this) {
            try {
                if (this.y) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.o;
                Object objPoll = this.s.poll();
                Object obj = null;
                realConnection$newWebSocketStreams$1 = null;
                RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$12 = null;
                if (objPoll == null) {
                    Object objPoll2 = this.t.poll();
                    if (objPoll2 instanceof Close) {
                        int i = this.w;
                        str = this.x;
                        if (i != -1) {
                            WebSocketWriter webSocketWriter3 = this.o;
                            this.o = null;
                            if (webSocketWriter3 != null && this.n == null) {
                                realConnection$newWebSocketStreams$12 = this.r;
                            }
                            this.p.f();
                            webSocketWriter = webSocketWriter3;
                            realConnection$newWebSocketStreams$1 = realConnection$newWebSocketStreams$12;
                            obj = objPoll2;
                        } else {
                            long j = ((Close) objPoll2).c;
                            TaskQueue.b(this.p, this.q + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new d(this, 1), 4);
                            realConnection$newWebSocketStreams$1 = null;
                            obj = objPoll2;
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        realConnection$newWebSocketStreams$1 = null;
                        str = null;
                        obj = objPoll2;
                        webSocketWriter = null;
                    }
                } else {
                    realConnection$newWebSocketStreams$1 = null;
                    webSocketWriter = null;
                    str = null;
                }
                try {
                    if (objPoll != null) {
                        Intrinsics.e(webSocketWriter2);
                        webSocketWriter2.a(10, (ByteString) objPoll);
                    } else if (obj instanceof Message) {
                        Message message = (Message) obj;
                        Intrinsics.e(webSocketWriter2);
                        webSocketWriter2.b(message.f26771a, message.b);
                        synchronized (this) {
                            this.u -= message.b.c();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        Intrinsics.e(webSocketWriter2);
                        int i2 = close.f26770a;
                        ByteString byteString = close.b;
                        ByteString byteStringP0 = ByteString.g;
                        if (i2 != 0 || byteString != null) {
                            if (i2 != 0) {
                                WebSocketProtocol.f26773a.getClass();
                                String strA = WebSocketProtocol.a(i2);
                                if (strA != null) {
                                    throw new IllegalArgumentException(strA.toString());
                                }
                            }
                            Buffer buffer = new Buffer();
                            buffer.k0(i2);
                            if (byteString != null) {
                                buffer.T(byteString);
                            }
                            byteStringP0 = buffer.p0(buffer.e);
                        }
                        try {
                            webSocketWriter2.a(8, byteStringP0);
                            if (realConnection$newWebSocketStreams$1 != null) {
                                DefaultWebSocketEngine$open$webSocket$1 defaultWebSocketEngine$open$webSocket$1 = this.e;
                                Intrinsics.e(str);
                                defaultWebSocketEngine$open$webSocket$1.a(this, str);
                            }
                        } finally {
                            webSocketWriter2.k = true;
                        }
                    }
                    return true;
                } finally {
                    if (webSocketWriter != null) {
                        _UtilCommonKt.b(webSocketWriter);
                    }
                    if (realConnection$newWebSocketStreams$1 != null) {
                        _UtilCommonKt.b(realConnection$newWebSocketStreams$1);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

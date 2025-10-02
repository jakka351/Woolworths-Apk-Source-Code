package io.grpc.okhttp;

import YU.a;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import io.grpc.Attributes;
import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.Grpc;
import io.grpc.HttpConnectProxiedSocketAddress;
import io.grpc.InternalChannelz;
import io.grpc.InternalLogId;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.SecurityLevel;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StreamTracer;
import io.grpc.internal.ClientStream;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.ClientTransport;
import io.grpc.internal.ConnectionClientTransport;
import io.grpc.internal.GrpcAttributes;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.Http2Ping;
import io.grpc.internal.InUseStateAggregator;
import io.grpc.internal.KeepAliveManager;
import io.grpc.internal.ManagedClientTransport;
import io.grpc.internal.SerializingExecutor;
import io.grpc.internal.StatsTraceContext;
import io.grpc.internal.TransportTracer;
import io.grpc.okhttp.AsyncSink;
import io.grpc.okhttp.AsyncSink.LimitControlFramesWriter;
import io.grpc.okhttp.ExceptionHandlingFrameWriter;
import io.grpc.okhttp.OkHttpChannelBuilder;
import io.grpc.okhttp.OkHttpClientStream;
import io.grpc.okhttp.OkHttpFrameLogger;
import io.grpc.okhttp.OutboundFlowController;
import io.grpc.okhttp.OutboundFlowController.StreamState;
import io.grpc.okhttp.internal.ConnectionSpec;
import io.grpc.okhttp.internal.StatusLine;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.FrameReader;
import io.grpc.okhttp.internal.framed.Http2;
import io.grpc.okhttp.internal.framed.Settings;
import io.grpc.okhttp.internal.proxy.HttpUrl;
import io.grpc.okhttp.internal.proxy.Request;
import io.perfmark.PerfMark;
import io.perfmark.Tag;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okio.AsyncTimeout$source$1;
import okio.Buffer;
import okio.ByteString;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes7.dex */
class OkHttpClientTransport implements ConnectionClientTransport, ExceptionHandlingFrameWriter.TransportExceptionHandler, OutboundFlowController.Transport {
    public static final Map P;
    public static final Logger Q;
    public final SocketFactory A;
    public final SSLSocketFactory B;
    public int C;
    public final LinkedList D;
    public final ConnectionSpec E;
    public KeepAliveManager F;
    public boolean G;
    public long H;
    public long I;
    public final Runnable J;
    public final int K;
    public final TransportTracer L;
    public final InUseStateAggregator M;
    public final HttpConnectProxiedSocketAddress N;
    public final int O;

    /* renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f24122a;
    public final String b;
    public final String c;
    public final Random d;
    public final Supplier e;
    public final int f;
    public final Http2 g;
    public ManagedClientTransport.Listener h;
    public ExceptionHandlingFrameWriter i;
    public OutboundFlowController j;
    public final Object k;
    public final InternalLogId l;
    public int m;
    public final HashMap n;
    public final Executor o;
    public final SerializingExecutor p;
    public final ScheduledExecutorService q;
    public final int r;
    public int s;
    public ClientFrameHandler t;
    public Attributes u;
    public Status v;
    public boolean w;
    public Http2Ping x;
    public boolean y;
    public boolean z;

    /* renamed from: io.grpc.okhttp.OkHttpClientTransport$2, reason: invalid class name */
    class AnonymousClass2 implements TransportTracer.FlowControlReader {
    }

    public class ClientFrameHandler implements FrameReader.Handler, Runnable {
        public final OkHttpFrameLogger d;
        public final FrameReader e;
        public boolean f;

        public ClientFrameHandler(FrameReader frameReader) {
            Level level = Level.FINE;
            this.d = new OkHttpFrameLogger();
            this.f = true;
            this.e = frameReader;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void E(int r8, long r9) {
            /*
                r7 = this;
                io.grpc.okhttp.OkHttpFrameLogger r0 = r7.d
                io.grpc.okhttp.OkHttpFrameLogger$Direction r1 = io.grpc.okhttp.OkHttpFrameLogger.Direction.d
                r0.g(r1, r8, r9)
                r0 = 0
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 != 0) goto L2a
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L17
                io.grpc.okhttp.OkHttpClientTransport r8 = io.grpc.okhttp.OkHttpClientTransport.this
                io.grpc.okhttp.OkHttpClientTransport.h(r8, r9)
                return
            L17:
                io.grpc.okhttp.OkHttpClientTransport r0 = io.grpc.okhttp.OkHttpClientTransport.this
                io.grpc.Status r10 = io.grpc.Status.m
                io.grpc.Status r2 = r10.i(r9)
                io.grpc.internal.ClientStreamListener$RpcProgress r3 = io.grpc.internal.ClientStreamListener.RpcProgress.d
                io.grpc.okhttp.internal.framed.ErrorCode r5 = io.grpc.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR
                r6 = 0
                r4 = 0
                r1 = r8
                r0.k(r1, r2, r3, r4, r5, r6)
                return
            L2a:
                r1 = r8
                io.grpc.okhttp.OkHttpClientTransport r8 = io.grpc.okhttp.OkHttpClientTransport.this
                java.lang.Object r8 = r8.k
                monitor-enter(r8)
                if (r1 != 0) goto L40
                io.grpc.okhttp.OkHttpClientTransport r0 = io.grpc.okhttp.OkHttpClientTransport.this     // Catch: java.lang.Throwable -> L3d
                io.grpc.okhttp.OutboundFlowController r0 = r0.j     // Catch: java.lang.Throwable -> L3d
                r1 = 0
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L3d
                r0.b(r1, r9)     // Catch: java.lang.Throwable -> L3d
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L3d
                return
            L3d:
                r0 = move-exception
                r9 = r0
                goto L7f
            L40:
                io.grpc.okhttp.OkHttpClientTransport r0 = io.grpc.okhttp.OkHttpClientTransport.this     // Catch: java.lang.Throwable -> L3d
                java.util.HashMap r0 = r0.n     // Catch: java.lang.Throwable -> L3d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3d
                java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L3d
                io.grpc.okhttp.OkHttpClientStream r0 = (io.grpc.okhttp.OkHttpClientStream) r0     // Catch: java.lang.Throwable -> L3d
                if (r0 == 0) goto L65
                io.grpc.okhttp.OkHttpClientTransport r2 = io.grpc.okhttp.OkHttpClientTransport.this     // Catch: java.lang.Throwable -> L3d
                io.grpc.okhttp.OutboundFlowController r2 = r2.j     // Catch: java.lang.Throwable -> L3d
                io.grpc.okhttp.OkHttpClientStream$TransportState r0 = r0.l     // Catch: java.lang.Throwable -> L3d
                java.lang.Object r3 = r0.x     // Catch: java.lang.Throwable -> L3d
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L3d
                io.grpc.okhttp.OutboundFlowController$StreamState r0 = r0.K     // Catch: java.lang.Throwable -> L61
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L61
                int r9 = (int) r9
                r2.b(r0, r9)     // Catch: java.lang.Throwable -> L3d
                goto L6f
            L61:
                r0 = move-exception
                r9 = r0
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L61
                throw r9     // Catch: java.lang.Throwable -> L3d
            L65:
                io.grpc.okhttp.OkHttpClientTransport r9 = io.grpc.okhttp.OkHttpClientTransport.this     // Catch: java.lang.Throwable -> L3d
                boolean r9 = r9.n(r1)     // Catch: java.lang.Throwable -> L3d
                if (r9 != 0) goto L6f
                r9 = 1
                goto L70
            L6f:
                r9 = 0
            L70:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L3d
                if (r9 == 0) goto L7e
                io.grpc.okhttp.OkHttpClientTransport r8 = io.grpc.okhttp.OkHttpClientTransport.this
                java.lang.String r9 = "Received window_update for unknown stream: "
                java.lang.String r9 = YU.a.d(r1, r9)
                io.grpc.okhttp.OkHttpClientTransport.h(r8, r9)
            L7e:
                return
            L7f:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L3d
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.OkHttpClientTransport.ClientFrameHandler.E(int, long):void");
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void J(int i, int i2, boolean z) {
            Http2Ping http2Ping;
            long j = (i << 32) | (i2 & 4294967295L);
            this.d.d(OkHttpFrameLogger.Direction.d, j);
            if (!z) {
                synchronized (OkHttpClientTransport.this.k) {
                    OkHttpClientTransport.this.i.J(i, i2, true);
                }
                return;
            }
            synchronized (OkHttpClientTransport.this.k) {
                try {
                    OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
                    http2Ping = okHttpClientTransport.x;
                    if (http2Ping != null) {
                        long j2 = http2Ping.f24020a;
                        if (j2 == j) {
                            okHttpClientTransport.x = null;
                        } else {
                            Logger logger = OkHttpClientTransport.Q;
                            Level level = Level.WARNING;
                            Locale locale = Locale.US;
                            logger.log(level, "Received unexpected ping ack. Expecting " + j2 + ", got " + j);
                        }
                    } else {
                        OkHttpClientTransport.Q.warning("Received unexpected ping ack. No ping outstanding");
                    }
                    http2Ping = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (http2Ping != null) {
                http2Ping.b();
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void M(int i, ErrorCode errorCode) {
            this.d.e(OkHttpFrameLogger.Direction.d, i, errorCode);
            Status statusB = OkHttpClientTransport.w(errorCode).b("Rst Stream");
            Status.Code code = statusB.f23971a;
            boolean z = code == Status.Code.CANCELLED || code == Status.Code.DEADLINE_EXCEEDED;
            synchronized (OkHttpClientTransport.this.k) {
                try {
                    OkHttpClientStream okHttpClientStream = (OkHttpClientStream) OkHttpClientTransport.this.n.get(Integer.valueOf(i));
                    if (okHttpClientStream != null) {
                        Tag tag = okHttpClientStream.l.J;
                        PerfMark.b();
                        OkHttpClientTransport.this.k(i, statusB, errorCode == ErrorCode.REFUSED_STREAM ? ClientStreamListener.RpcProgress.e : ClientStreamListener.RpcProgress.d, z, null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void N(boolean r9, int r10, java.util.ArrayList r11) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.OkHttpClientTransport.ClientFrameHandler.N(boolean, int, java.util.ArrayList):void");
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void O(boolean z, int i, RealBufferedSource realBufferedSource, int i2, int i3) throws EOFException {
            OkHttpClientStream okHttpClientStream;
            this.d.b(OkHttpFrameLogger.Direction.d, i, realBufferedSource.e, i2, z);
            OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
            synchronized (okHttpClientTransport.k) {
                okHttpClientStream = (OkHttpClientStream) okHttpClientTransport.n.get(Integer.valueOf(i));
            }
            if (okHttpClientStream != null) {
                long j = i2;
                realBufferedSource.I1(j);
                Buffer buffer = new Buffer();
                buffer.w1(realBufferedSource.e, j);
                Tag tag = okHttpClientStream.l.J;
                PerfMark.b();
                synchronized (OkHttpClientTransport.this.k) {
                    okHttpClientStream.l.r(i3 - i2, buffer, z);
                }
            } else {
                if (!OkHttpClientTransport.this.n(i)) {
                    OkHttpClientTransport.h(OkHttpClientTransport.this, a.d(i, "Received data for unknown stream: "));
                    return;
                }
                synchronized (OkHttpClientTransport.this.k) {
                    OkHttpClientTransport.this.i.M(i, ErrorCode.STREAM_CLOSED);
                }
                realBufferedSource.skip(i2);
            }
            OkHttpClientTransport okHttpClientTransport2 = OkHttpClientTransport.this;
            int i4 = okHttpClientTransport2.s + i3;
            okHttpClientTransport2.s = i4;
            if (i4 >= okHttpClientTransport2.f * 0.5f) {
                synchronized (okHttpClientTransport2.k) {
                    OkHttpClientTransport.this.i.E(0, r8.s);
                }
                OkHttpClientTransport.this.s = 0;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void P(int i, int i2, ArrayList arrayList) {
            OkHttpFrameLogger okHttpFrameLogger = this.d;
            OkHttpFrameLogger.Direction direction = OkHttpFrameLogger.Direction.d;
            if (okHttpFrameLogger.a()) {
                okHttpFrameLogger.f24123a.log(okHttpFrameLogger.b, direction + " PUSH_PROMISE: streamId=" + i + " promisedStreamId=" + i2 + " headers=" + arrayList);
            }
            synchronized (OkHttpClientTransport.this.k) {
                OkHttpClientTransport.this.i.M(i, ErrorCode.PROTOCOL_ERROR);
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void Q(int i, ErrorCode errorCode, ByteString byteString) {
            Status statusI;
            this.d.c(OkHttpFrameLogger.Direction.d, i, errorCode, byteString);
            ErrorCode errorCode2 = ErrorCode.ENHANCE_YOUR_CALM;
            OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
            if (errorCode == errorCode2) {
                String strY = byteString.y();
                OkHttpClientTransport.Q.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strY));
                if ("too_many_pings".equals(strY)) {
                    ((OkHttpChannelBuilder.OkHttpTransportFactory.AnonymousClass1) okHttpClientTransport.J).run();
                }
            }
            long j = errorCode.d;
            GrpcUtil.Http2Error[] http2ErrorArr = GrpcUtil.Http2Error.g;
            GrpcUtil.Http2Error http2Error = (j >= ((long) http2ErrorArr.length) || j < 0) ? null : http2ErrorArr[(int) j];
            if (http2Error == null) {
                statusI = Status.d(GrpcUtil.Http2Error.f.e.f23971a.d).i("Unrecognized HTTP/2 error code: " + j);
            } else {
                statusI = http2Error.e;
            }
            Status statusB = statusI.b("Received Goaway");
            if (byteString.c() > 0) {
                statusB = statusB.b(byteString.y());
            }
            Map map = OkHttpClientTransport.P;
            okHttpClientTransport.s(i, null, statusB);
        }

        @Override // java.lang.Runnable
        public final void run() throws IOException {
            Status statusI;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.e.i1(this)) {
                try {
                    KeepAliveManager keepAliveManager = OkHttpClientTransport.this.F;
                    if (keepAliveManager != null) {
                        keepAliveManager.a();
                    }
                } catch (Throwable th) {
                    try {
                        OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        Status statusH = Status.m.i("error in frame handler").h(th);
                        Map map = OkHttpClientTransport.P;
                        okHttpClientTransport.s(0, errorCode, statusH);
                        try {
                            this.e.close();
                        } catch (IOException e) {
                            e = e;
                            OkHttpClientTransport.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e2) {
                            if (!"bio == null".equals(e2.getMessage())) {
                                throw e2;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            this.e.close();
                        } catch (IOException e3) {
                            OkHttpClientTransport.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e3);
                        } catch (RuntimeException e4) {
                            if (!"bio == null".equals(e4.getMessage())) {
                                throw e4;
                            }
                        }
                        OkHttpClientTransport.this.h.c();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (OkHttpClientTransport.this.k) {
                statusI = OkHttpClientTransport.this.v;
            }
            if (statusI == null) {
                statusI = Status.n.i("End of stream or IOException");
            }
            OkHttpClientTransport.this.s(0, ErrorCode.INTERNAL_ERROR, statusI);
            try {
                this.e.close();
            } catch (IOException e5) {
                e = e5;
                OkHttpClientTransport.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
            } catch (RuntimeException e6) {
                if (!"bio == null".equals(e6.getMessage())) {
                    throw e6;
                }
            }
            OkHttpClientTransport.this.h.c();
            Thread.currentThread().setName(name);
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void u(Settings settings) {
            boolean z;
            this.d.f(OkHttpFrameLogger.Direction.d, settings);
            synchronized (OkHttpClientTransport.this.k) {
                try {
                    if (settings.a(4)) {
                        OkHttpClientTransport.this.C = settings.b[4];
                    }
                    if (settings.a(7)) {
                        int i = settings.b[7];
                        OutboundFlowController outboundFlowController = OkHttpClientTransport.this.j;
                        if (i < 0) {
                            outboundFlowController.getClass();
                            throw new IllegalArgumentException(a.d(i, "Invalid initial window size: "));
                        }
                        int i2 = i - outboundFlowController.c;
                        outboundFlowController.c = i;
                        z = false;
                        for (OutboundFlowController.StreamState streamState : outboundFlowController.f24129a.a()) {
                            streamState.b(i2);
                        }
                        if (i2 > 0) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    if (this.f) {
                        OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
                        ManagedClientTransport.Listener listener = okHttpClientTransport.h;
                        Attributes attributes = okHttpClientTransport.u;
                        listener.e(attributes);
                        okHttpClientTransport.u = attributes;
                        OkHttpClientTransport.this.h.b();
                        this.f = false;
                    }
                    OkHttpClientTransport.this.i.u1(settings);
                    if (z) {
                        OkHttpClientTransport.this.j.c();
                    }
                    OkHttpClientTransport.this.t();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        EnumMap enumMap = new EnumMap(ErrorCode.class);
        Status status = Status.m;
        enumMap.put((EnumMap) ErrorCode.NO_ERROR, (ErrorCode) status.i("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) ErrorCode.PROTOCOL_ERROR, (ErrorCode) status.i("Protocol error"));
        enumMap.put((EnumMap) ErrorCode.INTERNAL_ERROR, (ErrorCode) status.i("Internal error"));
        enumMap.put((EnumMap) ErrorCode.FLOW_CONTROL_ERROR, (ErrorCode) status.i("Flow control error"));
        enumMap.put((EnumMap) ErrorCode.STREAM_CLOSED, (ErrorCode) status.i("Stream closed"));
        enumMap.put((EnumMap) ErrorCode.FRAME_TOO_LARGE, (ErrorCode) status.i("Frame too large"));
        enumMap.put((EnumMap) ErrorCode.REFUSED_STREAM, (ErrorCode) Status.n.i("Refused stream"));
        enumMap.put((EnumMap) ErrorCode.CANCEL, (ErrorCode) Status.f.i("Cancelled"));
        enumMap.put((EnumMap) ErrorCode.COMPRESSION_ERROR, (ErrorCode) status.i("Compression error"));
        enumMap.put((EnumMap) ErrorCode.CONNECT_ERROR, (ErrorCode) status.i("Connect error"));
        enumMap.put((EnumMap) ErrorCode.ENHANCE_YOUR_CALM, (ErrorCode) Status.k.i("Enhance your calm"));
        enumMap.put((EnumMap) ErrorCode.INADEQUATE_SECURITY, (ErrorCode) Status.i.i("Inadequate security"));
        P = Collections.unmodifiableMap(enumMap);
        Q = Logger.getLogger(OkHttpClientTransport.class.getName());
    }

    public OkHttpClientTransport(OkHttpChannelBuilder.OkHttpTransportFactory okHttpTransportFactory, InetSocketAddress inetSocketAddress, String str, Attributes attributes, HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress, Runnable runnable) {
        Supplier supplier = GrpcUtil.r;
        Http2 http2 = new Http2();
        this.d = new Random();
        Object obj = new Object();
        this.k = obj;
        this.n = new HashMap();
        this.C = 0;
        this.D = new LinkedList();
        this.M = new InUseStateAggregator<OkHttpClientStream>() { // from class: io.grpc.okhttp.OkHttpClientTransport.1
            @Override // io.grpc.internal.InUseStateAggregator
            public final void a() {
                OkHttpClientTransport.this.h.d(true);
            }

            @Override // io.grpc.internal.InUseStateAggregator
            public final void b() {
                OkHttpClientTransport.this.h.d(false);
            }
        };
        this.O = 30000;
        Preconditions.j(inetSocketAddress, "address");
        this.f24122a = inetSocketAddress;
        this.b = str;
        this.r = okHttpTransportFactory.k;
        this.f = okHttpTransportFactory.o;
        Executor executor = okHttpTransportFactory.e;
        Preconditions.j(executor, "executor");
        this.o = executor;
        this.p = new SerializingExecutor(okHttpTransportFactory.e);
        ScheduledExecutorService scheduledExecutorService = okHttpTransportFactory.g;
        Preconditions.j(scheduledExecutorService, "scheduledExecutorService");
        this.q = scheduledExecutorService;
        this.m = 3;
        this.A = SocketFactory.getDefault();
        this.B = okHttpTransportFactory.i;
        ConnectionSpec connectionSpec = okHttpTransportFactory.j;
        Preconditions.j(connectionSpec, "connectionSpec");
        this.E = connectionSpec;
        Preconditions.j(supplier, "stopwatchFactory");
        this.e = supplier;
        this.g = http2;
        this.c = "grpc-java-okhttp/1.62.2";
        this.N = httpConnectProxiedSocketAddress;
        this.J = runnable;
        this.K = okHttpTransportFactory.p;
        okHttpTransportFactory.h.getClass();
        this.L = new TransportTracer();
        this.l = InternalLogId.a(getClass(), inetSocketAddress.toString());
        Attributes.Builder builder = new Attributes.Builder(Attributes.b);
        builder.b(GrpcAttributes.b, attributes);
        this.u = builder.a();
        synchronized (obj) {
        }
    }

    public static void h(OkHttpClientTransport okHttpClientTransport, String str) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        okHttpClientTransport.s(0, errorCode, w(errorCode).b(str));
    }

    public static Socket i(OkHttpClientTransport okHttpClientTransport, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws StatusException, NumberFormatException, IOException {
        SocketFactory socketFactory = okHttpClientTransport.A;
        Socket socket = null;
        try {
            Socket socketCreateSocket = inetSocketAddress2.getAddress() != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(okHttpClientTransport.O);
                AsyncTimeout$source$1 asyncTimeout$source$1F = Okio.f(socketCreateSocket);
                RealBufferedSink realBufferedSinkB = Okio.b(Okio.e(socketCreateSocket));
                Request requestJ = okHttpClientTransport.j(inetSocketAddress, str, str2);
                io.grpc.okhttp.internal.Headers headers = requestJ.b;
                HttpUrl httpUrl = requestJ.f24154a;
                Locale locale = Locale.US;
                realBufferedSinkB.r1("CONNECT " + httpUrl.f24152a + ":" + httpUrl.b + " HTTP/1.1");
                realBufferedSinkB.r1("\r\n");
                String[] strArr = headers.f24135a;
                String[] strArr2 = headers.f24135a;
                int length = strArr.length / 2;
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    realBufferedSinkB.r1((i2 < 0 || i2 >= strArr2.length) ? null : strArr2[i2]);
                    realBufferedSinkB.r1(": ");
                    int i3 = i2 + 1;
                    realBufferedSinkB.r1((i3 < 0 || i3 >= strArr2.length) ? null : strArr2[i3]);
                    realBufferedSinkB.r1("\r\n");
                }
                realBufferedSinkB.r1("\r\n");
                realBufferedSinkB.flush();
                StatusLine statusLineA = StatusLine.a(q(asyncTimeout$source$1F));
                int i4 = statusLineA.b;
                while (!q(asyncTimeout$source$1F).equals("")) {
                }
                if (i4 >= 200 && i4 < 300) {
                    socketCreateSocket.setSoTimeout(0);
                    return socketCreateSocket;
                }
                Buffer buffer = new Buffer();
                try {
                    socketCreateSocket.shutdownOutput();
                    asyncTimeout$source$1F.q2(buffer, llqqqql.c00630063c0063c0063);
                } catch (IOException e) {
                    buffer.t0("Unable to read body: " + e.toString());
                }
                try {
                    socketCreateSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new StatusException(Status.n.i("Response returned from proxy was not successful (expected 2xx, got " + i4 + " " + statusLineA.c + "). Response body:\n" + buffer.v()));
            } catch (IOException e2) {
                e = e2;
                socket = socketCreateSocket;
                if (socket != null) {
                    GrpcUtil.b(socket);
                }
                throw new StatusException(Status.n.i("Failed trying to connect with proxy").h(e));
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static String q(AsyncTimeout$source$1 asyncTimeout$source$1) throws EOFException {
        Buffer buffer = new Buffer();
        while (asyncTimeout$source$1.q2(buffer, 1L) != -1) {
            if (buffer.e(buffer.e - 1) == 10) {
                return buffer.n1(Long.MAX_VALUE);
            }
        }
        throw new EOFException("\\n not found: " + buffer.p0(buffer.e).d());
    }

    public static Status w(ErrorCode errorCode) {
        Status status = (Status) P.get(errorCode);
        if (status != null) {
            return status;
        }
        return Status.g.i("Unknown http2 error code: " + errorCode.d);
    }

    @Override // io.grpc.okhttp.OutboundFlowController.Transport
    public final OutboundFlowController.StreamState[] a() {
        OutboundFlowController.StreamState[] streamStateArr;
        OutboundFlowController.StreamState streamState;
        synchronized (this.k) {
            streamStateArr = new OutboundFlowController.StreamState[this.n.size()];
            Iterator it = this.n.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                OkHttpClientStream.TransportState transportState = ((OkHttpClientStream) it.next()).l;
                synchronized (transportState.x) {
                    streamState = transportState.K;
                }
                streamStateArr[i] = streamState;
                i = i2;
            }
        }
        return streamStateArr;
    }

    @Override // io.grpc.InternalWithLogId
    public final InternalLogId b() {
        return this.l;
    }

    @Override // io.grpc.internal.ClientTransport
    public final void c(ClientTransport.PingCallback pingCallback, Executor executor) {
        long jNextLong;
        synchronized (this.k) {
            try {
                boolean z = true;
                Preconditions.r(this.i != null);
                if (this.y) {
                    Http2Ping.c(pingCallback, executor, m());
                    return;
                }
                Http2Ping http2Ping = this.x;
                if (http2Ping != null) {
                    jNextLong = 0;
                    z = false;
                } else {
                    jNextLong = this.d.nextLong();
                    Stopwatch stopwatch = (Stopwatch) this.e.get();
                    stopwatch.b();
                    Http2Ping http2Ping2 = new Http2Ping(jNextLong, stopwatch);
                    this.x = http2Ping2;
                    this.L.getClass();
                    http2Ping = http2Ping2;
                }
                if (z) {
                    this.i.J((int) (jNextLong >>> 32), (int) jNextLong, false);
                }
                http2Ping.a(pingCallback, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.ClientTransport
    public final ClientStream d(MethodDescriptor methodDescriptor, Metadata metadata, CallOptions callOptions, ClientStreamTracer[] clientStreamTracerArr) {
        OkHttpClientStream okHttpClientStream;
        Preconditions.j(methodDescriptor, "method");
        Preconditions.j(metadata, "headers");
        Attributes attributes = this.u;
        StatsTraceContext statsTraceContext = new StatsTraceContext(clientStreamTracerArr);
        for (ClientStreamTracer clientStreamTracer : clientStreamTracerArr) {
            clientStreamTracer.n(attributes, metadata);
        }
        synchronized (this.k) {
            okHttpClientStream = new OkHttpClientStream(methodDescriptor, metadata, this.i, this, this.j, this.k, this.r, this.f, this.b, this.c, statsTraceContext, this.L, callOptions);
        }
        return okHttpClientStream;
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public final Runnable e(ManagedClientTransport.Listener listener) {
        this.h = listener;
        if (this.G) {
            KeepAliveManager keepAliveManager = new KeepAliveManager(new KeepAliveManager.ClientKeepAlivePinger(this), this.q, this.H, this.I);
            this.F = keepAliveManager;
            synchronized (keepAliveManager) {
            }
        }
        final AsyncSink asyncSink = new AsyncSink(this.p, this);
        AsyncSink.LimitControlFramesWriter limitControlFramesWriter = asyncSink.new LimitControlFramesWriter(this.g.e(Okio.b(asyncSink)));
        synchronized (this.k) {
            ExceptionHandlingFrameWriter exceptionHandlingFrameWriter = new ExceptionHandlingFrameWriter(this, limitControlFramesWriter);
            this.i = exceptionHandlingFrameWriter;
            this.j = new OutboundFlowController(this, exceptionHandlingFrameWriter);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.p.execute(new Runnable() { // from class: io.grpc.okhttp.OkHttpClientTransport.3

            /* renamed from: io.grpc.okhttp.OkHttpClientTransport$3$1, reason: invalid class name */
            class AnonymousClass1 implements Source {
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }

                @Override // okio.Source
                /* renamed from: n */
                public final Timeout getE() {
                    return Timeout.e;
                }

                @Override // okio.Source
                public final long q2(Buffer buffer, long j) {
                    return -1L;
                }
            }

            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                OkHttpClientTransport okHttpClientTransport;
                ClientFrameHandler clientFrameHandler;
                Socket socketI;
                SSLSession session;
                Socket socket;
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                RealBufferedSource realBufferedSourceC = Okio.c(new AnonymousClass1());
                try {
                    try {
                        try {
                            OkHttpClientTransport okHttpClientTransport2 = OkHttpClientTransport.this;
                            HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress = okHttpClientTransport2.N;
                            if (httpConnectProxiedSocketAddress == null) {
                                socketI = okHttpClientTransport2.A.createSocket(okHttpClientTransport2.f24122a.getAddress(), OkHttpClientTransport.this.f24122a.getPort());
                            } else {
                                SocketAddress socketAddress = httpConnectProxiedSocketAddress.d;
                                if (!(socketAddress instanceof InetSocketAddress)) {
                                    throw new StatusException(Status.m.i("Unsupported SocketAddress implementation " + OkHttpClientTransport.this.N.d.getClass()));
                                }
                                socketI = OkHttpClientTransport.i(okHttpClientTransport2, httpConnectProxiedSocketAddress.e, (InetSocketAddress) socketAddress, httpConnectProxiedSocketAddress.f, httpConnectProxiedSocketAddress.g);
                            }
                            OkHttpClientTransport okHttpClientTransport3 = OkHttpClientTransport.this;
                            SSLSocketFactory sSLSocketFactory = okHttpClientTransport3.B;
                            if (sSLSocketFactory != null) {
                                String host = okHttpClientTransport3.b;
                                URI uriA = GrpcUtil.a(host);
                                if (uriA.getHost() != null) {
                                    host = uriA.getHost();
                                }
                                SSLSocket sSLSocketA = OkHttpTlsUpgrader.a(sSLSocketFactory, socketI, host, OkHttpClientTransport.this.l(), OkHttpClientTransport.this.E);
                                session = sSLSocketA.getSession();
                                socket = sSLSocketA;
                            } else {
                                session = null;
                                socket = socketI;
                            }
                            socket.setTcpNoDelay(true);
                            RealBufferedSource realBufferedSourceC2 = Okio.c(Okio.f(socket));
                            asyncSink.a(Okio.e(socket), socket);
                            OkHttpClientTransport okHttpClientTransport4 = OkHttpClientTransport.this;
                            Attributes attributes = okHttpClientTransport4.u;
                            attributes.getClass();
                            Attributes.Builder builder = new Attributes.Builder(attributes);
                            builder.b(Grpc.f23938a, socket.getRemoteSocketAddress());
                            builder.b(Grpc.b, socket.getLocalSocketAddress());
                            builder.b(Grpc.c, session);
                            builder.b(GrpcAttributes.f24014a, session == null ? SecurityLevel.d : SecurityLevel.e);
                            okHttpClientTransport4.u = builder.a();
                            OkHttpClientTransport okHttpClientTransport5 = OkHttpClientTransport.this;
                            okHttpClientTransport5.t = okHttpClientTransport5.new ClientFrameHandler(okHttpClientTransport5.g.d(realBufferedSourceC2));
                            synchronized (OkHttpClientTransport.this.k) {
                                if (session != null) {
                                    try {
                                        new InternalChannelz.Tls(session);
                                    } finally {
                                    }
                                }
                            }
                        } catch (Exception e) {
                            OkHttpClientTransport.this.p(e);
                            okHttpClientTransport = OkHttpClientTransport.this;
                            clientFrameHandler = okHttpClientTransport.new ClientFrameHandler(okHttpClientTransport.g.d(realBufferedSourceC));
                            okHttpClientTransport.t = clientFrameHandler;
                        }
                    } catch (StatusException e2) {
                        OkHttpClientTransport okHttpClientTransport6 = OkHttpClientTransport.this;
                        ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
                        Status status = e2.d;
                        Map map = OkHttpClientTransport.P;
                        okHttpClientTransport6.s(0, errorCode, status);
                        okHttpClientTransport = OkHttpClientTransport.this;
                        clientFrameHandler = okHttpClientTransport.new ClientFrameHandler(okHttpClientTransport.g.d(realBufferedSourceC));
                        okHttpClientTransport.t = clientFrameHandler;
                    }
                } catch (Throwable th) {
                    OkHttpClientTransport okHttpClientTransport7 = OkHttpClientTransport.this;
                    okHttpClientTransport7.t = okHttpClientTransport7.new ClientFrameHandler(okHttpClientTransport7.g.d(realBufferedSourceC));
                    throw th;
                }
            }
        });
        try {
            r();
            countDownLatch.countDown();
            this.p.execute(new Runnable() { // from class: io.grpc.okhttp.OkHttpClientTransport.4
                @Override // java.lang.Runnable
                public final void run() {
                    OkHttpClientTransport.this.getClass();
                    OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
                    okHttpClientTransport.o.execute(okHttpClientTransport.t);
                    synchronized (OkHttpClientTransport.this.k) {
                        OkHttpClientTransport okHttpClientTransport2 = OkHttpClientTransport.this;
                        okHttpClientTransport2.C = Integer.MAX_VALUE;
                        okHttpClientTransport2.t();
                    }
                    OkHttpClientTransport.this.getClass();
                }
            });
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public final void f(Status status) {
        g(status);
        synchronized (this.k) {
            try {
                Iterator it = this.n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((OkHttpClientStream) entry.getValue()).l.k(new Metadata(), status, false);
                    o((OkHttpClientStream) entry.getValue());
                }
                for (OkHttpClientStream okHttpClientStream : this.D) {
                    okHttpClientStream.l.l(status, ClientStreamListener.RpcProgress.g, true, new Metadata());
                    o(okHttpClientStream);
                }
                this.D.clear();
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public final void g(Status status) {
        synchronized (this.k) {
            try {
                if (this.v != null) {
                    return;
                }
                this.v = status;
                this.h.a(status);
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.ConnectionClientTransport
    public final Attributes getAttributes() {
        return this.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0199 A[EDGE_INSN: B:108:0x0199->B:160:0x0243 BREAK  A[LOOP:9: B:147:0x0220->B:158:0x023f]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x012c A[ADDED_TO_REGION, EDGE_INSN: B:207:0x012c->B:83:0x012c BREAK  A[LOOP:2: B:28:0x0090->B:98:0x015e], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x012c A[EDGE_INSN: B:230:0x012c->B:83:0x012c BREAK  A[LOOP:7: B:52:0x00d1->B:80:0x0119], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0119 A[LOOP:7: B:52:0x00d1->B:80:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.grpc.okhttp.internal.proxy.Request j(java.net.InetSocketAddress r21, java.lang.String r22, java.lang.String r23) throws java.io.UnsupportedEncodingException, java.net.UnknownHostException {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.OkHttpClientTransport.j(java.net.InetSocketAddress, java.lang.String, java.lang.String):io.grpc.okhttp.internal.proxy.Request");
    }

    public final void k(int i, Status status, ClientStreamListener.RpcProgress rpcProgress, boolean z, ErrorCode errorCode, Metadata metadata) {
        synchronized (this.k) {
            try {
                OkHttpClientStream okHttpClientStream = (OkHttpClientStream) this.n.remove(Integer.valueOf(i));
                if (okHttpClientStream != null) {
                    if (errorCode != null) {
                        this.i.M(i, ErrorCode.CANCEL);
                    }
                    if (status != null) {
                        OkHttpClientStream.TransportState transportState = okHttpClientStream.l;
                        if (metadata == null) {
                            metadata = new Metadata();
                        }
                        transportState.l(status, rpcProgress, z, metadata);
                    }
                    if (!t()) {
                        v();
                        o(okHttpClientStream);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int l() {
        URI uriA = GrpcUtil.a(this.b);
        return uriA.getPort() != -1 ? uriA.getPort() : this.f24122a.getPort();
    }

    public final StatusException m() {
        synchronized (this.k) {
            try {
                Status status = this.v;
                if (status != null) {
                    return new StatusException(status);
                }
                return new StatusException(Status.n.i("Connection closed"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.k
            monitor-enter(r0)
            int r1 = r2.m     // Catch: java.lang.Throwable -> Lf
            if (r3 >= r1) goto Lc
            r1 = 1
            r3 = r3 & r1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.OkHttpClientTransport.n(int):boolean");
    }

    public final void o(OkHttpClientStream okHttpClientStream) {
        if (this.z && this.D.isEmpty() && this.n.isEmpty()) {
            this.z = false;
            KeepAliveManager keepAliveManager = this.F;
            if (keepAliveManager != null) {
                keepAliveManager.c();
            }
        }
        if (okHttpClientStream.c) {
            this.M.c(okHttpClientStream, false);
        }
    }

    public final void p(Exception exc) {
        s(0, ErrorCode.INTERNAL_ERROR, Status.n.h(exc));
    }

    public final void r() {
        synchronized (this.k) {
            try {
                this.i.S();
                Settings settings = new Settings();
                settings.b(7, this.f);
                this.i.u(settings);
                if (this.f > 65535) {
                    this.i.E(0, r1 - Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(int i, ErrorCode errorCode, Status status) {
        synchronized (this.k) {
            try {
                if (this.v == null) {
                    this.v = status;
                    this.h.a(status);
                }
                if (errorCode != null && !this.w) {
                    this.w = true;
                    this.i.A0(errorCode, new byte[0]);
                }
                Iterator it = this.n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i) {
                        it.remove();
                        ((OkHttpClientStream) entry.getValue()).l.l(status, ClientStreamListener.RpcProgress.e, false, new Metadata());
                        o((OkHttpClientStream) entry.getValue());
                    }
                }
                for (OkHttpClientStream okHttpClientStream : this.D) {
                    okHttpClientStream.l.l(status, ClientStreamListener.RpcProgress.g, true, new Metadata());
                    o(okHttpClientStream);
                }
                this.D.clear();
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t() {
        boolean z = false;
        while (true) {
            LinkedList linkedList = this.D;
            if (linkedList.isEmpty() || this.n.size() >= this.C) {
                break;
            }
            u((OkHttpClientStream) linkedList.poll());
            z = true;
        }
        return z;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.b(this.l.c, "logId");
        toStringHelperB.c(this.f24122a, "address");
        return toStringHelperB.toString();
    }

    public final void u(OkHttpClientStream okHttpClientStream) {
        boolean zG;
        Preconditions.q("StreamId already assigned", okHttpClientStream.l.L == -1);
        this.n.put(Integer.valueOf(this.m), okHttpClientStream);
        if (!this.z) {
            this.z = true;
            KeepAliveManager keepAliveManager = this.F;
            if (keepAliveManager != null) {
                keepAliveManager.b();
            }
        }
        if (okHttpClientStream.c) {
            this.M.c(okHttpClientStream, true);
        }
        OkHttpClientStream.TransportState transportState = okHttpClientStream.l;
        int i = this.m;
        OutboundFlowController outboundFlowController = transportState.G;
        OkHttpClientStream okHttpClientStream2 = OkHttpClientStream.this;
        Preconditions.n(i, "the stream has been started with id %s", transportState.L == -1);
        transportState.L = i;
        transportState.K = outboundFlowController.new StreamState(i, outboundFlowController.c, transportState);
        OkHttpClientStream.TransportState transportState2 = okHttpClientStream2.l;
        Preconditions.r(transportState2.h() != null);
        synchronized (transportState2.b) {
            Preconditions.q("Already allocated", !transportState2.f);
            transportState2.f = true;
        }
        synchronized (transportState2.b) {
            zG = transportState2.g();
        }
        if (zG) {
            transportState2.h().onReady();
        }
        TransportTracer transportTracer = transportState2.c;
        transportTracer.getClass();
        transportTracer.f24113a.a();
        if (transportState.I) {
            transportState.F.c0(transportState.L, transportState.y, okHttpClientStream2.o);
            for (StreamTracer streamTracer : okHttpClientStream2.j.f24108a) {
                ((ClientStreamTracer) streamTracer).m();
            }
            transportState.y = null;
            Buffer buffer = transportState.z;
            if (buffer.e > 0) {
                outboundFlowController.a(transportState.A, transportState.K, buffer, transportState.B);
            }
            transportState.I = false;
        }
        MethodDescriptor.MethodType methodType = okHttpClientStream.h.f23962a;
        if ((methodType != MethodDescriptor.MethodType.d && methodType != MethodDescriptor.MethodType.e) || okHttpClientStream.o) {
            this.i.flush();
        }
        int i2 = this.m;
        if (i2 < 2147483645) {
            this.m = i2 + 2;
        } else {
            this.m = Integer.MAX_VALUE;
            s(Integer.MAX_VALUE, ErrorCode.NO_ERROR, Status.n.i("Stream ids exhausted"));
        }
    }

    public final void v() {
        if (this.v == null || !this.n.isEmpty() || !this.D.isEmpty() || this.y) {
            return;
        }
        this.y = true;
        KeepAliveManager keepAliveManager = this.F;
        if (keepAliveManager != null) {
            keepAliveManager.d();
        }
        Http2Ping http2Ping = this.x;
        if (http2Ping != null) {
            StatusException statusExceptionM = m();
            synchronized (http2Ping) {
                try {
                    if (!http2Ping.d) {
                        http2Ping.d = true;
                        http2Ping.e = statusExceptionM;
                        LinkedHashMap linkedHashMap = http2Ping.c;
                        http2Ping.c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Http2Ping.c((ClientTransport.PingCallback) entry.getKey(), (Executor) entry.getValue(), statusExceptionM);
                        }
                    }
                } finally {
                }
            }
            this.x = null;
        }
        if (!this.w) {
            this.w = true;
            this.i.A0(ErrorCode.NO_ERROR, new byte[0]);
        }
        this.i.close();
    }
}

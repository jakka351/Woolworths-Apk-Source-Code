package io.grpc.okhttp;

import YU.a;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import com.medallia.digital.mobilesdk.q2;
import io.grpc.Attributes;
import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.InternalMetadata;
import io.grpc.InternalStatus;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.StreamTracer;
import io.grpc.internal.AbstractClientStream;
import io.grpc.internal.AbstractStream;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.Http2ClientStreamTransportState;
import io.grpc.internal.KeepAliveManager;
import io.grpc.internal.ReadableBuffer;
import io.grpc.internal.ReadableBuffers;
import io.grpc.internal.StatsTraceContext;
import io.grpc.internal.TransportFrameUtil;
import io.grpc.internal.TransportTracer;
import io.grpc.internal.WritableBuffer;
import io.grpc.okhttp.OutboundFlowController;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.Header;
import io.perfmark.Impl;
import io.perfmark.PerfMark;
import io.perfmark.Tag;
import io.perfmark.TaskCloseable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.ByteString;

/* loaded from: classes7.dex */
class OkHttpClientStream extends AbstractClientStream {
    public static final Buffer p = new Buffer();
    public final MethodDescriptor h;
    public final String i;
    public final StatsTraceContext j;
    public final String k;
    public final TransportState l;
    public final Sink m;
    public final Attributes n;
    public boolean o;

    public class Sink implements AbstractClientStream.Sink {
        public Sink() {
        }

        @Override // io.grpc.internal.AbstractClientStream.Sink
        public final void e(Status status) {
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                synchronized (OkHttpClientStream.this.l.x) {
                    OkHttpClientStream.this.l.q(null, status, true);
                }
                taskCloseable.close();
            } catch (Throwable th) {
                try {
                    taskCloseable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.AbstractClientStream.Sink
        public final void f(WritableBuffer writableBuffer, boolean z, boolean z2, int i) {
            Buffer buffer;
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                if (writableBuffer == null) {
                    buffer = OkHttpClientStream.p;
                } else {
                    buffer = ((OkHttpWritableBuffer) writableBuffer).f24128a;
                    int i2 = (int) buffer.e;
                    if (i2 > 0) {
                        OkHttpClientStream okHttpClientStream = OkHttpClientStream.this;
                        Buffer buffer2 = OkHttpClientStream.p;
                        AbstractStream.TransportState transportStateQ = okHttpClientStream.q();
                        synchronized (transportStateQ.b) {
                            transportStateQ.e += i2;
                        }
                    }
                }
                synchronized (OkHttpClientStream.this.l.x) {
                    TransportState.p(OkHttpClientStream.this.l, buffer, z, z2);
                    TransportTracer transportTracer = OkHttpClientStream.this.f23979a;
                    if (i == 0) {
                        transportTracer.getClass();
                    } else {
                        transportTracer.f24113a.a();
                    }
                }
                taskCloseable.close();
            } catch (Throwable th) {
                try {
                    taskCloseable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.AbstractClientStream.Sink
        public final void g(Metadata metadata, byte[] bArr) {
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                String string = q2.c + OkHttpClientStream.this.h.b;
                if (bArr != null) {
                    OkHttpClientStream.this.o = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append("?");
                    BaseEncoding baseEncoding = BaseEncoding.f14922a;
                    baseEncoding.getClass();
                    sb.append(baseEncoding.c(bArr.length, bArr));
                    string = sb.toString();
                }
                synchronized (OkHttpClientStream.this.l.x) {
                    TransportState.o(OkHttpClientStream.this.l, metadata, string);
                }
                taskCloseable.close();
            } catch (Throwable th) {
                try {
                    taskCloseable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public class TransportState extends Http2ClientStreamTransportState implements OutboundFlowController.Stream {
        public boolean A;
        public boolean B;
        public boolean C;
        public int D;
        public int E;
        public final ExceptionHandlingFrameWriter F;
        public final OutboundFlowController G;
        public final OkHttpClientTransport H;
        public boolean I;
        public final Tag J;
        public OutboundFlowController.StreamState K;
        public int L;
        public final int w;
        public final Object x;
        public ArrayList y;
        public final Buffer z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransportState(int i, StatsTraceContext statsTraceContext, Object obj, ExceptionHandlingFrameWriter exceptionHandlingFrameWriter, OutboundFlowController outboundFlowController, OkHttpClientTransport okHttpClientTransport, int i2) {
            super(i, statsTraceContext, OkHttpClientStream.this.f23979a);
            Buffer buffer = OkHttpClientStream.p;
            this.s = Charsets.b;
            this.z = new Buffer();
            this.A = false;
            this.B = false;
            this.C = false;
            this.I = true;
            this.L = -1;
            Preconditions.j(obj, "lock");
            this.x = obj;
            this.F = exceptionHandlingFrameWriter;
            this.G = outboundFlowController;
            this.H = okHttpClientTransport;
            this.D = i2;
            this.E = i2;
            this.w = i2;
            PerfMark.f24217a.getClass();
            this.J = Impl.f24216a;
        }

        public static void o(TransportState transportState, Metadata metadata, String str) {
            OkHttpClientStream okHttpClientStream = OkHttpClientStream.this;
            String str2 = okHttpClientStream.k;
            String str3 = okHttpClientStream.i;
            boolean z = okHttpClientStream.o;
            OkHttpClientTransport okHttpClientTransport = transportState.H;
            boolean z2 = okHttpClientTransport.B == null;
            Header header = Headers.f24116a;
            Preconditions.j(metadata, "headers");
            Preconditions.j(str, "defaultPath");
            Preconditions.j(str2, "authority");
            metadata.a(GrpcUtil.i);
            metadata.a(GrpcUtil.j);
            Metadata.Key key = GrpcUtil.k;
            metadata.a(key);
            ArrayList arrayList = new ArrayList(metadata.b + 7);
            if (z2) {
                arrayList.add(Headers.b);
            } else {
                arrayList.add(Headers.f24116a);
            }
            if (z) {
                arrayList.add(Headers.d);
            } else {
                arrayList.add(Headers.c);
            }
            arrayList.add(new Header(Header.h, str2));
            arrayList.add(new Header(Header.f, str));
            arrayList.add(new Header(key.f23960a, str3));
            arrayList.add(Headers.e);
            arrayList.add(Headers.f);
            Logger logger = TransportFrameUtil.f24112a;
            Charset charset = InternalMetadata.f23947a;
            int i = metadata.b * 2;
            byte[][] bArr = new byte[i][];
            Object[] objArr = metadata.f23959a;
            if (objArr instanceof byte[][]) {
                System.arraycopy(objArr, 0, bArr, 0, i);
            } else {
                for (int i2 = 0; i2 < metadata.b; i2++) {
                    int i3 = i2 * 2;
                    bArr[i3] = metadata.e(i2);
                    bArr[i3 + 1] = metadata.g(i2);
                }
            }
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5 += 2) {
                byte[] bArr2 = bArr[i5];
                byte[] bArr3 = bArr[i5 + 1];
                if (TransportFrameUtil.a(bArr2, TransportFrameUtil.b)) {
                    bArr[i4] = bArr2;
                    BaseEncoding baseEncoding = InternalMetadata.b;
                    baseEncoding.getClass();
                    bArr[i4 + 1] = baseEncoding.c(bArr3.length, bArr3).getBytes(Charsets.f14860a);
                } else {
                    for (byte b : bArr3) {
                        if (b < 32 || b > 126) {
                            String str4 = new String(bArr2, Charsets.f14860a);
                            Logger logger2 = TransportFrameUtil.f24112a;
                            StringBuilder sbU = a.u("Metadata key=", str4, ", value=");
                            sbU.append(Arrays.toString(bArr3));
                            sbU.append(" contains invalid ASCII characters");
                            logger2.warning(sbU.toString());
                            break;
                        }
                    }
                    bArr[i4] = bArr2;
                    bArr[i4 + 1] = bArr3;
                }
                i4 += 2;
            }
            if (i4 != i) {
                bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i4);
            }
            for (int i6 = 0; i6 < bArr.length; i6 += 2) {
                byte[] bArr4 = bArr[i6];
                ByteString byteString = ByteString.g;
                ByteString byteStringC = ByteString.Companion.c(bArr4);
                byte[] bArr5 = byteStringC.data;
                if (bArr5.length != 0 && bArr5[0] != 58) {
                    arrayList.add(new Header(byteStringC, ByteString.Companion.c(bArr[i6 + 1])));
                }
            }
            transportState.y = arrayList;
            Status status = okHttpClientTransport.v;
            if (status != null) {
                okHttpClientStream.l.l(status, ClientStreamListener.RpcProgress.g, true, new Metadata());
                return;
            }
            if (okHttpClientTransport.n.size() < okHttpClientTransport.C) {
                okHttpClientTransport.u(okHttpClientStream);
                return;
            }
            okHttpClientTransport.D.add(okHttpClientStream);
            if (!okHttpClientTransport.z) {
                okHttpClientTransport.z = true;
                KeepAliveManager keepAliveManager = okHttpClientTransport.F;
                if (keepAliveManager != null) {
                    keepAliveManager.b();
                }
            }
            if (okHttpClientStream.c) {
                okHttpClientTransport.M.c(okHttpClientStream, true);
            }
        }

        public static void p(TransportState transportState, Buffer buffer, boolean z, boolean z2) {
            if (transportState.C) {
                return;
            }
            if (!transportState.I) {
                Preconditions.q("streamId should be set", transportState.L != -1);
                transportState.G.a(z, transportState.K, buffer, z2);
            } else {
                transportState.z.w1(buffer, (int) buffer.e);
                transportState.A |= z;
                transportState.B |= z2;
            }
        }

        @Override // io.grpc.internal.MessageDeframer.Listener
        public final void b(int i) {
            int i2 = this.E - i;
            this.E = i2;
            float f = i2;
            int i3 = this.w;
            if (f <= i3 * 0.5f) {
                int i4 = i3 - i2;
                this.D += i4;
                this.E = i2 + i4;
                this.F.E(this.L, i4);
            }
        }

        @Override // io.grpc.internal.AbstractClientStream.TransportState, io.grpc.internal.MessageDeframer.Listener
        public final void c(boolean z) {
            ClientStreamListener.RpcProgress rpcProgress = ClientStreamListener.RpcProgress.d;
            if (this.n) {
                this.H.k(this.L, null, rpcProgress, false, null, null);
            } else {
                this.H.k(this.L, null, rpcProgress, false, ErrorCode.CANCEL, null);
            }
            super.c(z);
        }

        @Override // io.grpc.internal.ApplicationThreadDeframerListener.TransportExecutor
        public final void d(Runnable runnable) {
            synchronized (this.x) {
                runnable.run();
            }
        }

        @Override // io.grpc.internal.MessageDeframer.Listener
        public final void f(Throwable th) {
            q(new Metadata(), Status.e(th), true);
        }

        public final void q(Metadata metadata, Status status, boolean z) {
            if (this.C) {
                return;
            }
            this.C = true;
            if (!this.I) {
                this.H.k(this.L, status, ClientStreamListener.RpcProgress.d, z, ErrorCode.CANCEL, metadata);
                return;
            }
            OkHttpClientTransport okHttpClientTransport = this.H;
            LinkedList linkedList = okHttpClientTransport.D;
            OkHttpClientStream okHttpClientStream = OkHttpClientStream.this;
            linkedList.remove(okHttpClientStream);
            okHttpClientTransport.o(okHttpClientStream);
            this.y = null;
            this.z.a();
            this.I = false;
            if (metadata == null) {
                metadata = new Metadata();
            }
            k(metadata, status, true);
        }

        public final void r(int i, Buffer buffer, boolean z) throws Throwable {
            Throwable th;
            long j = buffer.e;
            int i2 = this.D - (((int) j) + i);
            this.D = i2;
            this.E -= i;
            if (i2 < 0) {
                this.F.M(this.L, ErrorCode.FLOW_CONTROL_ERROR);
                this.H.k(this.L, Status.m.i("Received data size exceeded our receiving window size"), ClientStreamListener.RpcProgress.d, false, null, null);
                return;
            }
            OkHttpReadableBuffer okHttpReadableBuffer = new OkHttpReadableBuffer(buffer);
            Status status = this.q;
            boolean z2 = false;
            if (status != null) {
                Charset charset = this.s;
                ReadableBuffer readableBuffer = ReadableBuffers.f24076a;
                Preconditions.j(charset, "charset");
                int i3 = (int) buffer.e;
                byte[] bArr = new byte[i3];
                okHttpReadableBuffer.Z1(0, i3, bArr);
                this.q = status.b("DATA-----------------------------\n".concat(new String(bArr, charset)));
                okHttpReadableBuffer.close();
                if (this.q.b.length() > 1000 || z) {
                    q(this.r, this.q, false);
                    return;
                }
                return;
            }
            if (!this.t) {
                q(new Metadata(), Status.m.i("headers not received before payload"), false);
                return;
            }
            int i4 = (int) j;
            try {
                if (this.o) {
                    AbstractClientStream.g.log(Level.INFO, "Received data on closed stream");
                    okHttpReadableBuffer.close();
                } else {
                    try {
                        this.f23981a.e(okHttpReadableBuffer);
                    } catch (Throwable th2) {
                        try {
                            f(th2);
                        } catch (Throwable th3) {
                            th = th3;
                            if (!z2) {
                                throw th;
                            }
                            okHttpReadableBuffer.close();
                            throw th;
                        }
                    }
                }
                if (z) {
                    if (i4 > 0) {
                        this.q = Status.m.i("Received unexpected EOS on non-empty DATA frame from server");
                    } else {
                        this.q = Status.m.i("Received unexpected EOS on empty DATA frame from server");
                    }
                    Metadata metadata = new Metadata();
                    this.r = metadata;
                    k(metadata, this.q, false);
                }
            } catch (Throwable th4) {
                th = th4;
                z2 = true;
            }
        }

        /* JADX WARN: Finally extract failed */
        public final void s(ArrayList arrayList, boolean z) {
            Status statusB;
            Metadata.Key key = Http2ClientStreamTransportState.v;
            if (z) {
                byte[][] bArrA = Utils.a(arrayList);
                int length = bArrA.length / 2;
                Metadata metadata = new Metadata();
                metadata.b = length;
                metadata.f23959a = bArrA;
                if (this.q == null && !this.t) {
                    Status statusN = Http2ClientStreamTransportState.n(metadata);
                    this.q = statusN;
                    if (statusN != null) {
                        this.r = metadata;
                    }
                }
                Status status = this.q;
                if (status != null) {
                    Status statusB2 = status.b("trailers: " + metadata);
                    this.q = statusB2;
                    q(this.r, statusB2, false);
                    return;
                }
                Metadata.Key key2 = InternalStatus.b;
                Status status2 = (Status) metadata.c(key2);
                if (status2 != null) {
                    statusB = status2.i((String) metadata.c(InternalStatus.f23948a));
                } else if (this.t) {
                    statusB = Status.g.i("missing GRPC status in response");
                } else {
                    Integer num = (Integer) metadata.c(key);
                    statusB = (num != null ? GrpcUtil.g(num.intValue()) : Status.m.i("missing HTTP status code")).b("missing GRPC status, inferred error from HTTP status code");
                }
                metadata.a(key);
                metadata.a(key2);
                metadata.a(InternalStatus.f23948a);
                if (this.o) {
                    AbstractClientStream.g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{statusB, metadata});
                    return;
                }
                for (StreamTracer streamTracer : this.h.f24108a) {
                    ((ClientStreamTracer) streamTracer).l(metadata);
                }
                k(metadata, statusB, false);
                return;
            }
            byte[][] bArrA2 = Utils.a(arrayList);
            Charset charset = InternalMetadata.f23947a;
            int length2 = bArrA2.length / 2;
            Metadata metadata2 = new Metadata();
            metadata2.b = length2;
            metadata2.f23959a = bArrA2;
            Status status3 = this.q;
            if (status3 != null) {
                this.q = status3.b("headers: " + metadata2);
                return;
            }
            try {
                if (this.t) {
                    Status statusI = Status.m.i("Received headers twice");
                    this.q = statusI;
                    this.q = statusI.b("headers: " + metadata2);
                    this.r = metadata2;
                    this.s = Http2ClientStreamTransportState.m(metadata2);
                    return;
                }
                Integer num2 = (Integer) metadata2.c(key);
                if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                    Status status4 = this.q;
                    if (status4 != null) {
                        this.q = status4.b("headers: " + metadata2);
                        this.r = metadata2;
                        this.s = Http2ClientStreamTransportState.m(metadata2);
                        return;
                    }
                    return;
                }
                this.t = true;
                Status statusN2 = Http2ClientStreamTransportState.n(metadata2);
                this.q = statusN2;
                if (statusN2 != null) {
                    this.q = statusN2.b("headers: " + metadata2);
                    this.r = metadata2;
                    this.s = Http2ClientStreamTransportState.m(metadata2);
                    return;
                }
                metadata2.a(key);
                metadata2.a(InternalStatus.b);
                metadata2.a(InternalStatus.f23948a);
                j(metadata2);
                Status status5 = this.q;
                if (status5 != null) {
                    this.q = status5.b("headers: " + metadata2);
                    this.r = metadata2;
                    this.s = Http2ClientStreamTransportState.m(metadata2);
                }
            } catch (Throwable th) {
                Status status6 = this.q;
                if (status6 != null) {
                    this.q = status6.b("headers: " + metadata2);
                    this.r = metadata2;
                    this.s = Http2ClientStreamTransportState.m(metadata2);
                }
                throw th;
            }
        }
    }

    public OkHttpClientStream(MethodDescriptor methodDescriptor, Metadata metadata, ExceptionHandlingFrameWriter exceptionHandlingFrameWriter, OkHttpClientTransport okHttpClientTransport, OutboundFlowController outboundFlowController, Object obj, int i, int i2, String str, String str2, StatsTraceContext statsTraceContext, TransportTracer transportTracer, CallOptions callOptions) {
        super(new OkHttpWritableBufferAllocator(), statsTraceContext, transportTracer, metadata, callOptions, false);
        this.m = new Sink();
        this.o = false;
        this.j = statsTraceContext;
        this.h = methodDescriptor;
        this.k = str;
        this.i = str2;
        this.n = okHttpClientTransport.u;
        String str3 = methodDescriptor.b;
        this.l = new TransportState(i, statsTraceContext, obj, exceptionHandlingFrameWriter, outboundFlowController, okHttpClientTransport, i2);
    }

    @Override // io.grpc.internal.ClientStream
    public final void f() {
        Preconditions.j(null, "authority");
        throw null;
    }

    @Override // io.grpc.internal.ClientStream
    public final Attributes getAttributes() {
        return this.n;
    }

    @Override // io.grpc.internal.AbstractClientStream, io.grpc.internal.AbstractStream
    public final AbstractStream.TransportState q() {
        return this.l;
    }

    @Override // io.grpc.internal.AbstractClientStream
    public final AbstractClientStream.Sink r() {
        return this.m;
    }

    @Override // io.grpc.internal.AbstractClientStream
    /* renamed from: s */
    public final AbstractClientStream.TransportState q() {
        return this.l;
    }
}

package io.grpc.okhttp;

import com.google.common.base.Preconditions;
import io.grpc.okhttp.internal.framed.FrameWriter;
import java.io.IOException;
import okio.Buffer;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes7.dex */
class OutboundFlowController {

    /* renamed from: a, reason: collision with root package name */
    public final Transport f24129a;
    public final FrameWriter b;
    public int c = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    public final StreamState d = new StreamState(0, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);

    public interface Stream {
        void e(int i);
    }

    public final class StreamState {
        public final int b;
        public int c;
        public int d;
        public final Stream e;

        /* renamed from: a, reason: collision with root package name */
        public final Buffer f24130a = new Buffer();
        public boolean f = false;

        public StreamState(int i, int i2, Stream stream) {
            this.b = i;
            this.c = i2;
            this.e = stream;
        }

        public final boolean a() {
            return this.f24130a.e > 0;
        }

        public final int b(int i) {
            if (i <= 0 || Integer.MAX_VALUE - i >= this.c) {
                int i2 = this.c + i;
                this.c = i2;
                return i2;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.b);
        }

        public final void c(int i, Buffer buffer, boolean z) {
            OutboundFlowController outboundFlowController = OutboundFlowController.this;
            FrameWriter frameWriter = outboundFlowController.b;
            do {
                int iMin = Math.min(i, ((ForwardingFrameWriter) ((ExceptionHandlingFrameWriter) frameWriter).e).H1());
                int i2 = -iMin;
                outboundFlowController.d.b(i2);
                b(i2);
                try {
                    ((ExceptionHandlingFrameWriter) frameWriter).k1(buffer.e == ((long) iMin) && z, this.b, buffer, iMin);
                    this.e.e(iMin);
                    i -= iMin;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } while (i > 0);
        }

        public final void d(int i, WriteStatus writeStatus) {
            int i2 = this.c;
            OutboundFlowController outboundFlowController = OutboundFlowController.this;
            int iMin = Math.min(i, Math.min(i2, outboundFlowController.d.c));
            int i3 = 0;
            while (a() && iMin > 0) {
                long j = iMin;
                Buffer buffer = this.f24130a;
                long j2 = buffer.e;
                if (j >= j2) {
                    int i4 = (int) j2;
                    i3 += i4;
                    c(i4, buffer, this.f);
                } else {
                    i3 += iMin;
                    c(iMin, buffer, false);
                }
                writeStatus.f24131a++;
                iMin = Math.min(i - i3, Math.min(this.c, outboundFlowController.d.c));
            }
            a();
        }
    }

    public interface Transport {
        StreamState[] a();
    }

    public static final class WriteStatus {

        /* renamed from: a, reason: collision with root package name */
        public int f24131a;
    }

    public OutboundFlowController(Transport transport, FrameWriter frameWriter) {
        this.f24129a = transport;
        this.b = frameWriter;
    }

    public final void a(boolean z, StreamState streamState, Buffer buffer, boolean z2) {
        Preconditions.j(buffer, "source");
        int iMin = Math.min(streamState.c, OutboundFlowController.this.d.c);
        boolean zA = streamState.a();
        int i = (int) buffer.e;
        if (zA || iMin < i) {
            if (!zA && iMin > 0) {
                streamState.c(iMin, buffer, false);
            }
            streamState.f24130a.w1(buffer, (int) buffer.e);
            streamState.f = z | streamState.f;
        } else {
            streamState.c(i, buffer, z);
        }
        if (z2) {
            try {
                ((ExceptionHandlingFrameWriter) this.b).flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void b(StreamState streamState, int i) {
        if (streamState == null) {
            this.d.b(i);
            c();
            return;
        }
        streamState.b(i);
        WriteStatus writeStatus = new WriteStatus();
        streamState.d(Math.min(streamState.c, OutboundFlowController.this.d.c), writeStatus);
        if (writeStatus.f24131a > 0) {
            try {
                ((ExceptionHandlingFrameWriter) this.b).flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void c() {
        /*
            r13 = this;
            io.grpc.okhttp.OutboundFlowController$Transport r0 = r13.f24129a
            io.grpc.okhttp.OkHttpClientTransport r0 = (io.grpc.okhttp.OkHttpClientTransport) r0
            io.grpc.okhttp.OutboundFlowController$StreamState[] r1 = r0.a()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            io.grpc.okhttp.OutboundFlowController$StreamState r2 = r13.d
            int r2 = r2.c
            int r3 = r1.length
        L14:
            r4 = 0
            if (r3 <= 0) goto L68
            if (r2 <= 0) goto L68
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L24:
            if (r7 >= r3) goto L66
            if (r2 <= 0) goto L66
            r8 = r1[r7]
            int r9 = r8.c
            okio.Buffer r10 = r8.f24130a
            long r11 = r10.e
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4c
            int r11 = r8.d
            int r11 = r11 + r9
            r8.d = r11
            int r2 = r2 - r9
        L4c:
            int r9 = r8.c
            long r10 = r10.e
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.d
            int r9 = r9 - r10
            if (r9 <= 0) goto L63
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L63:
            int r7 = r7 + 1
            goto L24
        L66:
            r3 = r6
            goto L14
        L68:
            io.grpc.okhttp.OutboundFlowController$WriteStatus r1 = new io.grpc.okhttp.OutboundFlowController$WriteStatus
            r1.<init>()
            io.grpc.okhttp.OutboundFlowController$StreamState[] r0 = r0.a()
            int r2 = r0.length
            r3 = r4
        L73:
            if (r3 >= r2) goto L81
            r5 = r0[r3]
            int r6 = r5.d
            r5.d(r6, r1)
            r5.d = r4
            int r3 = r3 + 1
            goto L73
        L81:
            int r0 = r1.f24131a
            if (r0 <= 0) goto L94
            io.grpc.okhttp.internal.framed.FrameWriter r0 = r13.b     // Catch: java.io.IOException -> L8d
            io.grpc.okhttp.ExceptionHandlingFrameWriter r0 = (io.grpc.okhttp.ExceptionHandlingFrameWriter) r0     // Catch: java.io.IOException -> L8d
            r0.flush()     // Catch: java.io.IOException -> L8d
            return
        L8d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.OutboundFlowController.c():void");
    }
}

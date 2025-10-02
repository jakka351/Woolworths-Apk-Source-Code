package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Segment;
import okio.SegmentedByteString;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class WebSocketWriter implements Closeable {
    public final BufferedSink d;
    public final Random e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final Buffer i;
    public final Buffer j;
    public boolean k;
    public MessageDeflater l;
    public final byte[] m;
    public final Buffer.UnsafeCursor n;

    public WebSocketWriter(BufferedSink sink, Random random, boolean z, boolean z2, long j) {
        Intrinsics.h(sink, "sink");
        this.d = sink;
        this.e = random;
        this.f = z;
        this.g = z2;
        this.h = j;
        this.i = new Buffer();
        this.j = sink.getE();
        this.m = new byte[4];
        this.n = new Buffer.UnsafeCursor();
    }

    public final void a(int i, ByteString byteString) throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        int iC = byteString.c();
        if (iC > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        Buffer buffer = this.j;
        buffer.Y(i | 128);
        buffer.Y(iC | 128);
        byte[] bArr = this.m;
        Intrinsics.e(bArr);
        this.e.nextBytes(bArr);
        buffer.m599write(bArr);
        if (iC > 0) {
            long j = buffer.e;
            buffer.T(byteString);
            Buffer.UnsafeCursor unsafeCursor = this.n;
            Intrinsics.e(unsafeCursor);
            buffer.i(unsafeCursor);
            unsafeCursor.b(j);
            WebSocketProtocol.f26773a.getClass();
            WebSocketProtocol.b(unsafeCursor, bArr);
            unsafeCursor.close();
        }
        this.d.flush();
    }

    public final void b(int i, ByteString data) throws IOException {
        Intrinsics.h(data, "data");
        if (this.k) {
            throw new IOException("closed");
        }
        Buffer buffer = this.i;
        buffer.T(data);
        int i2 = i | 128;
        if (this.f && data.c() >= this.h) {
            MessageDeflater messageDeflater = this.l;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.g);
                this.l = messageDeflater;
            }
            DeflaterSink deflaterSink = messageDeflater.g;
            Buffer buffer2 = messageDeflater.e;
            if (buffer2.e != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (messageDeflater.d) {
                messageDeflater.f.reset();
            }
            deflaterSink.w1(buffer, buffer.e);
            deflaterSink.flush();
            if (buffer2.a0(buffer2.e - r2.data.length, MessageDeflaterKt.f26769a)) {
                long j = buffer2.e - 4;
                Buffer.UnsafeCursor unsafeCursorI = buffer2.i(SegmentedByteString.f26780a);
                try {
                    unsafeCursorI.a(j);
                    unsafeCursorI.close();
                } finally {
                }
            } else {
                buffer2.Y(0);
            }
            buffer.w1(buffer2, buffer2.e);
            i2 = i | BERTags.PRIVATE;
        }
        long j2 = buffer.e;
        Buffer buffer3 = this.j;
        buffer3.Y(i2);
        if (j2 <= 125) {
            buffer3.Y(((int) j2) | 128);
        } else if (j2 <= 65535) {
            buffer3.Y(254);
            buffer3.k0((int) j2);
        } else {
            buffer3.Y(255);
            Segment segmentR = buffer3.R(8);
            byte[] bArr = segmentR.f26782a;
            int i3 = segmentR.c;
            bArr[i3] = (byte) ((j2 >>> 56) & 255);
            bArr[i3 + 1] = (byte) ((j2 >>> 48) & 255);
            bArr[i3 + 2] = (byte) ((j2 >>> 40) & 255);
            bArr[i3 + 3] = (byte) ((j2 >>> 32) & 255);
            bArr[i3 + 4] = (byte) ((j2 >>> 24) & 255);
            bArr[i3 + 5] = (byte) ((j2 >>> 16) & 255);
            bArr[i3 + 6] = (byte) ((j2 >>> 8) & 255);
            bArr[i3 + 7] = (byte) (j2 & 255);
            segmentR.c = i3 + 8;
            buffer3.e += 8;
        }
        byte[] bArr2 = this.m;
        Intrinsics.e(bArr2);
        this.e.nextBytes(bArr2);
        buffer3.m599write(bArr2);
        if (j2 > 0) {
            Buffer.UnsafeCursor unsafeCursor = this.n;
            Intrinsics.e(unsafeCursor);
            buffer.i(unsafeCursor);
            unsafeCursor.b(0L);
            WebSocketProtocol.f26773a.getClass();
            WebSocketProtocol.b(unsafeCursor, bArr2);
            unsafeCursor.close();
        }
        buffer3.w1(buffer, j2);
        this.d.f1();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        MessageDeflater messageDeflater = this.l;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }
}

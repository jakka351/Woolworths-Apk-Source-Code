package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.hpke.HPKE;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "FrameCallback", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class WebSocketReader implements Closeable {
    public final BufferedSource d;
    public final FrameCallback e;
    public final boolean f;
    public final boolean g;
    public boolean h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final Buffer n;
    public final Buffer o;
    public MessageInflater p;
    public final byte[] q;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface FrameCallback {
        void c(ByteString byteString);

        void d(ByteString byteString);

        void f(int i, String str);

        void g(ByteString byteString);

        void h(String str);
    }

    public WebSocketReader(BufferedSource source, FrameCallback frameCallback, boolean z, boolean z2) {
        Intrinsics.h(source, "source");
        this.d = source;
        this.e = frameCallback;
        this.f = z;
        this.g = z2;
        this.n = new Buffer();
        this.o = new Buffer();
        this.q = null;
    }

    public final void a() throws DataFormatException, IOException {
        c();
        if (this.l) {
            b();
            return;
        }
        int i = this.i;
        if (i != 1 && i != 2) {
            TimeZone timeZone = _UtilJvmKt.f26699a;
            String hexString = Integer.toHexString(i);
            Intrinsics.g(hexString, "toHexString(...)");
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.h) {
            long j = this.j;
            Buffer buffer = this.o;
            if (j > 0) {
                this.d.l1(buffer, j);
            }
            if (this.k) {
                if (this.m) {
                    MessageInflater messageInflater = this.p;
                    if (messageInflater == null) {
                        messageInflater = new MessageInflater(this.g);
                        this.p = messageInflater;
                    }
                    Inflater inflater = messageInflater.f;
                    Buffer buffer2 = messageInflater.e;
                    if (buffer2.e != 0) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    if (messageInflater.d) {
                        inflater.reset();
                    }
                    buffer2.U(buffer);
                    buffer2.i0(Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                    long bytesRead = inflater.getBytesRead() + buffer2.e;
                    do {
                        messageInflater.g.a(buffer, Long.MAX_VALUE);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                }
                FrameCallback frameCallback = this.e;
                if (i == 1) {
                    frameCallback.h(buffer.v());
                    return;
                } else {
                    frameCallback.g(buffer.p0(buffer.e));
                    return;
                }
            }
            while (!this.h) {
                c();
                if (!this.l) {
                    break;
                } else {
                    b();
                }
            }
            if (this.i != 0) {
                int i2 = this.i;
                TimeZone timeZone2 = _UtilJvmKt.f26699a;
                String hexString2 = Integer.toHexString(i2);
                Intrinsics.g(hexString2, "toHexString(...)");
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        throw new IOException("closed");
    }

    public final void b() throws ProtocolException, EOFException {
        short s;
        String strV;
        long j = this.j;
        Buffer buffer = this.n;
        if (j > 0) {
            this.d.l1(buffer, j);
        }
        int i = this.i;
        FrameCallback frameCallback = this.e;
        switch (i) {
            case 8:
                long j2 = buffer.e;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = buffer.readShort();
                    strV = buffer.v();
                    WebSocketProtocol.f26773a.getClass();
                    String strA = WebSocketProtocol.a(s);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    s = 1005;
                    strV = "";
                }
                frameCallback.f(s, strV);
                this.h = true;
                return;
            case 9:
                frameCallback.c(buffer.p0(buffer.e));
                return;
            case 10:
                frameCallback.d(buffer.p0(buffer.e));
                return;
            default:
                int i2 = this.i;
                TimeZone timeZone = _UtilJvmKt.f26699a;
                String hexString = Integer.toHexString(i2);
                Intrinsics.g(hexString, "toHexString(...)");
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void c() throws IOException {
        boolean z;
        if (this.h) {
            throw new IOException("closed");
        }
        BufferedSource bufferedSource = this.d;
        long c = bufferedSource.getE().getC();
        bufferedSource.getE().c();
        try {
            byte b = bufferedSource.readByte();
            byte[] bArr = _UtilCommonKt.f26698a;
            bufferedSource.getE().h(c, TimeUnit.NANOSECONDS);
            int i = b & 15;
            this.i = i;
            boolean z2 = (b & 128) != 0;
            this.k = z2;
            boolean z3 = (b & 8) != 0;
            this.l = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.f) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.m = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b2 = bufferedSource.readByte();
            boolean z5 = (b2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = b2 & 127;
            this.j = j;
            if (j == 126) {
                this.j = bufferedSource.readShort() & HPKE.aead_EXPORT_ONLY;
            } else if (j == 127) {
                long j2 = bufferedSource.readLong();
                this.j = j2;
                if (j2 < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    long j3 = this.j;
                    TimeZone timeZone = _UtilJvmKt.f26699a;
                    String hexString = Long.toHexString(j3);
                    Intrinsics.g(hexString, "toHexString(...)");
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (this.l && this.j > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.q;
                Intrinsics.e(bArr2);
                bufferedSource.readFully(bArr2);
            }
        } catch (Throwable th) {
            bufferedSource.getE().h(c, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MessageInflater messageInflater = this.p;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }
}

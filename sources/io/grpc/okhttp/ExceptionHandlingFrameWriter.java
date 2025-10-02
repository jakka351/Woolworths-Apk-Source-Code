package io.grpc.okhttp;

import io.grpc.okhttp.AsyncSink;
import io.grpc.okhttp.OkHttpFrameLogger;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.FrameWriter;
import io.grpc.okhttp.internal.framed.Settings;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.ByteString;

/* loaded from: classes7.dex */
final class ExceptionHandlingFrameWriter implements FrameWriter {
    public static final Logger g = Logger.getLogger(OkHttpClientTransport.class.getName());
    public final OkHttpClientTransport d;
    public final FrameWriter e;
    public final OkHttpFrameLogger f;

    public interface TransportExceptionHandler {
    }

    public ExceptionHandlingFrameWriter(OkHttpClientTransport okHttpClientTransport, FrameWriter frameWriter) {
        Level level = Level.FINE;
        this.f = new OkHttpFrameLogger();
        this.d = okHttpClientTransport;
        this.e = frameWriter;
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void A0(ErrorCode errorCode, byte[] bArr) {
        FrameWriter frameWriter = this.e;
        ByteString byteString = ByteString.g;
        this.f.c(OkHttpFrameLogger.Direction.e, 0, errorCode, ByteString.Companion.c(bArr));
        try {
            ForwardingFrameWriter forwardingFrameWriter = (ForwardingFrameWriter) frameWriter;
            forwardingFrameWriter.A0(errorCode, bArr);
            forwardingFrameWriter.flush();
        } catch (IOException e) {
            this.d.p(e);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void E(int i, long j) {
        this.f.g(OkHttpFrameLogger.Direction.e, i, j);
        try {
            ((ForwardingFrameWriter) this.e).E(i, j);
        } catch (IOException e) {
            this.d.p(e);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final int H1() {
        return this.e.H1();
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void J(int i, int i2, boolean z) {
        OkHttpFrameLogger.Direction direction = OkHttpFrameLogger.Direction.e;
        OkHttpFrameLogger okHttpFrameLogger = this.f;
        if (z) {
            long j = (4294967295L & i2) | (i << 32);
            if (okHttpFrameLogger.a()) {
                okHttpFrameLogger.f24123a.log(okHttpFrameLogger.b, direction + " PING: ack=true bytes=" + j);
            }
        } else {
            okHttpFrameLogger.d(direction, (4294967295L & i2) | (i << 32));
        }
        try {
            ((AsyncSink.LimitControlFramesWriter) this.e).J(i, i2, z);
        } catch (IOException e) {
            this.d.p(e);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void M(int i, ErrorCode errorCode) {
        this.f.e(OkHttpFrameLogger.Direction.e, i, errorCode);
        try {
            ((AsyncSink.LimitControlFramesWriter) this.e).M(i, errorCode);
        } catch (IOException e) {
            this.d.p(e);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void S() {
        try {
            ((ForwardingFrameWriter) this.e).S();
        } catch (IOException e) {
            this.d.p(e);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void c0(int i, List list, boolean z) {
        try {
            ((ForwardingFrameWriter) this.e).c0(i, list, z);
        } catch (IOException e) {
            this.d.p(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.e.close();
        } catch (IOException e) {
            g.log(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void flush() {
        try {
            ((ForwardingFrameWriter) this.e).flush();
        } catch (IOException e) {
            this.d.p(e);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void k1(boolean z, int i, Buffer buffer, int i2) {
        buffer.getClass();
        this.f.b(OkHttpFrameLogger.Direction.e, i, buffer, i2, z);
        try {
            ((ForwardingFrameWriter) this.e).k1(z, i, buffer, i2);
        } catch (IOException e) {
            this.d.p(e);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void u(Settings settings) {
        this.f.f(OkHttpFrameLogger.Direction.e, settings);
        try {
            ((ForwardingFrameWriter) this.e).u(settings);
        } catch (IOException e) {
            this.d.p(e);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void u1(Settings settings) {
        OkHttpFrameLogger okHttpFrameLogger = this.f;
        if (okHttpFrameLogger.a()) {
            okHttpFrameLogger.f24123a.log(okHttpFrameLogger.b, OkHttpFrameLogger.Direction.e + " SETTINGS: ack=true");
        }
        try {
            ((AsyncSink.LimitControlFramesWriter) this.e).u1(settings);
        } catch (IOException e) {
            this.d.p(e);
        }
    }
}

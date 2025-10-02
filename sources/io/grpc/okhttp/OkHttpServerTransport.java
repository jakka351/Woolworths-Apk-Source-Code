package io.grpc.okhttp;

import io.grpc.InternalLogId;
import io.grpc.Status;
import io.grpc.internal.KeepAliveManager;
import io.grpc.internal.ServerTransport;
import io.grpc.okhttp.ExceptionHandlingFrameWriter;
import io.grpc.okhttp.OutboundFlowController;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.FrameReader;
import io.grpc.okhttp.internal.framed.Settings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.ByteString;
import okio.RealBufferedSource;

/* loaded from: classes7.dex */
final class OkHttpServerTransport implements ServerTransport, ExceptionHandlingFrameWriter.TransportExceptionHandler, OutboundFlowController.Transport {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f24126a = Logger.getLogger(OkHttpServerTransport.class.getName());

    /* renamed from: io.grpc.okhttp.OkHttpServerTransport$1, reason: invalid class name */
    class AnonymousClass1 extends ForwardingFrameWriter {
        @Override // io.grpc.okhttp.ForwardingFrameWriter, io.grpc.okhttp.internal.framed.FrameWriter
        public final void k1(boolean z, int i, Buffer buffer, int i2) {
            Logger logger = OkHttpServerTransport.f24126a;
            throw null;
        }
    }

    public static final class Config {
    }

    public class FrameHandler implements FrameReader.Handler, Runnable {
        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void E(int i, long j) {
            throw null;
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void J(int i, int i2, boolean z) {
            Logger logger = OkHttpServerTransport.f24126a;
            throw null;
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void M(int i, ErrorCode errorCode) {
            throw null;
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void N(boolean z, int i, ArrayList arrayList) {
            throw null;
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void O(boolean z, int i, RealBufferedSource realBufferedSource, int i2, int i3) {
            throw null;
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void P(int i, int i2, ArrayList arrayList) {
            throw null;
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void Q(int i, ErrorCode errorCode, ByteString byteString) {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpServerTransport");
            try {
                throw null;
            } catch (Throwable th) {
                try {
                    OkHttpServerTransport.f24126a.log(Level.WARNING, "Error decoding HTTP/2 frames", th);
                    Status.m.i("Error decoding HTTP/2 frames").h(th);
                    throw null;
                } catch (IOException unused) {
                    Logger logger = OkHttpServerTransport.f24126a;
                    throw null;
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public final void u(Settings settings) {
            throw null;
        }
    }

    public static class Http2ErrorStreamState implements StreamState, OutboundFlowController.Stream {
        @Override // io.grpc.okhttp.OutboundFlowController.Stream
        public final void e(int i) {
        }
    }

    public final class KeepAlivePinger implements KeepAliveManager.KeepAlivePinger {
    }

    public interface StreamState {
    }

    static {
        TimeUnit.SECONDS.toNanos(1L);
        ByteString byteString = ByteString.g;
        ByteString.Companion.b(":method");
        ByteString.Companion.b("CONNECT");
        ByteString.Companion.b("POST");
        ByteString.Companion.b(":scheme");
        ByteString.Companion.b(":path");
        ByteString.Companion.b(":authority");
        ByteString.Companion.b("connection");
        ByteString.Companion.b("host");
        ByteString.Companion.b("te");
        ByteString.Companion.b("trailers");
        ByteString.Companion.b("content-type");
        ByteString.Companion.b("content-length");
    }

    @Override // io.grpc.okhttp.OutboundFlowController.Transport
    public final OutboundFlowController.StreamState[] a() {
        throw null;
    }

    @Override // io.grpc.InternalWithLogId
    public final InternalLogId b() {
        return null;
    }
}

package io.grpc.okhttp;

import com.google.common.base.Preconditions;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.FrameWriter;
import io.grpc.okhttp.internal.framed.Settings;
import java.io.IOException;
import java.util.List;
import okio.Buffer;

/* loaded from: classes7.dex */
abstract class ForwardingFrameWriter implements FrameWriter {
    public final FrameWriter d;

    public ForwardingFrameWriter(FrameWriter frameWriter) {
        Preconditions.j(frameWriter, "delegate");
        this.d = frameWriter;
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void A0(ErrorCode errorCode, byte[] bArr) {
        this.d.A0(errorCode, bArr);
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void E(int i, long j) {
        this.d.E(i, j);
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final int H1() {
        return this.d.H1();
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public void J(int i, int i2, boolean z) {
        this.d.J(i, i2, z);
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public void M(int i, ErrorCode errorCode) {
        this.d.M(i, errorCode);
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void S() {
        this.d.S();
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void c0(int i, List list, boolean z) {
        this.d.c0(i, list, z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void flush() {
        this.d.flush();
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public void k1(boolean z, int i, Buffer buffer, int i2) {
        this.d.k1(z, i, buffer, i2);
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public final void u(Settings settings) {
        this.d.u(settings);
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public void u1(Settings settings) {
        this.d.u1(settings);
    }
}

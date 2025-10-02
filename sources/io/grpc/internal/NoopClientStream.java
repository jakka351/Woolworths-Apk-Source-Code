package io.grpc.internal;

import io.grpc.Compressor;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Status;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class NoopClientStream implements ClientStream {

    /* renamed from: a, reason: collision with root package name */
    public static final NoopClientStream f24060a = new NoopClientStream();

    @Override // io.grpc.internal.Stream
    public final void a(Compressor compressor) {
    }

    @Override // io.grpc.internal.Stream
    public final void b(int i) {
    }

    @Override // io.grpc.internal.ClientStream
    public final void c(int i) {
    }

    @Override // io.grpc.internal.ClientStream
    public final void d(int i) {
    }

    @Override // io.grpc.internal.ClientStream
    public final void e(Status status) {
    }

    @Override // io.grpc.internal.ClientStream
    public final void f() {
    }

    @Override // io.grpc.internal.Stream
    public final void flush() {
    }

    @Override // io.grpc.internal.Stream
    public final void g(InputStream inputStream) {
    }

    @Override // io.grpc.internal.Stream
    public final void h() {
    }

    @Override // io.grpc.internal.ClientStream
    public final void i() {
    }

    @Override // io.grpc.internal.Stream
    public final boolean isReady() {
        return false;
    }

    @Override // io.grpc.internal.ClientStream
    public final void j(DecompressorRegistry decompressorRegistry) {
    }

    @Override // io.grpc.internal.ClientStream
    public final void k() {
    }

    @Override // io.grpc.internal.ClientStream
    public void l(InsightBuilder insightBuilder) {
        insightBuilder.f24022a.add("noop");
    }

    @Override // io.grpc.internal.ClientStream
    public final void m(Deadline deadline) {
    }

    @Override // io.grpc.internal.ClientStream
    public void n(ClientStreamListener clientStreamListener) {
    }
}

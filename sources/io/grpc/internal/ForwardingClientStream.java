package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.Compressor;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Status;
import java.io.InputStream;

/* loaded from: classes7.dex */
abstract class ForwardingClientStream implements ClientStream {
    @Override // io.grpc.internal.Stream
    public final void a(Compressor compressor) {
        o().a(compressor);
    }

    @Override // io.grpc.internal.Stream
    public final void b(int i) {
        o().b(1);
    }

    @Override // io.grpc.internal.ClientStream
    public final void c(int i) {
        o().c(i);
    }

    @Override // io.grpc.internal.ClientStream
    public final void d(int i) {
        o().d(i);
    }

    @Override // io.grpc.internal.ClientStream
    public final void e(Status status) {
        o().e(status);
    }

    @Override // io.grpc.internal.ClientStream
    public final void f() {
        o().f();
    }

    @Override // io.grpc.internal.Stream
    public final void flush() {
        o().flush();
    }

    @Override // io.grpc.internal.Stream
    public final void g(InputStream inputStream) {
        o().g(inputStream);
    }

    @Override // io.grpc.internal.Stream
    public final void h() {
        o().h();
    }

    @Override // io.grpc.internal.ClientStream
    public final void i() {
        o().i();
    }

    @Override // io.grpc.internal.Stream
    public final boolean isReady() {
        return o().isReady();
    }

    @Override // io.grpc.internal.ClientStream
    public final void j(DecompressorRegistry decompressorRegistry) {
        o().j(decompressorRegistry);
    }

    @Override // io.grpc.internal.ClientStream
    public final void k() {
        o().k();
    }

    @Override // io.grpc.internal.ClientStream
    public final void l(InsightBuilder insightBuilder) {
        o().l(insightBuilder);
    }

    @Override // io.grpc.internal.ClientStream
    public final void m(Deadline deadline) {
        o().m(deadline);
    }

    @Override // io.grpc.internal.ClientStream
    public void n(ClientStreamListener clientStreamListener) {
        o().n(clientStreamListener);
    }

    public abstract ClientStream o();

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(o(), "delegate");
        return toStringHelperB.toString();
    }
}

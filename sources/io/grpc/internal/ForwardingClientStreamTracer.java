package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.Attributes;
import io.grpc.ClientStreamTracer;
import io.grpc.Metadata;
import io.grpc.Status;

/* loaded from: classes7.dex */
public abstract class ForwardingClientStreamTracer extends ClientStreamTracer {
    @Override // io.grpc.StreamTracer
    public final void a(int i) {
        o().a(i);
    }

    @Override // io.grpc.StreamTracer
    public final void b(int i, long j) {
        o().b(i, j);
    }

    @Override // io.grpc.StreamTracer
    public final void c(long j) {
        o().c(j);
    }

    @Override // io.grpc.StreamTracer
    public final void d(long j) {
        o().d(j);
    }

    @Override // io.grpc.StreamTracer
    public final void e(int i) {
        o().e(i);
    }

    @Override // io.grpc.StreamTracer
    public final void f(int i, long j, long j2) {
        o().f(i, j, j2);
    }

    @Override // io.grpc.StreamTracer
    public final void g(long j) {
        o().g(j);
    }

    @Override // io.grpc.StreamTracer
    public final void h(long j) {
        o().h(j);
    }

    @Override // io.grpc.StreamTracer
    public final void i(Status status) {
        o().i(status);
    }

    @Override // io.grpc.ClientStreamTracer
    public final void j() {
        o().j();
    }

    @Override // io.grpc.ClientStreamTracer
    public final void k() {
        o().k();
    }

    @Override // io.grpc.ClientStreamTracer
    public final void l(Metadata metadata) {
        o().l(metadata);
    }

    @Override // io.grpc.ClientStreamTracer
    public final void m() {
        o().m();
    }

    @Override // io.grpc.ClientStreamTracer
    public final void n(Attributes attributes, Metadata metadata) {
        o().n(attributes, metadata);
    }

    public abstract ClientStreamTracer o();

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(o(), "delegate");
        return toStringHelperB.toString();
    }
}

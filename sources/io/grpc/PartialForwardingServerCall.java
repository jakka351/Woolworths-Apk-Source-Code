package io.grpc;

import com.google.common.base.MoreObjects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class PartialForwardingServerCall<ReqT, RespT> extends ServerCall<ReqT, RespT> {
    @Override // io.grpc.ServerCall
    public void a(Status status, Metadata metadata) {
        i().a(status, metadata);
    }

    @Override // io.grpc.ServerCall
    public Attributes b() {
        return i().b();
    }

    @Override // io.grpc.ServerCall
    public String c() {
        return i().c();
    }

    @Override // io.grpc.ServerCall
    public boolean d() {
        return i().d();
    }

    @Override // io.grpc.ServerCall
    public boolean e() {
        return i().e();
    }

    @Override // io.grpc.ServerCall
    public void f(int i) {
        i().f(i);
    }

    @Override // io.grpc.ServerCall
    public void g(Metadata metadata) {
        i().g(metadata);
    }

    public abstract ServerCall i();

    public String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(i(), "delegate");
        return toStringHelperB.toString();
    }
}

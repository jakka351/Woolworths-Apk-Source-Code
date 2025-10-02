package io.grpc;

import com.google.common.base.MoreObjects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class PartialForwardingClientCall<ReqT, RespT> extends ClientCall<ReqT, RespT> {
    @Override // io.grpc.ClientCall
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // io.grpc.ClientCall
    public void b() {
        f().b();
    }

    @Override // io.grpc.ClientCall
    public void c() {
        f().c();
    }

    public abstract ClientCall f();

    public String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(f(), "delegate");
        return toStringHelperB.toString();
    }
}

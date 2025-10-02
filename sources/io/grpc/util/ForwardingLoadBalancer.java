package io.grpc.util;

import com.google.common.base.MoreObjects;
import io.grpc.ExperimentalApi;
import io.grpc.LoadBalancer;
import io.grpc.Status;

@ExperimentalApi
/* loaded from: classes7.dex */
public abstract class ForwardingLoadBalancer extends LoadBalancer {
    @Override // io.grpc.LoadBalancer
    public final boolean b() {
        return g().b();
    }

    @Override // io.grpc.LoadBalancer
    public final void c(Status status) {
        g().c(status);
    }

    @Override // io.grpc.LoadBalancer
    public final void d(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        g().d(resolvedAddresses);
    }

    @Override // io.grpc.LoadBalancer
    public final void e() {
        g().e();
    }

    @Override // io.grpc.LoadBalancer
    public void f() {
        g().f();
    }

    public abstract LoadBalancer g();

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(g(), "delegate");
        return toStringHelperB.toString();
    }
}

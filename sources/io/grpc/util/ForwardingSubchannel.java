package io.grpc.util;

import com.google.common.base.MoreObjects;
import io.grpc.Attributes;
import io.grpc.ChannelLogger;
import io.grpc.ExperimentalApi;
import io.grpc.LoadBalancer;
import java.util.List;

@ExperimentalApi
/* loaded from: classes7.dex */
public abstract class ForwardingSubchannel extends LoadBalancer.Subchannel {
    @Override // io.grpc.LoadBalancer.Subchannel
    public final List b() {
        return j().b();
    }

    @Override // io.grpc.LoadBalancer.Subchannel
    public Attributes c() {
        return j().c();
    }

    @Override // io.grpc.LoadBalancer.Subchannel
    public final ChannelLogger d() {
        return j().d();
    }

    @Override // io.grpc.LoadBalancer.Subchannel
    public final Object e() {
        return j().e();
    }

    @Override // io.grpc.LoadBalancer.Subchannel
    public final void f() {
        j().f();
    }

    @Override // io.grpc.LoadBalancer.Subchannel
    public void g() {
        j().g();
    }

    @Override // io.grpc.LoadBalancer.Subchannel
    public void h(LoadBalancer.SubchannelStateListener subchannelStateListener) {
        j().h(subchannelStateListener);
    }

    @Override // io.grpc.LoadBalancer.Subchannel
    public void i(List list) {
        j().i(list);
    }

    public abstract LoadBalancer.Subchannel j();

    public String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(j(), "delegate");
        return toStringHelperB.toString();
    }
}

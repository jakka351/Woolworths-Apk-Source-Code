package io.grpc.util;

import com.google.common.base.Preconditions;
import io.grpc.ConnectivityState;
import io.grpc.ExperimentalApi;
import io.grpc.LoadBalancer;
import io.grpc.Status;
import javax.annotation.concurrent.NotThreadSafe;

@ExperimentalApi
@NotThreadSafe
/* loaded from: classes7.dex */
public final class GracefulSwitchLoadBalancer extends ForwardingLoadBalancer {
    public static final LoadBalancer.SubchannelPicker o = new AnonymousClass2();
    public final LoadBalancer f;
    public final ForwardingLoadBalancerHelper g;
    public LoadBalancer.Factory h;
    public LoadBalancer i;
    public LoadBalancer.Factory j;
    public LoadBalancer k;
    public ConnectivityState l;
    public LoadBalancer.SubchannelPicker m;
    public boolean n;

    /* renamed from: io.grpc.util.GracefulSwitchLoadBalancer$1PendingHelper, reason: invalid class name */
    class C1PendingHelper extends ForwardingLoadBalancerHelper {

        /* renamed from: a, reason: collision with root package name */
        public LoadBalancer f24160a;

        public C1PendingHelper() {
        }

        @Override // io.grpc.util.ForwardingLoadBalancerHelper, io.grpc.LoadBalancer.Helper
        public final void f(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
            LoadBalancer loadBalancer = this.f24160a;
            GracefulSwitchLoadBalancer gracefulSwitchLoadBalancer = GracefulSwitchLoadBalancer.this;
            LoadBalancer loadBalancer2 = gracefulSwitchLoadBalancer.k;
            ConnectivityState connectivityState2 = ConnectivityState.e;
            if (loadBalancer == loadBalancer2) {
                Preconditions.q("there's pending lb while current lb has been out of READY", gracefulSwitchLoadBalancer.n);
                gracefulSwitchLoadBalancer.l = connectivityState;
                gracefulSwitchLoadBalancer.m = subchannelPicker;
                if (connectivityState == connectivityState2) {
                    gracefulSwitchLoadBalancer.h();
                    return;
                }
                return;
            }
            if (loadBalancer == gracefulSwitchLoadBalancer.i) {
                boolean z = connectivityState == connectivityState2;
                gracefulSwitchLoadBalancer.n = z;
                if (z || loadBalancer2 == gracefulSwitchLoadBalancer.f) {
                    gracefulSwitchLoadBalancer.g.f(connectivityState, subchannelPicker);
                } else {
                    gracefulSwitchLoadBalancer.h();
                }
            }
        }

        @Override // io.grpc.util.ForwardingLoadBalancerHelper
        public final LoadBalancer.Helper g() {
            return GracefulSwitchLoadBalancer.this.g;
        }
    }

    /* renamed from: io.grpc.util.GracefulSwitchLoadBalancer$2, reason: invalid class name */
    public class AnonymousClass2 extends LoadBalancer.SubchannelPicker {
        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            return LoadBalancer.PickResult.e;
        }

        public final String toString() {
            return "BUFFER_PICKER";
        }
    }

    public GracefulSwitchLoadBalancer(ForwardingLoadBalancerHelper forwardingLoadBalancerHelper) {
        LoadBalancer loadBalancer = new LoadBalancer() { // from class: io.grpc.util.GracefulSwitchLoadBalancer.1
            @Override // io.grpc.LoadBalancer
            public final void c(Status status) {
                GracefulSwitchLoadBalancer.this.g.f(ConnectivityState.f, new LoadBalancer.FixedResultPicker(LoadBalancer.PickResult.a(status)));
            }

            @Override // io.grpc.LoadBalancer
            public final void d(LoadBalancer.ResolvedAddresses resolvedAddresses) {
                throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
            }

            @Override // io.grpc.LoadBalancer
            public final void f() {
            }
        };
        this.f = loadBalancer;
        this.i = loadBalancer;
        this.k = loadBalancer;
        this.g = forwardingLoadBalancerHelper;
    }

    @Override // io.grpc.util.ForwardingLoadBalancer, io.grpc.LoadBalancer
    public final void f() {
        this.k.f();
        this.i.f();
    }

    @Override // io.grpc.util.ForwardingLoadBalancer
    public final LoadBalancer g() {
        LoadBalancer loadBalancer = this.k;
        return loadBalancer == this.f ? this.i : loadBalancer;
    }

    public final void h() {
        this.g.f(this.l, this.m);
        this.i.f();
        this.i = this.k;
        this.h = this.j;
        this.k = this.f;
        this.j = null;
    }

    public final void i(LoadBalancer.Factory factory) {
        Preconditions.j(factory, "newBalancerFactory");
        if (factory.equals(this.j)) {
            return;
        }
        this.k.f();
        this.k = this.f;
        this.j = null;
        this.l = ConnectivityState.d;
        this.m = o;
        if (factory.equals(this.h)) {
            return;
        }
        C1PendingHelper c1PendingHelper = new C1PendingHelper();
        LoadBalancer loadBalancerA = factory.a(c1PendingHelper);
        c1PendingHelper.f24160a = loadBalancerA;
        this.k = loadBalancerA;
        this.j = factory;
        if (this.n) {
            return;
        }
        h();
    }
}

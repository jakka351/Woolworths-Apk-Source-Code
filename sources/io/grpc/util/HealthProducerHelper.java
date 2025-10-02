package io.grpc.util;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import io.grpc.ConnectivityStateInfo;
import io.grpc.Internal;
import io.grpc.LoadBalancer;

@Internal
/* loaded from: classes7.dex */
public final class HealthProducerHelper extends ForwardingLoadBalancerHelper {

    /* renamed from: a, reason: collision with root package name */
    public final LoadBalancer.Helper f24161a;

    @VisibleForTesting
    public static final class HealthProducerSubchannel extends ForwardingSubchannel {

        /* renamed from: a, reason: collision with root package name */
        public final LoadBalancer.Subchannel f24162a;
        public final LoadBalancer.SubchannelStateListener b;

        public HealthProducerSubchannel(LoadBalancer.Subchannel subchannel, LoadBalancer.SubchannelStateListener subchannelStateListener) {
            Preconditions.j(subchannel, "delegate");
            this.f24162a = subchannel;
            Preconditions.j(subchannelStateListener, "healthListener");
            this.b = subchannelStateListener;
        }

        @Override // io.grpc.util.ForwardingSubchannel, io.grpc.LoadBalancer.Subchannel
        public final Attributes c() {
            Attributes attributesC = super.c();
            attributesC.getClass();
            Attributes.Builder builder = new Attributes.Builder(attributesC);
            builder.b(LoadBalancer.d, Boolean.TRUE);
            return builder.a();
        }

        @Override // io.grpc.util.ForwardingSubchannel, io.grpc.LoadBalancer.Subchannel
        public final void h(final LoadBalancer.SubchannelStateListener subchannelStateListener) {
            this.f24162a.h(new LoadBalancer.SubchannelStateListener() { // from class: io.grpc.util.HealthProducerHelper.HealthProducerSubchannel.1
                @Override // io.grpc.LoadBalancer.SubchannelStateListener
                public final void a(ConnectivityStateInfo connectivityStateInfo) {
                    subchannelStateListener.a(connectivityStateInfo);
                    HealthProducerSubchannel.this.b.a(connectivityStateInfo);
                }
            });
        }

        @Override // io.grpc.util.ForwardingSubchannel
        public final LoadBalancer.Subchannel j() {
            return this.f24162a;
        }
    }

    public HealthProducerHelper(LoadBalancer.Helper helper) {
        this.f24161a = helper;
    }

    @Override // io.grpc.util.ForwardingLoadBalancerHelper, io.grpc.LoadBalancer.Helper
    public final LoadBalancer.Subchannel a(LoadBalancer.CreateSubchannelArgs createSubchannelArgs) {
        LoadBalancer.SubchannelStateListener subchannelStateListener = (LoadBalancer.SubchannelStateListener) createSubchannelArgs.a();
        LoadBalancer.Subchannel subchannelA = super.a(createSubchannelArgs);
        if (subchannelStateListener != null) {
            Attributes attributesC = subchannelA.c();
            if (attributesC.f23916a.get(LoadBalancer.d) == null) {
                return new HealthProducerSubchannel(subchannelA, subchannelStateListener);
            }
        }
        return subchannelA;
    }

    @Override // io.grpc.util.ForwardingLoadBalancerHelper
    public final LoadBalancer.Helper g() {
        return this.f24161a;
    }
}

package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.LoadBalancer;
import io.grpc.LoadBalancerProvider;
import io.grpc.LoadBalancerRegistry;
import io.grpc.Status;

/* loaded from: classes7.dex */
public final class AutoConfiguredLoadBalancerFactory {

    /* renamed from: a, reason: collision with root package name */
    public final LoadBalancerRegistry f23985a;
    public final String b;

    @VisibleForTesting
    public final class AutoConfiguredLoadBalancer {

        /* renamed from: a, reason: collision with root package name */
        public final LoadBalancer.Helper f23986a;
        public LoadBalancer b;
        public LoadBalancerProvider c;

        public AutoConfiguredLoadBalancer(LoadBalancer.Helper helper) {
            this.f23986a = helper;
            LoadBalancerRegistry loadBalancerRegistry = AutoConfiguredLoadBalancerFactory.this.f23985a;
            String str = AutoConfiguredLoadBalancerFactory.this.b;
            LoadBalancerProvider loadBalancerProviderB = loadBalancerRegistry.b(str);
            this.c = loadBalancerProviderB;
            if (loadBalancerProviderB == null) {
                throw new IllegalStateException(YU.a.h("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            }
            this.b = loadBalancerProviderB.a(helper);
        }
    }

    public static final class EmptyPicker extends LoadBalancer.SubchannelPicker {
        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            return LoadBalancer.PickResult.e;
        }

        public final String toString() {
            return new MoreObjects.ToStringHelper(EmptyPicker.class.getSimpleName()).toString();
        }
    }

    public static final class FailingPicker extends LoadBalancer.SubchannelPicker {

        /* renamed from: a, reason: collision with root package name */
        public final Status f23987a;

        public FailingPicker(Status status) {
            this.f23987a = status;
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            return LoadBalancer.PickResult.a(this.f23987a);
        }
    }

    public static final class NoopLoadBalancer extends LoadBalancer {
        @Override // io.grpc.LoadBalancer
        public final Status a(LoadBalancer.ResolvedAddresses resolvedAddresses) {
            return Status.e;
        }

        @Override // io.grpc.LoadBalancer
        public final void c(Status status) {
        }

        @Override // io.grpc.LoadBalancer
        public final void d(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        }

        @Override // io.grpc.LoadBalancer
        public final void f() {
        }
    }

    @VisibleForTesting
    public static final class PolicyException extends Exception {
    }

    public AutoConfiguredLoadBalancerFactory(String str) {
        LoadBalancerRegistry loadBalancerRegistryA = LoadBalancerRegistry.a();
        Preconditions.j(loadBalancerRegistryA, "registry");
        this.f23985a = loadBalancerRegistryA;
        Preconditions.j(str, "defaultPolicy");
        this.b = str;
    }
}

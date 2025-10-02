package io.grpc.util;

import io.grpc.LoadBalancer;
import io.grpc.LoadBalancerProvider;
import io.grpc.NameResolver;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class SecretRoundRobinLoadBalancerProvider {

    public static final class Provider extends LoadBalancerProvider {
        public static final /* synthetic */ int b = 0;

        @Override // io.grpc.LoadBalancer.Factory
        public final LoadBalancer a(LoadBalancer.Helper helper) {
            return new RoundRobinLoadBalancer(helper);
        }

        @Override // io.grpc.LoadBalancerProvider
        public final String b() {
            return "round_robin";
        }

        @Override // io.grpc.LoadBalancerProvider
        public final NameResolver.ConfigOrError c(Map map) {
            return new NameResolver.ConfigOrError("no service config");
        }
    }
}

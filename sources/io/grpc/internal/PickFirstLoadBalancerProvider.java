package io.grpc.internal;

import com.google.common.base.Strings;
import io.grpc.LoadBalancer;
import io.grpc.LoadBalancerProvider;
import io.grpc.NameResolver;
import io.grpc.Status;
import io.grpc.internal.PickFirstLoadBalancer;
import java.util.Map;

/* loaded from: classes7.dex */
public final class PickFirstLoadBalancerProvider extends LoadBalancerProvider {
    public static final boolean b;

    static {
        b = !Strings.a(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // io.grpc.LoadBalancer.Factory
    public final LoadBalancer a(LoadBalancer.Helper helper) {
        return b ? new PickFirstLeafLoadBalancer(helper) : new PickFirstLoadBalancer(helper);
    }

    @Override // io.grpc.LoadBalancerProvider
    public final String b() {
        return "pick_first";
    }

    @Override // io.grpc.LoadBalancerProvider
    public final NameResolver.ConfigOrError c(Map map) {
        try {
            return new NameResolver.ConfigOrError(new PickFirstLoadBalancer.PickFirstLoadBalancerConfig(JsonUtil.b("shuffleAddressList", map)));
        } catch (RuntimeException e) {
            return new NameResolver.ConfigOrError(Status.n.h(e).i("Failed parsing configuration for pick_first"));
        }
    }
}

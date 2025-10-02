package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.LoadBalancer;
import io.grpc.NameResolver;
import java.util.Map;

@ExperimentalApi
/* loaded from: classes7.dex */
public abstract class LoadBalancerProvider extends LoadBalancer.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final NameResolver.ConfigOrError f23956a = new NameResolver.ConfigOrError(new UnknownConfig());

    public static final class UnknownConfig {
        public final String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public NameResolver.ConfigOrError c(Map map) {
        return f23956a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(b(), "policy");
        toStringHelperB.a(5, "priority");
        toStringHelperB.d("available", true);
        return toStringHelperB.toString();
    }
}

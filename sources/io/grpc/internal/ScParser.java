package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import io.grpc.NameResolver;
import io.grpc.Status;
import java.util.List;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes7.dex */
public final class ScParser extends NameResolver.ServiceConfigParser {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24099a;
    public final int b;
    public final int c;
    public final AutoConfiguredLoadBalancerFactory d;

    public ScParser(boolean z, int i, int i2, AutoConfiguredLoadBalancerFactory autoConfiguredLoadBalancerFactory) {
        this.f24099a = z;
        this.b = i;
        this.c = i2;
        this.d = autoConfiguredLoadBalancerFactory;
    }

    @Override // io.grpc.NameResolver.ServiceConfigParser
    public final NameResolver.ConfigOrError a(Map map) {
        List listD;
        NameResolver.ConfigOrError configOrError;
        try {
            AutoConfiguredLoadBalancerFactory autoConfiguredLoadBalancerFactory = this.d;
            autoConfiguredLoadBalancerFactory.getClass();
            Object obj = null;
            if (map != null) {
                try {
                    listD = ServiceConfigUtil.d(ServiceConfigUtil.b(map));
                } catch (RuntimeException e) {
                    configOrError = new NameResolver.ConfigOrError(Status.g.i("can't parse load balancer configuration").h(e));
                }
            } else {
                listD = null;
            }
            configOrError = (listD == null || listD.isEmpty()) ? null : ServiceConfigUtil.c(listD, autoConfiguredLoadBalancerFactory.f23985a);
            if (configOrError != null) {
                Status status = configOrError.f23966a;
                if (status != null) {
                    return new NameResolver.ConfigOrError(status);
                }
                obj = configOrError.b;
            }
            return new NameResolver.ConfigOrError(ManagedChannelServiceConfig.a(map, this.f24099a, this.b, this.c, obj));
        } catch (RuntimeException e2) {
            return new NameResolver.ConfigOrError(Status.g.i("failed to parse service config").h(e2));
        }
    }
}

package io.grpc.util;

import com.google.common.base.Preconditions;
import io.grpc.Internal;
import io.grpc.LoadBalancer;
import io.grpc.LoadBalancerProvider;
import io.grpc.LoadBalancerRegistry;
import io.grpc.NameResolver;
import io.grpc.Status;
import io.grpc.internal.JsonUtil;
import io.grpc.internal.ServiceConfigUtil;
import io.grpc.util.OutlierDetectionLoadBalancer;
import java.util.List;
import java.util.Map;

@Internal
/* loaded from: classes7.dex */
public final class OutlierDetectionLoadBalancerProvider extends LoadBalancerProvider {
    public static NameResolver.ConfigOrError d(Map map) {
        Long lI = JsonUtil.i("interval", map);
        Long lI2 = JsonUtil.i("baseEjectionTime", map);
        Long lI3 = JsonUtil.i("maxEjectionTime", map);
        Integer numF = JsonUtil.f("maxEjectionPercentage", map);
        OutlierDetectionLoadBalancer.OutlierDetectionLoadBalancerConfig.Builder builder = new OutlierDetectionLoadBalancer.OutlierDetectionLoadBalancerConfig.Builder();
        builder.f24173a = 10000000000L;
        builder.b = 30000000000L;
        builder.c = 300000000000L;
        builder.d = 10;
        if (lI != null) {
            builder.f24173a = lI;
        }
        if (lI2 != null) {
            builder.b = lI2;
        }
        if (lI3 != null) {
            builder.c = lI3;
        }
        if (numF != null) {
            builder.d = numF;
        }
        Map mapG = JsonUtil.g("successRateEjection", map);
        if (mapG != null) {
            OutlierDetectionLoadBalancer.OutlierDetectionLoadBalancerConfig.SuccessRateEjection.Builder builder2 = new OutlierDetectionLoadBalancer.OutlierDetectionLoadBalancerConfig.SuccessRateEjection.Builder();
            builder2.f24177a = 1900;
            builder2.b = 100;
            builder2.c = 5;
            builder2.d = 100;
            Integer numF2 = JsonUtil.f("stdevFactor", mapG);
            Integer numF3 = JsonUtil.f("enforcementPercentage", mapG);
            Integer numF4 = JsonUtil.f("minimumHosts", mapG);
            Integer numF5 = JsonUtil.f("requestVolume", mapG);
            if (numF2 != null) {
                builder2.f24177a = numF2;
            }
            if (numF3 != null) {
                Preconditions.g(numF3.intValue() >= 0 && numF3.intValue() <= 100);
                builder2.b = numF3;
            }
            if (numF4 != null) {
                Preconditions.g(numF4.intValue() >= 0);
                builder2.c = numF4;
            }
            if (numF5 != null) {
                Preconditions.g(numF5.intValue() >= 0);
                builder2.d = numF5;
            }
            builder.e = new OutlierDetectionLoadBalancer.OutlierDetectionLoadBalancerConfig.SuccessRateEjection(builder2.f24177a, builder2.b, builder2.c, builder2.d);
        }
        Map mapG2 = JsonUtil.g("failurePercentageEjection", map);
        if (mapG2 != null) {
            OutlierDetectionLoadBalancer.OutlierDetectionLoadBalancerConfig.FailurePercentageEjection.Builder builder3 = new OutlierDetectionLoadBalancer.OutlierDetectionLoadBalancerConfig.FailurePercentageEjection.Builder();
            builder3.f24175a = 85;
            builder3.b = 100;
            builder3.c = 5;
            builder3.d = 50;
            Integer numF6 = JsonUtil.f("threshold", mapG2);
            Integer numF7 = JsonUtil.f("enforcementPercentage", mapG2);
            Integer numF8 = JsonUtil.f("minimumHosts", mapG2);
            Integer numF9 = JsonUtil.f("requestVolume", mapG2);
            if (numF6 != null) {
                Preconditions.g(numF6.intValue() >= 0 && numF6.intValue() <= 100);
                builder3.f24175a = numF6;
            }
            if (numF7 != null) {
                Preconditions.g(numF7.intValue() >= 0 && numF7.intValue() <= 100);
                builder3.b = numF7;
            }
            if (numF8 != null) {
                Preconditions.g(numF8.intValue() >= 0);
                builder3.c = numF8;
            }
            if (numF9 != null) {
                Preconditions.g(numF9.intValue() >= 0);
                builder3.d = numF9;
            }
            builder.f = new OutlierDetectionLoadBalancer.OutlierDetectionLoadBalancerConfig.FailurePercentageEjection(builder3.f24175a, builder3.b, builder3.c, builder3.d);
        }
        List listC = JsonUtil.c("childPolicy", map);
        if (listC == null) {
            listC = null;
        } else {
            JsonUtil.a(listC);
        }
        List listD = ServiceConfigUtil.d(listC);
        if (listD == null || listD.isEmpty()) {
            return new NameResolver.ConfigOrError(Status.m.i("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        NameResolver.ConfigOrError configOrErrorC = ServiceConfigUtil.c(listD, LoadBalancerRegistry.a());
        if (configOrErrorC.f23966a != null) {
            return configOrErrorC;
        }
        ServiceConfigUtil.PolicySelection policySelection = (ServiceConfigUtil.PolicySelection) configOrErrorC.b;
        Preconditions.r(policySelection != null);
        builder.g = policySelection;
        Preconditions.r(policySelection != null);
        return new NameResolver.ConfigOrError(new OutlierDetectionLoadBalancer.OutlierDetectionLoadBalancerConfig(builder.f24173a, builder.b, builder.c, builder.d, builder.e, builder.f, builder.g));
    }

    @Override // io.grpc.LoadBalancer.Factory
    public final LoadBalancer a(LoadBalancer.Helper helper) {
        return new OutlierDetectionLoadBalancer(helper);
    }

    @Override // io.grpc.LoadBalancerProvider
    public final String b() {
        return "outlier_detection_experimental";
    }

    @Override // io.grpc.LoadBalancerProvider
    public final NameResolver.ConfigOrError c(Map map) {
        try {
            return d(map);
        } catch (RuntimeException e) {
            return new NameResolver.ConfigOrError(Status.n.h(e).i("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}

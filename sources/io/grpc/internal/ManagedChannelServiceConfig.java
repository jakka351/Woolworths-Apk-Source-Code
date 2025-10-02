package io.grpc.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.base.Verify;
import io.grpc.CallOptions;
import io.grpc.InternalConfigSelector;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.RetriableStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
final class ManagedChannelServiceConfig {

    /* renamed from: a, reason: collision with root package name */
    public final MethodInfo f24055a;
    public final Map b;
    public final Map c;
    public final RetriableStream.Throttle d;
    public final Object e;
    public final Map f;

    public static final class MethodInfo {
        public static final CallOptions.Key g = new CallOptions.Key("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a, reason: collision with root package name */
        public final Long f24056a;
        public final Boolean b;
        public final Integer c;
        public final Integer d;
        public final RetryPolicy e;
        public final HedgingPolicy f;

        public MethodInfo(Map map, int i, boolean z, int i2) {
            long j;
            boolean z2;
            RetryPolicy retryPolicy;
            HedgingPolicy hedgingPolicy;
            this.f24056a = JsonUtil.i("timeout", map);
            this.b = JsonUtil.b("waitForReady", map);
            Integer numF = JsonUtil.f("maxResponseMessageBytes", map);
            this.c = numF;
            if (numF != null) {
                Preconditions.e("maxInboundMessageSize %s exceeds bounds", numF, numF.intValue() >= 0);
            }
            Integer numF2 = JsonUtil.f("maxRequestMessageBytes", map);
            this.d = numF2;
            if (numF2 != null) {
                Preconditions.e("maxOutboundMessageSize %s exceeds bounds", numF2, numF2.intValue() >= 0);
            }
            Map mapG = z ? JsonUtil.g("retryPolicy", map) : null;
            if (mapG == null) {
                j = 0;
                retryPolicy = null;
                z2 = true;
            } else {
                Integer numF3 = JsonUtil.f("maxAttempts", mapG);
                Preconditions.j(numF3, "maxAttempts cannot be empty");
                int iIntValue = numF3.intValue();
                Preconditions.b(iIntValue, "maxAttempts must be greater than 1: %s", iIntValue >= 2);
                int iMin = Math.min(iIntValue, i);
                Long lI = JsonUtil.i("initialBackoff", mapG);
                Preconditions.j(lI, "initialBackoff cannot be empty");
                long jLongValue = lI.longValue();
                Preconditions.c(jLongValue, "initialBackoffNanos must be greater than 0: %s", jLongValue > 0);
                Long lI2 = JsonUtil.i("maxBackoff", mapG);
                Preconditions.j(lI2, "maxBackoff cannot be empty");
                long jLongValue2 = lI2.longValue();
                j = 0;
                z2 = true;
                Preconditions.c(jLongValue2, "maxBackoff must be greater than 0: %s", jLongValue2 > 0);
                Double dE = JsonUtil.e("backoffMultiplier", mapG);
                Preconditions.j(dE, "backoffMultiplier cannot be empty");
                double dDoubleValue = dE.doubleValue();
                Preconditions.e("backoffMultiplier must be greater than 0: %s", dE, dDoubleValue > 0.0d);
                Long lI3 = JsonUtil.i("perAttemptRecvTimeout", mapG);
                Preconditions.e("perAttemptRecvTimeout cannot be negative: %s", lI3, lI3 == null || lI3.longValue() >= 0);
                Set setA = ServiceConfigUtil.a("retryableStatusCodes", mapG);
                Verify.a("%s is required in retry policy", "retryableStatusCodes", setA != null);
                Verify.a("%s must not contain OK", "retryableStatusCodes", !setA.contains(Status.Code.OK));
                Preconditions.f("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (lI3 == null && setA.isEmpty()) ? false : true);
                retryPolicy = new RetryPolicy(iMin, jLongValue, jLongValue2, dDoubleValue, lI3, setA);
            }
            this.e = retryPolicy;
            Map mapG2 = z ? JsonUtil.g("hedgingPolicy", map) : null;
            if (mapG2 == null) {
                hedgingPolicy = null;
            } else {
                Integer numF4 = JsonUtil.f("maxAttempts", mapG2);
                Preconditions.j(numF4, "maxAttempts cannot be empty");
                int iIntValue2 = numF4.intValue();
                Preconditions.b(iIntValue2, "maxAttempts must be greater than 1: %s", iIntValue2 >= 2 ? z2 : false);
                int iMin2 = Math.min(iIntValue2, i2);
                Long lI4 = JsonUtil.i("hedgingDelay", mapG2);
                Preconditions.j(lI4, "hedgingDelay cannot be empty");
                long jLongValue3 = lI4.longValue();
                Preconditions.c(jLongValue3, "hedgingDelay must not be negative: %s", jLongValue3 >= j ? z2 : false);
                Set setA2 = ServiceConfigUtil.a("nonFatalStatusCodes", mapG2);
                if (setA2 == null) {
                    setA2 = Collections.unmodifiableSet(EnumSet.noneOf(Status.Code.class));
                } else {
                    Verify.a("%s must not contain OK", "nonFatalStatusCodes", !setA2.contains(Status.Code.OK));
                }
                hedgingPolicy = new HedgingPolicy(iMin2, jLongValue3, setA2);
            }
            this.f = hedgingPolicy;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof MethodInfo)) {
                return false;
            }
            MethodInfo methodInfo = (MethodInfo) obj;
            return Objects.a(this.f24056a, methodInfo.f24056a) && Objects.a(this.b, methodInfo.b) && Objects.a(this.c, methodInfo.c) && Objects.a(this.d, methodInfo.d) && Objects.a(this.e, methodInfo.e) && Objects.a(this.f, methodInfo.f);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f24056a, this.b, this.c, this.d, this.e, this.f});
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(this.f24056a, "timeoutNanos");
            toStringHelperB.c(this.b, "waitForReady");
            toStringHelperB.c(this.c, "maxInboundMessageSize");
            toStringHelperB.c(this.d, "maxOutboundMessageSize");
            toStringHelperB.c(this.e, "retryPolicy");
            toStringHelperB.c(this.f, "hedgingPolicy");
            return toStringHelperB.toString();
        }
    }

    public static final class ServiceConfigConvertedSelector extends InternalConfigSelector {
        public final ManagedChannelServiceConfig b;

        public ServiceConfigConvertedSelector(ManagedChannelServiceConfig managedChannelServiceConfig) {
            this.b = managedChannelServiceConfig;
        }

        @Override // io.grpc.InternalConfigSelector
        public final InternalConfigSelector.Result a() {
            return new InternalConfigSelector.Result(Status.e, this.b);
        }
    }

    public ManagedChannelServiceConfig(MethodInfo methodInfo, HashMap map, HashMap map2, RetriableStream.Throttle throttle, Object obj, Map map3) {
        this.f24055a = methodInfo;
        this.b = Collections.unmodifiableMap(new HashMap(map));
        this.c = Collections.unmodifiableMap(new HashMap(map2));
        this.d = throttle;
        this.e = obj;
        this.f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static ManagedChannelServiceConfig a(Map map, boolean z, int i, int i2, Object obj) {
        RetriableStream.Throttle throttle;
        Map mapG;
        RetriableStream.Throttle throttle2;
        if (z) {
            if (map == null || (mapG = JsonUtil.g("retryThrottling", map)) == null) {
                throttle2 = null;
            } else {
                float fFloatValue = JsonUtil.e("maxTokens", mapG).floatValue();
                float fFloatValue2 = JsonUtil.e("tokenRatio", mapG).floatValue();
                Preconditions.q("maxToken should be greater than zero", fFloatValue > BitmapDescriptorFactory.HUE_RED);
                Preconditions.q("tokenRatio should be greater than zero", fFloatValue2 > BitmapDescriptorFactory.HUE_RED);
                throttle2 = new RetriableStream.Throttle(fFloatValue, fFloatValue2);
            }
            throttle = throttle2;
        } else {
            throttle = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapG2 = map == null ? null : JsonUtil.g("healthCheckConfig", map);
        List<Map> listC = JsonUtil.c("methodConfig", map);
        if (listC == null) {
            listC = null;
        } else {
            JsonUtil.a(listC);
        }
        if (listC == null) {
            return new ManagedChannelServiceConfig(null, map2, map3, throttle, obj, mapG2);
        }
        MethodInfo methodInfo = null;
        for (Map map4 : listC) {
            MethodInfo methodInfo2 = new MethodInfo(map4, i, z, i2);
            List<Map> listC2 = JsonUtil.c(AppMeasurementSdk.ConditionalUserProperty.NAME, map4);
            if (listC2 == null) {
                listC2 = null;
            } else {
                JsonUtil.a(listC2);
            }
            if (listC2 != null && !listC2.isEmpty()) {
                for (Map map5 : listC2) {
                    String strH = JsonUtil.h("service", map5);
                    String strH2 = JsonUtil.h("method", map5);
                    if (Strings.a(strH)) {
                        Preconditions.e("missing service name for method %s", strH2, Strings.a(strH2));
                        Preconditions.e("Duplicate default method config in service config %s", map, methodInfo == null);
                        methodInfo = methodInfo2;
                    } else if (Strings.a(strH2)) {
                        Preconditions.e("Duplicate service %s", strH, !map3.containsKey(strH));
                        map3.put(strH, methodInfo2);
                    } else {
                        String strA = MethodDescriptor.a(strH, strH2);
                        Preconditions.e("Duplicate method name %s", strA, !map2.containsKey(strA));
                        map2.put(strA, methodInfo2);
                    }
                }
            }
        }
        return new ManagedChannelServiceConfig(methodInfo, map2, map3, throttle, obj, mapG2);
    }

    public final InternalConfigSelector b() {
        if (this.c.isEmpty() && this.b.isEmpty() && this.f24055a == null) {
            return null;
        }
        return new ServiceConfigConvertedSelector(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ManagedChannelServiceConfig.class == obj.getClass()) {
            ManagedChannelServiceConfig managedChannelServiceConfig = (ManagedChannelServiceConfig) obj;
            if (Objects.a(this.f24055a, managedChannelServiceConfig.f24055a) && Objects.a(this.b, managedChannelServiceConfig.b) && Objects.a(this.c, managedChannelServiceConfig.c) && Objects.a(this.d, managedChannelServiceConfig.d) && Objects.a(this.e, managedChannelServiceConfig.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24055a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f24055a, "defaultMethodConfig");
        toStringHelperB.c(this.b, "serviceMethodMap");
        toStringHelperB.c(this.c, "serviceMap");
        toStringHelperB.c(this.d, "retryThrottling");
        toStringHelperB.c(this.e, "loadBalancingConfig");
        return toStringHelperB.toString();
    }
}

package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import io.grpc.LoadBalancerProvider;
import io.grpc.LoadBalancerRegistry;
import io.grpc.NameResolver;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.oriient.positioningengine.ondevice.ml.MlModel;

/* loaded from: classes7.dex */
public final class ServiceConfigUtil {

    public static final class LbConfig {

        /* renamed from: a, reason: collision with root package name */
        public final String f24102a;
        public final Map b;

        public LbConfig(String str, Map map) {
            Preconditions.j(str, "policyName");
            this.f24102a = str;
            Preconditions.j(map, "rawConfigValue");
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof LbConfig) {
                LbConfig lbConfig = (LbConfig) obj;
                if (this.f24102a.equals(lbConfig.f24102a) && this.b.equals(lbConfig.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f24102a, this.b});
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(this.f24102a, "policyName");
            toStringHelperB.c(this.b, "rawConfigValue");
            return toStringHelperB.toString();
        }
    }

    public static final class PolicySelection {

        /* renamed from: a, reason: collision with root package name */
        public final LoadBalancerProvider f24103a;
        public final Object b;

        public PolicySelection(LoadBalancerProvider loadBalancerProvider, Object obj) {
            this.f24103a = loadBalancerProvider;
            this.b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PolicySelection.class == obj.getClass()) {
                PolicySelection policySelection = (PolicySelection) obj;
                if (Objects.a(this.f24103a, policySelection.f24103a) && Objects.a(this.b, policySelection.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f24103a, this.b});
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(this.f24103a, "provider");
            toStringHelperB.c(this.b, MlModel.MODEL_FILE_SUFFIX);
            return toStringHelperB.toString();
        }
    }

    public static Set a(String str, Map map) {
        Status.Code codeValueOf;
        List listC = JsonUtil.c(str, map);
        if (listC == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(Status.Code.class);
        for (Object obj : listC) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                Verify.a("Status code %s is not integral", obj, ((double) iIntValue) == d.doubleValue());
                codeValueOf = Status.d(iIntValue).f23971a;
                Verify.a("Status code %s is not valid", obj, codeValueOf.d == d.intValue());
            } else {
                if (!(obj instanceof String)) {
                    throw new VerifyException("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    codeValueOf = Status.Code.valueOf((String) obj);
                } catch (IllegalArgumentException e) {
                    throw new VerifyException(androidx.camera.core.impl.b.n(obj, "Status code ", " is not valid"), e);
                }
            }
            enumSetNoneOf.add(codeValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static List b(Map map) {
        String strH;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listC = JsonUtil.c("loadBalancingConfig", map);
            if (listC == null) {
                listC = null;
            } else {
                JsonUtil.a(listC);
            }
            arrayList.addAll(listC);
        }
        if (arrayList.isEmpty() && (strH = JsonUtil.h("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(strH.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static NameResolver.ConfigOrError c(List list, LoadBalancerRegistry loadBalancerRegistry) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LbConfig lbConfig = (LbConfig) it.next();
            String str = lbConfig.f24102a;
            LoadBalancerProvider loadBalancerProviderB = loadBalancerRegistry.b(str);
            if (loadBalancerProviderB != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(ServiceConfigUtil.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                NameResolver.ConfigOrError configOrErrorC = loadBalancerProviderB.c(lbConfig.b);
                return configOrErrorC.f23966a != null ? configOrErrorC : new NameResolver.ConfigOrError(new PolicySelection(loadBalancerProviderB, configOrErrorC.b));
            }
            arrayList.add(str);
        }
        return new NameResolver.ConfigOrError(Status.g.i("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List d(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new LbConfig(str, JsonUtil.g(str, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }
}

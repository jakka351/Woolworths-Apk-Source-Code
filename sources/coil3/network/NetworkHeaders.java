package coil3.network;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.rest.RequestBuilder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/network/NetworkHeaders;", "", "Builder", "Companion", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkHeaders {
    public static final NetworkHeaders b = new Builder().b();

    /* renamed from: a, reason: collision with root package name */
    public final Map f13128a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/network/NetworkHeaders$Companion;", "", "Lcoil3/network/NetworkHeaders;", "EMPTY", "Lcoil3/network/NetworkHeaders;", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public NetworkHeaders(Map map) {
        this.f13128a = map;
    }

    public final String a() {
        String lowerCase = RequestBuilder.CONTENT_TYPE.toLowerCase(Locale.ROOT);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        List list = (List) this.f13128a.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.P(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NetworkHeaders) && Intrinsics.c(this.f13128a, ((NetworkHeaders) obj).f13128a);
    }

    public final int hashCode() {
        return this.f13128a.hashCode();
    }

    public final String toString() {
        return android.support.v4.media.session.a.u(new StringBuilder("NetworkHeaders(data="), this.f13128a, ')');
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/network/NetworkHeaders$Builder;", "", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f13129a;

        public Builder() {
            this.f13129a = new LinkedHashMap();
        }

        public final void a(String str, String str2) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            LinkedHashMap linkedHashMap = this.f13129a;
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }

        public final NetworkHeaders b() {
            return new NetworkHeaders(MapsKt.q(this.f13129a));
        }

        public final void c(String str) {
            String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            this.f13129a.put(lowerCase, CollectionsKt.Z(str));
        }

        public Builder(NetworkHeaders networkHeaders) {
            Map map = networkHeaders.f13128a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), CollectionsKt.J0((Collection) entry.getValue()));
            }
            this.f13129a = linkedHashMap;
        }
    }
}

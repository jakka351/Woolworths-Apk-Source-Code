package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "Selection", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RouteSelector {
    public static final Companion i = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Address f26721a;
    public final RouteDatabase b;
    public final ConnectionUser c;
    public final boolean d;
    public final List e;
    public int f;
    public Object g;
    public final ArrayList h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Selection {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f26722a;
        public int b;

        public Selection(ArrayList arrayList) {
            this.f26722a = arrayList;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, ConnectionUser connectionUser, boolean z) {
        List listK;
        Intrinsics.h(address, "address");
        Intrinsics.h(routeDatabase, "routeDatabase");
        Intrinsics.h(connectionUser, "connectionUser");
        this.f26721a = address;
        this.b = routeDatabase;
        this.c = connectionUser;
        this.d = z;
        EmptyList emptyList = EmptyList.d;
        this.e = emptyList;
        this.g = emptyList;
        this.h = new ArrayList();
        HttpUrl httpUrl = address.h;
        connectionUser.c(httpUrl);
        URI uriL = httpUrl.l();
        if (uriL.getHost() == null) {
            listK = _UtilJvmKt.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = address.g.select(uriL);
            List<Proxy> list = listSelect;
            listK = (list == null || list.isEmpty()) ? _UtilJvmKt.k(new Proxy[]{Proxy.NO_PROXY}) : _UtilJvmKt.j(listSelect);
        }
        this.e = listK;
        this.f = 0;
        connectionUser.d(httpUrl, listK);
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}

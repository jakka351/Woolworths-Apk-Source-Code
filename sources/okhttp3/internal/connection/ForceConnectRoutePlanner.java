package okhttp3.internal.connection;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RoutePlanner;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/ForceConnectRoutePlanner;", "Lokhttp3/internal/connection/RoutePlanner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ForceConnectRoutePlanner implements RoutePlanner {

    /* renamed from: a, reason: collision with root package name */
    public final RealRoutePlanner f26715a;

    public ForceConnectRoutePlanner(RealRoutePlanner realRoutePlanner) {
        this.f26715a = realRoutePlanner;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean a(RealConnection realConnection) {
        return this.f26715a.a(realConnection);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    /* renamed from: b */
    public final ArrayDeque getP() {
        return this.f26715a.p;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean c(HttpUrl url) {
        Intrinsics.h(url, "url");
        return this.f26715a.c(url);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    /* renamed from: d */
    public final Address getJ() {
        return this.f26715a.j;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final RoutePlanner.Plan e() {
        return this.f26715a.f();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean isCanceled() {
        return this.f26715a.l.isCanceled();
    }
}

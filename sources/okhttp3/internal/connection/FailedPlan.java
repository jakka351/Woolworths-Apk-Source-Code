package okhttp3.internal.connection;

import kotlin.Metadata;
import okhttp3.internal.connection.RoutePlanner;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/FailedPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FailedPlan implements RoutePlanner.Plan {
    public final RoutePlanner.ConnectResult d;

    public FailedPlan(Throwable th) {
        this.d = new RoutePlanner.ConnectResult(this, null, th, 2);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: b */
    public final RealConnection getD() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: d, reason: from getter */
    public final RoutePlanner.ConnectResult getD() {
        return this.d;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult e() {
        return this.d;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan g() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean isReady() {
        return false;
    }
}

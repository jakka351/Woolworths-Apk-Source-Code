package okhttp3.internal.connection;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RoutePlanner;", "", "Plan", "ConnectResult", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RoutePlanner {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConnectResult {

        /* renamed from: a, reason: collision with root package name */
        public final Plan f26720a;
        public final Plan b;
        public final Throwable c;

        public /* synthetic */ ConnectResult(Plan plan, ConnectPlan connectPlan, Throwable th, int i) {
            this(plan, (i & 2) != 0 ? null : connectPlan, (i & 4) != 0 ? null : th);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectResult)) {
                return false;
            }
            ConnectResult connectResult = (ConnectResult) obj;
            return Intrinsics.c(this.f26720a, connectResult.f26720a) && Intrinsics.c(this.b, connectResult.b) && Intrinsics.c(this.c, connectResult.c);
        }

        public final int hashCode() {
            int iHashCode = this.f26720a.hashCode() * 31;
            Plan plan = this.b;
            int iHashCode2 = (iHashCode + (plan == null ? 0 : plan.hashCode())) * 31;
            Throwable th = this.c;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            return "ConnectResult(plan=" + this.f26720a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
        }

        public ConnectResult(Plan plan, Plan plan2, Throwable th) {
            this.f26720a = plan;
            this.b = plan2;
            this.c = th;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RoutePlanner$Plan;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Plan {
        RealConnection b();

        void cancel();

        ConnectResult d();

        ConnectResult e();

        Plan g();

        boolean isReady();
    }

    boolean a(RealConnection realConnection);

    ArrayDeque b();

    boolean c(HttpUrl httpUrl);

    Address d();

    Plan e();

    boolean isCanceled();
}

package au.com.woolworths.pagingutils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/pagingutils/NetworkState;", "", "Companion", "paging-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NetworkState {
    public static final NetworkState d = new NetworkState(Status.e, null, null);
    public static final NetworkState e = new NetworkState(Status.d, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Status f9174a;
    public final String b;
    public final Throwable c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/pagingutils/NetworkState$Companion;", "", "paging-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public NetworkState(Status status, String str, Throwable th) {
        this.f9174a = status;
        this.b = str;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.f9174a == networkState.f9174a && Intrinsics.c(this.b, networkState.b) && Intrinsics.c(this.c, networkState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f9174a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkState(status=" + this.f9174a + ", msg=" + this.b + ", throwable=" + this.c + ")";
    }
}

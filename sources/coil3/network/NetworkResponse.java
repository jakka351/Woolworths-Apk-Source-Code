package coil3.network;

import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/network/NetworkResponse;", "", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkResponse {

    /* renamed from: a, reason: collision with root package name */
    public final int f13131a;
    public final long b;
    public final long c;
    public final NetworkHeaders d;
    public final NetworkResponseBody e;
    public final Object f;

    public NetworkResponse(int i, long j, long j2, NetworkHeaders networkHeaders, NetworkResponseBody networkResponseBody, Object obj) {
        this.f13131a = i;
        this.b = j;
        this.c = j2;
        this.d = networkHeaders;
        this.e = networkResponseBody;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkResponse)) {
            return false;
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        return this.f13131a == networkResponse.f13131a && this.b == networkResponse.b && this.c == networkResponse.c && Intrinsics.c(this.d, networkResponse.d) && Intrinsics.c(this.e, networkResponse.e) && Intrinsics.c(this.f, networkResponse.f);
    }

    public final int hashCode() {
        int iD = d.d(this.d.f13128a, b.b(b.b(this.f13131a * 31, 31, this.b), 31, this.c), 31);
        NetworkResponseBody networkResponseBody = this.e;
        int iHashCode = (iD + (networkResponseBody == null ? 0 : networkResponseBody.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.f13131a);
        sb.append(", requestMillis=");
        sb.append(this.b);
        sb.append(", responseMillis=");
        sb.append(this.c);
        sb.append(", headers=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", delegate=");
        return android.support.v4.media.session.a.s(sb, this.f, ')');
    }
}

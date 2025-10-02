package coil3.network;

import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/network/NetworkRequest;", "", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f13130a;
    public final String b;
    public final NetworkHeaders c;
    public final NetworkRequestBody d;

    public NetworkRequest(String str, String str2, NetworkHeaders networkHeaders, NetworkRequestBody networkRequestBody) {
        this.f13130a = str;
        this.b = str2;
        this.c = networkHeaders;
        this.d = networkRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkRequest)) {
            return false;
        }
        NetworkRequest networkRequest = (NetworkRequest) obj;
        return Intrinsics.c(this.f13130a, networkRequest.f13130a) && Intrinsics.c(this.b, networkRequest.b) && Intrinsics.c(this.c, networkRequest.c) && Intrinsics.c(this.d, networkRequest.d);
    }

    public final int hashCode() {
        int iD = d.d(this.c.f13128a, b.c(this.f13130a.hashCode() * 31, 31, this.b), 31);
        NetworkRequestBody networkRequestBody = this.d;
        return iD + (networkRequestBody == null ? 0 : networkRequestBody.hashCode());
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.f13130a + ", method=" + this.b + ", headers=" + this.c + ", body=" + this.d + ')';
    }
}

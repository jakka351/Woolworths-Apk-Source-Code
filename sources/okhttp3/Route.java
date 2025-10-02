package okhttp3;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal._HostnamesCommonKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Route;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Route {

    /* renamed from: a, reason: collision with root package name */
    public final Address f26694a;
    public final Proxy b;
    public final InetSocketAddress c;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.h(address, "address");
        Intrinsics.h(socketAddress, "socketAddress");
        this.f26694a = address;
        this.b = proxy;
        this.c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return Intrinsics.c(route.f26694a, this.f26694a) && Intrinsics.c(route.b, this.b) && Intrinsics.c(route.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f26694a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        Address address = this.f26694a;
        HttpUrl httpUrl = address.h;
        HttpUrl httpUrl2 = address.h;
        String str = httpUrl.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address2 = inetSocketAddress.getAddress();
        String strB = (address2 == null || (hostAddress = address2.getHostAddress()) == null) ? null : _HostnamesCommonKt.b(hostAddress);
        if (StringsKt.p(str, ':')) {
            androidx.compose.ui.input.pointer.a.w(sb, "[", str, "]");
        } else {
            sb.append(str);
        }
        if (httpUrl2.e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb.append(":");
            sb.append(httpUrl2.e);
        }
        if (!str.equals(strB)) {
            if (this.b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strB == null) {
                sb.append("<unresolved>");
            } else if (StringsKt.p(strB, ':')) {
                androidx.compose.ui.input.pointer.a.w(sb, "[", strB, "]");
            } else {
                sb.append(strB);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}

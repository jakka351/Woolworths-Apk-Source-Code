package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class HttpConnectProxiedSocketAddress extends ProxiedSocketAddress {
    public static final /* synthetic */ int h = 0;
    public final SocketAddress d;
    public final InetSocketAddress e;
    public final String f;
    public final String g;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public SocketAddress f23939a;
        public InetSocketAddress b;
        public String c;
        public String d;
    }

    public HttpConnectProxiedSocketAddress(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        Preconditions.j(socketAddress, "proxyAddress");
        Preconditions.j(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            Preconditions.p("The proxy address %s is not resolved", socketAddress, !((InetSocketAddress) socketAddress).isUnresolved());
        }
        this.d = socketAddress;
        this.e = inetSocketAddress;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HttpConnectProxiedSocketAddress)) {
            return false;
        }
        HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress = (HttpConnectProxiedSocketAddress) obj;
        return Objects.a(this.d, httpConnectProxiedSocketAddress.d) && Objects.a(this.e, httpConnectProxiedSocketAddress.e) && Objects.a(this.f, httpConnectProxiedSocketAddress.f) && Objects.a(this.g, httpConnectProxiedSocketAddress.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.d, "proxyAddr");
        toStringHelperB.c(this.e, "targetAddr");
        toStringHelperB.c(this.f, "username");
        toStringHelperB.d("hasPassword", this.g != null);
        return toStringHelperB.toString();
    }
}

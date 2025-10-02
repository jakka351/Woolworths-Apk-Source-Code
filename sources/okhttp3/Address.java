package okhttp3;

import androidx.camera.core.impl.b;
import java.io.EOFException;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Address;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Address {

    /* renamed from: a, reason: collision with root package name */
    public final Dns f26659a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final CertificatePinner e;
    public final Authenticator f;
    public final ProxySelector g;
    public final HttpUrl h;
    public final List i;
    public final List j;

    public Address(String uriHost, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) throws EOFException {
        Intrinsics.h(uriHost, "uriHost");
        Intrinsics.h(dns, "dns");
        Intrinsics.h(socketFactory, "socketFactory");
        Intrinsics.h(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.h(protocols, "protocols");
        Intrinsics.h(connectionSpecs, "connectionSpecs");
        Intrinsics.h(proxySelector, "proxySelector");
        this.f26659a = dns;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = certificatePinner;
        this.f = proxyAuthenticator;
        this.g = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            builder.f26684a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            builder.f26684a = "https";
        }
        String strB = _HostnamesCommonKt.b(_UrlKt.d(0, 0, 7, uriHost));
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        builder.d = strB;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(YU.a.d(i, "unexpected port: ").toString());
        }
        builder.e = i;
        this.h = builder.d();
        this.i = _UtilJvmKt.j(protocols);
        this.j = _UtilJvmKt.j(connectionSpecs);
    }

    public final boolean a(Address that) {
        Intrinsics.h(that, "that");
        return Intrinsics.c(this.f26659a, that.f26659a) && Intrinsics.c(this.f, that.f) && Intrinsics.c(this.i, that.i) && Intrinsics.c(this.j, that.j) && Intrinsics.c(this.g, that.g) && Intrinsics.c(this.c, that.c) && Intrinsics.c(this.d, that.d) && Intrinsics.c(this.e, that.e) && this.h.e == that.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.c(this.h, address.h) && a(address);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + b.d(b.d((this.f.hashCode() + ((this.f26659a.hashCode() + b.c(527, 31, this.h.i)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.h;
        sb.append(httpUrl.d);
        sb.append(':');
        sb.append(httpUrl.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}

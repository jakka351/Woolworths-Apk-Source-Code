package io.grpc.internal;

import com.google.common.base.Supplier;
import io.grpc.HttpConnectProxiedSocketAddress;
import io.grpc.ProxiedSocketAddress;
import io.grpc.ProxyDetector;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
class ProxyDetectorImpl implements ProxyDetector {
    public static final Logger d = Logger.getLogger(ProxyDetectorImpl.class.getName());
    public static final AnonymousClass1 e = new AnonymousClass1();
    public static final Supplier f = new AnonymousClass2();

    /* renamed from: a, reason: collision with root package name */
    public final Supplier f24075a;
    public final AuthenticationProvider b;
    public final InetSocketAddress c;

    /* renamed from: io.grpc.internal.ProxyDetectorImpl$1, reason: invalid class name */
    public class AnonymousClass1 implements AuthenticationProvider {
        @Override // io.grpc.internal.ProxyDetectorImpl.AuthenticationProvider
        public final PasswordAuthentication a(String str, InetAddress inetAddress, int i) {
            URL url;
            try {
                url = new URL("https", str, i, "");
            } catch (MalformedURLException unused) {
                ProxyDetectorImpl.d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* renamed from: io.grpc.internal.ProxyDetectorImpl$2, reason: invalid class name */
    public class AnonymousClass2 implements Supplier<ProxySelector> {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return ProxySelector.getDefault();
        }
    }

    public interface AuthenticationProvider {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i);
    }

    public ProxyDetectorImpl() {
        String str = System.getenv("GRPC_PROXY_EXP");
        Supplier supplier = f;
        supplier.getClass();
        this.f24075a = supplier;
        AnonymousClass1 anonymousClass1 = e;
        anonymousClass1.getClass();
        this.b = anonymousClass1;
        if (str == null) {
            this.c = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.c = new InetSocketAddress(strArrSplit[0], i);
    }

    @Override // io.grpc.ProxyDetector
    public final ProxiedSocketAddress a(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress != null) {
            InetSocketAddress inetSocketAddress2 = this.c;
            if (inetSocketAddress2 != null) {
                int i = HttpConnectProxiedSocketAddress.h;
                HttpConnectProxiedSocketAddress.Builder builder = new HttpConnectProxiedSocketAddress.Builder();
                builder.f23939a = inetSocketAddress2;
                builder.b = inetSocketAddress;
                return new HttpConnectProxiedSocketAddress(builder.f23939a, builder.b, builder.c, builder.d);
            }
            Logger logger = d;
            try {
                try {
                    URI uri = new URI("https", null, GrpcUtil.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                    ProxySelector proxySelector = (ProxySelector) this.f24075a.get();
                    if (proxySelector == null) {
                        logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> listSelect = proxySelector.select(uri);
                    if (listSelect.size() > 1) {
                        logger.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = listSelect.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                        PasswordAuthentication passwordAuthenticationA = this.b.a(GrpcUtil.d(inetSocketAddress3), inetSocketAddress3.getAddress(), inetSocketAddress3.getPort());
                        if (inetSocketAddress3.isUnresolved()) {
                            inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                        }
                        int i2 = HttpConnectProxiedSocketAddress.h;
                        HttpConnectProxiedSocketAddress.Builder builder2 = new HttpConnectProxiedSocketAddress.Builder();
                        builder2.b = inetSocketAddress;
                        builder2.f23939a = inetSocketAddress3;
                        if (passwordAuthenticationA == null) {
                            return new HttpConnectProxiedSocketAddress(builder2.f23939a, builder2.b, builder2.c, builder2.d);
                        }
                        builder2.c = passwordAuthenticationA.getUserName();
                        builder2.d = passwordAuthenticationA.getPassword() != null ? new String(passwordAuthenticationA.getPassword()) : null;
                        return new HttpConnectProxiedSocketAddress(builder2.f23939a, builder2.b, builder2.c, builder2.d);
                    }
                } catch (URISyntaxException e2) {
                    logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e2);
                }
            } catch (Throwable th) {
                logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            }
        }
        return null;
    }
}

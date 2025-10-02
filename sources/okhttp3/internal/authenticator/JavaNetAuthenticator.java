package okhttp3.internal.authenticator;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;
import okhttp3.Dns;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JavaNetAuthenticator implements Authenticator {
    public final Dns b;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26700a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26700a = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(0);
    }

    public static InetAddress b(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.f26700a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.D(dns.a(httpUrl.d));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.f(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.g(address, "getAddress(...)");
        return address;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    @Override // okhttp3.Authenticator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Request a(okhttp3.Route r19, okhttp3.Response r20) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.authenticator.JavaNetAuthenticator.a(okhttp3.Route, okhttp3.Response):okhttp3.Request");
    }

    public JavaNetAuthenticator(int i) {
        Dns defaultDns = Dns.f26677a;
        Intrinsics.h(defaultDns, "defaultDns");
        this.b = defaultDns;
    }
}

package okhttp3.internal.platform;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/Jdk9Platform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public class Jdk9Platform extends Platform {
    public static final Integer d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/Jdk9Platform$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        String property = System.getProperty("java.specification.version");
        Integer numI0 = property != null ? StringsKt.i0(property) : null;
        d = numI0;
        if (numI0 != null) {
            return;
        }
        try {
            SSLSocket.class.getMethod("getApplicationProtocol", null);
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void c(SSLSocket sSLSocket, String str, List protocols) {
        Intrinsics.h(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Platform.f26752a.getClass();
        sSLParameters.setApplicationProtocols((String[]) Platform.Companion.a(protocols).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    public final String e(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext j() throws NoSuchAlgorithmException {
        SSLContext sSLContext;
        Integer num = d;
        if (num != null && num.intValue() >= 9) {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            Intrinsics.g(sSLContext2, "getInstance(...)");
            return sSLContext2;
        }
        try {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } catch (NoSuchAlgorithmException unused) {
            sSLContext = SSLContext.getInstance("TLS");
        }
        Intrinsics.e(sSLContext);
        return sSLContext;
    }
}

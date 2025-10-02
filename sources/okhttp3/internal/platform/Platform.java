package okhttp3.internal.platform;

import YU.a;
import android.os.Build;
import android.util.Log;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidLogHandler;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okio.Buffer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class Platform {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f26752a = new Companion(0);
    public static volatile Platform b;
    public static final Logger c;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001c\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "<init>", "()V", "Lokhttp3/internal/platform/Platform;", k.a.b, "Lokhttp3/internal/platform/Platform;", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static ArrayList a(List protocols) {
            Intrinsics.h(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.f) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).d);
            }
            return arrayList2;
        }

        public static byte[] b(List protocols) {
            Intrinsics.h(protocols, "protocols");
            Buffer buffer = new Buffer();
            Iterator it = a(protocols).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                buffer.Y(str.length());
                buffer.t0(str);
            }
            return buffer.j(buffer.e);
        }

        private Companion() {
        }
    }

    static {
        PlatformRegistry.f26753a.getClass();
        AndroidLog.f26755a.getClass();
        try {
            for (Map.Entry entry : AndroidLog.c.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (AndroidLog.b.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(AndroidLogHandler.f26756a);
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        Android10Platform.f.getClass();
        Platform android10Platform = Android10Platform.g ? new Android10Platform() : null;
        if (android10Platform == null) {
            AndroidPlatform.f.getClass();
            android10Platform = AndroidPlatform.Companion.a();
        }
        if (android10Platform == null) {
            throw new IllegalStateException(a.d(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        b = android10Platform;
        c = Logger.getLogger(OkHttpClient.class.getName());
    }

    public CertificateChainCleaner a(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(b(x509TrustManager));
    }

    public TrustRootIndex b(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void c(SSLSocket sSLSocket, String str, List protocols) {
        Intrinsics.h(protocols, "protocols");
    }

    public void d(Socket socket, InetSocketAddress address, int i) throws IOException {
        Intrinsics.h(address, "address");
        socket.connect(address, i);
    }

    public String e(SSLSocket sSLSocket) {
        return null;
    }

    public Object f() {
        if (c.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean g(String hostname) {
        Intrinsics.h(hostname, "hostname");
        return true;
    }

    public void h(int i, String message, Throwable th) {
        Intrinsics.h(message, "message");
        c.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void i(Object obj, String message) {
        Intrinsics.h(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        h(5, message, (Throwable) obj);
    }

    public SSLContext j() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.g(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}

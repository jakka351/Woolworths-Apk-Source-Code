package okhttp3.internal.platform;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import androidx.activity.result.contract.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

@SuppressSignatureCheck
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/platform/Android10Platform;", "Lokhttp3/internal/platform/Platform;", "Lokhttp3/internal/platform/ContextAwarePlatform;", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Android10Platform extends Platform implements ContextAwarePlatform {
    public static final Companion f = new Companion(0 == true ? 1 : 0);
    public static final boolean g;
    public Context d;
    public final ArrayList e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/Android10Platform$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Platform.f26752a.getClass();
        PlatformRegistry.f26753a.getClass();
        g = Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        Android10SocketAdapter.f26754a.getClass();
        Platform.f26752a.getClass();
        PlatformRegistry.f26753a.getClass();
        Android10SocketAdapter android10SocketAdapter = Build.VERSION.SDK_INT >= 29 ? new Android10SocketAdapter() : null;
        AndroidSocketAdapter.e.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.f);
        ConscryptSocketAdapter.f26759a.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.b);
        BouncyCastleSocketAdapter.f26758a.getClass();
        ArrayList arrayListF = ArraysKt.F(new SocketAdapter[]{android10SocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.b)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((SocketAdapter) next).a()) {
                arrayList.add(next);
            }
        }
        this.e = arrayList;
    }

    @Override // okhttp3.internal.platform.Platform
    public final CertificateChainCleaner a(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        AndroidCertificateChainCleaner.d.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AndroidCertificateChainCleaner androidCertificateChainCleaner = x509TrustManagerExtensions != null ? new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions) : null;
        return androidCertificateChainCleaner != null ? androidCertificateChainCleaner : new BasicCertificateChainCleaner(b(x509TrustManager));
    }

    @Override // okhttp3.internal.platform.Platform
    public final TrustRootIndex b(X509TrustManager x509TrustManager) {
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.b(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void c(SSLSocket sSLSocket, String str, List protocols) {
        Object next;
        Intrinsics.h(protocols, "protocols");
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((SocketAdapter) next).b(sSLSocket)) {
                    break;
                }
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            socketAdapter.d(sSLSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String e(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SocketAdapter) next).b(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final Object f() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.f();
        }
        CloseGuard closeGuardG = a.g();
        closeGuardG.open("response.body().close()");
        return closeGuardG;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean g(String hostname) {
        Intrinsics.h(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    /* renamed from: getApplicationContext, reason: from getter */
    public final Context getD() {
        return this.d;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void i(Object obj, String message) {
        Intrinsics.h(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.i(obj, message);
        } else {
            Intrinsics.f(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            com.google.android.gms.internal.ads.a.d(obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext j() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.j();
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public final void setApplicationContext(Context context) {
        this.d = context;
    }
}

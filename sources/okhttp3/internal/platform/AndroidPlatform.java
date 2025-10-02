package okhttp3.internal.platform;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
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
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

@SuppressSignatureCheck
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "Lokhttp3/internal/platform/ContextAwarePlatform;", "<init>", "()V", "CustomTrustRootIndex", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AndroidPlatform extends Platform implements ContextAwarePlatform {
    public static final Companion f = new Companion(0 == true ? 1 : 0);
    public static final String g = "OkHttp";
    public static final boolean h;
    public Context d;
    public final ArrayList e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static AndroidPlatform a() {
            if (AndroidPlatform.h) {
                return new AndroidPlatform();
            }
            return null;
        }

        public static boolean b() {
            return AndroidPlatform.h;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomTrustRootIndex implements TrustRootIndex {

        /* renamed from: a, reason: collision with root package name */
        public final X509TrustManager f26751a;
        public final Method b;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.f26751a = x509TrustManager;
            this.b = method;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                Object objInvoke = this.b.invoke(this.f26751a, x509Certificate);
                Intrinsics.f(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return Intrinsics.c(this.f26751a, customTrustRootIndex.f26751a) && Intrinsics.c(this.b, customTrustRootIndex.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f26751a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f26751a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
        }
    }

    static {
        Platform.f26752a.getClass();
        PlatformRegistry.f26753a.getClass();
        h = Build.VERSION.SDK_INT < 29;
    }

    public AndroidPlatform() throws ClassNotFoundException {
        StandardAndroidSocketAdapter standardAndroidSocketAdapter;
        StandardAndroidSocketAdapter.g.getClass();
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            standardAndroidSocketAdapter = new StandardAndroidSocketAdapter(cls);
        } catch (Exception e) {
            AndroidLog androidLog = AndroidLog.f26755a;
            String name = OkHttpClient.class.getName();
            androidLog.getClass();
            AndroidLog.a(5, name, "unable to load android socket classes", e);
            standardAndroidSocketAdapter = null;
        }
        AndroidSocketAdapter.e.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.f);
        ConscryptSocketAdapter.f26759a.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.b);
        BouncyCastleSocketAdapter.f26758a.getClass();
        ArrayList arrayListF = ArraysKt.F(new SocketAdapter[]{standardAndroidSocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.b)});
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
    public final TrustRootIndex b(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
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
    public final void d(Socket socket, InetSocketAddress address, int i) throws IOException {
        Intrinsics.h(address, "address");
        socket.connect(address, i);
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
    public final void h(int i, String message, Throwable th) {
        Intrinsics.h(message, "message");
        String str = g;
        if (i == 5) {
            Log.w(str, message, th);
        } else {
            Log.i(str, message, th);
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

package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class AndroidSocketAdapter implements SocketAdapter {
    public static final Companion e = new Companion(0);
    public static final AndroidSocketAdapter$Companion$factory$1 f = new AndroidSocketAdapter$Companion$factory$1();

    /* renamed from: a, reason: collision with root package name */
    public final Class f26757a;
    public final Method b;
    public final Method c;
    public final Method d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidSocketAdapter(Class cls) throws NoSuchMethodException, SecurityException {
        this.f26757a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.g(declaredMethod, "getDeclaredMethod(...)");
        this.b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a() {
        AndroidPlatform.f.getClass();
        return AndroidPlatform.Companion.b();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return this.f26757a.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        if (this.f26757a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, Charsets.f24671a);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e3);
                }
            }
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.h(protocols, "protocols");
        if (this.f26757a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.d;
                Platform.f26752a.getClass();
                method.invoke(sSLSocket, Platform.Companion.b(protocols));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}

package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Factory", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeferredSocketAdapter implements SocketAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Factory f26760a;
    public SocketAdapter b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Factory {
        boolean b(SSLSocket sSLSocket);

        SocketAdapter c(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory socketAdapterFactory) {
        Intrinsics.h(socketAdapterFactory, "socketAdapterFactory");
        this.f26760a = socketAdapterFactory;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return this.f26760a.b(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE != null) {
            return socketAdapterE.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        Intrinsics.h(protocols, "protocols");
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE != null) {
            socketAdapterE.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized SocketAdapter e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.f26760a.b(sSLSocket)) {
                this.b = this.f26760a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}

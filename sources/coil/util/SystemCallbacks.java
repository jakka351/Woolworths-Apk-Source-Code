package coil.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil.RealImageLoader;
import coil.memory.MemoryCache;
import coil.network.EmptyNetworkObserver;
import coil.network.NetworkObserver;
import coil.network.NetworkObserverKt;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcoil/util/SystemCallbacks;", "Landroid/content/ComponentCallbacks2;", "Lcoil/network/NetworkObserver$Listener;", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SystemCallbacks implements ComponentCallbacks2, NetworkObserver.Listener {
    public final Context d;
    public final WeakReference e;
    public final NetworkObserver f;
    public volatile boolean g;
    public final AtomicBoolean h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcoil/util/SystemCallbacks$Companion;", "", "", "OFFLINE", "Ljava/lang/String;", "ONLINE", "TAG", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public SystemCallbacks(RealImageLoader realImageLoader, Context context, boolean z) {
        this.d = context;
        this.e = new WeakReference(realImageLoader);
        NetworkObserver networkObserverA = z ? NetworkObserverKt.a(context, this) : new EmptyNetworkObserver();
        this.f = networkObserverA;
        this.g = networkObserverA.a();
        this.h = new AtomicBoolean(false);
    }

    public final void a() {
        if (this.h.getAndSet(true)) {
            return;
        }
        this.d.unregisterComponentCallbacks(this);
        this.f.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (((RealImageLoader) this.e.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Unit unit;
        RealImageLoader realImageLoader = (RealImageLoader) this.e.get();
        if (realImageLoader != null) {
            MemoryCache memoryCache = (MemoryCache) realImageLoader.b.getD();
            if (memoryCache != null) {
                memoryCache.a(i);
            }
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            a();
        }
    }
}

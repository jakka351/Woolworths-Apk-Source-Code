package coil3.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil3.RealImageLoader;
import coil3.memory.MemoryCache;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/util/AndroidSystemCallbacks;", "Lcoil3/util/SystemCallbacks;", "Landroid/content/ComponentCallbacks2;", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidSystemCallbacks implements SystemCallbacks, ComponentCallbacks2 {
    public final WeakReference d;
    public Context e;
    public boolean f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/util/AndroidSystemCallbacks$Companion;", "", "", "TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public AndroidSystemCallbacks(RealImageLoader realImageLoader) {
        this.d = new WeakReference(realImageLoader);
    }

    public final synchronized void a() {
        try {
            if (this.f) {
                return;
            }
            this.f = true;
            Context context = this.e;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.d.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((RealImageLoader) this.d.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        MemoryCache memoryCacheD;
        try {
            RealImageLoader realImageLoader = (RealImageLoader) this.d.get();
            if (realImageLoader == null) {
                a();
            } else if (i >= 40) {
                MemoryCache memoryCacheD2 = realImageLoader.d();
                if (memoryCacheD2 != null) {
                    memoryCacheD2.clear();
                }
            } else if (i >= 10 && (memoryCacheD = realImageLoader.d()) != null) {
                memoryCacheD.a(memoryCacheD.getSize() / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

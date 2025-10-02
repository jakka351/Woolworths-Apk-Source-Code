package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidUiDispatcher extends CoroutineDispatcher {
    public static final Lazy p = LazyKt.b(AndroidUiDispatcher$Companion$Main$2.h);
    public static final AndroidUiDispatcher$Companion$currentThread$1 q = new AndroidUiDispatcher$Companion$currentThread$1();
    public final Choreographer f;
    public final Handler g;
    public boolean l;
    public boolean m;
    public final AndroidUiFrameClock o;
    public final Object h = new Object();
    public final ArrayDeque i = new ArrayDeque();
    public ArrayList j = new ArrayList();
    public ArrayList k = new ArrayList();
    public final AndroidUiDispatcher$dispatchCallback$1 n = new AndroidUiDispatcher$dispatchCallback$1(this);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;", "", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f = choreographer;
        this.g = handler;
        this.o = new AndroidUiFrameClock(choreographer, this);
    }

    public static final void T(AndroidUiDispatcher androidUiDispatcher) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (androidUiDispatcher.h) {
                ArrayDeque arrayDeque = androidUiDispatcher.i;
                runnable = (Runnable) (arrayDeque.isEmpty() ? null : arrayDeque.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (androidUiDispatcher.h) {
                    ArrayDeque arrayDeque2 = androidUiDispatcher.i;
                    runnable = (Runnable) (arrayDeque2.isEmpty() ? null : arrayDeque2.removeFirst());
                }
            }
            synchronized (androidUiDispatcher.h) {
                if (androidUiDispatcher.i.isEmpty()) {
                    z = false;
                    androidUiDispatcher.l = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void k(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.h) {
            this.i.addLast(runnable);
            if (!this.l) {
                this.l = true;
                this.g.post(this.n);
                if (!this.m) {
                    this.m = true;
                    this.f.postFrameCallback(this.n);
                }
            }
        }
    }
}

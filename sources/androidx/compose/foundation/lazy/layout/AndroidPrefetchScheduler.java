package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler;", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "Landroidx/compose/runtime/RememberObserver;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Companion", "PrefetchRequestScopeImpl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalFoundationApi
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidPrefetchScheduler implements PrefetchScheduler, RememberObserver, Runnable, Choreographer.FrameCallback {
    public static long j;
    public final View d;
    public boolean f;
    public boolean h;
    public long i;
    public final MutableVector e = new MutableVector(new PrefetchRequest[16], 0);
    public final Choreographer g = Choreographer.getInstance();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$Companion;", "", "", "frameIntervalNs", "J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$PrefetchRequestScopeImpl;", "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PrefetchRequestScopeImpl implements PrefetchRequestScope {

        /* renamed from: a, reason: collision with root package name */
        public final long f1030a;

        public PrefetchRequestScopeImpl(long j) {
            this.f1030a = j;
        }

        public final long a() {
            return Math.max(0L, this.f1030a - System.nanoTime());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidPrefetchScheduler(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.d = r5
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r1 = 16
            androidx.compose.foundation.lazy.layout.PrefetchRequest[] r1 = new androidx.compose.foundation.lazy.layout.PrefetchRequest[r1]
            r2 = 0
            r0.<init>(r1, r2)
            r4.e = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.g = r0
            long r0 = androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.j
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L40
            android.view.Display r0 = r5.getDisplay()
            boolean r5 = r5.isInEditMode()
            if (r5 != 0) goto L36
            if (r0 == 0) goto L36
            float r5 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L36
            goto L38
        L36:
            r5 = 1114636288(0x42700000, float:60.0)
        L38:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
            androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.j = r0
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.<init>(android.view.View):void");
    }

    @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler
    public final void a(PrefetchRequest prefetchRequest) {
        this.e.c(prefetchRequest);
        if (this.f) {
            return;
        }
        this.f = true;
        this.d.post(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
        this.h = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        if (this.h) {
            this.i = j2;
            this.d.post(this);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        this.h = false;
        this.d.removeCallbacks(this);
        this.g.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        MutableVector mutableVector = this.e;
        if (mutableVector.f == 0 || !this.f || !this.h || this.d.getWindowVisibility() != 0) {
            this.f = false;
            return;
        }
        PrefetchRequestScopeImpl prefetchRequestScopeImpl = new PrefetchRequestScopeImpl(this.i + j);
        boolean z = false;
        while (mutableVector.f != 0 && !z) {
            if (prefetchRequestScopeImpl.a() <= 0 || ((PrefetchRequest) mutableVector.d[0]).a(prefetchRequestScopeImpl)) {
                z = true;
            } else {
                mutableVector.l(0);
            }
        }
        if (z) {
            this.g.postFrameCallback(this);
        } else {
            this.f = false;
        }
    }
}

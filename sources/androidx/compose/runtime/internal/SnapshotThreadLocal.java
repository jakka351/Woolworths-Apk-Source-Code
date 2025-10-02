package androidx.compose.runtime.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/internal/SnapshotThreadLocal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SnapshotThreadLocal<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1691a = new AtomicReference(SnapshotThreadLocalKt.f1692a);
    public final Object b = new Object();
    public Object c;

    public final Object a() {
        long jA = Thread_jvmKt.a();
        if (jA == Thread_androidKt.f1694a) {
            return this.c;
        }
        ThreadMap threadMap = (ThreadMap) this.f1691a.get();
        int iA = threadMap.a(jA);
        if (iA >= 0) {
            return threadMap.c[iA];
        }
        return null;
    }

    public final void b(Object obj) {
        long jA = Thread_jvmKt.a();
        if (jA == Thread_androidKt.f1694a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            ThreadMap threadMap = (ThreadMap) this.f1691a.get();
            int iA = threadMap.a(jA);
            if (iA < 0) {
                this.f1691a.set(threadMap.b(jA, obj));
            } else {
                threadMap.c[iA] = obj;
            }
        }
    }
}

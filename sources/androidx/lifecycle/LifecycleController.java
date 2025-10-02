package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/LifecycleController;", "", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@MainThread
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LifecycleController {

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f2788a;
    public final Lifecycle.State b;
    public final DispatchQueue c;
    public final androidx.core.view.c d;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue dispatchQueue, Job job) {
        Intrinsics.h(lifecycle, "lifecycle");
        Intrinsics.h(dispatchQueue, "dispatchQueue");
        this.f2788a = lifecycle;
        this.b = state;
        this.c = dispatchQueue;
        androidx.core.view.c cVar = new androidx.core.view.c(1, this, job);
        this.d = cVar;
        if (lifecycle.getD() != Lifecycle.State.d) {
            lifecycle.a(cVar);
        } else {
            job.cancel((CancellationException) null);
            a();
        }
    }

    public final void a() {
        this.f2788a.c(this.d);
        DispatchQueue dispatchQueue = this.c;
        dispatchQueue.b = true;
        dispatchQueue.a();
    }
}

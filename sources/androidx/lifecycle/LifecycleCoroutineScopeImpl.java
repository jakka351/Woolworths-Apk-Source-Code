package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    public final Lifecycle d;
    public final CoroutineContext e;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.h(coroutineContext, "coroutineContext");
        this.d = lifecycle;
        this.e = coroutineContext;
        if (lifecycle.getD() == Lifecycle.State.d) {
            JobKt.b(coroutineContext, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle lifecycle = this.d;
        if (lifecycle.getD().compareTo(Lifecycle.State.d) <= 0) {
            lifecycle.c(this);
            JobKt.b(this.e, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    /* renamed from: a, reason: from getter */
    public final Lifecycle getD() {
        return this.d;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getD() {
        return this.e;
    }
}

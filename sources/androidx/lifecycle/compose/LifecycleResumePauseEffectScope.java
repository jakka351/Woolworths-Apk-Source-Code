package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LifecycleResumePauseEffectScope implements LifecycleOwner {
    public final Lifecycle d;

    public LifecycleResumePauseEffectScope(Lifecycle lifecycle) {
        this.d = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle, reason: from getter */
    public final Lifecycle getD() {
        return this.d;
    }
}

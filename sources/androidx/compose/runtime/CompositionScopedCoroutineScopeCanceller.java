package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;", "Landroidx/compose/runtime/RememberObserver;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public final CoroutineScope d;

    public CompositionScopedCoroutineScopeCanceller(CoroutineScope coroutineScope) {
        this.d = coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
        CoroutineScope coroutineScope = this.d;
        if (coroutineScope instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) coroutineScope).a();
        } else {
            CoroutineScopeKt.b(coroutineScope, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        CoroutineScope coroutineScope = this.d;
        if (coroutineScope instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) coroutineScope).a();
        } else {
            CoroutineScopeKt.b(coroutineScope, new LeftCompositionCancellationException());
        }
    }
}

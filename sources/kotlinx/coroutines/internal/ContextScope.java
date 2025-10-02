package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/ContextScope;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextScope implements CoroutineScope {
    public final CoroutineContext d;

    public ContextScope(CoroutineContext coroutineContext) {
        this.d = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getD() {
        return this.d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.d + ')';
    }
}

package androidx.lifecycle.viewmodel.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CloseableCoroutineScope implements AutoCloseable, CoroutineScope {
    public final CoroutineContext d;

    public CloseableCoroutineScope(CoroutineContext coroutineContext) {
        Intrinsics.h(coroutineContext, "coroutineContext");
        this.d = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        JobKt.b(this.d, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getD() {
        return this.d;
    }
}

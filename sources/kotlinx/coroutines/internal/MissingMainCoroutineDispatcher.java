package kotlinx.coroutines.internal;

import androidx.compose.ui.platform.i;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements Delay {
    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher A(int i) {
        U();
        throw null;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public final MainCoroutineDispatcher T() {
        return this;
    }

    public final void U() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @Override // kotlinx.coroutines.Delay
    public final void c(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        U();
        throw null;
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle j(long j, Runnable runnable, CoroutineContext coroutineContext) {
        U();
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void k(CoroutineContext coroutineContext, Runnable runnable) {
        U();
        throw null;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return i.a(']', "Dispatchers.Main[missing", "");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean v(CoroutineContext coroutineContext) {
        U();
        throw null;
    }
}

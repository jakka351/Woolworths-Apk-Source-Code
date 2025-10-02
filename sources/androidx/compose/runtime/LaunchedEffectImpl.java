package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ContextScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/LaunchedEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements RememberObserver {
    public final Function2 d;
    public final ContextScope e;
    public Job f;

    public LaunchedEffectImpl(CoroutineContext coroutineContext, Function2 function2) {
        this.d = function2;
        this.e = CoroutineScopeKt.a(coroutineContext);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
        Job job = this.f;
        if (job != null) {
            ((JobSupport) job).cancel(ExceptionsKt.a("Old job was still running!", null));
        }
        this.f = BuildersKt.c(this.e, null, null, this.d, 3);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
        Job job = this.f;
        if (job != null) {
            job.cancel((CancellationException) new LeftCompositionCancellationException());
        }
        this.f = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        Job job = this.f;
        if (job != null) {
            job.cancel((CancellationException) new LeftCompositionCancellationException());
        }
        this.f = null;
    }
}

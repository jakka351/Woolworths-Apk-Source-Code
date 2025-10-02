package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/internal/ScopeCoroutine;", "", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {
    public final ThreadLocal h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public UndispatchedCoroutine(Continuation continuation, CoroutineContext coroutineContext) {
        UndispatchedMarker undispatchedMarker = UndispatchedMarker.d;
        super(continuation, coroutineContext.get(undispatchedMarker) == null ? coroutineContext.plus(undispatchedMarker) : coroutineContext);
        this.h = new ThreadLocal();
        if (continuation.getE().get(ContinuationInterceptor.Key.d) instanceof CoroutineDispatcher) {
            return;
        }
        Object objC = ThreadContextKt.c(coroutineContext, null);
        ThreadContextKt.a(coroutineContext, objC);
        t0(coroutineContext, objC);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public final void A(Object obj) {
        s0();
        Object objA = CompletionStateKt.a(obj);
        Continuation continuation = this.g;
        CoroutineContext f = continuation.getE();
        Object objC = ThreadContextKt.c(f, null);
        UndispatchedCoroutine undispatchedCoroutineC = objC != ThreadContextKt.f24732a ? CoroutineContextKt.c(continuation, f, objC) : null;
        try {
            continuation.resumeWith(objA);
            if (undispatchedCoroutineC == null || undispatchedCoroutineC.r0()) {
                ThreadContextKt.a(f, objC);
            }
        } catch (Throwable th) {
            if (undispatchedCoroutineC == null || undispatchedCoroutineC.r0()) {
                ThreadContextKt.a(f, objC);
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine
    public final void q0() {
        s0();
    }

    public final boolean r0() {
        boolean z = this.threadLocalIsSet && this.h.get() == null;
        this.h.remove();
        return !z;
    }

    public final void s0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.h.get();
            if (pair != null) {
                ThreadContextKt.a((CoroutineContext) pair.d, pair.e);
            }
            this.h.remove();
        }
    }

    public final void t0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.h.set(new Pair(coroutineContext, obj));
    }
}

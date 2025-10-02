package kotlinx.coroutines.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/atomicfu/AtomicRef;", "", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements CoroutineStackFrame, Continuation<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final CoroutineDispatcher g;
    public final ContinuationImpl h;
    public Object i;
    public final Object j;

    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, ContinuationImpl continuationImpl) {
        super(-1);
        this.g = coroutineDispatcher;
        this.h = continuationImpl;
        this.i = DispatchedContinuationKt.f24720a;
        this.j = ThreadContextKt.b(continuationImpl.getD());
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: c */
    public final Continuation getG() {
        return this;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object g() {
        Object obj = this.i;
        this.i = DispatchedContinuationKt.f24720a;
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        return this.h;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext getD() {
        return this.h.getD();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thA = Result.a(obj);
        Object completedExceptionally = thA == null ? obj : new CompletedExceptionally(thA, false);
        ContinuationImpl continuationImpl = this.h;
        CoroutineContext f = continuationImpl.getD();
        CoroutineDispatcher coroutineDispatcher = this.g;
        if (DispatchedContinuationKt.c(coroutineDispatcher, f)) {
            this.i = completedExceptionally;
            this.f = 0;
            DispatchedContinuationKt.b(coroutineDispatcher, continuationImpl.getD(), this);
            return;
        }
        EventLoop eventLoopA = ThreadLocalEventLoop.a();
        if (eventLoopA.f >= llqqqql.a00610061aaaa) {
            this.i = completedExceptionally;
            this.f = 0;
            eventLoopA.U(this);
            return;
        }
        eventLoopA.Y(true);
        try {
            CoroutineContext f2 = continuationImpl.getD();
            Object objC = ThreadContextKt.c(f2, this.j);
            try {
                continuationImpl.resumeWith(obj);
                while (eventLoopA.d0()) {
                }
            } finally {
                ThreadContextKt.a(f2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.g + ", " + DebugStringsKt.b(this.h) + ']';
    }
}

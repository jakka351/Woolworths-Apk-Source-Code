package kotlin.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import org.jetbrains.annotations.Nullable;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/coroutines/SafeContinuation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "", lqlqqlq.m006Dm006Dm006Dm, "Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@PublishedApi
/* loaded from: classes.dex */
public final class SafeContinuation<T> implements Continuation<T>, CoroutineStackFrame {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, lqlqqlq.m006Dm006Dm006Dm);
    public final Continuation d;

    @Nullable
    private volatile Object result;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/SafeContinuation$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    public SafeContinuation(Continuation continuation, CoroutineSingletons coroutineSingletons) {
        this.d = continuation;
        this.result = coroutineSingletons;
    }

    public final Object a() {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.e;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, coroutineSingletons2)) {
                if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                    obj = this.result;
                }
            }
            return CoroutineSingletons.d;
        }
        if (obj == CoroutineSingletons.f) {
            return CoroutineSingletons.d;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).d;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext getD() {
        return this.d.getD();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.e;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                        break;
                    }
                }
                return;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.d;
            if (obj2 != coroutineSingletons2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.f;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons2) {
                    break;
                }
            }
            this.d.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.d;
    }

    public SafeContinuation(Continuation continuation) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.e;
        this.d = continuation;
        this.result = coroutineSingletons;
    }
}

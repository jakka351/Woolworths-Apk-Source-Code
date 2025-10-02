package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;

@InternalCoroutinesApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/AbstractCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AbstractCoroutine<T> extends JobSupport implements Job, Continuation<T>, CoroutineScope {
    public final CoroutineContext f;

    public AbstractCoroutine(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            W((Job) coroutineContext.get(Job.Key.d));
        }
        this.f = coroutineContext.plus(this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String I() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void V(CompletionHandlerException completionHandlerException) {
        CoroutineExceptionHandlerKt.a(completionHandlerException, this.f);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void f0(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            o0(obj);
        } else {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            n0(completedExceptionally.f24689a, CompletedExceptionally.b.get(completedExceptionally) == 1);
        }
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext, reason: from getter */
    public final CoroutineContext getD() {
        return this.f;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getE() {
        return this.f;
    }

    public void n0(Throwable th, boolean z) {
    }

    public void o0(Object obj) {
    }

    public final void p0(CoroutineStart coroutineStart, AbstractCoroutine abstractCoroutine, Function2 function2) {
        Object objInvoke;
        int iOrdinal = coroutineStart.ordinal();
        Unit unit = Unit.f24250a;
        if (iOrdinal == 0) {
            try {
                DispatchedContinuationKt.a(unit, IntrinsicsKt.b(IntrinsicsKt.a(abstractCoroutine, this, function2)));
                return;
            } catch (Throwable th) {
                CancellableKt.a(th, this);
                throw null;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                Intrinsics.h(function2, "<this>");
                IntrinsicsKt.b(IntrinsicsKt.a(abstractCoroutine, this, function2)).resumeWith(unit);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                CoroutineContext coroutineContext = this.f;
                Object objC = ThreadContextKt.c(coroutineContext, null);
                try {
                    if (function2 instanceof BaseContinuationImpl) {
                        TypeIntrinsics.d(2, function2);
                        objInvoke = function2.invoke(abstractCoroutine, this);
                    } else {
                        objInvoke = IntrinsicsKt.c(abstractCoroutine, function2, this);
                    }
                    ThreadContextKt.a(coroutineContext, objC);
                    if (objInvoke != CoroutineSingletons.d) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    ThreadContextKt.a(coroutineContext, objC);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).d;
                }
                resumeWith(ResultKt.a(th));
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            obj = new CompletedExceptionally(thA, false);
        }
        Object objA0 = a0(obj);
        if (objA0 == JobSupportKt.b) {
            return;
        }
        A(objA0);
    }
}

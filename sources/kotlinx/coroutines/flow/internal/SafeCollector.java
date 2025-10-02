package kotlinx.coroutines.flow.internal;

import au.com.woolworths.feature.shop.login.ui.b;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SafeCollector<T> extends ContinuationImpl implements FlowCollector<T>, CoroutineStackFrame {
    public final FlowCollector p;
    public final CoroutineContext q;
    public final int r;
    public CoroutineContext s;
    public Continuation t;

    public SafeCollector(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        super(NoOpContinuation.d, EmptyCoroutineContext.d);
        this.p = flowCollector;
        this.q = coroutineContext;
        this.r = ((Number) coroutineContext.fold(0, new a(4))).intValue();
    }

    public final Object a(Continuation continuation, Object obj) {
        CoroutineContext f = continuation.getH();
        JobKt.e(f);
        CoroutineContext coroutineContext = this.s;
        if (coroutineContext != f) {
            if (coroutineContext instanceof DownstreamExceptionContext) {
                throw new IllegalStateException(StringsKt.m0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((DownstreamExceptionContext) coroutineContext).e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) f.fold(0, new b(this, 1))).intValue() != this.r) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.q + ",\n\t\tbut emission happened in " + f + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.s = f;
        }
        this.t = continuation;
        Function3 function3 = SafeCollectorKt.f24717a;
        FlowCollector flowCollector = this.p;
        Intrinsics.f(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = function3.invoke(flowCollector, obj, this);
        if (!Intrinsics.c(objInvoke, CoroutineSingletons.d)) {
            this.t = null;
        }
        return objInvoke;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        try {
            Object objA = a(continuation, obj);
            return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
        } catch (Throwable th) {
            this.s = new DownstreamExceptionContext(th, continuation.getH());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.t;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext getH() {
        CoroutineContext coroutineContext = this.s;
        return coroutineContext == null ? EmptyCoroutineContext.d : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            this.s = new DownstreamExceptionContext(thA, getH());
        }
        Continuation continuation = this.t;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return CoroutineSingletons.d;
    }
}

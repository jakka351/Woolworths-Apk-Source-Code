package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt", "kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class IntrinsicsKt extends IntrinsicsKt__IntrinsicsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation a(final Continuation continuation, final Continuation continuation2, final Function2 function2) {
        Intrinsics.h(function2, "<this>");
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(continuation, continuation2);
        }
        final CoroutineContext f = continuation2.getF();
        return f == EmptyCoroutineContext.d ? new RestrictedContinuationImpl(continuation2) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            public int p;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.p;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.p = 2;
                    ResultKt.b(obj);
                    return obj;
                }
                this.p = 1;
                ResultKt.b(obj);
                Function2 function22 = function2;
                Intrinsics.f(function22, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                TypeIntrinsics.d(2, function22);
                return function22.invoke(continuation, this);
            }
        } : new ContinuationImpl(continuation2, f) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            public int p;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.p;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.p = 2;
                    ResultKt.b(obj);
                    return obj;
                }
                this.p = 1;
                ResultKt.b(obj);
                Function2 function22 = function2;
                Intrinsics.f(function22, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                TypeIntrinsics.d(2, function22);
                return function22.invoke(continuation, this);
            }
        };
    }

    public static Continuation b(Continuation continuation) {
        Continuation<Object> continuationIntercepted;
        Intrinsics.h(continuation, "<this>");
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (continuationIntercepted = continuationImpl.intercepted()) == null) ? continuation : continuationIntercepted;
    }

    public static Object c(Object obj, Function2 function2, Continuation continuation) {
        Intrinsics.h(function2, "<this>");
        CoroutineContext f = continuation.getF();
        Object intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = f == EmptyCoroutineContext.d ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(continuation) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(continuation, f);
        TypeIntrinsics.d(2, function2);
        return function2.invoke(obj, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
    }
}

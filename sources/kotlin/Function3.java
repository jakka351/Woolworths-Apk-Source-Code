package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*r\b\u0002\u0010\u0005\"5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000¢\u0006\u0002\b\u000425\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/Function3;", "Lkotlin/DeepRecursiveScope;", "", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "DeepRecursiveFunctionBlock", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: kotlin.DeepRecursiveKt, reason: from Kotlin metadata */
/* loaded from: classes7.dex */
public final class Function3 {

    /* renamed from: a, reason: collision with root package name */
    public static final CoroutineSingletons f24248a = CoroutineSingletons.d;

    public static final Object a(DeepRecursiveFunction deepRecursiveFunction) {
        Object objInvoke;
        kotlin.jvm.functions.Function3 function3 = deepRecursiveFunction.f24247a;
        DeepRecursiveScopeImpl deepRecursiveScopeImpl = new DeepRecursiveScopeImpl();
        deepRecursiveScopeImpl.d = function3;
        deepRecursiveScopeImpl.e = Unit.f24250a;
        deepRecursiveScopeImpl.f = deepRecursiveScopeImpl;
        CoroutineSingletons coroutineSingletons = f24248a;
        deepRecursiveScopeImpl.g = coroutineSingletons;
        while (true) {
            Object obj = deepRecursiveScopeImpl.g;
            Continuation continuation = deepRecursiveScopeImpl.f;
            if (continuation == null) {
                ResultKt.b(obj);
                return obj;
            }
            if (Intrinsics.c(coroutineSingletons, obj)) {
                try {
                    kotlin.jvm.functions.Function3 function32 = deepRecursiveScopeImpl.d;
                    Unit unit = deepRecursiveScopeImpl.e;
                    if (function32 == null) {
                        Intrinsics.h(function32, "<this>");
                        CoroutineContext e = continuation.getE();
                        Object intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = e == EmptyCoroutineContext.d ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(continuation) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(continuation, e);
                        TypeIntrinsics.d(3, function32);
                        objInvoke = function32.invoke(deepRecursiveScopeImpl, unit, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
                    } else {
                        TypeIntrinsics.d(3, function32);
                        objInvoke = function32.invoke(deepRecursiveScopeImpl, unit, continuation);
                    }
                    if (objInvoke != CoroutineSingletons.d) {
                        continuation.resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    continuation.resumeWith(ResultKt.a(th));
                }
            } else {
                deepRecursiveScopeImpl.g = coroutineSingletons;
                continuation.resumeWith(obj);
            }
        }
    }
}

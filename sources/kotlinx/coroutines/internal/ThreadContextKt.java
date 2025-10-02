package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThreadContextKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Symbol f24732a = new Symbol("NO_THREAD_ELEMENTS");
    public static final b b;
    public static final b c;
    public static final b d;

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlinx.coroutines.internal.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.internal.b] */
    static {
        final int i = 1;
        b = new Function2() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ThreadState threadState = (ThreadState) obj;
                        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                        if (element instanceof ThreadContextElement) {
                            ThreadContextElement threadContextElement = (ThreadContextElement) element;
                            threadState.a(threadContextElement, threadContextElement.R(threadState.f24734a));
                        }
                        return threadState;
                    case 1:
                        CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                        if (!(element2 instanceof ThreadContextElement)) {
                            return obj;
                        }
                        Integer num = obj instanceof Integer ? (Integer) obj : null;
                        int iIntValue = num != null ? num.intValue() : 1;
                        return iIntValue == 0 ? element2 : Integer.valueOf(iIntValue + 1);
                    default:
                        ThreadContextElement threadContextElement2 = (ThreadContextElement) obj;
                        CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                        if (threadContextElement2 != null) {
                            return threadContextElement2;
                        }
                        if (element3 instanceof ThreadContextElement) {
                            return (ThreadContextElement) element3;
                        }
                        return null;
                }
            }
        };
        final int i2 = 2;
        c = new Function2() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ThreadState threadState = (ThreadState) obj;
                        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                        if (element instanceof ThreadContextElement) {
                            ThreadContextElement threadContextElement = (ThreadContextElement) element;
                            threadState.a(threadContextElement, threadContextElement.R(threadState.f24734a));
                        }
                        return threadState;
                    case 1:
                        CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                        if (!(element2 instanceof ThreadContextElement)) {
                            return obj;
                        }
                        Integer num = obj instanceof Integer ? (Integer) obj : null;
                        int iIntValue = num != null ? num.intValue() : 1;
                        return iIntValue == 0 ? element2 : Integer.valueOf(iIntValue + 1);
                    default:
                        ThreadContextElement threadContextElement2 = (ThreadContextElement) obj;
                        CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                        if (threadContextElement2 != null) {
                            return threadContextElement2;
                        }
                        if (element3 instanceof ThreadContextElement) {
                            return (ThreadContextElement) element3;
                        }
                        return null;
                }
            }
        };
        final int i3 = 0;
        d = new Function2() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ThreadState threadState = (ThreadState) obj;
                        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                        if (element instanceof ThreadContextElement) {
                            ThreadContextElement threadContextElement = (ThreadContextElement) element;
                            threadState.a(threadContextElement, threadContextElement.R(threadState.f24734a));
                        }
                        return threadState;
                    case 1:
                        CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                        if (!(element2 instanceof ThreadContextElement)) {
                            return obj;
                        }
                        Integer num = obj instanceof Integer ? (Integer) obj : null;
                        int iIntValue = num != null ? num.intValue() : 1;
                        return iIntValue == 0 ? element2 : Integer.valueOf(iIntValue + 1);
                    default:
                        ThreadContextElement threadContextElement2 = (ThreadContextElement) obj;
                        CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                        if (threadContextElement2 != null) {
                            return threadContextElement2;
                        }
                        if (element3 instanceof ThreadContextElement) {
                            return (ThreadContextElement) element3;
                        }
                        return null;
                }
            }
        };
    }

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f24732a) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, c);
        Intrinsics.f(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((ThreadContextElement) objFold).i(obj);
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, b);
        Intrinsics.e(objFold);
        return objFold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        return obj == 0 ? f24732a : obj instanceof Integer ? coroutineContext.fold(new ThreadState(((Number) obj).intValue(), coroutineContext), d) : ((ThreadContextElement) obj).R(coroutineContext);
    }
}

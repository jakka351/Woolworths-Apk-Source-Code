package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoroutineContextKt {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, new kotlin.coroutines.a(1))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, new kotlin.coroutines.a(1))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = coroutineContext2;
        Function2 function2 = new Function2() { // from class: kotlinx.coroutines.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineContext coroutineContext3 = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof CopyableThreadContextElement)) {
                    return coroutineContext3.plus(element);
                }
                Ref.ObjectRef objectRef2 = objectRef;
                if (((CoroutineContext) objectRef2.d).get(element.getD()) != null) {
                    objectRef2.d = ((CoroutineContext) objectRef2.d).minusKey(element.getD());
                    return coroutineContext3.plus(((CopyableThreadContextElement) element).H());
                }
                CopyableThreadContextElement copyableThreadContextElementF = (CopyableThreadContextElement) element;
                if (z) {
                    copyableThreadContextElementF = copyableThreadContextElementF.f();
                }
                return coroutineContext3.plus(copyableThreadContextElementF);
            }
        };
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.d;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, function2);
        if (zBooleanValue2) {
            objectRef.d = ((CoroutineContext) objectRef.d).fold(emptyCoroutineContext, new kotlin.coroutines.a(2));
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.d);
    }

    public static final CoroutineContext b(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(coroutineScope.getE(), coroutineContext, true);
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return (coroutineContextA == defaultScheduler || coroutineContextA.get(ContinuationInterceptor.Key.d) != null) ? coroutineContextA : coroutineContextA.plus(defaultScheduler);
    }

    public static final UndispatchedCoroutine c(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        UndispatchedCoroutine undispatchedCoroutine = null;
        if ((continuation instanceof CoroutineStackFrame) && coroutineContext.get(UndispatchedMarker.d) != null) {
            CoroutineStackFrame callerFrame = (CoroutineStackFrame) continuation;
            while (true) {
                if ((callerFrame instanceof DispatchedCoroutine) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof UndispatchedCoroutine) {
                    undispatchedCoroutine = (UndispatchedCoroutine) callerFrame;
                    break;
                }
            }
            if (undispatchedCoroutine != null) {
                undispatchedCoroutine.t0(coroutineContext, obj);
            }
        }
        return undispatchedCoroutine;
    }
}

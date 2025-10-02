package kotlin.coroutines;

import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CopyableThreadContextElement;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        switch (this.d) {
            case 0:
                CoroutineContext acc = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.h(acc, "acc");
                Intrinsics.h(element, "element");
                CoroutineContext coroutineContextMinusKey = acc.minusKey(element.getD());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.d;
                if (coroutineContextMinusKey == emptyCoroutineContext) {
                    return element;
                }
                ContinuationInterceptor.Key key = ContinuationInterceptor.Key.d;
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContextMinusKey.get(key);
                if (continuationInterceptor == null) {
                    combinedContext = new CombinedContext(element, coroutineContextMinusKey);
                } else {
                    CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(key);
                    if (coroutineContextMinusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(continuationInterceptor, element);
                    }
                    combinedContext = new CombinedContext(continuationInterceptor, new CombinedContext(element, coroutineContextMinusKey2));
                }
                return combinedContext;
            case 1:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((CoroutineContext.Element) obj2) instanceof CopyableThreadContextElement));
            case 2:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                return element2 instanceof CopyableThreadContextElement ? coroutineContext.plus(((CopyableThreadContextElement) element2).f()) : coroutineContext.plus(element2);
            case 3:
                return Boolean.valueOf(Intrinsics.c(obj, obj2));
            default:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
        }
    }
}

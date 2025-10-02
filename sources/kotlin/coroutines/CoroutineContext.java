package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Key", "Element", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CoroutineContext {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Element extends CoroutineContext {

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class DefaultImpls {
            public static Element a(Element element, Key key) {
                Intrinsics.h(key, "key");
                if (Intrinsics.c(element.getKey(), key)) {
                    return element;
                }
                return null;
            }

            public static CoroutineContext b(Element element, Key key) {
                Intrinsics.h(key, "key");
                return Intrinsics.c(element.getKey(), key) ? EmptyCoroutineContext.d : element;
            }

            public static CoroutineContext c(Element element, CoroutineContext context) {
                Intrinsics.h(context, "context");
                return context == EmptyCoroutineContext.d ? element : (CoroutineContext) context.fold(element, new a(0));
            }
        }

        Key getKey();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Key<E extends Element> {
    }

    Object fold(Object obj, Function2 function2);

    Element get(Key key);

    CoroutineContext minusKey(Key key);

    CoroutineContext plus(CoroutineContext coroutineContext);
}

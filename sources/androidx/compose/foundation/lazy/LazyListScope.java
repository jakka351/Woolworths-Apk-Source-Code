package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@LazyScopeMarker
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyListScope {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void e(LazyListScope lazyListScope, String str, ComposableLambdaImpl composableLambdaImpl, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        lazyListScope.c(str, null, composableLambdaImpl);
    }

    static /* synthetic */ void g(LazyListScope lazyListScope, int i, Function1 function1, ComposableLambdaImpl composableLambdaImpl, int i2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        lazyListScope.b(i, function1, LazyListScope$items$1.h, composableLambdaImpl);
    }

    static /* synthetic */ void i(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.a(obj, obj2, function3);
    }

    default void a(Object obj, Object obj2, Function3 function3) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void b(int i, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void c(Object obj, String str, final ComposableLambdaImpl composableLambdaImpl) {
        a(obj, str, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListScope$stickyHeader$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                Composer composer = (Composer) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.n(lazyItemScope) ? 4 : 2;
                }
                if (composer.z(iIntValue & 1, (iIntValue & 19) != 18)) {
                    composableLambdaImpl.invoke(lazyItemScope, 0, composer, Integer.valueOf((iIntValue & 14) | 48));
                } else {
                    composer.j();
                }
                return Unit.f24250a;
            }
        }, true, 628101784));
    }
}

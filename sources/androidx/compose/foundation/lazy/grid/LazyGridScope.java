package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@LazyGridScopeMarker
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LazyGridScope {
    static /* synthetic */ void h(LazyGridScope lazyGridScope, int i, Function1 function1, Function2 function2, d dVar, ComposableLambdaImpl composableLambdaImpl, int i2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            function2 = null;
        }
        Function1 function12 = dVar;
        if ((i2 & 8) != 0) {
            function12 = LazyGridScope$items$1.h;
        }
        lazyGridScope.d(i, function1, function2, function12, composableLambdaImpl);
    }

    void d(int i, Function1 function1, Function2 function2, Function1 function12, ComposableLambdaImpl composableLambdaImpl);

    void f(Function1 function1, ComposableLambdaImpl composableLambdaImpl);
}

package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridInterval;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {
    public static final Function2 d = null;

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridSpanLayoutProvider f1011a = new LazyGridSpanLayoutProvider(this);
    public final MutableIntervalList b = new MutableIntervalList();
    public boolean c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public LazyGridIntervalContent(Function1 function1) {
        function1.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public final void d(int i, Function1 function1, Function2 function2, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        this.b.a(i, new LazyGridInterval(function1, function2 == null ? LazyGridIntervalContent$Companion$DefaultSpan$1.h : function2, function12, composableLambdaImpl));
        if (function2 != null) {
            this.c = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public final void f(final Function1 function1, final ComposableLambdaImpl composableLambdaImpl) {
        this.b.a(1, new LazyGridInterval(null, new Function2<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$2$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                return new GridItemSpan(((GridItemSpan) function1.invoke((LazyGridItemSpanScope) obj)).f1007a);
            }
        }, new LazyGridIntervalContent$item$3(1), new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$4
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
                ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.n(lazyGridItemScope) ? 4 : 2;
                }
                if (composer.z(iIntValue & 1, (iIntValue & 131) != 130)) {
                    composableLambdaImpl.invoke(lazyGridItemScope, composer, Integer.valueOf(iIntValue & 14));
                } else {
                    composer.j();
                }
                return Unit.f24250a;
            }
        }, true, -34608120)));
        this.c = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    /* renamed from: k, reason: from getter */
    public final MutableIntervalList getF993a() {
        return this.b;
    }
}

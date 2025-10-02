package androidx.compose.foundation.lazy;

import androidx.collection.MutableIntList;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/LazyListInterval;", "Landroidx/compose/foundation/lazy/LazyListScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalFoundationApi
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {

    /* renamed from: a, reason: collision with root package name */
    public final MutableIntervalList f993a = new MutableIntervalList();
    public MutableIntList b;

    public LazyListIntervalContent(Function1 function1) {
        function1.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final void a(final Object obj, final Object obj2, final Function3 function3) {
        this.f993a.a(1, new LazyListInterval(obj != null ? new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                ((Number) obj3).intValue();
                return obj;
            }
        } : null, new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                ((Number) obj3).intValue();
                return obj2;
            }
        }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$3
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                ((Number) obj4).intValue();
                Composer composer = (Composer) obj5;
                int iIntValue = ((Number) obj6).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.n(lazyItemScope) ? 4 : 2;
                }
                if (composer.z(iIntValue & 1, (iIntValue & 131) != 130)) {
                    function3.invoke(lazyItemScope, composer, Integer.valueOf(iIntValue & 14));
                } else {
                    composer.j();
                }
                return Unit.f24250a;
            }
        }, true, -1010194746)));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final void b(int i, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        this.f993a.a(i, new LazyListInterval(function1, function12, composableLambdaImpl));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final void c(Object obj, String str, final ComposableLambdaImpl composableLambdaImpl) {
        MutableIntList mutableIntList = this.b;
        if (mutableIntList == null) {
            mutableIntList = new MutableIntList();
            this.b = mutableIntList;
        }
        MutableIntervalList mutableIntervalList = this.f993a;
        mutableIntList.c(mutableIntervalList.b);
        final int i = mutableIntervalList.b;
        a(obj, str, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$stickyHeader$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    composableLambdaImpl.invoke(lazyItemScope, Integer.valueOf(i), composer, Integer.valueOf(iIntValue & 14));
                } else {
                    composer.j();
                }
                return Unit.f24250a;
            }
        }, true, 1491981087));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    /* renamed from: k, reason: from getter */
    public final MutableIntervalList getF993a() {
        return this.f993a;
    }
}

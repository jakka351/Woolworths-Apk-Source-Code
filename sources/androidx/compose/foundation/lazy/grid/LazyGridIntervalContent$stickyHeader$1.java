package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "invoke-BHJ-flc", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;)J"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LazyGridIntervalContent$stickyHeader$1 extends Lambda implements Function1<LazyGridItemSpanScope, GridItemSpan> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new GridItemSpan(LazyGridSpanKt.a(((LazyGridItemSpanScope) obj).a()));
    }
}

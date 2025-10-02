package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridInterval;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LazyGridInterval implements LazyLayoutIntervalContent.Interval {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1010a;
    public final Function2 b;
    public final Function1 c;
    public final ComposableLambdaImpl d;

    public LazyGridInterval(Function1 function1, Function2 function2, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        this.f1010a = function1;
        this.b = function2;
        this.c = function12;
        this.d = composableLambdaImpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    /* renamed from: getKey, reason: from getter */
    public final Function1 getF992a() {
        return this.f1010a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    /* renamed from: getType, reason: from getter */
    public final Function1 getB() {
        return this.c;
    }
}

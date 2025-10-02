package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListInterval;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListInterval implements LazyLayoutIntervalContent.Interval {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f992a;
    public final Function1 b;
    public final ComposableLambdaImpl c;

    public LazyListInterval(Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        this.f992a = function1;
        this.b = function12;
        this.c = composableLambdaImpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    /* renamed from: getKey, reason: from getter */
    public final Function1 getF992a() {
        return this.f992a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    /* renamed from: getType, reason: from getter */
    public final Function1 getB() {
        return this.b;
    }
}

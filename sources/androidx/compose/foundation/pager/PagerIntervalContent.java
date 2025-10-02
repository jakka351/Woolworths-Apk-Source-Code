package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/PagerIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PagerIntervalContent implements LazyLayoutIntervalContent.Interval {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1085a;
    public final Function4 b;

    public PagerIntervalContent(Function1 function1, Function4 function4) {
        this.f1085a = function1;
        this.b = function4;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    /* renamed from: getKey, reason: from getter */
    public final Function1 getF1085a() {
        return this.f1085a;
    }
}

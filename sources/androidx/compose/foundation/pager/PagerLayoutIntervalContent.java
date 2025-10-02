package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/pager/PagerLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/pager/PagerIntervalContent;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PagerLayoutIntervalContent extends LazyLayoutIntervalContent<PagerIntervalContent> {

    /* renamed from: a, reason: collision with root package name */
    public final Function4 f1086a;
    public final Function1 b;
    public final MutableIntervalList c;

    public PagerLayoutIntervalContent(Function4 function4, Function1 function1, int i) {
        this.f1086a = function4;
        this.b = function1;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.a(i, new PagerIntervalContent(function1, function4));
        this.c = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    /* renamed from: k, reason: from getter */
    public final MutableIntervalList getC() {
        return this.c;
    }
}

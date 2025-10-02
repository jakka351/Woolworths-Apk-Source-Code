package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/foundation/pager/PagerScrollScopeKt$LazyLayoutScrollScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PagerScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollScope f1091a;
    public final /* synthetic */ PagerState b;

    public PagerScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, PagerState pagerState) {
        this.b = pagerState;
        this.f1091a = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int a() {
        return this.b.m();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final void b(int i) {
        this.b.u(true, 0 / r1.o(), i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int c() {
        return this.b.e;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int d() {
        return ((PageInfo) CollectionsKt.O(this.b.l().getF1088a())).getF1082a();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int e(int i) {
        PagerState pagerState = this.b;
        return (int) (RangesKt.e(PagerScrollPositionKt.a(pagerState) + MathKt.b(((pagerState.o() * (i - pagerState.j())) - (pagerState.k() * pagerState.o())) + 0), pagerState.h, pagerState.g) - PagerScrollPositionKt.a(pagerState));
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public final float f(float f) {
        return this.f1091a.f(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int g() {
        return this.b.f;
    }
}

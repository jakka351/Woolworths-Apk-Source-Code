package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyListScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollScope f999a;
    public final /* synthetic */ LazyListState b;

    public LazyListScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyListState lazyListState) {
        this.b = lazyListState;
        this.f999a = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int a() {
        return this.b.j().getN();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final void b(int i) {
        this.b.m(i, 0, true);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int c() {
        return this.b.h();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int d() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.P(this.b.j().f());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getF996a();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int e(int i) {
        Object obj;
        LazyListState lazyListState = this.b;
        LazyListLayoutInfo lazyListLayoutInfoJ = lazyListState.j();
        if (!lazyListLayoutInfoJ.f().isEmpty()) {
            int iH = lazyListState.h();
            if (i > d() || iH > i) {
                return ((i - lazyListState.h()) * LazyListLayoutInfoKt.a(lazyListLayoutInfoJ)) - lazyListState.i();
            }
            List listF = lazyListLayoutInfoJ.f();
            int size = listF.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = listF.get(i2);
                if (((LazyListItemInfo) obj).getF996a() == i) {
                    break;
                }
                i2++;
            }
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj;
            if (lazyListItemInfo != null) {
                return lazyListItemInfo.getP();
            }
        }
        return 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public final float f(float f) {
        return this.f999a.f(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int g() {
        return this.b.i();
    }
}

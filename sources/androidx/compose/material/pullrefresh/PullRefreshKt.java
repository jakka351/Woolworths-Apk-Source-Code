package androidx.compose.material.pullrefresh;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PullRefreshKt {
    public static final Modifier a(Modifier modifier, PullRefreshState pullRefreshState, boolean z) {
        return NestedScrollModifierKt.a(modifier, new PullRefreshNestedScrollConnection(new PullRefreshKt$pullRefresh$1(1, pullRefreshState, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0), new PullRefreshKt$pullRefresh$2(2, pullRefreshState, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4), z), null);
    }
}

package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PagerScrollPositionKt {
    public static final long a(PagerState pagerState) {
        return MathKt.c(pagerState.k() * pagerState.o()) + (pagerState.j() * pagerState.o());
    }
}

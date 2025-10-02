package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection;

import androidx.compose.foundation.pager.PagerState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ PagerState e;

    public /* synthetic */ b(PagerState pagerState, int i) {
        this.d = i;
        this.e = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
        }
        return Integer.valueOf(this.e.j());
    }
}

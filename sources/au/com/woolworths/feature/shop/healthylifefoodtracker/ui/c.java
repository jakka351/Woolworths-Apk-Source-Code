package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import au.com.woolworths.base.shopapp.modules.text.TextWithLinkApiData;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerContract;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerFooterCard;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((Function1) this.e).invoke((FoodTrackerFooterCard) this.f);
                break;
            case 1:
                LazyListState lazyListState = (LazyListState) this.e;
                State state = (State) this.f;
                return (lazyListState.h() > 0 || (((FoodTrackerContract.ViewState) state.getD()).b instanceof FoodTrackerWebView)) ? ((FoodTrackerContract.ViewState) state.getD()).c : "";
            default:
                ((Function1) this.e).invoke(((TextWithLinkApiData) this.f).getUrl());
                break;
        }
        return Unit.f24250a;
    }
}

package au.com.woolworths.shop.rewards.promo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.shop.rewards.promo.PromoRewardsAppContract;
import au.com.woolworths.shop.rewards.promo.domain.PromoRewardsAppInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/promo/PromoAppViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoAppViewModel extends ViewModel {
    public final PromoRewardsAppInteractor e;
    public final MutableStateFlow f;
    public final StateFlow g;

    public PromoAppViewModel(PromoRewardsAppInteractor promoRewardsAppInteractor) {
        this.e = promoRewardsAppInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new PromoRewardsAppContract.ViewState(false, null, null));
        this.f = mutableStateFlowA;
        this.g = mutableStateFlowA;
        p6();
    }

    public final void p6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new PromoAppViewModel$refresh$1(this, null), 3);
    }
}

package au.com.woolworths.shop.checkout.ui.summary;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.checkout.CheckoutFeature;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutSummaryActions;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutSummaryEpoxyController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                CheckoutSummaryViewModel checkoutSummaryViewModel = (CheckoutSummaryViewModel) this.e;
                BuildersKt.c(ViewModelKt.a(checkoutSummaryViewModel), null, null, new CheckoutSummaryViewModel$onClickButtonRewardsUse$2$1(checkoutSummaryViewModel, null), 3);
                checkoutSummaryViewModel.p.c(CheckoutSummaryActions.RewardsRedeemOld.e);
                break;
            case 1:
                ((CheckoutSummaryViewModel) this.e).p.c(CheckoutSummaryActions.RewardsNotNow.e);
                break;
            case 2:
                ((CheckoutSummaryViewModel) this.e).D6(CheckoutSummaryActions.PromotionSuccess.e);
                break;
            default:
                CheckoutSummaryFragment checkoutSummaryFragment = (CheckoutSummaryFragment) this.e;
                CheckoutSummaryViewModel checkoutSummaryViewModelO2 = checkoutSummaryFragment.o2();
                FeatureToggleManager featureToggleManager = checkoutSummaryFragment.r;
                if (featureToggleManager != null) {
                    return new CheckoutSummaryEpoxyController(checkoutSummaryViewModelO2, featureToggleManager.c(CheckoutFeature.j), checkoutSummaryFragment.o2());
                }
                Intrinsics.p("featureToggleManager");
                throw null;
        }
        return Unit.f24250a;
    }
}

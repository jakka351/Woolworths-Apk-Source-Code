package au.com.woolworths.feature.rewards.offers.detail.composable;

import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsFullPageErrorStateLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$2$1 extends FunctionReferenceImpl implements Function1<RewardsOfferDetailsFullPageErrorStateLegacy, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RewardsOfferDetailsFullPageErrorStateLegacy p0 = (RewardsOfferDetailsFullPageErrorStateLegacy) obj;
        Intrinsics.h(p0, "p0");
        RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel = (RewardsOfferDetailsViewModel) this.receiver;
        rewardsOfferDetailsViewModel.getClass();
        RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = rewardsOfferDetailsViewModel.i;
        if (p0 instanceof RewardsOfferDetailsFullPageErrorStateLegacy.CustomErrorWithBackButtonLegacy) {
            rewardsOfferDetailsViewModel.p.f(RewardsOfferDetailsContractLegacy.Actions.CloseScreen.f6321a);
        } else if (p0.equals(RewardsOfferDetailsFullPageErrorStateLegacy.NoConnectivity.h)) {
            HomeOfferDetailsActionDataLegacy action = HomeOfferDetailsActionDataLegacy.m;
            rewardsOfferAnalyticsManager.getClass();
            Intrinsics.h(action, "action");
            rewardsOfferAnalyticsManager.b.c(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(action));
            rewardsOfferDetailsViewModel.q6();
        } else {
            if (!p0.equals(RewardsOfferDetailsFullPageErrorStateLegacy.ServerErrorLegacy.h)) {
                throw new NoWhenBranchMatchedException();
            }
            HomeOfferDetailsActionDataLegacy action2 = HomeOfferDetailsActionDataLegacy.n;
            rewardsOfferAnalyticsManager.getClass();
            Intrinsics.h(action2, "action");
            rewardsOfferAnalyticsManager.b.c(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(action2));
            rewardsOfferDetailsViewModel.q6();
        }
        return Unit.f24250a;
    }
}

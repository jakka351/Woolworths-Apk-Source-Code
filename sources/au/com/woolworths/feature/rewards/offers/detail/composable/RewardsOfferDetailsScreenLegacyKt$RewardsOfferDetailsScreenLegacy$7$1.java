package au.com.woolworths.feature.rewards.offers.detail.composable;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$7$1 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final String p0 = (String) obj;
        String p1 = (String) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel = (RewardsOfferDetailsViewModel) this.receiver;
        rewardsOfferDetailsViewModel.getClass();
        rewardsOfferDetailsViewModel.p.f(new RewardsOfferDetailsContractLegacy.Actions.OpenUrl(p1));
        RewardsOfferData rewardsOfferData = ((RewardsOfferDetailsContractLegacy.ViewState) rewardsOfferDetailsViewModel.r.getValue()).f;
        if (rewardsOfferData != null) {
            RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = rewardsOfferDetailsViewModel.i;
            RewardsOfferScreen rewardsOfferScreen = RewardsOfferScreen.d;
            HomeOfferDetailsActionDataLegacy.e.getClass();
            Action action = new Action(p0) { // from class: au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy$Companion$rewardsOfferCtaButtonClick$1
                public final RewardsOfferScreen d = RewardsOfferScreen.d;
                public final Category e = Category.K;
                public final String f;

                {
                    this.f = p0;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }

                @Override // au.com.woolworths.android.onesite.analytics.Action
                /* renamed from: f */
                public final Screen getD() {
                    return this.d;
                }
            };
            rewardsOfferAnalyticsManager.getClass();
            rewardsOfferAnalyticsManager.n(rewardsOfferData, rewardsOfferScreen, "offer page", p1, action);
        }
        return Unit.f24250a;
    }
}

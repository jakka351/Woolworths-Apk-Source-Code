package au.com.woolworths.feature.rewards.offers.detail.composable;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.StandardBanner;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$5$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StandardBanner standardBanner;
        RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel = (RewardsOfferDetailsViewModel) this.receiver;
        RewardsOfferData rewardsOfferData = ((RewardsOfferDetailsContractLegacy.ViewState) rewardsOfferDetailsViewModel.r.getValue()).f;
        final String str = (rewardsOfferData == null || (standardBanner = rewardsOfferData.C) == null) ? null : standardBanner.h;
        if (str != null) {
            rewardsOfferDetailsViewModel.p.f(new RewardsOfferDetailsContractLegacy.Actions.OpenUrl(str));
        }
        RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = rewardsOfferDetailsViewModel.i;
        final HomeOfferDetailsActionDataLegacy action = HomeOfferDetailsActionDataLegacy.q;
        if (str == null) {
            str = "";
        }
        rewardsOfferAnalyticsManager.getClass();
        Intrinsics.h(action, "action");
        rewardsOfferAnalyticsManager.b.c(new Action() { // from class: au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager$trackLegacyOfferDetailsBannerClick$combinedAction$1
            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getF() {
                return action.getF();
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b */
            public final Category getE() {
                return action.getE();
            }

            @Override // au.com.woolworths.android.onesite.analytics.Action
            /* renamed from: f */
            public final Screen getD() {
                return action.getD();
            }

            @Override // au.com.woolworths.android.onesite.analytics.Action, au.com.woolworths.android.onesite.analytics.BaseAction
            public final HashMap l() {
                HashMap mapL = action.l();
                TrackableValue trackableValue = TrackableValue.e;
                mapL.put("event.Description", "Legacy");
                mapL.put("deeplink.uri", str);
                return mapL;
            }
        });
        return Unit.f24250a;
    }
}

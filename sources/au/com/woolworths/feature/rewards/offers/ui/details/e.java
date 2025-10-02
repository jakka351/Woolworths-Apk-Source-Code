package au.com.woolworths.feature.rewards.offers.ui.details;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsFooter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Function1 function1 = (Function1) this.e;
                ContentCta contentCta = ((OfferDetailsFooter) this.f).b;
                if (contentCta == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                function1.invoke(contentCta);
                return Unit.f24250a;
            default:
                OfferDetailsViewModel offerDetailsViewModel = (OfferDetailsViewModel) this.e;
                FullPageError fullPageError = ((OfferDetailsContract.ViewState.Error) ((OfferDetailsContract.ViewState) this.f)).f6307a;
                RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = offerDetailsViewModel.i;
                offerDetailsViewModel.v6();
                if (fullPageError instanceof FullPageError.ConnectionError) {
                    rewardsOfferAnalyticsManager.getClass();
                    rewardsOfferAnalyticsManager.b.g((Event) new OfferDetailsAnalytics.OfferDetailsError().f.c.getD());
                } else {
                    if (!(fullPageError instanceof FullPageError.ServerError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rewardsOfferAnalyticsManager.getClass();
                    rewardsOfferAnalyticsManager.b.g((Event) new OfferDetailsAnalytics.OfferDetailsError().f.e.getD());
                }
                return Unit.f24250a;
        }
    }
}

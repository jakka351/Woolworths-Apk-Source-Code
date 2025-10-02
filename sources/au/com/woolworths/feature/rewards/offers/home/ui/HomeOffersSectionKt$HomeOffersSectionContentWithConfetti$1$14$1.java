package au.com.woolworths.feature.rewards.offers.home.ui;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomeOffersSectionKt$HomeOffersSectionContentWithConfetti$1$14$1 extends FunctionReferenceImpl implements Function1<ContentCta, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ContentCta p0 = (ContentCta) obj;
        Intrinsics.h(p0, "p0");
        RewardsOffersHomeViewModel rewardsOffersHomeViewModel = (RewardsOffersHomeViewModel) this.receiver;
        rewardsOffersHomeViewModel.getClass();
        String url = p0.getUrl();
        if (url != null) {
            rewardsOffersHomeViewModel.g.f(new RewardsOfferBaseContract.Actions.OpenUrl(url));
        }
        return Unit.f24250a;
    }
}

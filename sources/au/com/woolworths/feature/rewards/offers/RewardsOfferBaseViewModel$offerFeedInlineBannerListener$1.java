package au.com.woolworths.feature.rewards.offers;

import androidx.lifecycle.ViewModelKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsOfferBaseViewModel$offerFeedInlineBannerListener$1 extends FunctionReferenceImpl implements Function1<OfferFeedInlineBannerViewItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((OfferFeedInlineBannerViewItem) obj);
        return Unit.f24250a;
    }

    public final void m(OfferFeedInlineBannerViewItem p0) {
        Intrinsics.h(p0, "p0");
        RewardsOfferBaseViewModel rewardsOfferBaseViewModel = (RewardsOfferBaseViewModel) this.receiver;
        rewardsOfferBaseViewModel.getClass();
        BuildersKt.c(ViewModelKt.a(rewardsOfferBaseViewModel), null, null, new RewardsOfferBaseViewModel$onDismissOfferFeedInlineBanner$1(rewardsOfferBaseViewModel, p0, null), 3);
        Function1 function1 = rewardsOfferBaseViewModel.i;
        if (function1 != null) {
            function1.invoke(p0.b);
        }
    }
}

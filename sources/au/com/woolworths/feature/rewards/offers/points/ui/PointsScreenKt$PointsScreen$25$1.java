package au.com.woolworths.feature.rewards.offers.points.ui;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PointsScreenKt$PointsScreen$25$1 extends FunctionReferenceImpl implements Function1<ContentCta, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ContentCta p0 = (ContentCta) obj;
        Intrinsics.h(p0, "p0");
        RewardsPointsViewModel rewardsPointsViewModel = (RewardsPointsViewModel) this.receiver;
        rewardsPointsViewModel.getClass();
        String url = p0.getUrl();
        if (url != null) {
            rewardsPointsViewModel.g.f(new RewardsOfferBaseContract.Actions.OpenUrl(url));
        }
        return Unit.f24250a;
    }
}

package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.runtime.Composer;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.rewards.base.data.IconAsset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$OfferDetailsScreenKt$lambda$1010346904$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            OfferDetailsPageResponse.RewardsErrorEmptyState rewardsErrorEmptyState = new OfferDetailsPageResponse.RewardsErrorEmptyState(new IconAsset.HostedIcon(""), "Empty State Title", "Empty State Message", new ContentCta("View offers", "", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.c(9);
                composer.A(objG);
            }
            composer.l();
            OfferDetailsScreenKt.c(rewardsErrorEmptyState, (Function1) objG, composer, 48);
        }
        return Unit.f24250a;
    }
}

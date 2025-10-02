package au.com.woolworths.feature.rewards.offers.provider;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsFooter;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsStatusBadge;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsFooterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsFooter;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferDetailsFooterProvider implements PreviewParameterProvider<OfferDetailsFooter> {

    /* renamed from: a, reason: collision with root package name */
    public static final OfferDetailsFooter f6387a = new OfferDetailsFooter("Ends 13 Oct", new ContentCta("Shop", "", (String) null, Boolean.TRUE, (AnalyticsData) null, 20, (DefaultConstructorMarker) null), null);
    public static final OfferDetailsFooter b = new OfferDetailsFooter("Ends 13 Oct", null, new OfferDetailsStatusBadge("Completed", RewardsOfferStatus.COMPLETED));

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsFooterProvider$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}

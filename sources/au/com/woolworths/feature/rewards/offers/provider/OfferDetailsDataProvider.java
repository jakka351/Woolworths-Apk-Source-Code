package au.com.woolworths.feature.rewards.offers.provider;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsContentItem;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.LocalAssetIconName;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsPageResponse;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferDetailsDataProvider implements PreviewParameterProvider<OfferDetailsPageResponse> {

    /* renamed from: a, reason: collision with root package name */
    public static final OfferDetailsPageResponse.OfferDetailsPage f6386a = new OfferDetailsPageResponse.OfferDetailsPage(OfferDetailsHeaderProvider.f6388a, CollectionsKt.R(new OfferDetailsContentItem.OfferDetailsCard(CollectionsKt.Q(OfferDetailsTrackerComboRowProvider.f6391a)), new OfferDetailsContentItem.OfferDetailsCard(CollectionsKt.Q(OfferDetailsTrackerComboRowProvider.b)), new OfferDetailsContentItem.OfferDetailsCard(CollectionsKt.Q(OfferDetailsTrackerComboRowProvider.c)), new OfferDetailsContentItem.OfferDetailsCard(CollectionsKt.Q(OfferDetailsTrackerComboRowProvider.d)), new OfferDetailsContentItem.OfferDetailsCard(CollectionsKt.Q(OfferDetailsTrackerComboRowProvider.e)), new OfferDetailsContentItem.OfferDetailsCard(CollectionsKt.Q(OfferDetailsInfoItemProvider.f6389a)), new OfferDetailsContentItem.OfferDetailsCard(CollectionsKt.R(OfferDetailsTrackerTermsProvider.f6393a, OfferDetailsTrackerTermsProvider.b, OfferDetailsTrackerTermsProvider.c, OfferDetailsTrackerTermsProvider.d))), OfferDetailsFooterProvider.f6387a, OfferDetailsAnalyticsProvider.f6385a);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/provider/OfferDetailsDataProvider$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        new IconAsset.LocalAsset(LocalAssetIconName.REWARDS);
        new ContentCta("View offers", "", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}

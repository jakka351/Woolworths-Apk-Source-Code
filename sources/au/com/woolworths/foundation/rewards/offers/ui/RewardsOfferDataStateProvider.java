package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsCta;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.RewardsCalendarIcon;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsStatusIcon;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/ui/RewardsOfferDataStateProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferViewItem;", "Companion", "offers-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsOfferDataStateProvider implements PreviewParameterProvider<OfferViewItem> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/ui/RewardsOfferDataStateProvider$Companion;", "", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferData;", "OfferWithOneStatusIcon", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferData;", "OfferWithTwoStatusIcons", "OfferWithBanner", "NotActivatedWithCta", "ActivatedWithInternalCta", "ActivatedWithExternalCta", "offers-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RewardsOfferData rewardsOfferData = OfferViewItemProvider.f8624a;
        RewardsCalendarIcon rewardsCalendarIcon = RewardsCalendarIcon.CALENDAR_CHECK_SUCCESS;
        RewardsOfferData.a(rewardsOfferData, null, null, CollectionsKt.Q(new RewardsStatusIcon(rewardsCalendarIcon)), null, null, null, null, null, null, 1073733631);
        RewardsOfferData.a(rewardsOfferData, null, null, CollectionsKt.R(new RewardsStatusIcon(rewardsCalendarIcon), new RewardsStatusIcon(rewardsCalendarIcon)), null, null, null, null, null, null, 1073733631);
        RewardsOfferData.a(rewardsOfferData, null, null, null, null, null, null, null, null, null, 1073741819);
        RewardsOfferData.a(rewardsOfferData, null, null, null, null, null, new OfferDetailsCta(new ContentCta("Boost", (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null), null), null, null, null, 1065353215);
        RewardsOfferData rewardsOfferData2 = OfferViewItemProvider.b;
        RewardsOfferData.a(rewardsOfferData2, null, null, null, null, null, new OfferDetailsCta(new ContentCta("Shop", "com.woolworths.rewards", (String) null, Boolean.FALSE, (AnalyticsData) null, 20, (DefaultConstructorMarker) null), null), null, null, null, 1065353215);
        RewardsOfferData.a(rewardsOfferData2, null, null, null, null, null, new OfferDetailsCta(new ContentCta("Get a quote", "https://rewards.test-app.link", (String) null, Boolean.TRUE, (AnalyticsData) null, 20, (DefaultConstructorMarker) null), null), null, null, null, 1065353215);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}

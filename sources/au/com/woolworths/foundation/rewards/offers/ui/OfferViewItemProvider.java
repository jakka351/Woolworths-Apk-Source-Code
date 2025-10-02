package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.rewards.offers.model.CircularProgressIndicator;
import au.com.woolworths.foundation.rewards.offers.model.CircularProgressRing;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsCta;
import au.com.woolworths.foundation.rewards.offers.model.OfferProgressTracker;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.rewards.offers.model.StandardBanner;
import au.com.woolworths.rewards.base.data.IconAsset;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/ui/OfferViewItemProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferViewItem;", "Companion", "offers-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferViewItemProvider implements PreviewParameterProvider<OfferViewItem> {

    /* renamed from: a, reason: collision with root package name */
    public static final RewardsOfferData f8624a;
    public static final RewardsOfferData b;
    public static final OfferViewItem c;
    public static final OfferViewItem d;
    public static final OfferViewItem e;
    public static final OfferViewItem f;
    public static final OfferViewItem g;
    public static final OfferViewItem h;
    public static final OfferViewItem i;
    public static final OfferViewItem j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/ui/OfferViewItemProvider$Companion;", "", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferData;", "notActivatedLongTexts", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferData;", "activatedLongTexts", "offerWithCtaData", "endedOfferData", "activatedWithProgressTracker", "Lau/com/woolworths/foundation/rewards/offers/model/OfferViewItem;", "defaultOfferViewItemActivating", "Lau/com/woolworths/foundation/rewards/offers/model/OfferViewItem;", "notActivatedLongTextOfferViewItem", "activatedLongTextOfferViewItem", "defaultOfferViewItemNotActivating", "activatedOfferViewItem", "offerViewItemWithCtaData", "endedOfferViewItem", "activatedProgressTrackerOfferViewItem", "offers-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RewardsOfferData rewardsOfferData = new RewardsOfferData("mockOfferId", "mockImageUrl", null, "Shop to collect 100 points", "Mock Subtitle", "Fancy Feast Medleys Tuna Tuscany In Savory Sauce 85g", "Mock Body", "Mock Formatted Terms", "Mock Markdown Terms", "Boost", RewardsOfferStatus.NOT_ACTIVATED, "Offer expires 21 Nov", null, EmptyList.d, null, null, null, null, "mockBrandLogoUrl", "mockBrandLogoUrlCompact", new IconAsset.HostedIcon("mockRoundelUrl"), null, null, null, null, new StandardBanner("1", "Continue shopping online", "https://example.com/image/summer_sale.jpg", "Shop boosted products from your Boosted Offers list.", "https://example.com/summer_sale", "View on Woolworths App", "Double-tap to see this in Woolies app"), "Mock Display Expiry Extended", "Mock Minimum Spend", null, "alt text");
        f8624a = rewardsOfferData;
        RewardsOfferStatus rewardsOfferStatus = RewardsOfferStatus.ACTIVATED;
        RewardsOfferData rewardsOfferDataA = RewardsOfferData.a(rewardsOfferData, "Boosted", rewardsOfferStatus, null, null, null, null, null, null, null, 1073740287);
        b = rewardsOfferDataA;
        RewardsOfferData rewardsOfferDataA2 = RewardsOfferData.a(rewardsOfferData, "Long display status, that might not be a use case but is tested for test purposes", null, null, null, null, null, null, null, null, 1073741271);
        RewardsOfferData rewardsOfferDataA3 = RewardsOfferData.a(rewardsOfferDataA2, null, rewardsOfferStatus, null, null, null, null, null, null, null, 1073740799);
        RewardsOfferData rewardsOfferDataA4 = RewardsOfferData.a(rewardsOfferData, null, null, null, new ContentCta("Open", "http://test", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null), null, null, null, null, null, 1071644671);
        RewardsOfferData rewardsOfferDataA5 = RewardsOfferData.a(rewardsOfferData, "Missed", RewardsOfferStatus.MISSED, null, null, null, null, null, null, null, 1073740287);
        RewardsOfferData rewardsOfferDataA6 = RewardsOfferData.a(rewardsOfferData, "Boosted", rewardsOfferStatus, null, null, null, new OfferDetailsCta(new ContentCta("Shop", "http://test", (String) null, Boolean.TRUE, (AnalyticsData) null, 20, (DefaultConstructorMarker) null), null), null, null, new OfferProgressTracker("$80.00", " to go", "Week 1/4 • Ends 7 days", new CircularProgressIndicator(new CircularProgressRing(0.625d, "#126C34"))), 796916223);
        c = new OfferViewItem(true, rewardsOfferData);
        d = new OfferViewItem(false, rewardsOfferDataA2);
        e = new OfferViewItem(false, rewardsOfferDataA3);
        f = new OfferViewItem(false, rewardsOfferData);
        g = new OfferViewItem(false, rewardsOfferDataA);
        h = new OfferViewItem(false, rewardsOfferDataA4);
        i = new OfferViewItem(false, rewardsOfferDataA5);
        j = new OfferViewItem(false, rewardsOfferDataA6);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return ArraysKt.g(new OfferViewItem[]{c, f, g, h, i, e, d, j});
    }
}

package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.rewards.offers.StandardBannerViewItem;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ui/StandardBannerMockDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/offers/StandardBannerViewItem;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StandardBannerMockDataProvider implements PreviewParameterProvider<StandardBannerViewItem> {

    /* renamed from: a, reason: collision with root package name */
    public static final StandardBannerViewItem f6410a;
    public static final StandardBannerViewItem b;
    public static final StandardBannerViewItem c;
    public static final StandardBannerViewItem d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ui/StandardBannerMockDataProvider$Companion;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        StandardBannerViewItem standardBannerViewItem = new StandardBannerViewItem("1", "Continue shopping online", "https://example.com/image/summer_sale.jpg", "Shop boosted products from your Boosted Offers list.", "https://example.com/summer_sale", "View on Woolworths App", "Double-tap to see this in Woolies app");
        f6410a = standardBannerViewItem;
        b = StandardBannerViewItem.b(standardBannerViewItem, 119);
        c = StandardBannerViewItem.b(standardBannerViewItem, 95);
        d = StandardBannerViewItem.b(standardBannerViewItem, 123);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return ArraysKt.g(new StandardBannerViewItem[]{f6410a, b, c, d});
    }
}

package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.ProductSectionViewItem;
import au.com.woolworths.feature.rewards.offers.data.OfferSectionLayout;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.ui.OfferViewItemProvider;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/ui/boosterlist/offerssection/preview/ProductSectionViewItemPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/offers/ProductSectionViewItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductSectionViewItemPreviewProvider implements PreviewParameterProvider<ProductSectionViewItem> {
    public static ProductSectionViewItem a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((OfferViewItem) SequencesKt.x(new OfferViewItemProvider().getValues()).get(1));
        }
        return new ProductSectionViewItem("12345", "Exclusive Offers", "Ends on 26 Jan", "Ends on 26 Jan", true, new ContentCta("View Deals", "http://www.action.com", (String) null, Boolean.TRUE, (AnalyticsData) null, 20, (DefaultConstructorMarker) null), arrayList, OfferSectionLayout.e);
    }

    public static ProductSectionViewItem b(int i, int i2) {
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.add((OfferViewItem) SequencesKt.x(new OfferViewItemProvider().getValues()).get(i2 + i3));
        }
        return new ProductSectionViewItem("12345", "Exclusive Offers", "Ends on 26 Jan", "Ends on 26 Jan", true, new ContentCta("View Deals", "http://www.action.com", (String) null, Boolean.TRUE, (AnalyticsData) null, 20, (DefaultConstructorMarker) null), arrayList, OfferSectionLayout.e);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return ArraysKt.g(new ProductSectionViewItem[]{a(1), a(2), a(3), a(4), b(3, 1), b(4, 2), b(4, 3), b(4, 4)});
    }
}

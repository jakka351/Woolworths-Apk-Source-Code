package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundleProductCard;
import au.com.woolworths.feature.shop.bundles.data.BundleQuantityStepper;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.BundlesHeader;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/ui/BundlesPagePreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/bundles/data/BundlesData;", "Companion", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BundlesPagePreviewProvider implements PreviewParameterProvider<BundlesData> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/ui/BundlesPagePreviewProvider$Companion;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        BundlesHeader bundlesHeader = new BundlesHeader(null, "10 bundles", null);
        ProductCard productCard = BundlesSampleData.f6772a;
        new BundlesData.BundlesLandingPage(bundlesHeader, CollectionsKt.Q(new Bundle(BundlesSampleData.f, CollectionsKt.R(new BundleProductCard(BundlesSampleData.f6772a, "Qty 2"), new BundleProductCard(BundlesSampleData.b, "Qty 1")), new BundleQuantityStepper(1, 10, 1, 5, "Add bundle to cart", "Bundle limit reached", "9"), null, null, "Afternoon pickup & delivery")), null, null, null);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}

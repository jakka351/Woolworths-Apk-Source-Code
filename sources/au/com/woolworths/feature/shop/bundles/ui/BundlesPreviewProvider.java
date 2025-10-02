package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundleDetails;
import au.com.woolworths.feature.shop.bundles.data.BundleProductCard;
import au.com.woolworths.feature.shop.bundles.data.BundleQuantityStepper;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/ui/BundlesPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/bundles/data/Bundle;", "Companion", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BundlesPreviewProvider implements PreviewParameterProvider<Bundle> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/ui/BundlesPreviewProvider$Companion;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ProductCard productCard = BundlesSampleData.f6772a;
        BundleDetails bundleDetails = BundlesSampleData.e;
        new Bundle(bundleDetails, EmptyList.d, new BundleQuantityStepper(1, 19, 1, 0, "Add bundle to cart", "Bundle limit reached", "13"), null, null, "Afternoon pickup & delivery");
        ProductCard productCard2 = BundlesSampleData.f6772a;
        BundleProductCard bundleProductCard = new BundleProductCard(productCard2, null);
        ProductCard productCard3 = BundlesSampleData.b;
        new Bundle(bundleDetails, CollectionsKt.R(bundleProductCard, new BundleProductCard(productCard3, null)), new BundleQuantityStepper(1, 19, 1, 0, "Add bundle to cart", "Bundle limit reached", "14"), null, null, "Remote orders restricted goods");
        BundleDetails bundleDetails2 = BundlesSampleData.f;
        new Bundle(bundleDetails2, CollectionsKt.R(new BundleProductCard(productCard2, null), new BundleProductCard(productCard3, null)), new BundleQuantityStepper(1, 19, 1, 0, "Add bundle to cart", "Bundle limit reached", "15"), null, null, "Unavailable for remote orders");
        new Bundle(bundleDetails2, CollectionsKt.R(new BundleProductCard(productCard2, "Qty 1"), new BundleProductCard(productCard3, "Qty 2")), new BundleQuantityStepper(1, 19, 1, 0, "Add bundle to cart", "Bundle limit reached", "16"), null, null, "Afternoon pickup & delivery");
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}

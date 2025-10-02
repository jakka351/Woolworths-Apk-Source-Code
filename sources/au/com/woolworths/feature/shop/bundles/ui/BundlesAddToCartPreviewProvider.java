package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.bundles.data.BundleQuantityStepper;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/ui/BundlesAddToCartPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/bundles/data/BundleQuantityStepper;", "Companion", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BundlesAddToCartPreviewProvider implements PreviewParameterProvider<BundleQuantityStepper> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/ui/BundlesAddToCartPreviewProvider$Companion;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        new BundleQuantityStepper(1, 10, 1, 0, "Add bundles to cart", "Bundle limit reached", "1");
        new BundleQuantityStepper(1, 0, 1, 0, "Add bundles to cart", "Bundle Unavailable", "2");
        new BundleQuantityStepper(1, 10, 1, 3, "Add bundles to cart", "Bundle limit reached", "3");
        new BundleQuantityStepper(1, 10, 1, 10, "Add bundles to cart", "Bundle limit reached", "4");
        new BundleQuantityStepper(1, 10, 1, 1, "Add bundles to cart", "Bundle limit reached", "5");
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}

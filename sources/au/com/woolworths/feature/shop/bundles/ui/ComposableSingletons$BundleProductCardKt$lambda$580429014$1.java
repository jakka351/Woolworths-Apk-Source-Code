package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.feature.shop.bundles.data.BundleProductCard;
import au.com.woolworths.feature.shop.bundles.data.BundlesProductCardConfig;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$BundleProductCardKt$lambda$580429014$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            BundleProductCard bundleProductCard = BundlesSampleData.c;
            SharedIntrinsicHeightState sharedIntrinsicHeightState = new SharedIntrinsicHeightState();
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shared.instore.wifi.ui.c(24);
                composer.A(objG);
            }
            composer.l();
            BundleProductCardKt.a((Function1) objG, bundleProductCard, BundlesProductCardConfig.e, sharedIntrinsicHeightState, true, null, composer, (ProductCard.$stable << 3) | 24966, 32);
        }
        return Unit.f24250a;
    }
}

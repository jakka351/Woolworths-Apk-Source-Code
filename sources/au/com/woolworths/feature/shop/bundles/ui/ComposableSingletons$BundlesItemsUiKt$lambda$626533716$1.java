package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.bundles.data.BundleProductCard;
import au.com.woolworths.feature.shop.bundles.data.BundlesProductCardConfig;
import au.com.woolworths.product.models.ProductCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.bundles.ui.ComposableSingletons$BundlesItemsUiKt$lambda$-626533716$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$BundlesItemsUiKt$lambda$626533716$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$BundlesItemsUiKt$lambda$626533716$1 d = new ComposableSingletons$BundlesItemsUiKt$lambda$626533716$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            List listR = CollectionsKt.R(new BundleProductCard(BundlesSampleData.f6772a, "Qty 2"), new BundleProductCard(BundlesSampleData.b, "Qty 1"));
            BundlesProductCardConfig bundlesProductCardConfigA = BundlesProductCardConfig.a(BundlesProductCardConfig.e, false, false, false, true, 127);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shared.instore.wifi.ui.c(26);
                composer.A(objG);
            }
            composer.l();
            BundlesItemsUiKt.a(listR, (Function1) objG, bundlesProductCardConfigA, false, composer, ProductCard.$stable | 48, 8);
        }
        return Unit.f24250a;
    }
}

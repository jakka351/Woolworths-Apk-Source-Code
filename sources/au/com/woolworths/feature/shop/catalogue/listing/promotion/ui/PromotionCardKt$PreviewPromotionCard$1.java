package au.com.woolworths.feature.shop.catalogue.listing.promotion.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class PromotionCardKt$PreviewPromotionCard$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        SharedIntrinsicHeightState sharedIntrinsicHeightState = new SharedIntrinsicHeightState();
        composer.o(1849434622);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(10);
            composer.A(objG);
        }
        composer.l();
        PromotionCardKt.a(null, sharedIntrinsicHeightState, (Function1) objG, null, composer, ProductCard.$stable | KyberEngine.KyberPolyBytes, 8);
        throw null;
    }
}

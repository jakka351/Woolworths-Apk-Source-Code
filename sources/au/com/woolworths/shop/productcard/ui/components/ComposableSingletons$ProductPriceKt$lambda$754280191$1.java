package au.com.woolworths.shop.productcard.ui.components;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import au.com.woolworths.shop.productcard.data.ProductPriceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.productcard.ui.components.ComposableSingletons$ProductPriceKt$lambda$-754280191$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductPriceKt$lambda$754280191$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductPriceKt.a(new ProductPriceInfo(null, null, null, CollectionsKt.R(new TextWithAltData("$7.00 / 1kg", "Unit price 7 dollars per kilo"), new TextWithAltData("$13.35 / tray approx", "Approximately $13.35 per tray")), null, null, null), null, 0L, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}

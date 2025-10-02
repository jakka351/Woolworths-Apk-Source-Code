package au.com.woolworths.shop.productcard.ui.components;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import au.com.woolworths.shop.productcard.data.ProductPriceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.productcard.ui.components.ComposableSingletons$ProductPriceKt$lambda$-1584400490$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductPriceKt$lambda$1584400490$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductPriceKt.a(new ProductPriceInfo("", 5500, "/4kg", EmptyList.d, new TextWithAltData("$12.50", "Was $12.50"), new TextWithAltData("Save $5.50", "Save $5.50"), null), null, 0L, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}

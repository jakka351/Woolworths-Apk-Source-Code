package au.com.woolworths.feature.product.list.compose.errorscreen;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.product.list.data.ProductListZeroResults;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductListErrorScreenKt$lambda$1273904748$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductListErrorScreenKt.a(new ProductListZeroResults.ProductListFullScreenError("https://example.com/image.png", "Error Title", "This is an error description.", new LinkData("id", new ActionData("TODO()", ActionType.d, "id", null), new TextWithAltData("Clear filters", "Clear filters"))), SizeKt.c, composer, 56);
        }
        return Unit.f24250a;
    }
}

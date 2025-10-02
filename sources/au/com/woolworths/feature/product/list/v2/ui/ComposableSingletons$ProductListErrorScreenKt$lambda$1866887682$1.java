package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.product.list.v2.ui.ComposableSingletons$ProductListErrorScreenKt$lambda$-1866887682$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductListErrorScreenKt$lambda$1866887682$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            FillElement fillElement = SizeKt.c;
            ProductListZeroResults.ProductListFullScreenError productListFullScreenError = new ProductListZeroResults.ProductListFullScreenError("https://example.com/image.png", "Error Title", "This is an error description.", new LinkData("id", new ActionData("TODO()", ActionType.d, "id", null), new TextWithAltData("Clear filters", "Clear filters")), null, null);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new d(2);
                composer.A(objG);
            }
            composer.l();
            ProductListErrorScreenKt.a(productListFullScreenError, (Function1) objG, fillElement, composer, 432);
        }
        return Unit.f24250a;
    }
}

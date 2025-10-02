package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.ProductTrolleyDataKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductCardButtonsKt$lambda$-614188032$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductCardButtonsKt$lambda$614188032$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductTrolleyData productTrolleyDataDefaultProductTrolleyData = ProductTrolleyDataKt.defaultProductTrolleyData();
            ProductCard productCardB = ProductCardPreviewDataKt.b(null, null, null, null, false, null, productTrolleyDataDefaultProductTrolleyData.copy((895 & 1) != 0 ? productTrolleyDataDefaultProductTrolleyData.minimum : 0.0d, (895 & 2) != 0 ? productTrolleyDataDefaultProductTrolleyData.maximum : 0.0d, (895 & 4) != 0 ? productTrolleyDataDefaultProductTrolleyData.increment : 0.0d, (895 & 8) != 0 ? productTrolleyDataDefaultProductTrolleyData.defaultValue : 0.0d, (895 & 16) != 0 ? productTrolleyDataDefaultProductTrolleyData.inTrolley : null, (895 & 32) != 0 ? productTrolleyDataDefaultProductTrolleyData.unitLabel : null, (895 & 64) != 0 ? productTrolleyDataDefaultProductTrolleyData.buttonState : null, (895 & 128) != 0 ? productTrolleyDataDefaultProductTrolleyData.buttonLabel : "Update", (895 & 256) != 0 ? productTrolleyDataDefaultProductTrolleyData.buttonQuantity : null, (895 & 512) != 0 ? productTrolleyDataDefaultProductTrolleyData.title : null), null, null, null, null, null, null, null, null, null, null, -32769, 3);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            composer.l();
            ProductCardButtonsKt.i(productCardB, (Function0) objG, null, composer, 48, 4);
        }
        return Unit.f24250a;
    }
}

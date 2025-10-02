package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductLocationInfoKt$lambda$-130425925$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductLocationInfoKt$lambda$130425925$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCard productCardB = ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, new InstoreDetailsData("Aisle 3 and some very long descriptive text lorem ipsum is very long indeed", InStoreLocationType.AVAILABLE), null, null, null, null, null, null, null, null, -131073, 3);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            composer.l();
            ProductLocationInfoKt.a(productCardB, null, false, (Function0) objG, null, composer, 3072, 22);
        }
        return Unit.f24250a;
    }
}

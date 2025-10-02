package au.com.woolworths.feature.shop.product.availability.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiState;
import au.com.woolworths.feature.shop.product.availability.domain.GeoData;
import au.com.woolworths.feature.shop.product.availability.domain.StoreProductAvailabilityData;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.product.availability.ui.ComposableSingletons$ProductAvailabilityScreenKt$lambda$-738121770$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductAvailabilityScreenKt$lambda$738121770$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductAvailabilityUiState.Content content = new ProductAvailabilityUiState.Content("Penrith, NSW", ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -513, 3), CollectionsKt.R(new StoreProductAvailabilityData("123", "Sydney Metcentre", "123 Some Street", new GeoData(Double.valueOf(2.5d)), true), new StoreProductAvailabilityData("456", "North Sydney Store with a very long name", "456 Some Road with very long name that needs to be truncated", new GeoData(Double.valueOf(4.6d)), false)));
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new l(15);
                composer.A(objE);
            }
            composer.l();
            ProductAvailabilityScreenKt.e(content, function0, (Function1) objE, composer, 432);
        }
        return Unit.f24250a;
    }
}

package au.com.woolworths.feature.shop.product.availability.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import au.com.woolworths.feature.shop.product.availability.domain.GeoData;
import au.com.woolworths.feature.shop.product.availability.domain.StoreProductAvailabilityData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$NearbyStoresSectionUiKt$lambda$355515660$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            List listR = CollectionsKt.R(new StoreProductAvailabilityData("123", "Sydney Metcentre", "123 Some Street", new GeoData(Double.valueOf(2.5d)), true), new StoreProductAvailabilityData("456", "Penrith CBD", "456 Some Road with very long name should be most definitely truncated", new GeoData(Double.valueOf(4.6d)), false));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new l(14);
                composer.A(objG);
            }
            composer.l();
            NearbyStoresSectionUiKt.b(listR, (Function1) objG, null, composer, 48);
        }
        return Unit.f24250a;
    }
}

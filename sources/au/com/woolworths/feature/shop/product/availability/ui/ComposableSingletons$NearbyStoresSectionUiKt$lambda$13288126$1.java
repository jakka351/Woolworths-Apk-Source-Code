package au.com.woolworths.feature.shop.product.availability.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$NearbyStoresSectionUiKt$lambda$13288126$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new l(13);
                composer.A(objG);
            }
            composer.l();
            NearbyStoresSectionUiKt.b(EmptyList.d, (Function1) objG, null, composer, 54);
        }
        return Unit.f24250a;
    }
}

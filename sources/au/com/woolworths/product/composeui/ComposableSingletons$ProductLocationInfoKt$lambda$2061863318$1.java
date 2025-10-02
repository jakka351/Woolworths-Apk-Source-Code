package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductLocationInfoKt$lambda$-2061863318$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductLocationInfoKt$lambda$2061863318$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductLocationInfoKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, new InstoreDetailsData("Aisle 3", InStoreLocationType.AVAILABLE), null, null, null, null, null, null, null, null, -131073, 3), null, false, null, null, composer, 0, 30);
        }
        return Unit.f24250a;
    }
}

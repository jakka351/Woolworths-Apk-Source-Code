package au.com.woolworths.feature.shop.product.availability.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.composeui.ProductCardButtonsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.product.availability.ui.ComposableSingletons$NearbyStoresSectionUiKt$lambda$-2084753457$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$NearbyStoresSectionUiKt$lambda$2084753457$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$NearbyStoresSectionUiKt$lambda$2084753457$1 d = new ComposableSingletons$NearbyStoresSectionUiKt$lambda$2084753457$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCardButtonsKt.h(0, 1, composer, null);
        }
        return Unit.f24250a;
    }
}

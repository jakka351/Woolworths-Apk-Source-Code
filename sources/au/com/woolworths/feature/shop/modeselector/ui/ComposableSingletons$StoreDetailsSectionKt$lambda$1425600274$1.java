package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.modeselector.model.ModeSelectorStoreDetailsData;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$StoreDetailsSectionKt$lambda$1425600274$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData shoppingModeSelectorStoreDetailsSectionData = new ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData(CollectionsKt.Q(new ModeSelectorStoreDetailsData(null, "Trading hours", "Today 6am - 12am", ButtonApiData.b(StoreDetailsSectionKt.f7551a, null, null, false, 510))));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.marketplace.ui.facet.a(29);
                composer.A(objG);
            }
            composer.l();
            StoreDetailsSectionKt.b(shoppingModeSelectorStoreDetailsSectionData, (Function1) objG, null, composer, 48, 4);
        }
        return Unit.f24250a;
    }
}

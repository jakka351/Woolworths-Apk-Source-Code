package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$FeaturesSectionKt$lambda$1355969931$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData shoppingModeSelectorStoreFeaturesData = FeaturesSectionKt.f7547a;
            List listW0 = CollectionsKt.w0(shoppingModeSelectorStoreFeaturesData.b, 3);
            String title = shoppingModeSelectorStoreFeaturesData.f7536a;
            Intrinsics.h(title, "title");
            FeaturesSectionKt.b(new ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData(title, listW0), null, composer, 0, 2);
        }
        return Unit.f24250a;
    }
}

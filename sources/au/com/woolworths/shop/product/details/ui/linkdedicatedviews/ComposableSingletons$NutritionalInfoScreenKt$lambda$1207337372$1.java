package au.com.woolworths.shop.product.details.ui.linkdedicatedviews;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.shop.product.details.data.NutritionInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$NutritionalInfoScreenKt$lambda$1207337372$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            NutritionInfo nutritionInfo = new NutritionInfo("Test title", "Servings per package:00g", "Serving size:00g", CollectionsKt.R("Servings per package", "Serving size"), CollectionsKt.R("100g", "100g"), "bottom caption", CollectionsKt.R("Col 1", "Col 2", "Col 3", "Col 4"), CollectionsKt.R(CollectionsKt.R("Row 1", "1,1", "1,2", "1,3"), CollectionsKt.R("Row 2", "2,1", "2,2", "2,3"), CollectionsKt.R("Row 3", "3,1", "3,2", "3,3")));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            NutritionalInfoScreenKt.a(nutritionInfo, (Function0) objG, composer, 48);
        }
        return Unit.f24250a;
    }
}

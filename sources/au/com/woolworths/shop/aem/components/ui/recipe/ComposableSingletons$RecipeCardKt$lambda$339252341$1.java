package au.com.woolworths.shop.aem.components.ui.recipe;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCostPerServeData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeDuration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$RecipeCardKt$lambda$339252341$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RecipeCardSummaryData recipeCardSummaryData = new RecipeCardSummaryData("", "This title spans two lines and is a very loooooooong title with ellipsis", null, null, "", Boolean.FALSE, new RecipeDuration("30m", "Prep Time is 30 minutes"), new RecipeDuration("2h 30m", "Cook Time is 2 hours 30 minutes"), new RecipeCostPerServeData(6.55d, null));
            RecipeCardSummaryConfig recipeCardSummaryConfig = new RecipeCardSummaryConfig(true, true);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            RecipeCardKt.a(recipeCardSummaryData, recipeCardSummaryConfig, (Function0) objG, null, false, null, composer, 432, 56);
        }
        return Unit.f24250a;
    }
}

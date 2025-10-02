package au.com.woolworths.feature.product.list.compose.recipe;

import androidx.compose.runtime.Composer;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.product.list.ProductListClickHandler;
import au.com.woolworths.feature.product.list.data.IngredientAnalyticsApiData;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.product.list.compose.recipe.ComposableSingletons$IngredientCardUiKt$lambda$-279526049$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$IngredientCardUiKt$lambda$279526049$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/product/list/compose/recipe/ComposableSingletons$IngredientCardUiKt$lambda$-279526049$1$1", "Lau/com/woolworths/feature/product/list/ProductListClickHandler;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.compose.recipe.ComposableSingletons$IngredientCardUiKt$lambda$-279526049$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductListClickHandler {
        @Override // au.com.woolworths.feature.product.list.ProductListClickHandler
        public final void o2(IngredientCardApiData ingredientCardApiData) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IngredientCardUiKt.a(new IngredientCardApiData("2 garlic cloves, crushed", new ButtonApiData("swap", null, null, true, null, null, null, null, null, 470, null), EmptyList.d, new IngredientAnalyticsApiData("")), new AnonymousClass1(), composer, 0);
        }
        return Unit.f24250a;
    }
}

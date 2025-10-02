package au.com.woolworths.feature.product.list.legacy.compose.recipe;

import androidx.compose.runtime.Composer;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.product.list.legacy.ProductListClickHandler;
import au.com.woolworths.feature.product.list.legacy.data.IngredientAnalyticsApiData;
import au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$IngredientCardUiKt$lambda$1175839112$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/product/list/legacy/compose/recipe/ComposableSingletons$IngredientCardUiKt$lambda$1175839112$1$1", "Lau/com/woolworths/feature/product/list/legacy/ProductListClickHandler;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.legacy.compose.recipe.ComposableSingletons$IngredientCardUiKt$lambda$1175839112$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductListClickHandler {
        @Override // au.com.woolworths.feature.product.list.legacy.ProductListClickHandler
        public final void N() {
        }

        @Override // au.com.woolworths.feature.product.list.legacy.ProductListClickHandler
        public final void p4(IngredientCardApiData ingredientCard) {
            Intrinsics.h(ingredientCard, "ingredientCard");
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

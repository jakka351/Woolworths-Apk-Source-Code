package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.shop.graphql.ProductsByRecipeQuery;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/IngredientCardApiData;", "Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$OnIngredientCard;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByRecipeQueryOnIngredientCardExtKt {
    @NotNull
    public static final IngredientCardApiData toUiModel(@NotNull ProductsByRecipeQuery.OnIngredientCard onIngredientCard) {
        Intrinsics.h(onIngredientCard, "<this>");
        String str = onIngredientCard.f10954a;
        ProductsByRecipeQuery.SwapButton swapButton = onIngredientCard.b;
        ButtonApiData uiModel = swapButton != null ? ProductsByRecipeQuerySwapButtonExtKt.toUiModel(swapButton) : null;
        ArrayList arrayList = onIngredientCard.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ProductsByRecipeQueryAlternativeProductExtKt.toUiModel((ProductsByRecipeQuery.AlternativeProduct) it.next()));
        }
        return new IngredientCardApiData(str, uiModel, arrayList2, ProductsByRecipeQueryAnalyticsExtKt.toUiModel(onIngredientCard.d));
    }
}

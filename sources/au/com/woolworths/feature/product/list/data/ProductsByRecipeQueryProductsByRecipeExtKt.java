package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.shop.graphql.ProductsByRecipeQuery;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListByRecipeApiData;", "Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$ProductsByRecipe;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByRecipeQueryProductsByRecipeExtKt {
    @NotNull
    public static final ProductListByRecipeApiData toUiModel(@NotNull ProductsByRecipeQuery.ProductsByRecipe productsByRecipe) {
        Object uiModel;
        Intrinsics.h(productsByRecipe, "<this>");
        ArrayList<ProductsByRecipeQuery.ProductsFeed> arrayList = productsByRecipe.c;
        ArrayList arrayList2 = new ArrayList();
        for (ProductsByRecipeQuery.ProductsFeed productsFeed : arrayList) {
            ProductsByRecipeQuery.OnIngredientCard onIngredientCard = productsFeed.b;
            if (onIngredientCard != null) {
                uiModel = ProductsByRecipeQueryOnIngredientCardExtKt.toUiModel(onIngredientCard);
            } else {
                ProductsByRecipeQuery.OnListSectionHeader onListSectionHeader = productsFeed.c;
                if (onListSectionHeader != null) {
                    uiModel = ProductsByRecipeQueryOnListSectionHeaderExtKt.toUiModel(onListSectionHeader);
                } else {
                    ProductsByRecipeQuery.OnProductCard onProductCard = productsFeed.d;
                    if (onProductCard != null) {
                        uiModel = ProductsByRecipeQueryOnProductCardExtKt.toUiModel(onProductCard);
                    } else {
                        ProductsByRecipeQuery.OnDietaryDisclaimer onDietaryDisclaimer = productsFeed.e;
                        uiModel = onDietaryDisclaimer != null ? ProductsByRecipeQueryOnDietaryDisclaimerExtKt.toUiModel(onDietaryDisclaimer) : null;
                    }
                }
            }
            if (uiModel != null) {
                arrayList2.add(uiModel);
            }
        }
        return new ProductListByRecipeApiData(arrayList2, productsByRecipe.f10957a, productsByRecipe.b);
    }
}

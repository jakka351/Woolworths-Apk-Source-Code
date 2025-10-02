package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.product.models.DietaryInfo;
import au.com.woolworths.shop.graphql.ProductsByRecipeQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/DietaryInfo;", "Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$DietaryInfo;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByRecipeQueryDietaryInfoExtKt {
    @NotNull
    public static final DietaryInfo toUiModel(@NotNull ProductsByRecipeQuery.DietaryInfo dietaryInfo) {
        Intrinsics.h(dietaryInfo, "<this>");
        return new DietaryInfo(dietaryInfo.f10951a, dietaryInfo.b);
    }
}

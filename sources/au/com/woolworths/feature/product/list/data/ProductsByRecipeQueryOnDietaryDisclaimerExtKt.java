package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.product.models.DietaryDisclaimer;
import au.com.woolworths.shop.graphql.ProductsByRecipeQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/DietaryDisclaimer;", "Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$OnDietaryDisclaimer;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByRecipeQueryOnDietaryDisclaimerExtKt {
    @NotNull
    public static final DietaryDisclaimer toUiModel(@NotNull ProductsByRecipeQuery.OnDietaryDisclaimer onDietaryDisclaimer) {
        Intrinsics.h(onDietaryDisclaimer, "<this>");
        InsetBannerApiData uiModel = ProductsByRecipeQueryInsetBannerExtKt.toUiModel(onDietaryDisclaimer.f10953a);
        ProductsByRecipeQuery.DietaryInfo dietaryInfo = onDietaryDisclaimer.b;
        return new DietaryDisclaimer(uiModel, dietaryInfo != null ? ProductsByRecipeQueryDietaryInfoExtKt.toUiModel(dietaryInfo) : null);
    }
}

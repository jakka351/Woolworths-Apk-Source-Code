package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import au.com.woolworths.shop.graphql.ProductsByRecipeQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionApiData;", "Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$Action;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByRecipeQueryActionExtKt {
    @NotNull
    public static final InsetBannerActionApiData toUiModel(@NotNull ProductsByRecipeQuery.Action action) {
        Intrinsics.h(action, "<this>");
        return new InsetBannerActionApiData(action.c, action.d, InsetBannerActionTypeExtKt.toUiModel(action.b), InsetBannerActionPlacementExtKt.toUiModel(action.f10947a), null);
    }
}

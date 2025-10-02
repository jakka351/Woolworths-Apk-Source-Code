package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.shop.graphql.ProductsByRecipeQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "Lau/com/woolworths/shop/graphql/ProductsByRecipeQuery$InsetBanner;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByRecipeQueryInsetBannerExtKt {
    @NotNull
    public static final InsetBannerApiData toUiModel(@NotNull ProductsByRecipeQuery.InsetBanner insetBanner) {
        Intrinsics.h(insetBanner, "<this>");
        InsetBannerTypeApiData uiModel = InsetBannerDisplayTypeExtKt.toUiModel(insetBanner.f10952a);
        String str = insetBanner.b;
        ProductsByRecipeQuery.Action action = insetBanner.d;
        return new InsetBannerApiData(uiModel, str, null, action != null ? ProductsByRecipeQueryActionExtKt.toUiModel(action) : null, null, null, 32, null);
    }
}

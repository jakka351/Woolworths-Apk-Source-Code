package au.com.woolworths.product.details.models;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import com.woolworths.product.details.ProductDetailsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "Lcom/woolworths/product/details/ProductDetailsQuery$Banner;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQueryBannerExtKt {
    @NotNull
    public static final InsetBannerApiData toUiModel(@NotNull ProductDetailsQuery.Banner banner) {
        Intrinsics.h(banner, "<this>");
        InsetBannerTypeApiData uiModel = InsetBannerDisplayTypeExtKt.toUiModel(banner.getDisplayType());
        String message = banner.getMessage();
        String bannerTitle = banner.getBannerTitle();
        ProductDetailsQuery.Action2 action = banner.getAction();
        return new InsetBannerApiData(uiModel, message, bannerTitle, action != null ? ProductDetailsQueryAction2ExtKt.toUiModel(action) : null, banner.getIconUrl(), null, 32, null);
    }
}

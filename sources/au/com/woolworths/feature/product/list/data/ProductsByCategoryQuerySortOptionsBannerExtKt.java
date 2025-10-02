package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import com.woolworths.product.list.ProductsByCategoryQuery;
import com.woolworths.product.list.fragment.InsetBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "Lcom/woolworths/product/list/ProductsByCategoryQuery$SortOptionsBanner;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByCategoryQuerySortOptionsBannerExtKt {
    @NotNull
    public static final InsetBannerApiData toUiModel(@NotNull ProductsByCategoryQuery.SortOptionsBanner sortOptionsBanner) {
        Intrinsics.h(sortOptionsBanner, "<this>");
        InsetBannerTypeApiData uiModel = InsetBannerDisplayTypeExtKt.toUiModel(sortOptionsBanner.getInsetBanner().getDisplayType());
        String message = sortOptionsBanner.getInsetBanner().getMessage();
        String bannerTitle = sortOptionsBanner.getInsetBanner().getBannerTitle();
        InsetBanner.Action action = sortOptionsBanner.getInsetBanner().getAction();
        return new InsetBannerApiData(uiModel, message, bannerTitle, action != null ? InsetBannerActionExtKt.toUiModel(action) : null, sortOptionsBanner.getInsetBanner().getIconUrl(), null, 32, null);
    }
}

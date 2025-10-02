package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import com.woolworths.product.list.ProductsBySearchQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionApiData;", "Lcom/woolworths/product/list/ProductsBySearchQuery$Action;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsBySearchQueryActionExtKt {
    @NotNull
    public static final InsetBannerActionApiData toUiModel(@NotNull ProductsBySearchQuery.Action action) {
        Intrinsics.h(action, "<this>");
        return new InsetBannerActionApiData(action.getLabel(), action.getUrl(), InsetBannerActionTypeExtKt.toUiModel(action.getType()), InsetBannerActionPlacementExtKt.toUiModel(action.getPlacement()), null);
    }
}

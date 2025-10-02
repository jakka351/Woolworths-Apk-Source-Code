package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import com.woolworths.product.list.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionApiData;", "Lcom/woolworths/product/list/ProductListQuery$Action1;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryAction1ExtKt {
    @NotNull
    public static final InsetBannerActionApiData toUiModel(@NotNull ProductListQuery.Action1 action1) {
        Intrinsics.h(action1, "<this>");
        return new InsetBannerActionApiData(action1.getLabel(), action1.getUrl(), InsetBannerActionTypeExtKt.toUiModel(action1.getType()), InsetBannerActionPlacementExtKt.toUiModel(action1.getPlacement()), null);
    }
}

package au.com.woolworths.product.details.models;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import com.woolworths.product.details.ProductDetailsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionApiData;", "Lcom/woolworths/product/details/ProductDetailsQuery$Action2;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQueryAction2ExtKt {
    @NotNull
    public static final InsetBannerActionApiData toUiModel(@NotNull ProductDetailsQuery.Action2 action2) {
        Intrinsics.h(action2, "<this>");
        return new InsetBannerActionApiData(action2.getLabel(), action2.getUrl(), InsetBannerActionTypeExtKt.toUiModel(action2.getType()), InsetBannerActionPlacementExtKt.toUiModel(action2.getPlacement()), null);
    }
}

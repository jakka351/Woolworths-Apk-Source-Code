package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.feature.shop.banners.imagetextbanner.ImageTextBannerModel;
import com.airbnb.epoxy.EpoxyModel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListControllerKt {
    public static final boolean a(EpoxyModel epoxyModel) {
        return (epoxyModel instanceof DynamicSizeCardComposeEpoxyModel) || (epoxyModel instanceof EdrOfferBannerEpoxyModel) || (epoxyModel instanceof PersonalisedProductsBannerEpoxyModel) || (epoxyModel instanceof HorizontalListEpoxyModel) || (epoxyModel instanceof ItemProductListInsetBannerLegacyBindingModel_) || (epoxyModel instanceof ImageTextBannerModel) || (epoxyModel instanceof VideoAdUnitComposeEpoxyModel);
    }
}

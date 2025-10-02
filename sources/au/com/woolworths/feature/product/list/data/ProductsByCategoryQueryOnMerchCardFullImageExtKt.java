package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.merchcardfullimage.MerchCardFullImageData;
import com.woolworths.product.list.ProductsByCategoryQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/aem/components/model/merchcardfullimage/MerchCardFullImageData;", "Lcom/woolworths/product/list/ProductsByCategoryQuery$OnMerchCardFullImage;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByCategoryQueryOnMerchCardFullImageExtKt {
    @NotNull
    public static final MerchCardFullImageData toUiModel(@NotNull ProductsByCategoryQuery.OnMerchCardFullImage onMerchCardFullImage) {
        Intrinsics.h(onMerchCardFullImage, "<this>");
        ImageWithAltText uiModel = ProductsByCategoryQueryMerchCardFullImageBackgroundImageWithAltExtKt.toUiModel(onMerchCardFullImage.getMerchCardFullImageBackgroundImageWithAlt());
        ProductsByCategoryQuery.MerchCardFullImageAction merchCardFullImageAction = onMerchCardFullImage.getMerchCardFullImageAction();
        ActionData uiModel2 = merchCardFullImageAction != null ? ProductsByCategoryQueryMerchCardFullImageActionExtKt.toUiModel(merchCardFullImageAction) : null;
        ProductsByCategoryQuery.MerchCardFullImageButton merchCardFullImageButton = onMerchCardFullImage.getMerchCardFullImageButton();
        return new MerchCardFullImageData(uiModel, uiModel2, merchCardFullImageButton != null ? ProductListByCategoryApiDataKt.toUiModel(merchCardFullImageButton) : null, onMerchCardFullImage.getMerchCardFullImageDescription(), onMerchCardFullImage.getMerchCardFullImageTitle());
    }
}

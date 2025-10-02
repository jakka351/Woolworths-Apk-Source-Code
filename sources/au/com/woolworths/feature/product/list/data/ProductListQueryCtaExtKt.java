package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.shop.aem.components.model.link.LinkData;
import com.woolworths.product.list.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/aem/components/model/link/LinkData;", "Lcom/woolworths/product/list/ProductListQuery$Cta;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryCtaExtKt {
    @NotNull
    public static final LinkData toUiModel(@NotNull ProductListQuery.Cta cta) {
        Intrinsics.h(cta, "<this>");
        return new LinkData(cta.getLinkId(), ProductListQueryLinkActionExtKt.toUiModel(cta.getLinkAction()), ProductListQueryLinkTextWithAltExtKt.toUiModel(cta.getLinkTextWithAlt()));
    }
}

package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.base.shopapp.data.models.InfoSectionFooter;
import com.woolworths.product.list.ProductsByCategoryQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/base/shopapp/data/models/InfoSectionFooter;", "Lcom/woolworths/product/list/ProductsByCategoryQuery$Footer;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByCategoryQueryFooterExtKt {
    @NotNull
    public static final InfoSectionFooter toUiModel(@NotNull ProductsByCategoryQuery.Footer footer) {
        Intrinsics.h(footer, "<this>");
        return new InfoSectionFooter(footer.getTitle(), footer.getSubtitle(), footer.getLinkUrl());
    }
}

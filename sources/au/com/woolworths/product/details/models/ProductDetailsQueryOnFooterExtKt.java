package au.com.woolworths.product.details.models;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import com.woolworths.product.details.ProductDetailsQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/details/models/Footer;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnFooter;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsQueryOnFooterExtKt {
    @NotNull
    public static final Footer toUiModel(@NotNull ProductDetailsQuery.OnFooter onFooter) {
        Intrinsics.h(onFooter, "<this>");
        List<ProductDetailsQuery.Button> buttons = onFooter.getButtons();
        ArrayList arrayList = new ArrayList();
        for (ProductDetailsQuery.Button button : buttons) {
            ButtonApiData uiModel = button != null ? ProductDetailsQueryButtonExtKt.toUiModel(button) : null;
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        return new Footer(arrayList);
    }
}

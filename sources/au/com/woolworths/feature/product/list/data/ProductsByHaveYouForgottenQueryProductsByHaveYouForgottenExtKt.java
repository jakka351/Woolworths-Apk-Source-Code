package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.graphql.ProductsByHaveYouForgottenQuery;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListByHaveYouForgottenApiData;", "Lau/com/woolworths/shop/graphql/ProductsByHaveYouForgottenQuery$ProductsByHaveYouForgotten;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByHaveYouForgottenQueryProductsByHaveYouForgottenExtKt {
    @NotNull
    public static final ProductListByHaveYouForgottenApiData toUiModel(@NotNull ProductsByHaveYouForgottenQuery.ProductsByHaveYouForgotten productsByHaveYouForgotten) {
        Intrinsics.h(productsByHaveYouForgotten, "<this>");
        ArrayList arrayList = productsByHaveYouForgotten.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ProductsByHaveYouForgottenQuery.OnProductCard onProductCard = ((ProductsByHaveYouForgottenQuery.ProductsFeed) it.next()).b;
            ProductCard uiModel = onProductCard != null ? ProductsByHaveYouForgottenQueryOnProductCardExtKt.toUiModel(onProductCard) : null;
            if (uiModel != null) {
                arrayList2.add(uiModel);
            }
        }
        return new ProductListByHaveYouForgottenApiData(arrayList2, productsByHaveYouForgotten.f10944a);
    }
}

package au.com.woolworths.shop.aem.components.model.productcategorytile;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/productcategorytile/ProductCategoryTileData;", "Lau/com/woolworths/shop/aem/components/model/horizontalList/HorizontalListItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductCategoryTileData implements HorizontalListItem {
    public final String d;
    public final String e;
    public final ActionData f;

    public ProductCategoryTileData(String productCategoryTileImageUrl, String productCategoryTileLabel, ActionData productCategoryTileAction) {
        Intrinsics.h(productCategoryTileImageUrl, "productCategoryTileImageUrl");
        Intrinsics.h(productCategoryTileLabel, "productCategoryTileLabel");
        Intrinsics.h(productCategoryTileAction, "productCategoryTileAction");
        this.d = productCategoryTileImageUrl;
        this.e = productCategoryTileLabel;
        this.f = productCategoryTileAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCategoryTileData)) {
            return false;
        }
        ProductCategoryTileData productCategoryTileData = (ProductCategoryTileData) obj;
        return Intrinsics.c(this.d, productCategoryTileData.d) && Intrinsics.c(this.e, productCategoryTileData.e) && Intrinsics.c(this.f, productCategoryTileData.f);
    }

    @Override // au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem
    public final AnalyticsData getImpressionAnalyticsData() {
        return null;
    }

    public final int hashCode() {
        return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ProductCategoryTileData(productCategoryTileImageUrl=", this.d, ", productCategoryTileLabel=", this.e, ", productCategoryTileAction=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}

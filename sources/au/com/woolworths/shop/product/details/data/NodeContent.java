package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/NodeContent;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NodeContent {

    /* renamed from: a, reason: collision with root package name */
    public final ProductHorizontalList f12603a;

    public NodeContent(ProductHorizontalList productHorizontalList) {
        this.f12603a = productHorizontalList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NodeContent) && Intrinsics.c(this.f12603a, ((NodeContent) obj).f12603a);
    }

    public final int hashCode() {
        ProductHorizontalList productHorizontalList = this.f12603a;
        if (productHorizontalList == null) {
            return 0;
        }
        return productHorizontalList.hashCode();
    }

    public final String toString() {
        return "NodeContent(onHorizontalList=" + this.f12603a + ")";
    }
}

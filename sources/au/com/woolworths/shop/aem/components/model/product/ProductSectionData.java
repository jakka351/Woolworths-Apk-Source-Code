package au.com.woolworths.shop.aem.components.model.product;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/product/ProductSectionData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductSectionData implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10179a;
    public final String b;
    public final LinkData c;
    public final List d;

    public ProductSectionData(String str, String str2, LinkData linkData, List list) {
        this.f10179a = str;
        this.b = str2;
        this.c = linkData;
        this.d = list;
    }

    public static ProductSectionData a(ProductSectionData productSectionData, ArrayList arrayList) {
        return new ProductSectionData(productSectionData.f10179a, productSectionData.b, productSectionData.c, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSectionData)) {
            return false;
        }
        ProductSectionData productSectionData = (ProductSectionData) obj;
        return Intrinsics.c(this.f10179a, productSectionData.f10179a) && Intrinsics.c(this.b, productSectionData.b) && Intrinsics.c(this.c, productSectionData.c) && Intrinsics.c(this.d, productSectionData.d);
    }

    public final int hashCode() {
        String str = this.f10179a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkData linkData = this.c;
        return this.d.hashCode() + ((iHashCode2 + (linkData != null ? linkData.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ProductSectionData(productSectionId=", this.f10179a, ", productSectionTotal=", this.b, ", productSectionLink=");
        sbV.append(this.c);
        sbV.append(", productSectionFeed=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}

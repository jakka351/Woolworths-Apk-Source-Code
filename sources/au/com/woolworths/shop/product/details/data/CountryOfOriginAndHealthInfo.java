package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/CountryOfOriginAndHealthInfo;", "Lau/com/woolworths/shop/product/details/data/ProductDetailsItem;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CountryOfOriginAndHealthInfo implements ProductDetailsItem {

    /* renamed from: a, reason: collision with root package name */
    public final ImageContent f12598a;

    public CountryOfOriginAndHealthInfo(ImageContent imageContent) {
        this.f12598a = imageContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CountryOfOriginAndHealthInfo) && Intrinsics.c(this.f12598a, ((CountryOfOriginAndHealthInfo) obj).f12598a);
    }

    public final int hashCode() {
        ImageContent imageContent = this.f12598a;
        if (imageContent == null) {
            return 0;
        }
        return imageContent.hashCode();
    }

    public final String toString() {
        return "CountryOfOriginAndHealthInfo(countryOfOrigin=" + this.f12598a + ")";
    }
}

package au.com.woolworths.shop.product.details.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ImageContent;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ImageContent {

    /* renamed from: a, reason: collision with root package name */
    public final String f12602a;
    public final String b;
    public final String c;

    public ImageContent(String str, String str2, String str3) {
        this.f12602a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageContent)) {
            return false;
        }
        ImageContent imageContent = (ImageContent) obj;
        return Intrinsics.c(this.f12602a, imageContent.f12602a) && Intrinsics.c(this.b, imageContent.b) && Intrinsics.c(this.c, imageContent.c);
    }

    public final int hashCode() {
        String str = this.f12602a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return a.o(a.v("ImageContent(url=", this.f12602a, ", text=", this.b, ", altText="), this.c, ")");
    }
}

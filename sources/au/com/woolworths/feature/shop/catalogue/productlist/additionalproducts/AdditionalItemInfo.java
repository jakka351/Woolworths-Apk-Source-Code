package au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/additionalproducts/AdditionalItemInfo;", "", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdditionalItemInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f6928a;
    public final String b;
    public final String c;
    public final String d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/additionalproducts/AdditionalItemInfo$Companion;", "", "", "IMAGE_URL", "Ljava/lang/String;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public AdditionalItemInfo(String itemDescription, String itemId, String skuCode, String str) {
        Intrinsics.h(itemDescription, "itemDescription");
        Intrinsics.h(itemId, "itemId");
        Intrinsics.h(skuCode, "skuCode");
        this.f6928a = itemDescription;
        this.b = itemId;
        this.c = skuCode;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalItemInfo)) {
            return false;
        }
        AdditionalItemInfo additionalItemInfo = (AdditionalItemInfo) obj;
        return Intrinsics.c(this.f6928a, additionalItemInfo.f6928a) && Intrinsics.c(this.b, additionalItemInfo.b) && Intrinsics.c(this.c, additionalItemInfo.c) && Intrinsics.c(this.d, additionalItemInfo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.c(b.c(this.f6928a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return a.l(YU.a.v("AdditionalItemInfo(itemDescription=", this.f6928a, ", itemId=", this.b, ", skuCode="), this.c, ", imagePath=", this.d, ")");
    }
}

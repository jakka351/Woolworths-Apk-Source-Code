package au.com.woolworths.feature.shop.brandedshop.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopErrorData;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BrandedShopErrorData {

    /* renamed from: a, reason: collision with root package name */
    public final String f6678a;
    public final FullPageMessage.Error b;

    public BrandedShopErrorData(String str, FullPageMessage.Error error) {
        this.f6678a = str;
        this.b = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandedShopErrorData)) {
            return false;
        }
        BrandedShopErrorData brandedShopErrorData = (BrandedShopErrorData) obj;
        return Intrinsics.c(this.f6678a, brandedShopErrorData.f6678a) && Intrinsics.c(this.b, brandedShopErrorData.b);
    }

    public final int hashCode() {
        String str = this.f6678a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FullPageMessage.Error error = this.b;
        return iHashCode + (error != null ? error.hashCode() : 0);
    }

    public final String toString() {
        return "BrandedShopErrorData(contentId=" + this.f6678a + ", error=" + this.b + ")";
    }
}

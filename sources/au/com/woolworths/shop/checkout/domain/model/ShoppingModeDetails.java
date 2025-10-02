package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ShoppingModeDetails;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShoppingModeDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f10638a;
    public final String b;
    public final Integer c;

    public ShoppingModeDetails(String str, String str2, Integer num) {
        this.f10638a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeDetails)) {
            return false;
        }
        ShoppingModeDetails shoppingModeDetails = (ShoppingModeDetails) obj;
        return Intrinsics.c(this.f10638a, shoppingModeDetails.f10638a) && Intrinsics.c(this.b, shoppingModeDetails.b) && Intrinsics.c(this.c, shoppingModeDetails.c);
    }

    public final int hashCode() {
        String str = this.f10638a;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Integer num = this.c;
        return iC + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return a.p(YU.a.v("ShoppingModeDetails(displayName=", this.f10638a, ", mode=", this.b, ", storeAddressId="), this.c, ")");
    }
}

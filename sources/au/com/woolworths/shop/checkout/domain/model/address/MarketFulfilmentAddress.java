package au.com.woolworths.shop.checkout.domain.model.address;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOptionModeId;
import au.com.woolworths.shop.checkout.domain.model.ShoppingModeDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/address/MarketFulfilmentAddress;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MarketFulfilmentAddress {

    /* renamed from: a, reason: collision with root package name */
    public final String f10641a;
    public final String b;
    public final String c;
    public final MarketFulfilmentAddressStatus d;
    public final MarketAddressType e;
    public final CollectionMethodOptionModeId f;
    public final ShoppingModeDetails g;

    public MarketFulfilmentAddress(String str, String str2, String str3, MarketFulfilmentAddressStatus marketFulfilmentAddressStatus, MarketAddressType marketAddressType, CollectionMethodOptionModeId collectionMethodOptionModeId, ShoppingModeDetails shoppingModeDetails) {
        this.f10641a = str;
        this.b = str2;
        this.c = str3;
        this.d = marketFulfilmentAddressStatus;
        this.e = marketAddressType;
        this.f = collectionMethodOptionModeId;
        this.g = shoppingModeDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketFulfilmentAddress)) {
            return false;
        }
        MarketFulfilmentAddress marketFulfilmentAddress = (MarketFulfilmentAddress) obj;
        return Intrinsics.c(this.f10641a, marketFulfilmentAddress.f10641a) && Intrinsics.c(this.b, marketFulfilmentAddress.b) && Intrinsics.c(this.c, marketFulfilmentAddress.c) && this.d == marketFulfilmentAddress.d && this.e == marketFulfilmentAddress.e && this.f == marketFulfilmentAddress.f && Intrinsics.c(this.g, marketFulfilmentAddress.g);
    }

    public final int hashCode() {
        int iC = b.c(this.f10641a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        CollectionMethodOptionModeId collectionMethodOptionModeId = this.f;
        int iHashCode2 = (iHashCode + (collectionMethodOptionModeId == null ? 0 : collectionMethodOptionModeId.hashCode())) * 31;
        ShoppingModeDetails shoppingModeDetails = this.g;
        return iHashCode2 + (shoppingModeDetails != null ? shoppingModeDetails.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("MarketFulfilmentAddress(title=", this.f10641a, ", displayName=", this.b, ", addressButtonTitle=");
        sbV.append(this.c);
        sbV.append(", addressStatus=");
        sbV.append(this.d);
        sbV.append(", addressType=");
        sbV.append(this.e);
        sbV.append(", modeId=");
        sbV.append(this.f);
        sbV.append(", shoppingModeDetails=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }
}

package au.com.woolworths.shop.buyagain.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/domain/BuyAgainFooter;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BuyAgainFooter {

    /* renamed from: a, reason: collision with root package name */
    public final ButtonApiData f10254a;
    public final ButtonApiData b;

    public BuyAgainFooter(ButtonApiData buttonApiData, ButtonApiData buttonApiData2) {
        this.f10254a = buttonApiData;
        this.b = buttonApiData2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyAgainFooter)) {
            return false;
        }
        BuyAgainFooter buyAgainFooter = (BuyAgainFooter) obj;
        return Intrinsics.c(this.f10254a, buyAgainFooter.f10254a) && Intrinsics.c(this.b, buyAgainFooter.b);
    }

    public final int hashCode() {
        ButtonApiData buttonApiData = this.f10254a;
        int iHashCode = (buttonApiData == null ? 0 : buttonApiData.hashCode()) * 31;
        ButtonApiData buttonApiData2 = this.b;
        return iHashCode + (buttonApiData2 != null ? buttonApiData2.hashCode() : 0);
    }

    public final String toString() {
        return "BuyAgainFooter(addToCartBtn=" + this.f10254a + ", saveToListBtn=" + this.b + ")";
    }
}

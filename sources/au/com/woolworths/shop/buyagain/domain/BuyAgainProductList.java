package au.com.woolworths.shop.buyagain.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/domain/BuyAgainProductList;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BuyAgainProductList {

    /* renamed from: a, reason: collision with root package name */
    public final BuyAgainHeader f10257a;
    public final BuyAgainFooter b;
    public final ProductList c;
    public final BuyAgainFilterStatus d;

    public BuyAgainProductList(BuyAgainHeader buyAgainHeader, BuyAgainFooter buyAgainFooter, ProductList productList, BuyAgainFilterStatus buyAgainFilterStatus) {
        this.f10257a = buyAgainHeader;
        this.b = buyAgainFooter;
        this.c = productList;
        this.d = buyAgainFilterStatus;
    }

    public static BuyAgainProductList a(BuyAgainProductList buyAgainProductList, ProductList productList) {
        BuyAgainHeader buyAgainHeader = buyAgainProductList.f10257a;
        BuyAgainFooter buyAgainFooter = buyAgainProductList.b;
        BuyAgainFilterStatus buyAgainFilterStatus = buyAgainProductList.d;
        buyAgainProductList.getClass();
        return new BuyAgainProductList(buyAgainHeader, buyAgainFooter, productList, buyAgainFilterStatus);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyAgainProductList)) {
            return false;
        }
        BuyAgainProductList buyAgainProductList = (BuyAgainProductList) obj;
        return Intrinsics.c(this.f10257a, buyAgainProductList.f10257a) && Intrinsics.c(this.b, buyAgainProductList.b) && Intrinsics.c(this.c, buyAgainProductList.c) && Intrinsics.c(this.d, buyAgainProductList.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f10257a.hashCode() * 31)) * 31)) * 31;
        BuyAgainFilterStatus buyAgainFilterStatus = this.d;
        return iHashCode + (buyAgainFilterStatus == null ? 0 : buyAgainFilterStatus.hashCode());
    }

    public final String toString() {
        return "BuyAgainProductList(header=" + this.f10257a + ", footer=" + this.b + ", productList=" + this.c + ", filterStatus=" + this.d + ")";
    }
}

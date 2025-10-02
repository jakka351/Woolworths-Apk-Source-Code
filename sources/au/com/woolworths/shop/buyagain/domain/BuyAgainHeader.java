package au.com.woolworths.shop.buyagain.domain;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/domain/BuyAgainHeader;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BuyAgainHeader {

    /* renamed from: a, reason: collision with root package name */
    public final String f10255a;

    public BuyAgainHeader(String str) {
        this.f10255a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BuyAgainHeader) && Intrinsics.c(this.f10255a, ((BuyAgainHeader) obj).f10255a);
    }

    public final int hashCode() {
        String str = this.f10255a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.h("BuyAgainHeader(totalProductsText=", this.f10255a, ")");
    }
}

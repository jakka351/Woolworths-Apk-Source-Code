package au.com.woolworths.shop.buyagain.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/domain/BuyAgainFilterStatus;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BuyAgainFilterStatus {

    /* renamed from: a, reason: collision with root package name */
    public final String f10253a;
    public final ArrayList b;

    public BuyAgainFilterStatus(String str, ArrayList arrayList) {
        this.f10253a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyAgainFilterStatus)) {
            return false;
        }
        BuyAgainFilterStatus buyAgainFilterStatus = (BuyAgainFilterStatus) obj;
        return Intrinsics.c(this.f10253a, buyAgainFilterStatus.f10253a) && this.b.equals(buyAgainFilterStatus.b);
    }

    public final int hashCode() {
        String str = this.f10253a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return d.q("BuyAgainFilterStatus(message=", this.f10253a, ", revertedFilterChipIds=", ")", this.b);
    }
}

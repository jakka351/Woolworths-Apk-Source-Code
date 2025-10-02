package au.com.woolworths.shop.productcard.data;

import YU.a;
import au.com.woolworths.product.models.PurchaseRestriction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/RestrictionInfo;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RestrictionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final PurchaseRestriction f12659a;
    public final String b;
    public final boolean c;

    public RestrictionInfo(PurchaseRestriction purchaseRestriction, String str, boolean z) {
        this.f12659a = purchaseRestriction;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestrictionInfo)) {
            return false;
        }
        RestrictionInfo restrictionInfo = (RestrictionInfo) obj;
        return this.f12659a == restrictionInfo.f12659a && Intrinsics.c(this.b, restrictionInfo.b) && this.c == restrictionInfo.c;
    }

    public final int hashCode() {
        PurchaseRestriction purchaseRestriction = this.f12659a;
        int iHashCode = (purchaseRestriction == null ? 0 : purchaseRestriction.hashCode()) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestrictionInfo(purchaseRestriction=");
        sb.append(this.f12659a);
        sb.append(", disclaimer=");
        sb.append(this.b);
        sb.append(", isTobacco=");
        return a.k(")", sb, this.c);
    }
}

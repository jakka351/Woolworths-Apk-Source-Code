package au.com.woolworths.shop.graphql.type;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/UpdateCartBundleQuantitiesInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateCartBundleQuantitiesInput {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11991a;
    public final String b;

    public UpdateCartBundleQuantitiesInput(String offerId, ArrayList arrayList) {
        Intrinsics.h(offerId, "offerId");
        this.f11991a = arrayList;
        this.b = offerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateCartBundleQuantitiesInput)) {
            return false;
        }
        UpdateCartBundleQuantitiesInput updateCartBundleQuantitiesInput = (UpdateCartBundleQuantitiesInput) obj;
        return this.f11991a.equals(updateCartBundleQuantitiesInput.f11991a) && Intrinsics.c(this.b, updateCartBundleQuantitiesInput.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11991a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateCartBundleQuantitiesInput(cartBundleQuantityUpdates=" + this.f11991a + ", offerId=" + this.b + ")";
    }
}

package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/UpdateCartProductQuantitiesInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateCartProductQuantitiesInput {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11992a;

    public UpdateCartProductQuantitiesInput(ArrayList arrayList) {
        this.f11992a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateCartProductQuantitiesInput) && this.f11992a.equals(((UpdateCartProductQuantitiesInput) obj).f11992a);
    }

    public final int hashCode() {
        return this.f11992a.hashCode();
    }

    public final String toString() {
        return a.k("UpdateCartProductQuantitiesInput(cartProductQuantityUpdates=", ")", this.f11992a);
    }
}

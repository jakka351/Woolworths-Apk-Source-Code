package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/GetAlternativeProductsInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GetAlternativeProductsInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11431a;
    public final Optional b;
    public final Optional.Present c;
    public final Optional d;

    public GetAlternativeProductsInput(String productId, Optional optional, Optional.Present present, Optional optional2) {
        Intrinsics.h(productId, "productId");
        this.f11431a = productId;
        this.b = optional;
        this.c = present;
        this.d = optional2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAlternativeProductsInput)) {
            return false;
        }
        GetAlternativeProductsInput getAlternativeProductsInput = (GetAlternativeProductsInput) obj;
        return Intrinsics.c(this.f11431a, getAlternativeProductsInput.f11431a) && this.b.equals(getAlternativeProductsInput.b) && this.c.equals(getAlternativeProductsInput.c) && this.d.equals(getAlternativeProductsInput.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.b(this.c, a.c(this.b, this.f11431a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = a.r("GetAlternativeProductsInput(productId=", this.f11431a, ", storeId=", this.b, ", shouldIncludeProductsFromCategory=");
        sbR.append(this.c);
        sbR.append(", alternativeProductsMode=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}

package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/StoresForProductInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StoresForProductInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11937a;
    public final Optional b;
    public final Optional c;
    public final String d;

    public StoresForProductInput(Optional optional, String productId) {
        Intrinsics.h(productId, "productId");
        this.f11937a = optional;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = productId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoresForProductInput)) {
            return false;
        }
        StoresForProductInput storesForProductInput = (StoresForProductInput) obj;
        return Intrinsics.c(this.f11937a, storesForProductInput.f11937a) && Intrinsics.c(this.b, storesForProductInput.b) && Intrinsics.c(this.c, storesForProductInput.c) && Intrinsics.c(this.d, storesForProductInput.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.c(this.c, a.c(this.b, this.f11937a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = a.p("StoresForProductInput(storeId=", this.f11937a, ", geoLocation=", this.b, ", postcode=");
        sbP.append(this.c);
        sbP.append(", productId=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}

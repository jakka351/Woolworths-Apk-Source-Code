package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/AddressInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddressInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11012a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;

    public AddressInput(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8) {
        this.f11012a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = optional7;
        this.h = optional8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressInput)) {
            return false;
        }
        AddressInput addressInput = (AddressInput) obj;
        return Intrinsics.c(this.f11012a, addressInput.f11012a) && Intrinsics.c(this.b, addressInput.b) && Intrinsics.c(this.c, addressInput.c) && Intrinsics.c(this.d, addressInput.d) && Intrinsics.c(this.e, addressInput.e) && Intrinsics.c(this.f, addressInput.f) && Intrinsics.c(this.g, addressInput.g) && Intrinsics.c(this.h, addressInput.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + a.c(this.g, a.c(this.f, a.c(this.e, a.c(this.d, a.c(this.c, a.c(this.b, this.f11012a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = a.p("AddressInput(alternateAddressId=", this.f11012a, ", amasId=", this.b, ", isAlternateAddressId=");
        a.x(sbP, this.c, ", isForBilling=", this.d, ", postcode=");
        a.x(sbP, this.e, ", street1=", this.f, ", street2=");
        sbP.append(this.g);
        sbP.append(", suburbId=");
        sbP.append(this.h);
        sbP.append(")");
        return sbP.toString();
    }
}

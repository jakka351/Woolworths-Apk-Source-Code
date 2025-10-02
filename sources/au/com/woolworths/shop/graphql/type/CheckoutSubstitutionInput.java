package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutSubstitutionInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutSubstitutionInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11259a;
    public final double b;
    public final Optional.Present c;
    public final boolean d;

    public CheckoutSubstitutionInput(String str, double d, Optional.Present present, boolean z) {
        this.f11259a = str;
        this.b = d;
        this.c = present;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutSubstitutionInput)) {
            return false;
        }
        CheckoutSubstitutionInput checkoutSubstitutionInput = (CheckoutSubstitutionInput) obj;
        return this.f11259a.equals(checkoutSubstitutionInput.f11259a) && Double.compare(this.b, checkoutSubstitutionInput.b) == 0 && this.c.equals(checkoutSubstitutionInput.c) && this.d == checkoutSubstitutionInput.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a.b(this.c, android.support.v4.media.session.a.a(this.b, this.f11259a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "CheckoutSubstitutionInput(productId=", this.f11259a, ", quantity=");
        sbR.append(", text=");
        sbR.append(this.c);
        sbR.append(", allowSubstitution=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}

package au.com.woolworths.shop.checkout.domain.model.substitution;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/substitution/UserSubstitutionPreference;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserSubstitutionPreference {

    /* renamed from: a, reason: collision with root package name */
    public final String f10669a;
    public final List b;
    public final List c;
    public final String d;

    public UserSubstitutionPreference(String productId, String str, List list, List list2) {
        Intrinsics.h(productId, "productId");
        this.f10669a = productId;
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSubstitutionPreference)) {
            return false;
        }
        UserSubstitutionPreference userSubstitutionPreference = (UserSubstitutionPreference) obj;
        return Intrinsics.c(this.f10669a, userSubstitutionPreference.f10669a) && this.b.equals(userSubstitutionPreference.b) && this.c.equals(userSubstitutionPreference.c) && Intrinsics.c(this.d, userSubstitutionPreference.d);
    }

    public final int hashCode() {
        int iD = b.d(b.d(this.f10669a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbS = a.s("UserSubstitutionPreference(allowSubstitution=null, productId=", this.f10669a, ", preferred=", ", nonPreferred=", this.b);
        sbS.append(this.c);
        sbS.append(", preference=");
        sbS.append(this.d);
        sbS.append(")");
        return sbS.toString();
    }
}

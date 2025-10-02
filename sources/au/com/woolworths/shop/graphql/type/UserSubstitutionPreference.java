package au.com.woolworths.shop.graphql.type;

import androidx.camera.core.impl.b;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/UserSubstitutionPreference;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserSubstitutionPreference {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f12001a;
    public final String b;
    public final Optional c;
    public final Optional d;
    public final Optional e;

    public UserSubstitutionPreference(Optional optional, String productId, Optional optional2, Optional optional3, Optional optional4) {
        Intrinsics.h(productId, "productId");
        this.f12001a = optional;
        this.b = productId;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSubstitutionPreference)) {
            return false;
        }
        UserSubstitutionPreference userSubstitutionPreference = (UserSubstitutionPreference) obj;
        return Intrinsics.c(this.f12001a, userSubstitutionPreference.f12001a) && Intrinsics.c(this.b, userSubstitutionPreference.b) && Intrinsics.c(this.c, userSubstitutionPreference.c) && Intrinsics.c(this.d, userSubstitutionPreference.d) && Intrinsics.c(this.e, userSubstitutionPreference.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a.c(this.d, a.c(this.c, b.c(this.f12001a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSubstitutionPreference(allowSubstitution=");
        sb.append(this.f12001a);
        sb.append(", productId=");
        sb.append(this.b);
        sb.append(", preferred=");
        a.x(sb, this.c, ", nonPreferred=", this.d, ", customerSelection=");
        return a.o(sb, this.e, ")");
    }
}

package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/BundlesInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BundlesInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11077a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;

    public BundlesInput(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        this.f11077a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundlesInput)) {
            return false;
        }
        BundlesInput bundlesInput = (BundlesInput) obj;
        if (!this.f11077a.equals(bundlesInput.f11077a)) {
            return false;
        }
        Object obj2 = Optional.Absent.f13523a;
        return obj2.equals(obj2) && this.b.equals(bundlesInput.b) && this.c.equals(bundlesInput.c) && this.d.equals(bundlesInput.d) && this.e.equals(bundlesInput.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a.c(this.d, a.c(this.c, a.c(this.b, (Optional.Absent.f13523a.hashCode() + (this.f11077a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BundlesInput(storeId=");
        sb.append(this.f11077a);
        sb.append(", chips=");
        sb.append(Optional.Absent.f13523a);
        sb.append(", sortOption=");
        a.x(sb, this.b, ", initialLoad=", this.c, ", argument=");
        sb.append(this.d);
        sb.append(", pageNumber=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}

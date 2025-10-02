package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/SpecialsHomeSaleFinderStore;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SpecialsHomeSaleFinderStore {

    /* renamed from: a, reason: collision with root package name */
    public final String f11928a;
    public final Optional.Present b;
    public final Optional.Present c;

    public SpecialsHomeSaleFinderStore(String id, Optional.Present present, Optional.Present present2) {
        Intrinsics.h(id, "id");
        this.f11928a = id;
        this.b = present;
        this.c = present2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsHomeSaleFinderStore)) {
            return false;
        }
        SpecialsHomeSaleFinderStore specialsHomeSaleFinderStore = (SpecialsHomeSaleFinderStore) obj;
        return Intrinsics.c(this.f11928a, specialsHomeSaleFinderStore.f11928a) && this.b.equals(specialsHomeSaleFinderStore.b) && this.c.equals(specialsHomeSaleFinderStore.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a.b(this.b, this.f11928a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SpecialsHomeSaleFinderStore(id=" + this.f11928a + ", name=" + this.b + ", postCode=" + this.c + ")";
    }
}

package au.com.woolworths.shop.graphql.type;

import androidx.camera.core.impl.b;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/SpecialsHomeInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SpecialsHomeInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11926a;
    public final ShoppingModeType b;
    public final java.util.List c;
    public final Optional.Present d;
    public final Optional e;
    public final Optional.Present f;
    public final Optional g;

    public SpecialsHomeInput(Optional optional, ShoppingModeType shoppingModeType, java.util.List list, Optional.Present present, Optional optional2, Optional.Present present2, Optional optional3) {
        this.f11926a = optional;
        this.b = shoppingModeType;
        this.c = list;
        this.d = present;
        this.e = optional2;
        this.f = present2;
        this.g = optional3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsHomeInput)) {
            return false;
        }
        SpecialsHomeInput specialsHomeInput = (SpecialsHomeInput) obj;
        return this.f11926a.equals(specialsHomeInput.f11926a) && this.b == specialsHomeInput.b && this.c.equals(specialsHomeInput.c) && this.d.equals(specialsHomeInput.d) && this.e.equals(specialsHomeInput.e) && this.f.equals(specialsHomeInput.f) && this.g.equals(specialsHomeInput.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + a.b(this.f, a.c(this.e, a.b(this.d, b.d((this.b.hashCode() + (this.f11926a.hashCode() * 31)) * 31, 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialsHomeInput(storeId=");
        sb.append(this.f11926a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", supportedLinks=");
        sb.append(this.c);
        sb.append(", requestSource=");
        sb.append(this.d);
        sb.append(", specialsHomeSaleFinderStore=");
        sb.append(this.e);
        sb.append(", categoriesType=");
        sb.append(this.f);
        sb.append(", isConsolidatedSpecials=");
        return a.o(sb, this.g, ")");
    }
}

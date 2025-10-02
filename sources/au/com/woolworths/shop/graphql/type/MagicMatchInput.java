package au.com.woolworths.shop.graphql.type;

import android.support.v4.media.session.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/MagicMatchInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MagicMatchInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11544a;
    public final ShoppingModeType b;
    public final java.util.List c;

    public MagicMatchInput(ShoppingModeType shoppingModeType, Optional optional, java.util.List searchedProducts) {
        Intrinsics.h(searchedProducts, "searchedProducts");
        this.f11544a = optional;
        this.b = shoppingModeType;
        this.c = searchedProducts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagicMatchInput)) {
            return false;
        }
        MagicMatchInput magicMatchInput = (MagicMatchInput) obj;
        return Intrinsics.c(this.f11544a, magicMatchInput.f11544a) && this.b == magicMatchInput.b && Intrinsics.c(this.c, magicMatchInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f11544a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MagicMatchInput(storeId=");
        sb.append(this.f11544a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", searchedProducts=");
        return a.t(sb, this.c, ")");
    }
}

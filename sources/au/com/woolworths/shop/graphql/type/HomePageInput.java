package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/HomePageInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HomePageInput {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingModeType f11471a;
    public final Optional b;
    public final java.util.List c;

    public HomePageInput(ShoppingModeType shoppingModeType, Optional optional, java.util.List list) {
        this.f11471a = shoppingModeType;
        this.b = optional;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomePageInput)) {
            return false;
        }
        HomePageInput homePageInput = (HomePageInput) obj;
        if (this.f11471a != homePageInput.f11471a || !this.b.equals(homePageInput.b)) {
            return false;
        }
        EmptyList emptyList = EmptyList.d;
        return emptyList.equals(emptyList) && this.c.equals(homePageInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.b.hashCode() + (this.f11471a.hashCode() * 31)) * 31) + 1) * 31);
    }

    public final String toString() {
        return "HomePageInput(mode=" + this.f11471a + ", storeId=" + this.b + ", supportedActions=" + EmptyList.d + ", supportedLinks=" + this.c + ")";
    }
}

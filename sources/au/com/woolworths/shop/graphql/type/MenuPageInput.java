package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/MenuPageInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MenuPageInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f11569a;
    public final ShoppingModeType b;
    public final Optional.Present c;

    public MenuPageInput(Optional.Present present, ShoppingModeType mode, Optional.Present present2) {
        Intrinsics.h(mode, "mode");
        this.f11569a = present;
        this.b = mode;
        this.c = present2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuPageInput)) {
            return false;
        }
        MenuPageInput menuPageInput = (MenuPageInput) obj;
        if (!this.f11569a.equals(menuPageInput.f11569a) || this.b != menuPageInput.b || !this.c.equals(menuPageInput.c)) {
            return false;
        }
        EmptyList emptyList = EmptyList.d;
        return emptyList.equals(emptyList) && emptyList.equals(emptyList);
    }

    public final int hashCode() {
        return ((((this.c.hashCode() + ((this.b.hashCode() + (this.f11569a.hashCode() * 31)) * 31)) * 31) + 1) * 31) + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuPageInput(id=");
        sb.append(this.f11569a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", storeId=");
        sb.append(this.c);
        sb.append(", supportedActions=");
        EmptyList emptyList = EmptyList.d;
        sb.append(emptyList);
        sb.append(", supportedLinks=");
        sb.append(emptyList);
        sb.append(")");
        return sb.toString();
    }
}

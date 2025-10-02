package au.com.woolworths.shop.cart.data.common.fragment;

import YU.a;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCategory;", "Lcom/apollographql/apollo/api/Fragment$Data;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartProductCategory implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f10420a;

    public CartProductCategory(String str) {
        this.f10420a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CartProductCategory) && Intrinsics.c(this.f10420a, ((CartProductCategory) obj).f10420a);
    }

    public final int hashCode() {
        return this.f10420a.hashCode();
    }

    public final String toString() {
        return a.h("CartProductCategory(title=", this.f10420a, ")");
    }
}

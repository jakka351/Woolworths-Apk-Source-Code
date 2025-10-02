package com.woolworths.shop.checkout.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.shop.graphql.type.CollectionModeId;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutCollectionAddressDelivery;", "Lcom/apollographql/apollo/api/Fragment$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CheckoutCollectionAddressDelivery implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f22060a;
    public final CollectionModeId b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;

    public CheckoutCollectionAddressDelivery(String str, CollectionModeId collectionModeId, int i, String str2, String str3, String str4, Integer num) {
        this.f22060a = str;
        this.b = collectionModeId;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutCollectionAddressDelivery)) {
            return false;
        }
        CheckoutCollectionAddressDelivery checkoutCollectionAddressDelivery = (CheckoutCollectionAddressDelivery) obj;
        return Intrinsics.c(this.f22060a, checkoutCollectionAddressDelivery.f22060a) && this.b == checkoutCollectionAddressDelivery.b && this.c == checkoutCollectionAddressDelivery.c && Intrinsics.c(this.d, checkoutCollectionAddressDelivery.d) && Intrinsics.c(this.e, checkoutCollectionAddressDelivery.e) && Intrinsics.c(this.f, checkoutCollectionAddressDelivery.f) && Intrinsics.c(this.g, checkoutCollectionAddressDelivery.g);
    }

    public final int hashCode() {
        int iC = b.c(b.a(this.c, (this.b.hashCode() + (this.f22060a.hashCode() * 31)) * 31, 31), 31, this.d);
        String str = this.e;
        int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        Integer num = this.g;
        return iC2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutCollectionAddressDelivery(title=");
        sb.append(this.f22060a);
        sb.append(", modeId=");
        sb.append(this.b);
        sb.append(", addressId=");
        a.u(this.c, ", displayName=", this.d, ", addressImageUrl=", sb);
        androidx.constraintlayout.core.state.a.B(sb, this.e, ", buttonText=", this.f, ", expressDeliveryStoreId=");
        return au.com.woolworths.android.onesite.a.p(sb, this.g, ")");
    }
}

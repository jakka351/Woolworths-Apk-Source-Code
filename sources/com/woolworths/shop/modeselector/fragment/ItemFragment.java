package com.woolworths.shop.modeselector.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.ShoppingModeSelectorOptionState;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ItemFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ItemFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f23354a;
    public final String b;
    public final String c;
    public final String d;
    public final ShoppingModeSelectorOptionState e;

    public ItemFragment(String str, String str2, String str3, String str4, ShoppingModeSelectorOptionState shoppingModeSelectorOptionState) {
        this.f23354a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = shoppingModeSelectorOptionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemFragment)) {
            return false;
        }
        ItemFragment itemFragment = (ItemFragment) obj;
        return Intrinsics.c(this.f23354a, itemFragment.f23354a) && Intrinsics.c(this.b, itemFragment.b) && Intrinsics.c(this.c, itemFragment.c) && Intrinsics.c(this.d, itemFragment.d) && this.e == itemFragment.e;
    }

    public final int hashCode() {
        int iHashCode = this.f23354a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + b.c(b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ItemFragment(id=", this.f23354a, ", price=", this.b, ", subtitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", title=", this.d, ", state=");
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }
}

package com.woolworths.shop.modeselector.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ShoppingModeDetailsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ShoppingModeDetailsFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f23360a;
    public final String b;
    public final Integer c;

    public ShoppingModeDetailsFragment(String str, String str2, Integer num) {
        this.f23360a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeDetailsFragment)) {
            return false;
        }
        ShoppingModeDetailsFragment shoppingModeDetailsFragment = (ShoppingModeDetailsFragment) obj;
        return Intrinsics.c(this.f23360a, shoppingModeDetailsFragment.f23360a) && Intrinsics.c(this.b, shoppingModeDetailsFragment.b) && Intrinsics.c(this.c, shoppingModeDetailsFragment.c);
    }

    public final int hashCode() {
        String str = this.f23360a;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Integer num = this.c;
        return iC + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return a.p(YU.a.v("ShoppingModeDetailsFragment(displayName=", this.f23360a, ", mode=", this.b, ", storeAddressId="), this.c, ")");
    }
}

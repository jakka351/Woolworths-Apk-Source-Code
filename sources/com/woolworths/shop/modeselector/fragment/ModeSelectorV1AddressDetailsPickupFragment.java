package com.woolworths.shop.modeselector.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ModeSelectorV1AddressDetailsPickupFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ModeSelectorV1AddressDetailsPickupFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f23358a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public ModeSelectorV1AddressDetailsPickupFragment(String str, String str2, int i, String str3, String str4, String str5) {
        this.f23358a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeSelectorV1AddressDetailsPickupFragment)) {
            return false;
        }
        ModeSelectorV1AddressDetailsPickupFragment modeSelectorV1AddressDetailsPickupFragment = (ModeSelectorV1AddressDetailsPickupFragment) obj;
        return Intrinsics.c(this.f23358a, modeSelectorV1AddressDetailsPickupFragment.f23358a) && Intrinsics.c(this.b, modeSelectorV1AddressDetailsPickupFragment.b) && this.c == modeSelectorV1AddressDetailsPickupFragment.c && Intrinsics.c(this.d, modeSelectorV1AddressDetailsPickupFragment.d) && Intrinsics.c(this.e, modeSelectorV1AddressDetailsPickupFragment.e) && Intrinsics.c(this.f, modeSelectorV1AddressDetailsPickupFragment.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b.c(b.c(b.a(this.c, b.c(this.f23358a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ModeSelectorV1AddressDetailsPickupFragment(modeId=", this.f23358a, ", storeId=", this.b, ", addressId=");
        androidx.compose.ui.input.pointer.a.u(this.c, ", addressText=", this.d, ", displayName=", sbV);
        return androidx.constraintlayout.core.state.a.l(sbV, this.e, ", label=", this.f, ")");
    }
}

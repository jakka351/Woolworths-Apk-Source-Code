package com.woolworths.shop.modeselector.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/ModeSelectorV1AddressDetailsDeliveryFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ModeSelectorV1AddressDetailsDeliveryFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f23356a;
    public final int b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;

    public ModeSelectorV1AddressDetailsDeliveryFragment(String str, int i, String str2, boolean z, String str3, String str4, String str5, int i2, String str6) {
        this.f23356a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = i2;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeSelectorV1AddressDetailsDeliveryFragment)) {
            return false;
        }
        ModeSelectorV1AddressDetailsDeliveryFragment modeSelectorV1AddressDetailsDeliveryFragment = (ModeSelectorV1AddressDetailsDeliveryFragment) obj;
        return Intrinsics.c(this.f23356a, modeSelectorV1AddressDetailsDeliveryFragment.f23356a) && this.b == modeSelectorV1AddressDetailsDeliveryFragment.b && Intrinsics.c(this.c, modeSelectorV1AddressDetailsDeliveryFragment.c) && this.d == modeSelectorV1AddressDetailsDeliveryFragment.d && Intrinsics.c(this.e, modeSelectorV1AddressDetailsDeliveryFragment.e) && Intrinsics.c(this.f, modeSelectorV1AddressDetailsDeliveryFragment.f) && Intrinsics.c(this.g, modeSelectorV1AddressDetailsDeliveryFragment.g) && this.h == modeSelectorV1AddressDetailsDeliveryFragment.h && Intrinsics.c(this.i, modeSelectorV1AddressDetailsDeliveryFragment.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + b.a(this.h, b.c(b.c(b.c(b.e(b.c(b.a(this.b, this.f23356a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbU = b.u("ModeSelectorV1AddressDetailsDeliveryFragment(modeId=", this.b, this.f23356a, ", addressId=", ", addressText=");
        d.A(this.c, ", isPrimary=", ", postcode=", sbU, this.d);
        a.B(sbU, this.e, ", street1=", this.f, ", street2=");
        YU.a.x(this.h, this.g, ", suburbId=", ", suburbName=", sbU);
        return YU.a.o(sbU, this.i, ")");
    }
}

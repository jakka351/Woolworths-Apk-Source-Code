package com.woolworths.feature.shop.storelocator.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/fragment/SuburbItem;", "Lcom/apollographql/apollo/api/Fragment$Data;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SuburbItem implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f20348a;
    public final String b;
    public final String c;
    public final String d;

    public SuburbItem(String str, String str2, String str3, String str4) {
        this.f20348a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuburbItem)) {
            return false;
        }
        SuburbItem suburbItem = (SuburbItem) obj;
        return Intrinsics.c(this.f20348a, suburbItem.f20348a) && Intrinsics.c(this.b, suburbItem.b) && Intrinsics.c(this.c, suburbItem.c) && Intrinsics.c(this.d, suburbItem.d);
    }

    public final int hashCode() {
        int iHashCode = this.f20348a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return a.l(YU.a.v("SuburbItem(__typename=", this.f20348a, ", postcode=", this.b, ", state="), this.c, ", text=", this.d, ")");
    }
}

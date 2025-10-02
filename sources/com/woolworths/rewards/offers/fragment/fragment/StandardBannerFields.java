package com.woolworths.rewards.offers.fragment.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/StandardBannerFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class StandardBannerFields implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f21034a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public StandardBannerFields(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f21034a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardBannerFields)) {
            return false;
        }
        StandardBannerFields standardBannerFields = (StandardBannerFields) obj;
        return Intrinsics.c(this.f21034a, standardBannerFields.f21034a) && Intrinsics.c(this.b, standardBannerFields.b) && Intrinsics.c(this.c, standardBannerFields.c) && Intrinsics.c(this.d, standardBannerFields.d) && Intrinsics.c(this.e, standardBannerFields.e) && Intrinsics.c(this.f, standardBannerFields.f) && Intrinsics.c(this.g, standardBannerFields.g);
    }

    public final int hashCode() {
        int iC = b.c(this.f21034a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("StandardBannerFields(bannerId=", this.f21034a, ", bannerTitle=", this.b, ", bannerImageUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", bannerDescription=", this.d, ", bannerActionUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", bannerActionLabel=", this.f, ", bannerActionAccessibilityHint=");
        return a.o(sbV, this.g, ")");
    }
}

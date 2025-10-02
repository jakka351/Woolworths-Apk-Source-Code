package com.woolworths.dynamic.page.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/CampaignCard;", "Lcom/apollographql/apollo/api/Fragment$Data;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CampaignCard implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f19284a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public CampaignCard(String str, String str2, String str3, String str4, String str5) {
        this.f19284a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignCard)) {
            return false;
        }
        CampaignCard campaignCard = (CampaignCard) obj;
        return Intrinsics.c(this.f19284a, campaignCard.f19284a) && Intrinsics.c(this.b, campaignCard.b) && Intrinsics.c(this.c, campaignCard.c) && Intrinsics.c(this.d, campaignCard.d) && Intrinsics.c(this.e, campaignCard.e);
    }

    public final int hashCode() {
        int iC = b.c(this.f19284a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CampaignCard(title=", this.f19284a, ", imageUrl=", this.b, ", imageAltText=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", action=", this.d, ", subtitle=");
        return a.o(sbV, this.e, ")");
    }
}

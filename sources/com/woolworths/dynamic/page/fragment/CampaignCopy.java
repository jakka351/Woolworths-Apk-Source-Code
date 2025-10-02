package com.woolworths.dynamic.page.fragment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/CampaignCopy;", "Lcom/apollographql/apollo/api/Fragment$Data;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CampaignCopy implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f19286a;
    public final String b;
    public final String c;

    public CampaignCopy(String str, String str2, String str3) {
        this.f19286a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignCopy)) {
            return false;
        }
        CampaignCopy campaignCopy = (CampaignCopy) obj;
        return Intrinsics.c(this.f19286a, campaignCopy.f19286a) && Intrinsics.c(this.b, campaignCopy.b) && Intrinsics.c(this.c, campaignCopy.c);
    }

    public final int hashCode() {
        String str = this.f19286a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return a.o(a.v("CampaignCopy(campaignCopyTitle=", this.f19286a, ", campaignCopySubtitle=", this.b, ", campaignCopyBody="), this.c, ")");
    }
}

package com.woolworths.dynamic.page.fragment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/dynamic/page/fragment/CampaignTermsAndConditions;", "Lcom/apollographql/apollo/api/Fragment$Data;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CampaignTermsAndConditions implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f19288a;
    public final String b;

    public CampaignTermsAndConditions(String str, String str2) {
        this.f19288a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignTermsAndConditions)) {
            return false;
        }
        CampaignTermsAndConditions campaignTermsAndConditions = (CampaignTermsAndConditions) obj;
        return Intrinsics.c(this.f19288a, campaignTermsAndConditions.f19288a) && Intrinsics.c(this.b, campaignTermsAndConditions.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19288a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("CampaignTermsAndConditions(termsAndConditionsTitle=", this.f19288a, ", markdownText=", this.b, ")");
    }
}

package com.woolworths.rewards.offers.fragment.fragment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.rewards.fragment.AnalyticsFields;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/ContentCtaFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "OnCtaClickAnalytics", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ContentCtaFields implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f20974a;
    public final String b;
    public final Boolean c;
    public final OnCtaClickAnalytics d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/ContentCtaFields$OnCtaClickAnalytics;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCtaClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20975a;
        public final AnalyticsFields b;

        public OnCtaClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f20975a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCtaClickAnalytics)) {
                return false;
            }
            OnCtaClickAnalytics onCtaClickAnalytics = (OnCtaClickAnalytics) obj;
            return Intrinsics.c(this.f20975a, onCtaClickAnalytics.f20975a) && Intrinsics.c(this.b, onCtaClickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20975a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCtaClickAnalytics(__typename=" + this.f20975a + ", analyticsFields=" + this.b + ")";
        }
    }

    public ContentCtaFields(String str, String str2, Boolean bool, OnCtaClickAnalytics onCtaClickAnalytics) {
        this.f20974a = str;
        this.b = str2;
        this.c = bool;
        this.d = onCtaClickAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCtaFields)) {
            return false;
        }
        ContentCtaFields contentCtaFields = (ContentCtaFields) obj;
        return Intrinsics.c(this.f20974a, contentCtaFields.f20974a) && Intrinsics.c(this.b, contentCtaFields.b) && Intrinsics.c(this.c, contentCtaFields.c) && Intrinsics.c(this.d, contentCtaFields.d);
    }

    public final int hashCode() {
        int iHashCode = this.f20974a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        OnCtaClickAnalytics onCtaClickAnalytics = this.d;
        return iHashCode3 + (onCtaClickAnalytics != null ? onCtaClickAnalytics.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ContentCtaFields(label=", this.f20974a, ", url=", this.b, ", isExternalUrl=");
        sbV.append(this.c);
        sbV.append(", onCtaClickAnalytics=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}

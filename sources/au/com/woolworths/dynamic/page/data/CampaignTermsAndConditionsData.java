package au.com.woolworths.dynamic.page.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/data/CampaignTermsAndConditionsData;", "Lau/com/woolworths/dynamic/page/data/FeedItemData;", "Lau/com/woolworths/dynamic/page/data/BottomSheetFeedItemData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CampaignTermsAndConditionsData implements FeedItemData, BottomSheetFeedItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5178a;
    public final String b;

    public CampaignTermsAndConditionsData(String str, String str2) {
        this.f5178a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignTermsAndConditionsData)) {
            return false;
        }
        CampaignTermsAndConditionsData campaignTermsAndConditionsData = (CampaignTermsAndConditionsData) obj;
        return Intrinsics.c(this.f5178a, campaignTermsAndConditionsData.f5178a) && Intrinsics.c(this.b, campaignTermsAndConditionsData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5178a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("CampaignTermsAndConditionsData(title=", this.f5178a, ", markdownText=", this.b, ")");
    }
}

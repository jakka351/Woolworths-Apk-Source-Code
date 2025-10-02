package au.com.woolworths.dynamic.page.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/data/CampaignCardCopyData;", "Lau/com/woolworths/dynamic/page/data/FeedItemData;", "Lau/com/woolworths/dynamic/page/data/BottomSheetFeedItemData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CampaignCardCopyData implements FeedItemData, BottomSheetFeedItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5175a;
    public final String b;
    public final String c;

    public CampaignCardCopyData(String str, String str2, String str3) {
        this.f5175a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignCardCopyData)) {
            return false;
        }
        CampaignCardCopyData campaignCardCopyData = (CampaignCardCopyData) obj;
        return Intrinsics.c(this.f5175a, campaignCardCopyData.f5175a) && Intrinsics.c(this.b, campaignCardCopyData.b) && Intrinsics.c(this.c, campaignCardCopyData.c);
    }

    public final int hashCode() {
        String str = this.f5175a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return a.o(a.v("CampaignCardCopyData(campaignCopyTitle=", this.f5175a, ", campaignCopySubtitle=", this.b, ", campaignCopyBody="), this.c, ")");
    }
}

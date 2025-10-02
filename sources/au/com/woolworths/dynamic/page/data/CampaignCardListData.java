package au.com.woolworths.dynamic.page.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/data/CampaignCardListData;", "Lau/com/woolworths/dynamic/page/data/FeedItemData;", "Lau/com/woolworths/dynamic/page/data/BottomSheetFeedItemData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CampaignCardListData implements FeedItemData, BottomSheetFeedItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5177a;
    public final List b;

    public CampaignCardListData(String str, List list) {
        this.f5177a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignCardListData)) {
            return false;
        }
        CampaignCardListData campaignCardListData = (CampaignCardListData) obj;
        return Intrinsics.c(this.f5177a, campaignCardListData.f5177a) && Intrinsics.c(this.b, campaignCardListData.b);
    }

    public final int hashCode() {
        String str = this.f5177a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.i("CampaignCardListData(title=", this.f5177a, ", cards=", ")", this.b);
    }
}

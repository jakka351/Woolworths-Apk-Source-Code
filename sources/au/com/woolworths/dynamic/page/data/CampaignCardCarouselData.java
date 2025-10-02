package au.com.woolworths.dynamic.page.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/data/CampaignCardCarouselData;", "Lau/com/woolworths/dynamic/page/data/FeedItemData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CampaignCardCarouselData implements FeedItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5174a;
    public final List b;

    public CampaignCardCarouselData(String str, List list) {
        this.f5174a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignCardCarouselData)) {
            return false;
        }
        CampaignCardCarouselData campaignCardCarouselData = (CampaignCardCarouselData) obj;
        return Intrinsics.c(this.f5174a, campaignCardCarouselData.f5174a) && Intrinsics.c(this.b, campaignCardCarouselData.b);
    }

    public final int hashCode() {
        String str = this.f5174a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.i("CampaignCardCarouselData(title=", this.f5174a, ", cards=", ")", this.b);
    }
}

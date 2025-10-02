package au.com.woolworths.dynamic.page.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/data/CampaignCardData;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CampaignCardData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5176a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public CampaignCardData(String title, String imageUrl, String str, String action, String str2) {
        Intrinsics.h(title, "title");
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(action, "action");
        this.f5176a = title;
        this.b = imageUrl;
        this.c = str;
        this.d = action;
        this.e = str2;
    }

    public static CampaignCardData a(CampaignCardData campaignCardData, String str, int i) {
        String title = (i & 1) != 0 ? campaignCardData.f5176a : "One line";
        String imageUrl = campaignCardData.b;
        String str2 = campaignCardData.c;
        String action = campaignCardData.d;
        if ((i & 16) != 0) {
            str = campaignCardData.e;
        }
        Intrinsics.h(title, "title");
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(action, "action");
        return new CampaignCardData(title, imageUrl, str2, action, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignCardData)) {
            return false;
        }
        CampaignCardData campaignCardData = (CampaignCardData) obj;
        return Intrinsics.c(this.f5176a, campaignCardData.f5176a) && Intrinsics.c(this.b, campaignCardData.b) && Intrinsics.c(this.c, campaignCardData.c) && Intrinsics.c(this.d, campaignCardData.d) && Intrinsics.c(this.e, campaignCardData.e);
    }

    public final int hashCode() {
        int iC = b.c(this.f5176a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CampaignCardData(title=", this.f5176a, ", imageUrl=", this.b, ", imageAltText=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", action=", this.d, ", subtitle=");
        return a.o(sbV, this.e, ")");
    }
}

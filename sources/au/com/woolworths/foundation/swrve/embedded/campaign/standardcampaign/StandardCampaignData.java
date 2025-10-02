package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign;

import androidx.compose.runtime.Immutable;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/standardcampaign/StandardCampaignData;", "", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StandardCampaignData {

    /* renamed from: a, reason: collision with root package name */
    public final SwrveEmbeddedMessage f8905a;
    public final StandardCampaignContent b;

    public StandardCampaignData(SwrveEmbeddedMessage campaignMessage, StandardCampaignContent standardCampaignContent) {
        Intrinsics.h(campaignMessage, "campaignMessage");
        this.f8905a = campaignMessage;
        this.b = standardCampaignContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardCampaignData)) {
            return false;
        }
        StandardCampaignData standardCampaignData = (StandardCampaignData) obj;
        return Intrinsics.c(this.f8905a, standardCampaignData.f8905a) && Intrinsics.c(this.b, standardCampaignData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8905a.hashCode() * 31);
    }

    public final String toString() {
        return "StandardCampaignData(campaignMessage=" + this.f8905a + ", standardCampaignContent=" + this.b + ")";
    }
}

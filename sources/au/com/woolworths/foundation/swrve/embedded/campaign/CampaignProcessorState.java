package au.com.woolworths.foundation.swrve.embedded.campaign;

import au.com.woolworths.dynamic.page.ui.content.d;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/CampaignProcessorState;", "", "Companion", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class CampaignProcessorState {
    public static final CampaignProcessorState d = new CampaignProcessorState(null, EmptyMap.d, true);

    /* renamed from: a, reason: collision with root package name */
    public final SwrveEmbeddedMessage f8894a;
    public final Map b;
    public final boolean c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/CampaignProcessorState$Companion;", "", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CampaignProcessorState(SwrveEmbeddedMessage swrveEmbeddedMessage, Map map, boolean z) {
        this.f8894a = swrveEmbeddedMessage;
        this.b = map;
        this.c = z;
    }

    public static CampaignProcessorState a(CampaignProcessorState campaignProcessorState, SwrveEmbeddedMessage swrveEmbeddedMessage, Map map, int i) {
        if ((i & 1) != 0) {
            swrveEmbeddedMessage = campaignProcessorState.f8894a;
        }
        if ((i & 2) != 0) {
            map = campaignProcessorState.b;
        }
        boolean z = (i & 4) != 0 ? campaignProcessorState.c : true;
        campaignProcessorState.getClass();
        return new CampaignProcessorState(swrveEmbeddedMessage, map, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignProcessorState)) {
            return false;
        }
        CampaignProcessorState campaignProcessorState = (CampaignProcessorState) obj;
        return Intrinsics.c(this.f8894a, campaignProcessorState.f8894a) && Intrinsics.c(this.b, campaignProcessorState.b) && this.c == campaignProcessorState.c;
    }

    public final int hashCode() {
        SwrveEmbeddedMessage swrveEmbeddedMessage = this.f8894a;
        return Boolean.hashCode(this.c) + d.d(this.b, (swrveEmbeddedMessage == null ? 0 : swrveEmbeddedMessage.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CampaignProcessorState(pendingEmbeddedMessage=");
        sb.append(this.f8894a);
        sb.append(", pendingEmbeddedMessagePersonalizationProperties=");
        sb.append(this.b);
        sb.append(", active=");
        return YU.a.k(")", sb, this.c);
    }
}

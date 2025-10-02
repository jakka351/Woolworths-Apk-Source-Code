package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/standardcampaign/StandardCampaignFetcher;", "", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StandardCampaignFetcher {

    /* renamed from: a, reason: collision with root package name */
    public static final MutableStateFlow f8906a;
    public static final StateFlow b;

    static {
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        f8906a = mutableStateFlowA;
        b = mutableStateFlowA;
    }

    public static void a(StandardCampaignData standardCampaignData) {
        f8906a.setValue(standardCampaignData);
    }
}

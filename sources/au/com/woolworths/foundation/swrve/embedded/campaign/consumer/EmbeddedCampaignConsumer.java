package au.com.woolworths.foundation.swrve.embedded.campaign.consumer;

import android.app.Activity;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/EmbeddedCampaignConsumer;", "", "Companion", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface EmbeddedCampaignConsumer {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/EmbeddedCampaignConsumer$Companion;", "", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    boolean a(JsonObject jsonObject);

    boolean b(SwrveEmbeddedMessage swrveEmbeddedMessage, JsonObject jsonObject, Activity activity);
}

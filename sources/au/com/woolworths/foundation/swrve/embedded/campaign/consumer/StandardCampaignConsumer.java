package au.com.woolworths.foundation.swrve.embedded.campaign.consumer;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.swrve.embedded.campaign.JsonDecoderKt;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.StandardCampaignActivity;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.StandardCampaignData;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.StandardCampaignFetcher;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignConsumer;", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/EmbeddedCampaignConsumer;", "Companion", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class StandardCampaignConsumer implements EmbeddedCampaignConsumer {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignConsumer$Companion;", "", "", "MessageKeyBottomSheet", "Ljava/lang/String;", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.foundation.swrve.embedded.campaign.consumer.EmbeddedCampaignConsumer
    public final boolean a(JsonObject jsonObject) {
        JsonElement jsonElement = (JsonElement) jsonObject.get("data");
        return (jsonElement != null ? (JsonElement) JsonElementKt.j(jsonElement).get("bottomSheetContent") : null) != null;
    }

    @Override // au.com.woolworths.foundation.swrve.embedded.campaign.consumer.EmbeddedCampaignConsumer
    public final boolean b(SwrveEmbeddedMessage message, JsonObject jsonObject, Activity activeActivity) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        Intrinsics.h(message, "message");
        Intrinsics.h(activeActivity, "activeActivity");
        if (!(activeActivity instanceof StandardCampaignActivity) && (jsonElement = (JsonElement) jsonObject.get("data")) != null && (jsonElement2 = (JsonElement) JsonElementKt.j(jsonElement).get("bottomSheetContent")) != null) {
            Json jsonA = JsonDecoderKt.a();
            jsonA.getClass();
            StandardCampaignContent standardCampaignContent = (StandardCampaignContent) jsonA.a(StandardCampaignContent.INSTANCE.serializer(), jsonElement2);
            if (standardCampaignContent != null) {
                MutableStateFlow mutableStateFlow = StandardCampaignFetcher.f8906a;
                StandardCampaignFetcher.a(new StandardCampaignData(message, standardCampaignContent));
                activeActivity.startActivity(new Intent(activeActivity, (Class<?>) StandardCampaignActivity.class));
                return true;
            }
        }
        return false;
    }
}

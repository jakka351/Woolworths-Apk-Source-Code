package au.com.woolworths.foundation.swrve.embedded.campaign.consumer;

import android.app.Activity;
import android.support.v4.media.session.a;
import androidx.camera.camera2.interop.e;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.review.zzd;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/InAppReviewConsumer;", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/EmbeddedCampaignConsumer;", "Companion", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InAppReviewConsumer implements EmbeddedCampaignConsumer {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/InAppReviewConsumer$Companion;", "", "", "CampaignTypeAppReview", "Ljava/lang/String;", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.foundation.swrve.embedded.campaign.consumer.EmbeddedCampaignConsumer
    public final boolean a(JsonObject jsonObject) {
        JsonElement jsonElement = (JsonElement) jsonObject.get("campaign_type");
        return Intrinsics.c(jsonElement != null ? JsonElementKt.k(jsonElement).getF() : null, "app_review");
    }

    @Override // au.com.woolworths.foundation.swrve.embedded.campaign.consumer.EmbeddedCampaignConsumer
    public final boolean b(SwrveEmbeddedMessage message, JsonObject jsonObject, Activity activeActivity) {
        Intrinsics.h(message, "message");
        Intrinsics.h(activeActivity, "activeActivity");
        try {
            zzd zzdVarA = ReviewManagerFactory.a(activeActivity.getApplication().getApplicationContext());
            Task taskB = zzdVarA.b();
            Intrinsics.g(taskB, "requestReviewFlow(...)");
            Intrinsics.e(taskB.addOnCompleteListener(new e(27, zzdVarA, activeActivity)));
            return true;
        } catch (Exception e) {
            Timber.f27013a.h(a.n(e, "Trying to launch in-app review got exception: "), new Object[0]);
            return true;
        }
    }
}

package au.com.woolworths.foundation.swrve.embedded.campaign;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.compose.d;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.EmbeddedCampaignConsumer;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.InAppReviewConsumer;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignConsumer;
import com.swrve.sdk.SwrveSDKBase;
import com.swrve.sdk.config.SwrveEmbeddedMessageConfig;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/EmbeddedCampaignProcessor;", "", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class EmbeddedCampaignProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f8895a = new d(12);
    public final MutableStateFlow b = StateFlowKt.a(CampaignProcessorState.d);
    public final ArrayList c = CollectionsKt.c0(EmptyList.d, CollectionsKt.R(new StandardCampaignConsumer(), new InAppReviewConsumer()));
    public Activity d;
    public final SwrveEmbeddedMessageConfig e;

    public EmbeddedCampaignProcessor(Application application) {
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: au.com.woolworths.foundation.swrve.embedded.campaign.EmbeddedCampaignProcessor$activityLifecycleCallbacks$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                Intrinsics.h(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                Intrinsics.h(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                Object value;
                Intrinsics.h(activity, "activity");
                EmbeddedCampaignProcessor embeddedCampaignProcessor = this.d;
                embeddedCampaignProcessor.d = null;
                MutableStateFlow mutableStateFlow = embeddedCampaignProcessor.b;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, CampaignProcessorState.a((CampaignProcessorState) value, null, null, 3)));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                Intrinsics.h(activity, "activity");
                EmbeddedCampaignProcessor embeddedCampaignProcessor = this.d;
                embeddedCampaignProcessor.d = activity;
                embeddedCampaignProcessor.a();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Intrinsics.h(activity, "activity");
                Intrinsics.h(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                Intrinsics.h(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                Intrinsics.h(activity, "activity");
            }
        });
        a aVar = new a(this);
        SwrveEmbeddedMessageConfig swrveEmbeddedMessageConfig = new SwrveEmbeddedMessageConfig();
        swrveEmbeddedMessageConfig.f19079a = aVar;
        this.e = swrveEmbeddedMessageConfig;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public final void a() {
        boolean zB;
        Object value;
        String strR;
        MutableStateFlow mutableStateFlow = this.b;
        CampaignProcessorState campaignProcessorState = (CampaignProcessorState) mutableStateFlow.getValue();
        SwrveEmbeddedMessage swrveEmbeddedMessage = campaignProcessorState.f8894a;
        Map map = campaignProcessorState.b;
        boolean z = campaignProcessorState.c;
        Activity activity = this.d;
        if (!z || swrveEmbeddedMessage == null || activity == null) {
            return;
        }
        if (((Boolean) this.f8895a.invoke()).booleanValue() || swrveEmbeddedMessage.e != SwrveEmbeddedMessage.EMBEDDED_CAMPAIGN_TYPE.e) {
            zB = false;
        } else {
            try {
                SwrveSDKBase.a();
                strR = SwrveSDKBase.f19075a.r(swrveEmbeddedMessage, map);
            } catch (SerializationException e) {
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(ReportOwner.Squad.r.a(), e, "Could not parse JSON from Swrve embedded campaign", 8);
            }
            if (strR == null) {
                return;
            }
            JsonObject jsonObjectJ = JsonElementKt.j(Json.d.d(strR));
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                EmbeddedCampaignConsumer embeddedCampaignConsumer = (EmbeddedCampaignConsumer) it.next();
                if (embeddedCampaignConsumer.a(jsonObjectJ)) {
                    zB = embeddedCampaignConsumer.b(swrveEmbeddedMessage, jsonObjectJ, activity);
                    break;
                }
            }
            zB = false;
        }
        if (zB) {
            SwrveSDKBase.a();
            SwrveSDKBase.f19075a.q(swrveEmbeddedMessage);
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, CampaignProcessorState.a((CampaignProcessorState) value, null, null, 6)));
    }
}

package com.swrve.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import com.swrve.sdk.SwrveRunnables;
import com.swrve.sdk.config.SwrveConfig;
import com.swrve.sdk.config.SwrveEmbeddedMessageConfig;
import com.swrve.sdk.localstorage.SQLiteLocalStorage;
import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import com.swrve.sdk.messaging.SwrveBaseCampaign;
import com.swrve.sdk.messaging.SwrveEmbeddedCampaign;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import com.swrve.sdk.messaging.SwrveInAppCampaign;
import com.swrve.sdk.messaging.SwrveMessage;
import com.swrve.sdk.rest.IRESTClient;
import com.swrve.sdk.rest.IRESTResponseListener;
import com.swrve.sdk.rest.RESTClient;
import com.swrve.sdk.rest.RESTResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class SwrveDeeplinkManager {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19048a;
    public final IRESTClient b;
    public final Context c;
    public final SwrveConfig d;
    public final SwrveAssetsManager e;
    public SwrveBaseCampaign f;
    public SwrveMessage g;
    public final SwrveCampaignDisplayer h = new SwrveCampaignDisplayer();
    public String i;

    /* renamed from: com.swrve.sdk.SwrveDeeplinkManager$3, reason: invalid class name */
    class AnonymousClass3 implements IRESTResponseListener {
        @Override // com.swrve.sdk.rest.IRESTResponseListener
        public final void a(Exception exc) {
            SwrveLogger.c("SwrveDeeplinkManager: Exception getting offline campaign.", exc, new Object[0]);
        }

        @Override // com.swrve.sdk.rest.IRESTResponseListener
        public final void b(RESTResponse rESTResponse) {
            int i = rESTResponse.f19107a;
            if (i != 200) {
                SwrveLogger.h("SwrveDeeplinkManager: checking for offline campaign did not return OK. ResponseCode:%s", Integer.valueOf(i));
                return;
            }
            try {
                throw null;
            } catch (Exception e) {
                SwrveLogger.c("SwrveDeeplinkManager: exception getting offline campaign:%s", e, 0L);
            }
        }
    }

    public SwrveDeeplinkManager(HashMap map, SwrveConfig swrveConfig, Context context, SwrveAssetsManagerImp swrveAssetsManagerImp, RESTClient rESTClient) {
        this.f19048a = map;
        this.d = swrveConfig;
        this.c = context;
        this.e = swrveAssetsManagerImp;
        this.b = rESTClient;
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public final void a(String str, String str2, RESTResponse rESTResponse) throws JSONException {
        int i = rESTResponse.f19107a;
        String str3 = rESTResponse.b;
        if (i != 200) {
            SwrveLogger.d("SwrveSDK unable to get ad_journey_campaign JSON : \"%s\".", str3);
            SwrveLogger.g("SwrveSDK attempting to load campaign from cache", new Object[0]);
            try {
                Swrve swrve = (Swrve) SwrveSDKBase.f19075a;
                SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = swrve.s;
                String userId = swrve.getUserId();
                SQLiteLocalStorage sQLiteLocalStorage = swrveMultiLayerLocalStorage.b;
                String strH = sQLiteLocalStorage != null ? sQLiteLocalStorage.h(userId, str) : null;
                if (SwrveHelper.o(strH)) {
                    b(new JSONObject(strH), new SwrveAssetsCompleteCallback() { // from class: com.swrve.sdk.SwrveDeeplinkManager.2
                        @Override // com.swrve.sdk.SwrveAssetsCompleteCallback
                        public final void a(HashSet hashSet, boolean z) {
                            SwrveDeeplinkManager swrveDeeplinkManager = SwrveDeeplinkManager.this;
                            swrveDeeplinkManager.f(swrveDeeplinkManager.f, swrveDeeplinkManager.c, swrveDeeplinkManager.d);
                        }
                    });
                    return;
                } else {
                    SwrveLogger.h("SwrveDeeplinkManager: unable to load campaignId:%s from cache", str);
                    return;
                }
            } catch (Exception e) {
                SwrveLogger.c("SwrveDeeplinkManager: exception loading campaignId:%s from cache", e, str);
                return;
            }
        }
        JSONObject jSONObject = new JSONObject(str3);
        if (jSONObject.has("additional_info")) {
            boolean zHas = jSONObject.has("cdn_root");
            SwrveAssetsManager swrveAssetsManager = this.e;
            if (zHas) {
                String string = jSONObject.getString("cdn_root");
                swrveAssetsManager.b(string);
                SwrveLogger.e("CDN URL %s", string);
            } else if (jSONObject.has("cdn_paths")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("cdn_paths");
                String string2 = jSONObject2.getString("message_images");
                String string3 = jSONObject2.getString("message_fonts");
                swrveAssetsManager.b(string2);
                swrveAssetsManager.c(string3);
                SwrveLogger.e("CDN URL images:%s fonts:%s", string2, string3);
            }
        }
        if (jSONObject.has("real_time_user_properties")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("real_time_user_properties");
            Swrve swrve2 = (Swrve) SwrveSDKBase.f19075a;
            swrve2.E = SwrveHelper.a(jSONObject3);
            swrve2.l0(new l(swrve2, swrve2.j.c(), jSONObject3, 1));
        }
        b(jSONObject, new SwrveAssetsCompleteCallback() { // from class: com.swrve.sdk.h
            @Override // com.swrve.sdk.SwrveAssetsCompleteCallback
            public final void a(HashSet hashSet, boolean z) {
                SwrveDeeplinkManager swrveDeeplinkManager = this.f19082a;
                swrveDeeplinkManager.f(swrveDeeplinkManager.f, swrveDeeplinkManager.c, swrveDeeplinkManager.d);
            }
        });
        String userId2 = SwrveCommon.f19047a.getUserId();
        Swrve swrve3 = (Swrve) SwrveSDKBase.f19075a;
        swrve3.s.f(userId2, str2.equals("notification_to_campaign") ? "NotificationCampaign" : "AdCampaign", jSONObject.toString(), swrve3.S(userId2));
    }

    public final void b(JSONObject jSONObject, SwrveAssetsCompleteCallback swrveAssetsCompleteCallback) throws JSONException {
        SwrveLogger.g("SwrveDeeplinkManager: Campaign JSON data: %s", jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("additional_info");
        if (!jSONObject2.has("version")) {
            SwrveLogger.h("SwrveDeeplinkManager: no version. No campaigns loaded.", new Object[0]);
            return;
        }
        String string = jSONObject2.getString("version");
        if (!string.equals("2")) {
            SwrveLogger.h("SwrveDeeplinkManager: Campaign JSON (%s) has the wrong version for this sdk (%s). No campaigns loaded.", string, "2");
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(NotificationResult.Notification.CAMPAIGN);
        HashSet hashSet = new HashSet();
        if (jSONObject3.has("message")) {
            Swrve swrve = (Swrve) SwrveSDKBase.f19075a;
            this.f = new SwrveInAppCampaign(swrve, this.h, jSONObject3, hashSet, swrve.h0(null));
        } else if (jSONObject3.has("embedded_message")) {
            this.f = new SwrveEmbeddedCampaign((Swrve) SwrveSDKBase.f19075a, this.h, jSONObject3);
        }
        this.e.a(hashSet, swrveAssetsCompleteCallback);
    }

    public final void c(Bundle bundle) {
        String string = bundle.getString("target_url");
        if (!SwrveHelper.o(string)) {
            String string2 = bundle.getString(NotificationResult.Notification.CAMPAIGN);
            if (SwrveHelper.o(string2)) {
                d(string2, "notification_to_campaign");
                return;
            }
            return;
        }
        Uri uri = Uri.parse(string);
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("ad_content");
            if (SwrveHelper.p(queryParameter)) {
                SwrveLogger.e("SwrveDeeplinkManager: Could not queue deeplink generic event, missing campaignId", new Object[0]);
                return;
            }
            if (queryParameter.equals(this.i)) {
                SwrveLogger.e("SwrveDeeplinkManager: Not queuing deeplink generic event, alreadySeenCampaignID flag is true.", new Object[0]);
                return;
            }
            d(queryParameter, "reengage");
            String queryParameter2 = uri.getQueryParameter("ad_source");
            String queryParameter3 = uri.getQueryParameter("ad_campaign");
            if (SwrveHelper.p(queryParameter2) || SwrveHelper.p(queryParameter3)) {
                SwrveLogger.e("SwrveDeeplinkManager: Not queuing deeplink generic event, adSource:%s contextId:%s", queryParameter2, queryParameter3);
                return;
            }
            try {
                e(queryParameter2, queryParameter, queryParameter3);
            } catch (Exception e) {
                SwrveLogger.c("SwrveDeeplinkManager: Could not queue deeplink generic event", e, new Object[0]);
            }
        }
    }

    public final void d(String str, String str2) {
        this.f19048a.put("in_app_campaign_id", str);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            executorServiceNewSingleThreadExecutor.execute(new SwrveRunnables.AnonymousClass1(new a(2, this, str, str2)));
        } finally {
            executorServiceNewSingleThreadExecutor.shutdown();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public final void e(String str, String str2, String str3) {
        ?? r0 = SwrveCommon.f19047a;
        if (r0 == 0 || !SwrveHelper.o(str) || !SwrveHelper.o(str3)) {
            SwrveLogger.d("Cannot queueDeeplinkGenericEvent: no SwrveSDK instance present or parameters were null", new Object[0]);
            return;
        }
        r0.f(this.c, r0.getUserId(), EventHelper.a(System.currentTimeMillis(), "-1", "external_source_" + str.toLowerCase(Locale.ENGLISH), "reengage", str3, str2, new HashMap(), r0.p()));
    }

    public final void f(SwrveBaseCampaign swrveBaseCampaign, Context context, SwrveConfig swrveConfig) {
        SwrveEmbeddedMessageConfig swrveEmbeddedMessageConfig;
        au.com.woolworths.foundation.swrve.embedded.campaign.a aVar;
        this.i = String.valueOf(swrveBaseCampaign.c);
        if (swrveBaseCampaign instanceof SwrveInAppCampaign) {
            SwrveMessage swrveMessage = ((SwrveInAppCampaign) swrveBaseCampaign).o;
            if (SwrveMessageTextTemplatingChecks.a(swrveMessage, ((Swrve) SwrveSDKBase.f19075a).h0(null))) {
                this.g = swrveMessage;
                Intent intent = new Intent(context, (Class<?>) SwrveInAppMessageActivity.class);
                intent.addFlags(268435456);
                intent.putExtra("ad_message_key", true);
                context.startActivity(intent);
                return;
            }
            return;
        }
        if (!(swrveBaseCampaign instanceof SwrveEmbeddedCampaign) || swrveConfig == null || (swrveEmbeddedMessageConfig = swrveConfig.h) == null || (aVar = swrveEmbeddedMessageConfig.f19079a) == null) {
            return;
        }
        SwrveEmbeddedMessage swrveEmbeddedMessage = ((SwrveEmbeddedCampaign) swrveBaseCampaign).o;
        HashMap mapH0 = ((Swrve) SwrveSDKBase.f19075a).h0(null);
        boolean z = swrveEmbeddedMessage.f;
        aVar.a(swrveEmbeddedMessage, mapH0);
    }
}

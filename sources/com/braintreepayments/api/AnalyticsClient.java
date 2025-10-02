package com.braintreepayments.api;

import android.content.Context;
import androidx.room.Room;
import androidx.work.WorkManager;
import androidx.work.impl.WorkManagerImpl;
import com.braintreepayments.api.AnalyticsDatabase;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/AnalyticsClient;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class AnalyticsClient {

    /* renamed from: a, reason: collision with root package name */
    public final BraintreeHttpClient f13692a;
    public final AnalyticsDatabase b;
    public final WorkManager c;
    public final DeviceInspector d;
    public final Context e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/braintreepayments/api/AnalyticsClient$Companion;", "", "", "DELAY_TIME_SECONDS", "J", "", "FPTI_ANALYTICS_URL", "Ljava/lang/String;", "FPTI_KEY_AUTH_FINGERPRINT", "FPTI_KEY_BATCH_PARAMS", "FPTI_KEY_ENDPOINT", "FPTI_KEY_END_TIME", "FPTI_KEY_EVENTS", "FPTI_KEY_EVENT_NAME", "FPTI_KEY_EVENT_PARAMS", "FPTI_KEY_IS_VAULT", "FPTI_KEY_LINK_TYPE", "FPTI_KEY_PAYPAL_CONTEXT_ID", "FPTI_KEY_START_TIME", "FPTI_KEY_TENANT_NAME", "FPTI_KEY_TIMESTAMP", "FPTI_KEY_TOKENIZATION_KEY", "FPTI_KEY_VENMO_INSTALLED", "WORK_INPUT_KEY_ANALYTICS_JSON", "WORK_INPUT_KEY_AUTHORIZATION", "WORK_INPUT_KEY_CONFIGURATION", "WORK_INPUT_KEY_INTEGRATION", "WORK_INPUT_KEY_SESSION_ID", "WORK_NAME_ANALYTICS_UPLOAD", "WORK_NAME_ANALYTICS_WRITE", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public AnalyticsClient(Context context) {
        BraintreeHttpClient braintreeHttpClient = new BraintreeHttpClient();
        AnalyticsDatabase.Companion companion = AnalyticsDatabase.m;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "context.applicationContext");
        AnalyticsDatabase analyticsDatabase = AnalyticsDatabase.n;
        if (analyticsDatabase == null) {
            synchronized (companion) {
                analyticsDatabase = (AnalyticsDatabase) Room.a(applicationContext.getApplicationContext(), AnalyticsDatabase.class, "analytics_database").b();
                AnalyticsDatabase.n = analyticsDatabase;
            }
        }
        WorkManagerImpl workManagerImplA = WorkManager.Companion.a(context.getApplicationContext());
        DeviceInspector deviceInspector = new DeviceInspector();
        Intrinsics.h(context, "context");
        this.f13692a = braintreeHttpClient;
        this.b = analyticsDatabase;
        this.c = workManagerImplA;
        this.d = deviceInspector;
        this.e = context.getApplicationContext();
    }

    public static JSONObject a(Authorization authorization, List list, DeviceMetadata deviceMetadata) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("app_id", deviceMetadata.f13722a).put("app_name", deviceMetadata.b).put("c_sdk_ver", deviceMetadata.c).put("client_os", deviceMetadata.d).put("comp", deviceMetadata.e).put("device_manufacturer", deviceMetadata.f).put("mobile_device_model", deviceMetadata.g).put("drop_in_sdk_ver", deviceMetadata.h).put("event_source", deviceMetadata.j).put("merchant_sdk_env", deviceMetadata.i).put("api_integration_type", deviceMetadata.k).put("is_simulator", deviceMetadata.l).put("mapv", deviceMetadata.m).put("merchant_id", deviceMetadata.n).put(k.a.b, deviceMetadata.o).put("session_id", deviceMetadata.p);
        Intrinsics.g(jSONObjectPut, "JSONObject()\n           …ESSION_ID_KEY, sessionId)");
        if (authorization != null) {
            if (authorization instanceof ClientToken) {
                jSONObjectPut.put("authorization_fingerprint", ((ClientToken) authorization).c);
            } else {
                jSONObjectPut.put("tokenization_key", authorization.getC());
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("batch_params", jSONObjectPut);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject(((AnalyticsEventBlob) it.next()).f13694a));
        }
        jSONObject.put("event_params", jSONArray);
        JSONObject jSONObjectPut2 = new JSONObject().put("events", new JSONArray(new JSONObject[]{jSONObject}));
        Intrinsics.g(jSONObjectPut2, "JSONObject().put(FPTI_KEY_EVENTS, eventsArray)");
        return jSONObjectPut2;
    }

    public static String b(AnalyticsEvent analyticsEvent) {
        String string = new JSONObject().put("event_name", "android." + analyticsEvent.f13693a).put("t", analyticsEvent.i).put("venmo_installed", analyticsEvent.d).put("is_vault", analyticsEvent.e).put("tenant_name", "Braintree").putOpt("paypal_context_id", analyticsEvent.b).putOpt("link_type", analyticsEvent.c).putOpt("start_time", analyticsEvent.f).putOpt("end_time", analyticsEvent.g).putOpt(com.salesforce.marketingcloud.config.a.i, analyticsEvent.h).toString();
        Intrinsics.g(string, "json.toString()");
        return string;
    }
}

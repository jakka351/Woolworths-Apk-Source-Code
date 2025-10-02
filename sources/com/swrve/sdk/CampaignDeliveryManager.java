package com.swrve.sdk;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.impl.model.WorkSpec;
import com.medallia.digital.mobilesdk.l8;
import com.swrve.sdk.rest.IRESTResponseListener;
import com.swrve.sdk.rest.RESTClient;
import com.swrve.sdk.rest.RESTResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class CampaignDeliveryManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19031a;

    public class RESTResponseListener implements IRESTResponseListener {

        /* renamed from: a, reason: collision with root package name */
        public final int f19032a;
        public final String b;
        public ListenableWorker.Result c = new ListenableWorker.Result.Failure();

        public RESTResponseListener(CampaignDeliveryManager campaignDeliveryManager, int i, String str) {
            this.f19032a = i;
            this.b = str;
        }

        @Override // com.swrve.sdk.rest.IRESTResponseListener
        public final void a(Exception exc) {
            SwrveLogger.c("SwrveSDK: Error sending post request for campaign delivery event.", exc, new Object[0]);
        }

        /* JADX WARN: Type inference failed for: r5v12, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
        @Override // com.swrve.sdk.rest.IRESTResponseListener
        public final void b(RESTResponse rESTResponse) {
            int i = rESTResponse.f19107a;
            boolean zV = SwrveHelper.v(i);
            String str = this.b;
            if (zV) {
                SwrveLogger.e("SwrveSDK:PushDelivery event sent to Swrve", new Object[0]);
                this.c = ListenableWorker.Result.a();
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(EventHelper.d(str));
                    QaUser.p(arrayList);
                    return;
                } catch (Exception e) {
                    SwrveLogger.c("SwrveSDK: Exception sending QA campaign delivery wrapped event.", e, new Object[0]);
                    return;
                }
            }
            SwrveLogger.d("SwrveSDK:Error sending PushDelivery event to Swrve. responseCode: %s\tresponseBody:%s", Integer.valueOf(i), rESTResponse.b);
            if (i >= 400 && i < 500) {
                this.c = new ListenableWorker.Result.Failure();
                return;
            }
            if (i >= 500) {
                int i2 = this.f19032a;
                if (i2 < 3) {
                    SwrveLogger.e("SwrveSDK: Will retry sending campaign delivery. runNumber:%s", Integer.valueOf(i2));
                    this.c = new ListenableWorker.Result.Retry();
                    return;
                }
                SwrveLogger.d("SwrveSDK: Attempts to resend campaign delivery has maxed out %s times. No more retries.", 3);
                this.c = new ListenableWorker.Result.Failure();
                try {
                    SwrveCommon.f19047a.D(EventHelper.d(CampaignDeliveryManager.a(i2 + 1, str)));
                } catch (Exception e2) {
                    SwrveLogger.c("SwrveSDK: Exception saving campaign delivery event to storage.", e2, new Object[0]);
                }
            }
        }
    }

    public CampaignDeliveryManager(Context context) {
        this.f19031a = context;
    }

    public static String a(int i, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(EventHelper.d(str));
            if (!jSONObject.has("payload")) {
                return str;
            }
            jSONObject.getJSONObject("payload").put("runNumber", i);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject(str);
            jSONObject2.put("data", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: Exception in addRunNumberToPayload", e, new Object[0]);
            return str;
        }
    }

    public static OneTimeWorkRequest b(String str, String str2) throws IOException {
        Constraints.Builder builder = new Constraints.Builder();
        builder.b(NetworkType.e);
        Constraints constraintsA = builder.a();
        Data.Builder builder2 = new Data.Builder();
        builder2.d("END_POINT", str);
        builder2.d("BODY", str2);
        Data dataA = builder2.a();
        OneTimeWorkRequest.Builder builder3 = new OneTimeWorkRequest.Builder(SwrveCampaignDeliveryWorker.class);
        WorkSpec workSpec = builder3.c;
        workSpec.j = constraintsA;
        workSpec.e = dataA;
        return (OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) builder3.d(l8.b.c, TimeUnit.MILLISECONDS)).a();
    }

    public final ListenableWorker.Result c(Data data, int i) throws Throwable {
        if (i >= 3) {
            SwrveLogger.d("SwrveSDK: SwrveCampaignDelivery error. Exit. Attempts to resend campaign delivery has maxed out %s times", 3);
            return new ListenableWorker.Result.Failure();
        }
        String strB = data.b("END_POINT");
        String strB2 = data.b("BODY");
        if (SwrveHelper.p(strB) || SwrveHelper.p(strB2)) {
            SwrveLogger.d("SwrveSDK: SwrveCampaignDelivery error. Exit. Invalid endpoint:%s body:%s", strB, strB2);
            return new ListenableWorker.Result.Failure();
        }
        int i2 = i + 1;
        if (i2 > 1) {
            strB2 = a(i2, strB2);
        }
        RESTClient rESTClient = new RESTClient(60000);
        SwrveLogger.g("SwrveSDK: runNumber %s, sending campaign delivery post request with body:\n %s", Integer.valueOf(i2), strB2);
        RESTResponseListener rESTResponseListener = new RESTResponseListener(this, i2, strB2);
        rESTClient.a(strB, strB2, rESTResponseListener);
        return rESTResponseListener.c;
    }
}

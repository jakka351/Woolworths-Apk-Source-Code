package com.braintreepayments.api;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class DataCollector {

    /* renamed from: a, reason: collision with root package name */
    public final BraintreeClient f13719a;
    public final PayPalDataCollector b;

    public DataCollector(BraintreeClient braintreeClient) {
        PayPalDataCollector payPalDataCollector = new PayPalDataCollector();
        this.f13719a = braintreeClient;
        this.b = payPalDataCollector;
    }

    public final void a(Context context, DataCollectorCallback dataCollectorCallback) {
        ConfigurationCallback configurationCallback = new ConfigurationCallback(context.getApplicationContext(), new DataCollectorRequest(), dataCollectorCallback) { // from class: com.braintreepayments.api.DataCollector.1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f13720a;
            public final /* synthetic */ DataCollectorCallback b;

            {
                this.b = dataCollectorCallback;
            }

            @Override // com.braintreepayments.api.ConfigurationCallback
            public final void a(Configuration configuration, Exception exc) throws JSONException {
                String strA;
                DataCollectorCallback dataCollectorCallback2 = this.b;
                if (configuration == null) {
                    dataCollectorCallback2.b(null);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    DataCollector dataCollector = DataCollector.this;
                    Context context2 = this.f13720a;
                    try {
                        PayPalDataCollector payPalDataCollector = dataCollector.b;
                        payPalDataCollector.getClass();
                        PayPalDataCollectorInternalRequest payPalDataCollectorInternalRequest = new PayPalDataCollectorInternalRequest(false);
                        payPalDataCollectorInternalRequest.f13737a = payPalDataCollector.a(context2);
                        strA = payPalDataCollector.f13736a.a(context2, configuration, payPalDataCollectorInternalRequest);
                    } catch (NoClassDefFoundError unused) {
                        strA = "";
                    }
                    if (!TextUtils.isEmpty(strA)) {
                        jSONObject.put("correlation_id", strA);
                    }
                } catch (JSONException unused2) {
                }
                dataCollectorCallback2.b(jSONObject.toString());
            }
        };
        BraintreeClient braintreeClient = this.f13719a;
        braintreeClient.getClass();
        braintreeClient.b(new b(braintreeClient, configurationCallback));
    }
}

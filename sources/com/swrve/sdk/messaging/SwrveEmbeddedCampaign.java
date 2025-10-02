package com.swrve.sdk.messaging;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.swrve.sdk.ISwrveCampaignManager;
import com.swrve.sdk.QaCampaignInfo;
import com.swrve.sdk.SwrveCampaignDisplayer;
import com.swrve.sdk.SwrveLogger;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SwrveEmbeddedCampaign extends SwrveBaseCampaign {
    public final SwrveEmbeddedMessage o;

    public SwrveEmbeddedCampaign(ISwrveCampaignManager iSwrveCampaignManager, SwrveCampaignDisplayer swrveCampaignDisplayer, JSONObject jSONObject) throws JSONException {
        super(iSwrveCampaignManager, swrveCampaignDisplayer, jSONObject);
        if (jSONObject.has("embedded_message")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("embedded_message");
            SwrveEmbeddedMessage swrveEmbeddedMessage = new SwrveEmbeddedMessage();
            swrveEmbeddedMessage.b = 9999;
            swrveEmbeddedMessage.c = this;
            swrveEmbeddedMessage.f19096a = jSONObject2.getInt("id");
            if (jSONObject2.has("priority")) {
                swrveEmbeddedMessage.b = jSONObject2.getInt("priority");
            }
            if (jSONObject2.has("buttons")) {
                JSONArray jSONArray = jSONObject2.getJSONArray("buttons");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            }
            if (jSONObject2.has("data")) {
                swrveEmbeddedMessage.d = jSONObject2.getString("data");
            }
            if (jSONObject2.has("type")) {
                String string = jSONObject2.getString("type");
                if (string.equalsIgnoreCase("json")) {
                    swrveEmbeddedMessage.e = SwrveEmbeddedMessage.EMBEDDED_CAMPAIGN_TYPE.e;
                }
                if (string.equalsIgnoreCase("other")) {
                    swrveEmbeddedMessage.e = SwrveEmbeddedMessage.EMBEDDED_CAMPAIGN_TYPE.d;
                }
            }
            if (jSONObject2.has(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            }
            if (jSONObject2.has("message_center_details")) {
                new SwrveMessageCenterDetails(jSONObject2.getJSONObject("message_center_details"));
            }
            if (jSONObject2.has("control")) {
                swrveEmbeddedMessage.f = jSONObject2.getBoolean("control");
            }
            this.o = swrveEmbeddedMessage;
        }
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseCampaign
    public final boolean a(HashSet hashSet, HashMap map) {
        return this.o.d != null;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseCampaign
    public final QaCampaignInfo.CAMPAIGN_TYPE c() {
        return QaCampaignInfo.CAMPAIGN_TYPE.e;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseCampaign
    public final boolean t(SwrveOrientation swrveOrientation) {
        return true;
    }

    public final SwrveEmbeddedMessage u() {
        return this.o;
    }

    public final SwrveEmbeddedMessage v(String str, Map map, Date date, HashMap map2) {
        if (!this.b.h(this, str, map, date, map2, 1)) {
            return null;
        }
        SwrveLogger.e("%s matches a trigger in %s", str, Integer.valueOf(this.c));
        return this.o;
    }
}

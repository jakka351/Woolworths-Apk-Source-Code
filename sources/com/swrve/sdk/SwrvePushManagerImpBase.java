package com.swrve.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkManager;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.db.k;
import com.swrve.sdk.SwrveCampaignInfluence;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class SwrvePushManagerImpBase {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19071a;
    public final ISwrveCommon b;
    public String c;
    public String d;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public SwrvePushManagerImpBase(Context context) {
        ?? r0 = SwrveCommon.f19047a;
        if (r0 == 0) {
            SwrveLogger.d("Please call SwrveSDK.createInstance first in your Application class.", new Object[0]);
            throw new RuntimeException("Please call SwrveSDK.createInstance first in your Application class.");
        }
        this.f19071a = context;
        this.b = r0;
    }

    public CampaignDeliveryManager a() {
        return new CampaignDeliveryManager(this.f19071a);
    }

    public final void b(Bundle bundle, String str) {
        JSONObject jSONObject;
        Date date = new Date();
        if (!bundle.containsKey("_siw")) {
            SwrveLogger.b("Cannot save influence data because there's no influenced window set.", new Object[0]);
            return;
        }
        if (SwrveHelper.p(str)) {
            SwrveLogger.b("Cannot save influence data because cannot no tracking id.", new Object[0]);
            return;
        }
        int i = Integer.parseInt(bundle.getString("_siw"));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(12, i);
        Date time = calendar.getTime();
        boolean zContainsKey = bundle.containsKey("_sp");
        String string = SwrveHelper.o(bundle.getString("_td")) ? bundle.getString("_td") : "";
        String string2 = SwrveHelper.o(bundle.getString("_smp")) ? bundle.getString("_smp") : "";
        long time2 = time.getTime();
        SwrveCampaignInfluence.InfluenceData influenceData = new SwrveCampaignInfluence.InfluenceData();
        influenceData.f19046a = string2;
        influenceData.b = string;
        influenceData.c = str;
        influenceData.d = time2;
        influenceData.e = zContainsKey;
        SharedPreferences sharedPreferences = this.f19071a.getSharedPreferences("swrve.influenced_data_v2", 0);
        ArrayList arrayListA = SwrveCampaignInfluence.a(sharedPreferences);
        arrayListA.add(influenceData);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            SwrveCampaignInfluence.InfluenceData influenceData2 = (SwrveCampaignInfluence.InfluenceData) it.next();
            String str2 = influenceData2.c;
            try {
                jSONObject = new JSONObject();
                jSONObject.put(k.a.b, influenceData2.f19046a);
                jSONObject.put("trackingData", influenceData2.b);
                jSONObject.put("trackingId", influenceData2.c);
                jSONObject.put("maxInfluencedMillis", influenceData2.d);
                jSONObject.put("silent", influenceData2.e);
            } catch (Exception e) {
                SwrveLogger.c("Could not serialize influence data:", e, new Object[0]);
                jSONObject = null;
            }
            editorEdit.putString(str2, jSONObject.toString());
        }
        editorEdit.commit();
    }

    public final void c(Bundle bundle, boolean z, String str) {
        try {
            ArrayList arrayListG = EventHelper.g(bundle, new Date().getTime(), z, str);
            if (arrayListG.size() > 0) {
                String string = bundle.getString(NotificationMessage.NOTIF_KEY_SID);
                if (SwrveHelper.p(string) && bundle.containsKey("provider.message_id")) {
                    string = bundle.getString("provider.message_id");
                }
                if (SwrveHelper.p(string)) {
                    string = bundle.getString("_p");
                }
                String str2 = "CampaignDeliveryWork_" + string;
                String strF = EventHelper.f(arrayListG);
                String str3 = this.b.i() + "/1/batch";
                try {
                    WorkManager.Companion.a(a().f19031a).c(str2, ExistingWorkPolicy.e, CampaignDeliveryManager.b(str3, strF));
                } catch (Exception e) {
                    SwrveLogger.c("SwrveSDK: Error trying to queue campaign delivery event.", e, new Object[0]);
                }
            }
        } catch (Exception e2) {
            SwrveLogger.c("Exception in sendPushDeliveredEvent.", e2, new Object[0]);
        }
    }
}

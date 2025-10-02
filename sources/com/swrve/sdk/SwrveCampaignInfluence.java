package com.swrve.sdk;

import android.content.SharedPreferences;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SwrveCampaignInfluence {

    /* loaded from: classes6.dex */
    public class InfluenceData {

        /* renamed from: a, reason: collision with root package name */
        public String f19046a;
        public String b;
        public String c;
        public long d;
        public boolean e;

        public InfluenceData(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f19046a = jSONObject.getString(k.a.b);
                this.b = jSONObject.getString("trackingData");
                this.c = jSONObject.getString("trackingId");
                this.d = jSONObject.getLong("maxInfluencedMillis");
                this.e = jSONObject.getBoolean("silent");
            } catch (JSONException e) {
                SwrveLogger.c("Could not serialize influence data:", e, new Object[0]);
            }
        }

        public final long a() {
            return Long.parseLong(this.c);
        }
    }

    public static ArrayList a(SharedPreferences sharedPreferences) {
        Set<String> setKeySet = sharedPreferences.getAll().keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = setKeySet.iterator();
        while (it.hasNext()) {
            String string = sharedPreferences.getString(it.next(), null);
            if (SwrveHelper.o(string)) {
                InfluenceData influenceData = new InfluenceData(string);
                if (influenceData.d > 0) {
                    arrayList.add(influenceData);
                }
            }
        }
        return arrayList;
    }
}

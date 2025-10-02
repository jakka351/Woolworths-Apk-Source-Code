package com.google.androidbrowserhelper.trusted;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.Collections;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SharingUtils {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    public static ShareTarget a(String str) throws JSONException {
        ?? SingletonList;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(UrlHandler.ACTION);
        ArrayList arrayList = null;
        String strOptString = jSONObject.optString("method", null);
        String strOptString2 = jSONObject.optString("enctype", null);
        JSONObject jSONObject2 = jSONObject.getJSONObject("params");
        String strOptString3 = jSONObject2.optString("title", "title");
        String strOptString4 = jSONObject2.optString(TextBundle.TEXT_ENTRY, TextBundle.TEXT_ENTRY);
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("files");
        if (jSONArrayOptJSONArray != null) {
            arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                String string2 = jSONObject3.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                Object obj = jSONObject3.get("accept");
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    SingletonList = new ArrayList(jSONArray.length());
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        SingletonList.add(jSONArray.getString(i2));
                    }
                } else {
                    SingletonList = Collections.singletonList(obj.toString());
                }
                arrayList.add(new ShareTarget.FileFormField(string2, SingletonList));
            }
        }
        return new ShareTarget(string, strOptString, strOptString2, new ShareTarget.Params(strOptString3, strOptString4, arrayList));
    }
}

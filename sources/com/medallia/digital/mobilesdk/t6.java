package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t6 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f16713a;
    private HashMap<String, String> b;
    private int c;
    private int d;

    public t6(ArrayList<String> arrayList, HashMap<String, String> map) {
        this.c = 2;
        this.d = 4;
        this.f16713a = arrayList;
        this.b = map;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.c;
    }

    public HashMap<String, String> c() {
        return this.b;
    }

    public ArrayList<String> d() {
        return this.f16713a;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            String stringArrayAsJsonString = "null";
            StringBuilder sb = new StringBuilder("{\"versions\":");
            if (this.f16713a != null) {
                stringArrayAsJsonString = ModelFactory.getInstance().getStringArrayAsJsonString(this.f16713a);
            }
            sb.append(stringArrayAsJsonString);
            sb.append(",\"messages\":");
            sb.append(ModelFactory.getInstance().getStringMapAsJsonString(this.b));
            sb.append(",\"maxSupportedIndex\":");
            sb.append(this.c);
            sb.append(",\"maxDeprecatedIndex\":");
            sb.append(this.d);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public t6(ArrayList<String> arrayList, HashMap<String, String> map, int i, int i2) {
        this.f16713a = arrayList;
        this.b = map;
        this.c = i;
        this.d = i2;
    }

    public t6(JSONObject jSONObject) {
        this.c = 2;
        this.d = 4;
        try {
            if (jSONObject.has("versions") && !jSONObject.isNull("versions")) {
                this.f16713a = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("versions"));
            }
            if (jSONObject.has(com.salesforce.marketingcloud.storage.db.i.e) && !jSONObject.isNull(com.salesforce.marketingcloud.storage.db.i.e)) {
                this.b = ModelFactory.getInstance().getStringMap(jSONObject.getJSONObject(com.salesforce.marketingcloud.storage.db.i.e));
            }
            if (jSONObject.has("maxSupportedIndex") && !jSONObject.isNull("maxSupportedIndex")) {
                this.c = jSONObject.getInt("maxSupportedIndex");
            }
            if (!jSONObject.has("maxDeprecatedIndex") || jSONObject.isNull("maxDeprecatedIndex")) {
                return;
            }
            this.d = jSONObject.getInt("maxDeprecatedIndex");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}

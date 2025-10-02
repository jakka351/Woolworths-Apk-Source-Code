package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class DynamicData {
    private ArrayList<t5> pages;

    public DynamicData(JSONObject jSONObject) {
        this.pages = new ArrayList<>();
        try {
            if (!jSONObject.has("pages") || jSONObject.isNull("pages")) {
                return;
            }
            this.pages = ModelFactory.getInstance().getPageArray(jSONObject.getJSONArray("pages"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public ArrayList<t5> getPages() {
        return this.pages;
    }
}
